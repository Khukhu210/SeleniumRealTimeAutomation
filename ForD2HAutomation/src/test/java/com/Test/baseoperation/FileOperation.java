package com.test.baseoperation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileOperation 
{

	public  static String readPropertyFile(String key) throws Exception {

		File file = new File(".\\src\\test\\java\\com\\test\\loginoperation\\property\\configure.properties");
		FileInputStream fs = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fs);
		String value = prop.getProperty(key);
		return value;
	}
}
