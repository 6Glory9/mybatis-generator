package com.glory.mybatis.utils;

import org.apache.commons.lang.ObjectUtils;
import org.apache.velocity.VelocityContext;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MybatisGeneratorUtil {
	
	//generatorConfig模板路径
	private static String GENERATOR_CONFIG_TEMPLATE = "template/generatorConfig.vm";
	// Service模板路径
	private static String SERVICE_TEMPLATE = "template/Service.vm";
	// ServiceImpl模板路径
	private static String SERVICE_IMPL_TEMPLATE = "template/ServiceImpl.vm";
	
	////根目录/module + "-dal"
	private static String targetProject;
	
	//根目录,/F:/codes/sources/exts/mybatis-generator/
	private static String basePath;
	
	//class根目录,/F:/codes/sources/exts/mybatis-generator/target/classes/
	private static String targetClassPath;
	
	private static String generatorConfigXml;
	
	/**
	 * @param jdbcDriver 驱动路径
	 * @param jdbcUrl 链接
	 * @param jdbcUsername 帐号
	 * @param jdbcPassword 密码
	 * @param database 数据库
	 * @param tablePrefix 表前缀
	 * @param packageName 包名
	 */
	public static void generator(	String jdbcDriver, String jdbcUrl, String jdbcUsername,
									String jdbcPassword, String database, String tablePrefix,
									String packageName,
									Map<String, String> lastInsertIdTables) throws Exception {
		
		resetTemplatePathAndProjectPath();
		
		List<Map<String, Object>> tables = generatorConfig(jdbcDriver, jdbcUrl, jdbcUsername,
			jdbcPassword, packageName, lastInsertIdTables, database, tablePrefix);
		
		mybatisGenerator();
		
		generatorService(packageName, tables);
	}
	
	private static void generatorService(	String packageName,
											List<Map<String, Object>> tables) throws Exception {
		System.out.println("========== 开始生成Service ==========");
		String ctime = new SimpleDateFormat("yyyy/M/d").format(new Date());
		String servicePath = basePath	+ "/src/main/java/" + packageName.replaceAll("\\.", "/")
								+ "/dao/mapper";
		String serviceImplPath = basePath	+ "/src/main/java/" + packageName.replaceAll("\\.", "/")
									+ "/dao/mapper";
		for (int i = 0; i < tables.size(); i++) {
			String model = StringUtil
				.lineToHump(ObjectUtils.toString(tables.get(i).get("table_name")));
			String service = servicePath + "/" + model + "Service.java";
			String serviceImpl = serviceImplPath + "/" + model + "ServiceImpl.java";
			// 生成service
			File serviceFile = new File(service);
			if (!serviceFile.exists()) {
				VelocityContext context = new VelocityContext();
				context.put("package_name", packageName);
				context.put("model", model);
				context.put("ctime", ctime);
				VelocityUtil.generate(SERVICE_TEMPLATE, service, context);
				System.out.println(service);
			}
			// 生成serviceImpl
			File serviceImplFile = new File(serviceImpl);
			if (!serviceImplFile.exists()) {
				VelocityContext context = new VelocityContext();
				context.put("package_name", packageName);
				context.put("model", model);
				context.put("mapper", StringUtil.toLowerCaseFirstOne(model));
				context.put("ctime", ctime);
				VelocityUtil.generate(SERVICE_IMPL_TEMPLATE, serviceImpl, context);
				System.out.println(serviceImpl);
			}
		}
		System.out.println("========== 结束生成Service ==========");
	}
	
	private static void mybatisGenerator()	throws IOException, XMLParserException,
											InvalidConfigurationException, SQLException,
											InterruptedException {
		System.out.println("========== 开始运行MybatisGenerator ==========");
		List<String> warnings = new ArrayList<>();
		File configFile = new File(generatorConfigXml);
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		for (String warning : warnings) {
			System.out.println(warning);
		}
		System.out.println("========== 结束运行MybatisGenerator ==========");
	}
	
	private static List<Map<String, Object>> generatorConfig(	String jdbcDriver, String jdbcUrl,
																String jdbcUsername,
																String jdbcPassword,
																String packageName,
																Map<String, String> lastInsertIdTables,
																String database,
																String tablePrefix) {
		System.out.println("========== 开始生成generatorConfig.xml文件 ==========");
		
		List<Map<String, Object>> tables = new ArrayList<>();
		try {
			VelocityContext context = new VelocityContext();
			Map<String, Object> table;
			String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '"
							+ database + "' AND table_name LIKE '" + tablePrefix + "_%';";
			// 查询定制前缀项目的所有表
			JdbcUtil jdbcUtil = new JdbcUtil(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			List<Map> result = jdbcUtil.selectByParams(sql, null);
			for (Map map : result) {
				System.out.println(map.get("TABLE_NAME"));
				table = new HashMap<>(2);
				table.put("table_name", map.get("TABLE_NAME"));
				table.put("model_name",
					StringUtil.lineToHump(ObjectUtils.toString(map.get("TABLE_NAME"))));
				tables.add(table);
			}
			jdbcUtil.release();
			
			context.put("tables", tables);
			context.put("generator_javaModelGenerator_targetPackage", packageName + ".dao.model");
			context.put("generator_sqlMapGenerator_targetPackage", packageName + ".dao.mapper");
			context.put("generator_javaClientGenerator_targetPackage", packageName + ".dao.mapper");
			context.put("targetProject", targetProject);
			context.put("targetProject_sqlMap", targetProject);
			context.put("generator_jdbc_username", jdbcUsername);
			context.put("generator_jdbc_password", jdbcPassword);
			context.put("generator_jdbc_driver", jdbcDriver);
			context.put("generator_jdbc_url", jdbcUrl);
			context.put("last_insert_id_tables", lastInsertIdTables);
			VelocityUtil.generate(GENERATOR_CONFIG_TEMPLATE, generatorConfigXml, context);
			// 删除旧代码
			
			deleteDir(new File(targetProject	+ "/src/main/java/"
								+ packageName.replaceAll("\\.", "/") + "/dao/model"));
			deleteDir(new File(targetProject	+ "/src/main/java/"
								+ packageName.replaceAll("\\.", "/") + "/dao/mapper"));
			deleteDir(new File(targetProject	+ "/src/main/java/"
								+ packageName.replaceAll("\\.", "/") + "/dao/service"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("========== 结束生成generatorConfig.xml文件 ==========");
		return tables;
	}
	
	private static void resetTemplatePathAndProjectPath() {
		
		targetClassPath = MybatisGeneratorUtil.class.getResource("/").getPath();

		//GENERATOR_CONFIG_TEMPLATE = targetClassPath + GENERATOR_CONFIG_TEMPLATE;
		//SERVICE_TEMPLATE = targetClassPath + SERVICE_TEMPLATE;
		//SERVICE_IMPL_TEMPLATE = targetClassPath + SERVICE_IMPL_TEMPLATE;
		
		basePath = targetClassPath.replace("/target/classes/", "");
		
		generatorConfigXml = basePath + "/src/main/resources/generatorConfig.xml";
		
		targetProject = basePath;
	}
	
	// 递归删除非空文件夹
	public static void deleteDir(File dir) {
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (int i = 0; i < files.length; i++) {
				deleteDir(files[i]);
			}
		}
		dir.delete();
	}
	
}