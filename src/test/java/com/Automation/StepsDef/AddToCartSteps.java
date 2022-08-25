package com.Automation.StepsDef;

import com.Automation.Pages.AddToCart_Page;

import io.cucumber.java.en.Then;

public class AddToCartSteps {
	AddToCart_Page a=new AddToCart_Page();
	@Then("Add To Cart")
	public void add_to_cart() {
	    a.addtocart();
	}
}
