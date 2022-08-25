package com.Automation.StepsDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.BillPage;

import io.cucumber.java.en.Then;

public class BillSteps {
	
	WebDriver d= DriverUtils.getDriver();
	BillPage b=new BillPage();
	
	@Then("Bill output")
	public void bill_output() throws IOException {
		
		b.total(d);
		b.ConfirmOrder(d);
	}
}
