package com.Automation.GenericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
	
	static WebDriver driver;
	public static void createDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aniket.1\\eclipse-workspace\\Cucumber_SauceDemo_GlobalLogic\\src\\test\\resources\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static WebDriver getDriver()
	{
		if(driver== null) {
		createDriver();
		}
		return driver;
	}
}
