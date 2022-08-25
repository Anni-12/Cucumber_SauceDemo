package com.Automation.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillPage extends BasePage{
	
	@FindBy(xpath="//div[@class='summary_total_label']")
	private WebElement total;
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
	
	public void total(WebDriver d)
	{
		System.out.println(total.getText());
		finish.click();
		JavascriptExecutor j= (JavascriptExecutor)d;
		String scrollUp= "window.scrollBy(0,-600)";
		j.executeScript(scrollUp);
	}
	
	public void ConfirmOrder(WebDriver d) throws IOException
	{
		TakesScreenshot t= (TakesScreenshot)d;
		File src= t.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\aniket.1\\Pictures\\Screenshots\\bill.jpg");
		FileUtils.copyFile(src, dest);
	}

}
