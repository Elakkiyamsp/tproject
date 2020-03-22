package com.Opencart.stepdefinition;

import com.Opencart.pagesobjects.GiftCertificatesPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GiftCertificatesStepdefinition {
	 GiftCertificatesPage gc = new  GiftCertificatesPage();

		@Given("^logged in to enter recipient details$")
		public void logedin() throws Throwable
		{
			
			gc.login_pass() ;
		}

		@When("^enter recipient details$")
		public void wishes() throws Throwable
		{
			
			gc.recipient();
		}
}
