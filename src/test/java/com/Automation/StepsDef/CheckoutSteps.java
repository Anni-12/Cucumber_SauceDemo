package com.Automation.StepsDef;

import org.openqa.selenium.WebDriver;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.CheckoutPage;

import io.cucumber.java.en.Then;

public class CheckoutSteps {
	CheckoutPage c=new CheckoutPage();
	WebDriver d=DriverUtils.getDriver();
	@Then("Enter firstname {string} lastname {string} and postalcode {string}")
	public void enter_firstname_lastname_and_postalcode(String string, String string2, String string3) {
	    String s1=PropertyReader.getProperty(string);
	    String s2=PropertyReader.getProperty(string2);
	    String s3=PropertyReader.getProperty(string3);
	    
		c.checkoutclick(s1,s2,s3,d);
	}
}
