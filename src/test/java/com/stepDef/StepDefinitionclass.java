package com.stepDef;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectpack.ObjectClass;

public class StepDefinitionclass extends BaseClass{

	BaseClass bs;
	
	@Given("Customer logged in to pizzahut application")
	public void customer_logged_in_to_pizzahut_application() throws InterruptedException {
		bs=new BaseClass();
		bs.setup();
	    
	}

	@When("Customer enter location")
	public void customer_enter_location() throws InterruptedException, IOException {
		oc=new ObjectClass(driver);
	     oc.locationselection();
	     bs.takeScreenshot();
	  
	}

	@Then("Select the first option of location")
	public void select_the_first_option_of_location() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Then("Customer validate that Vegatarian option is disabled")
	public void customer_validate_that_vegatarian_option_is_disabled() throws InterruptedException {
	    Thread.sleep(2000);
	}

	@When("Customer selects pizza and added into cart")
	public void customer_selects_pizza_and_added_into_cart() throws InterruptedException, IOException {
	    oc.itemselection();
	    bs.takeScreenshot();
	}

	@Then("Customer selects drinks and add it to the cart")
	public void customer_selects_drinks_and_add_it_to_the_cart() throws InterruptedException, IOException {
	   oc.removeitems();
	   bs.takeScreenshot();
	}

	@Then("Verify the price of selected pizza and drink")
	public void verify_the_price_of_selected_pizza_and_drink() {
	    bs.teardown();
	}



}
