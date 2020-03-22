package com.Opencart.stepdefinition;


import com.Opencart.excelutility.excel_data;
import com.Opencart.pagesobjects.ValidRegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidRegisterStepdefinition 
{
	ValidRegisterPage vr=new ValidRegisterPage();

	
	@Given("^the user launch the browser for valid register$")
	public void the_user_launch_the_browser_for_valid_register() throws Throwable 
	{
		vr.url("chrome");
	 
	}

	@When("^the  user opens opencart register page$")
	public void the_user_opens_opencart_register_page() throws Throwable 
	{
		vr.opencart_register();
	    
	}

	@Then("^the user enters the valid register details$")
	public void the_user_enters_the_valid_register_details() throws Throwable 
	{
		vr.register_details();
	   
	}
	
	@Then("^the user close the register page$")
	public void the_user_close_the_register_page() throws Throwable 
	{
		vr.quit();
	   
	}

}
