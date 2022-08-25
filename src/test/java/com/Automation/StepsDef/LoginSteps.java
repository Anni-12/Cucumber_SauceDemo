package com.Automation.StepsDef;

import org.openqa.selenium.WebDriver;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyReader;
import com.Automation.Pages.SDLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	SDLoginPage lp=new SDLoginPage();
	
	@Given("Open the browser")
	public void open_the_browser() {
		WebDriver d= DriverUtils.getDriver();
		d.get("https://www.saucedemo.com/");
	}

//	@When("Enter valid username {string} and Password {string}")
//	public void enter_valid_username_and_password(String string, String string2) {
//	    lp.enterusername(PropertyReader.getProperty(string));
//	    lp.enterpassword(PropertyReader.getProperty(string2));
//	    lp.loginclick();
//	}
	
	@When("Enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
	    lp.enterusername(PropertyReader.getProperty(string));
	    lp.enterpassword(PropertyReader.getProperty(string2));
	    lp.loginclick();
	}

	@Then("execute successfully")
	public void execute_successfully() {
	    System.out.println("Login successful");
	}
}
