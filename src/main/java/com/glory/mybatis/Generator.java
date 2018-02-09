package com.glory.mybatis;

import com.glory.mybatis.utils.MybatisGeneratorUtil;

import java.util.HashMap;
import java.util.Map;

public class Generator {
	
	// 根据命名规范，只修改此常量值即可
	private static String DATABASE = "ad_new";
	private static String TABLE_PREFIX = "ad_";
	private static String PACKAGE_NAME = "mybatis.ad";
	private static String JDBC_USERNAME = "root";
	private static String JDBC_PASSWORD = "111111";
	
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static String JDBC_URL = "jdbc:mysql://192.168.45.30:3306/ad_new?characterEncoding=utf-8";
	
	/*private static String JDBC_DRIVER = "";
	private static String JDBC_URL = "";*/
	
	//需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
	
	static {
		//LAST_INSERT_ID_TABLES.put("upms_user", "user_id");
	}
	
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD,
			DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
	}
}
