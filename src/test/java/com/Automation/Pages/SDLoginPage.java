package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SDLoginPage extends BasePage{
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
	
	public void enterusername(String a)
	{
		username.sendKeys(a);
	}
	public void enterpassword(String b)
	{
		password.sendKeys(b);
	}
	public void loginclick()
	{
		login.click();
	}
}
