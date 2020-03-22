$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/Opencart.feature");
formatter.feature({
  "line": 2,
  "name": "Opencart website",
  "description": "",
  "id": "opencart-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Testcase_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Registering valid details",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_opencart_valid_register"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user launch the browser for valid register",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the  user opens opencart register page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user enters the valid register details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the user close the register page",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidRegisterStepdefinition.the_user_launch_the_browser_for_valid_register()"
});
formatter.result({
  "duration": 18934904900,
  "status": "passed"
});
formatter.match({
  "location": "ValidRegisterStepdefinition.the_user_opens_opencart_register_page()"
});
formatter.result({
  "duration": 4247770100,
  "status": "passed"
});
formatter.match({
  "location": "ValidRegisterStepdefinition.the_user_enters_the_valid_register_details()"
});
formatter.result({
  "duration": 6274075700,
  "status": "passed"
});
formatter.match({
  "location": "ValidRegisterStepdefinition.the_user_close_the_register_page()"
});
formatter.result({
  "duration": 756122600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "Registering valid details",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tc02_opencart_invalid_register"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "the user launch the browser for invalid register",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "the  user opens the opencart register page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the user enters the invalid register details",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the user closes the register page",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidRegisterStepdefinition.the_user_launch_the_browser_for_invalid_register()"
});
formatter.result({
  "duration": 6047594900,
  "status": "passed"
});
formatter.match({
  "location": "InvalidRegisterStepdefinition.the_user_opens_the_opencart_register_page()"
});
formatter.result({
  "duration": 2167117100,
  "status": "passed"
});
formatter.match({
  "location": "InvalidRegisterStepdefinition.the_user_enters_the_invalid_register_details()"
});
formatter.result({
  "duration": 4479817700,
  "status": "passed"
});
formatter.match({
  "location": "InvalidRegisterStepdefinition.the_user_closes_the_register_page()"
});
formatter.result({
  "duration": 129063900,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "",
  "description": "Login with valid details",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tc03_opencart_valid_login"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "the user launch the browser for valid login",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the  user opens opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "the user enters the valid login details",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "the user close the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLoginStepdefinition.the_user_launch_the_browser_for_valid_login()"
});
formatter.result({
  "duration": 6098433700,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginStepdefinition.the_user_opens_opencart_login_page()"
});
formatter.result({
  "duration": 1835812100,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginStepdefinition.the_user_enters_the_valid_login_details()"
});
formatter.result({
  "duration": 8592532300,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginStepdefinition.the_user_close_the_login_page()"
});
formatter.result({
  "duration": 191699500,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "",
  "description": "Login with invalid details",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@tc_04_opencart_invalid_login"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "the user launch the browser for invalid login",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "the  user opens the opencart login page",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "the user enters the invalid login details",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "the user closes the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidLoginStepdefinition.the_user_launch_the_browser_for_invalid_login()"
});
formatter.result({
  "duration": 5883571200,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginStepdefinition.the_user_opens_the_opencart_login_page()"
});
formatter.result({
  "duration": 1923442200,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginStepdefinition.the_user_enters_the_invalid_login_details()"
});
formatter.result({
  "duration": 5247679000,
  "status": "passed"
});
formatter.match({
  "location": "InvalidLoginStepdefinition.the_user_closes_the_login_page()"
});
formatter.result({
  "duration": 180557100,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "",
  "description": "Searching products in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@tc05_opencart_search"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "the user opens the opencart search page",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "the user search the product",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "the user close the search page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepdefinition.launch_the_browser()"
});
formatter.result({
  "duration": 1771019200,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepdefinition.the_user_opens_the_opencart_search_page()"
});
formatter.result({
  "duration": 3840178000,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepdefinition.the_user_search_the_product()"
});
formatter.result({
  "duration": 5851498500,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepdefinition.the_user_close_the_search_page()"
});
formatter.result({
  "duration": 4130536400,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "",
  "description": "Add to cart in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@tc06_opencart_add_to_cart"
    }
  ]
});
formatter.step({
  "line": 55,
  "name": "launching the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "the user opens the opencart page",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "the user select the product and add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "the user close the website",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCartStepdefinition.launching_the_browser()"
});
formatter.result({
  "duration": 1719783900,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepdefinition.the_user_opens_the_opencart_page()"
});
formatter.result({
  "duration": 3754938900,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepdefinition.the_user_select_the_product_and_add_to_cart()"
});
formatter.result({
  "duration": 13519418600,
  "status": "passed"
});
formatter.match({
  "location": "AddToCartStepdefinition.the_user_close_the_website()"
});
formatter.result({
  "duration": 222675300,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "",
  "description": "Select desktop in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 60,
      "name": "@tc07_opencart_select_desktop"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "launching browser",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "the user opens the home page",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "the user select the desktop",
  "keyword": "Then "
});
formatter.step({
  "line": 67,
  "name": "the user close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopStepdefinition.launching_browser()"
});
formatter.result({
  "duration": 2187826600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepdefinition.the_user_opens_the_home_page()"
});
formatter.result({
  "duration": 5726187600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepdefinition.the_user_select_the_desktop()"
});
formatter.result({
  "duration": 14824744200,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepdefinition.the_user_close_the_browser()"
});
formatter.result({
  "duration": 133593600,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "",
  "description": "Gift certificate in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 69,
      "name": "@tc08_opencart_gift_certificate"
    }
  ]
});
formatter.step({
  "line": 73,
  "name": "logged in to enter recipient details",
  "keyword": "Given "
});
formatter.step({
  "line": 74,
  "name": "enter recipient details",
  "keyword": "When "
});
formatter.match({
  "location": "GiftCertificatesStepdefinition.logedin()"
});
formatter.result({
  "duration": 16617558100,
  "status": "passed"
});
formatter.match({
  "location": "GiftCertificatesStepdefinition.wishes()"
});
formatter.result({
  "duration": 7471997400,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "",
  "description": "Wishlist in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 76,
      "name": "@tc09_opencart_wishlist"
    }
  ]
});
formatter.step({
  "line": 80,
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "add items to wishlist",
  "keyword": "When "
});
formatter.match({
  "location": "WishListStepdefinition.logedin()"
});
formatter.result({
  "duration": 14418486900,
  "status": "passed"
});
formatter.match({
  "location": "WishListStepdefinition.wishes()"
});
formatter.result({
  "duration": 8249643100,
  "status": "passed"
});
formatter.scenario({
  "line": 84,
  "name": "",
  "description": "Price Comparison of two products",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 83,
      "name": "@tc10_opencart_product_comparison"
    }
  ]
});
formatter.step({
  "line": 87,
  "name": "open the site",
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "compare amount of 2 products",
  "keyword": "When "
});
formatter.match({
  "location": "CompareStepdefinition.logedin()"
});
formatter.result({
  "duration": 6563300100,
  "status": "passed"
});
formatter.match({
  "location": "CompareStepdefinition.wishes()"
});
formatter.result({
  "duration": 9509056900,
  "status": "passed"
});
formatter.scenario({
  "line": 91,
  "name": "",
  "description": "Checking special offers",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 90,
      "name": "@tc11_opencart_special_offers"
    }
  ]
});
formatter.step({
  "line": 94,
  "name": "click specials",
  "keyword": "Given "
});
formatter.step({
  "line": 95,
  "name": "display special offers",
  "keyword": "When "
});
formatter.match({
  "location": "SpecialsStepdefinition.logedin()"
});
formatter.result({
  "duration": 7691336500,
  "status": "passed"
});
formatter.match({
  "location": "SpecialsStepdefinition.wishes()"
});
formatter.result({
  "duration": 3328753800,
  "status": "passed"
});
formatter.scenario({
  "line": 98,
  "name": "",
  "description": "Address book in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 97,
      "name": "@tc12_opencart_address_book"
    }
  ]
});
formatter.step({
  "line": 101,
  "name": "the user launch the browser for address book scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 102,
  "name": "the user opens the webpage",
  "keyword": "When "
});
formatter.step({
  "line": 103,
  "name": "the user enters the address book details",
  "keyword": "Then "
});
formatter.step({
  "line": 104,
  "name": "the user close the webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "AddressBookStepdefinition.the_user_launch_the_browser_for_address_book_scenario()"
});
formatter.result({
  "duration": 1966421100,
  "status": "passed"
});
formatter.match({
  "location": "AddressBookStepdefinition.the_user_opens_the_webpage()"
});
formatter.result({
  "duration": 9425123900,
  "status": "passed"
});
formatter.match({
  "location": "AddressBookStepdefinition.the_user_enters_the_address_book_details()"
});
formatter.result({
  "duration": 13482949300,
  "status": "passed"
});
formatter.match({
  "location": "AddressBookStepdefinition.the_user_close_the_webpage()"
});
formatter.result({
  "duration": 191016700,
  "status": "passed"
});
formatter.scenario({
  "line": 107,
  "name": "",
  "description": "Choose currency type in opencart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 106,
      "name": "@tc13_opencart_choosecurrency"
    }
  ]
});
formatter.step({
  "line": 110,
  "name": "launching the browser for choosing currency type",
  "keyword": "Given "
});
formatter.step({
  "line": 111,
  "name": "the user opens opencart homepage",
  "keyword": "When "
});
formatter.step({
  "line": 112,
  "name": "the user select the currency type",
  "keyword": "Then "
});
formatter.step({
  "line": 113,
  "name": "the user closes the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "CurrencyStepdefinition.launching_the_browser_for_choosing_currency_type()"
});
formatter.result({
  "duration": 1850691700,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepdefinition.the_user_opens_opencart_homepage()"
});
formatter.result({
  "duration": 4231110600,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepdefinition.the_user_select_the_currency_type()"
});
formatter.result({
  "duration": 6786156900,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepdefinition.the_user_closes_the_homepage()"
});
formatter.result({
  "duration": 174277500,
  "status": "passed"
});
formatter.scenario({
  "line": 117,
  "name": "",
  "description": "Choose the company brand in open cart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 116,
      "name": "@tc14_opencart_choosebrand"
    }
  ]
});
formatter.step({
  "line": 120,
  "name": "launching the browser for choosing the brand",
  "keyword": "Given "
});
formatter.step({
  "line": 121,
  "name": "the user opens the opencart homepage",
  "keyword": "When "
});
formatter.step({
  "line": 122,
  "name": "the user select the brand",
  "keyword": "Then "
});
formatter.step({
  "line": 123,
  "name": "the user close the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "BrandsStepdefinition.launching_the_browser_for_choosing_the_brand()"
});
formatter.result({
  "duration": 1674315600,
  "status": "passed"
});
formatter.match({
  "location": "BrandsStepdefinition.the_user_opens_the_opencart_homepage()"
});
formatter.result({
  "duration": 6081454400,
  "status": "passed"
});
formatter.match({
  "location": "BrandsStepdefinition.the_user_select_the_brand()"
});
formatter.result({
  "duration": 10026088000,
  "status": "passed"
});
formatter.match({
  "location": "BrandsStepdefinition.the_user_close_the_homepage()"
});
formatter.result({
  "duration": 158295200,
  "status": "passed"
});
formatter.scenario({
  "line": 126,
  "name": "",
  "description": "Contact us in open cart website",
  "id": "opencart-website;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 125,
      "name": "@tc15_opencart_contactus"
    }
  ]
});
formatter.step({
  "line": 129,
  "name": "launching browser for contactus scenario",
  "keyword": "Given "
});
formatter.step({
  "line": 130,
  "name": "the user opens the website",
  "keyword": "When "
});
formatter.step({
  "line": 131,
  "name": "the user enters the contactus details",
  "keyword": "Then "
});
formatter.step({
  "line": 132,
  "name": "the user closes the website",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsStepdefinition.launching_browser_for_contactus_scenarior()"
});
formatter.result({
  "duration": 2099333800,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepdefinition.the_user_opens_the_website()"
});
formatter.result({
  "duration": 3794066600,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepdefinition.the_user_enters_the_contactus_details()"
});
formatter.result({
  "duration": 11489758300,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsStepdefinition.the_user_closes_the_website()"
});
formatter.result({
  "duration": 4129824600,
  "status": "passed"
});
});