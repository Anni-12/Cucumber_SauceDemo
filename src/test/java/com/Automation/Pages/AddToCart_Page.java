package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart_Page extends BasePage{
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement addtocart;
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addcart;
	
	public void addtocart()
	{
		addtocart.click();
		addcart.click();
	}
	
}
