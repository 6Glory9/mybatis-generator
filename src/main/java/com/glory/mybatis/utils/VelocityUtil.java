package com.glory.mybatis.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Properties;

public class VelocityUtil {
	
	/**
	 * 根据模板生成文件
	 * @param inputVmFilePath 模板路径
	 * @param outputFilePath 输出文件路径
	 * @param context
	 * @throws Exception
	 */
	public static void generate(String inputVmFilePath, String outputFilePath,
								VelocityContext context) throws Exception {
		try {
			Properties properties = new Properties();
			/*properties.setProperty(VelocityEngine.FILE_RESOURCE_LOADER_PATH,
				getPath(inputVmFilePath));*/
			properties.setProperty("classpath.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
			properties.setProperty("classpath.resource.loader.cache", "false");
			properties.setProperty(VelocityEngine.RESOURCE_LOADER,
				"file,classpath");
			Velocity.init(properties);
			Template template = Velocity.getTemplate(inputVmFilePath, "utf-8");
			File outputFile = new File(outputFilePath);
			Writer writer = new OutputStreamWriter(new FileOutputStream(outputFile), "utf-8");
			template.merge(context, writer);
			writer.close();
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	/**
	 * 根据文件绝对路径获取目录
	 * @param filePath
	 * @return
	 */
	public static String getPath(String filePath) {
		String path = "";
		if (StringUtils.isNotBlank(filePath)) {
			path = filePath.substring(0, filePath.lastIndexOf("/") + 1);
		}
		return path;
	}
	
	/**
	 * 根据文件绝对路径获取文件
	 * @param filePath
	 * @return
	 */
	public static String getFile(String filePath) {
		String file = "";
		if (StringUtils.isNotBlank(filePath)) {
			file = filePath.substring(filePath.lastIndexOf("/") + 1);
		}
		return file;
	}
	
}
