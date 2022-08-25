package com.Automation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
	
	@FindBy(xpath="//div[@class='cart_quantity']")
	private WebElement quantity;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	public void checkoutclick(String s1,String s2,String s3,WebDriver d)
	{
		checkout.click();
		firstname.sendKeys(s1);
		lastname.sendKeys(s2);
		postalcode.sendKeys(s3);
		cont.click();
		JavascriptExecutor j= (JavascriptExecutor)d;
		String scrollDown= "window.scrollBy(0,600)";
		j.executeScript(scrollDown);
	}
	public Boolean changequantity()
	{
		//quantity.sendKeys("2");
		Boolean a=quantity.isEnabled();
		return a;
	}
}
