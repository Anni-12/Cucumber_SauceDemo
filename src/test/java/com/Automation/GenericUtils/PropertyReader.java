package com.Automation.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	static Properties prop= new Properties();
	public static void initProperty() throws FileNotFoundException, IOException
	{
		prop.load(new FileInputStream("C:\\Users\\aniket.1\\eclipse-workspace\\Cucumber_SauceDemo_GlobalLogic\\src\\test\\resources\\Config\\config.properties"));
	}
	public static String getProperty(String key)
	{
		return prop.getProperty(key);
	}
}
