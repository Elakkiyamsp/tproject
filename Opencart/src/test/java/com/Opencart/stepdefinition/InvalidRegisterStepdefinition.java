package com.Opencart.stepdefinition;

import com.Opencart.excelutility.excel_data;
import com.Opencart.pagesobjects.InvalidRegisterPage;
import com.Opencart.pagesobjects.ValidRegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidRegisterStepdefinition 
{
	InvalidRegisterPage ivr=new InvalidRegisterPage();

	
	@Given("^the user launch the browser for invalid register$")
	public void the_user_launch_the_browser_for_invalid_register() throws Throwable 
	{
		ivr.url("chrome");
	 
	}

	@When("^the  user opens the opencart register page$")
	public void the_user_opens_the_opencart_register_page() throws Throwable 
	{
		ivr.opencart_register();
	    
	}

	@Then("^the user enters the invalid register details$")
	public void the_user_enters_the_invalid_register_details() throws Throwable 
	{
		ivr.register_details();
	   
	}
	
	@Then("^the user closes the register page$")
	public void the_user_closes_the_register_page() throws Throwable 
	{
		ivr.quit();
	   
	}

}
