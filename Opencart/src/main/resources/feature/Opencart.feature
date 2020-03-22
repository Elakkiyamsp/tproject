@Testcase_Feature
Feature: Opencart website 

@tc01_opencart_valid_register
Scenario: 
	Registering valid details
	
	Given the user launch the browser for valid register
	When the  user opens opencart register page
	Then the user enters the valid register details
	Then the user close the register page

	
@tc02_opencart_invalid_register
Scenario:
	Registering valid details
	
	Given the user launch the browser for invalid register
	When the  user opens the opencart register page
	Then the user enters the invalid register details
	Then the user closes the register page
	
@tc03_opencart_valid_login
Scenario:
	Login with valid details
	
	Given the user launch the browser for valid login
	When the  user opens opencart login page
	Then the user enters the valid login details
	Then the user close the login page

@tc_04_opencart_invalid_login
Scenario:
	Login with invalid details
	
	Given the user launch the browser for invalid login
	When the  user opens the opencart login page
	Then the user enters the invalid login details
	Then the user closes the login page


@tc05_opencart_search
Scenario:
	Searching products in opencart website
	
	Given launch the browser
	When the user opens the opencart search page
	Then the user search the product
	Then the user close the search page
	
@tc06_opencart_add_to_cart
Scenario:
	Add to cart in opencart website
	
	Given launching the browser
	When the user opens the opencart page
	Then the user select the product and add to cart
	Then the user close the website
	
@tc07_opencart_select_desktop
Scenario:
	Select desktop in opencart website
	
	Given launching browser
	When the user opens the home page
	Then the user select the desktop
	Then the user close the browser	

@tc08_opencart_gift_certificate
Scenario: 
	Gift certificate in opencart website
	
	Given logged in to enter recipient details
	When enter recipient details
	
@tc09_opencart_wishlist
Scenario: 
	Wishlist in opencart website
	
	Given the user logged in
	When add items to wishlist
	 
@tc10_opencart_product_comparison
Scenario: 
	Price Comparison of two products
	
    Given open the site
	When compare amount of 2 products
	
@tc11_opencart_special_offers
	Scenario: 
	Checking special offers
	
    Given click specials
	When display special offers
	
@tc12_opencart_address_book
Scenario: 
	Address book in opencart website
	
    Given the user launch the browser for address book scenario
	When the user opens the webpage
	Then the user enters the address book details
	Then the user close the webpage
	
@tc13_opencart_choosecurrency
Scenario:
	Choose currency type in opencart website
	
	Given launching the browser for choosing currency type
	When the user opens opencart homepage
	Then the user select the currency type
	Then the user closes the homepage

	
@tc14_opencart_choosebrand
Scenario:
	Choose the company brand in open cart website
	
	Given launching the browser for choosing the brand
	When the user opens the opencart homepage
	Then the user select the brand
	Then the user close the homepage

@tc15_opencart_contactus
Scenario:
	Contact us in open cart website
	
	Given launching browser for contactus scenario
	When the user opens the website
	Then the user enters the contactus details
	Then the user closes the website