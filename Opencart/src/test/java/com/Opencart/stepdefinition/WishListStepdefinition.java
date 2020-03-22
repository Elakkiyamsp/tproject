package com.Opencart.stepdefinition;

import com.Opencart.pagesobjects.WishListPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class WishListStepdefinition 
{	
		 WishListPage wi = new  WishListPage();

		@Given("^the user logged in$")
		public void logedin() throws Throwable
		{
			
			wi.loginpass() ;
		}

		@When("^add items to wishlist$")
		public void wishes() throws Throwable
		{
			
			wi.wish();
		}
}


