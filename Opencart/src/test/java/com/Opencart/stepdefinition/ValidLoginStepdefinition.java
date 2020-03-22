package com.Opencart.stepdefinition;

import com.Opencart.excelutility.excel_data;
import com.Opencart.pagesobjects.ValidLoginPage;
import com.Opencart.pagesobjects.ValidRegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidLoginStepdefinition 
{
	ValidLoginPage vl=new ValidLoginPage();
	excel_data excel=new excel_data();

	
	@Given("^the user launch the browser for valid login$")
	public void the_user_launch_the_browser_for_valid_login() throws Throwable 
	{
		vl.url("chrome");
	 
	}
	
	@When("^the  user opens opencart login page$")
	public void the_user_opens_opencart_login_page() throws Throwable 
	{
		vl.opencart_login();
	   
	}

	@Then("^the user enters the valid login details$")
	public void the_user_enters_the_valid_login_details() throws Throwable 
	{
		vl.login_details(excel.excel_emailid(1),excel.excel_password(1));
	    
	}
	
	@Then("^the user close the login page$")
	public void the_user_close_the_login_page() throws Throwable 
	{
		vl.quit();
	   
	}

}
