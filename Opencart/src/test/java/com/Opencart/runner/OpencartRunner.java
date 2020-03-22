package com.Opencart.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/Opencart.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc01_opencart_valid_register,@tc02_opencart_invalid_register,@tc03_opencart_valid_login,@tc_04_opencart_invalid_login,@tc05_opencart_search,@tc06_opencart_add_to_cart,@tc07_opencart_select_desktop,@tc08_opencart_gift_certificate,@tc09_opencart_wishlist,@tc10_opencart_product_comparison,@tc11_opencart_special_offers,@tc12_opencart_address_book,@tc13_opencart_choosecurrency,@tc14_opencart_choosebrand,@tc15_opencart_contactus"},//test cases to be executed
		glue = {"com.Opencart.stepdefinition"},
		monochrome = true//readable
		)

public class OpencartRunner 
{

}
