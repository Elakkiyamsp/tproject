package com.Opencart.stepdefinition;

import com.Opencart.excelutility.excel_data;
import com.Opencart.pagesobjects.InvalidLoginPage;
import com.Opencart.pagesobjects.ValidLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLoginStepdefinition 
{
	InvalidLoginPage ivl=new InvalidLoginPage();
	excel_data excel=new excel_data();

	
	@Given("^the user launch the browser for invalid login$")
	public void the_user_launch_the_browser_for_invalid_login() throws Throwable 
	{
		ivl.url("chrome");
	 
	}
	
	@When("^the  user opens the opencart login page$")
	public void the_user_opens_the_opencart_login_page() throws Throwable 
	{
		ivl.opencart_login();
	   
	}

	@Then("^the user enters the invalid login details$")
	public void the_user_enters_the_invalid_login_details() throws Throwable 
	{
		ivl.login_details(excel.excel_emailid(2),excel.excel_password(2));
	    
	}
	
	@Then("^the user closes the login page$")
	public void the_user_closes_the_login_page() throws Throwable 
	{
		ivl.quit();
	   
	}


}
