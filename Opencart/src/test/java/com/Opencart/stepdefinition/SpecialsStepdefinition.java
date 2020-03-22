package com.Opencart.stepdefinition;

import com.Opencart.pagesobjects.SpecialsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SpecialsStepdefinition {
	 SpecialsPage sp = new  SpecialsPage();

		@Given("^click specials$")
		public void logedin() throws Throwable
		{
			
			sp.open_special() ;
		}

		@When("^display special offers$")
		public void wishes() throws Throwable
		{
			
			sp.offers();
		}
}
