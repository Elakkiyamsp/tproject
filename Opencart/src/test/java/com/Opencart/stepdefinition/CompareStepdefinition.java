package com.Opencart.stepdefinition;

import com.Opencart.pagesobjects.ComparePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CompareStepdefinition 
{
	ComparePage cm = new  ComparePage();

	@Given("^open the site$")
	public void logedin() throws Throwable 
	{
		
		cm.opening() ;
	}

	@When("^compare amount of 2 products$")
	public void wishes() throws Throwable
	{
		
		cm.compare();
	}
}
