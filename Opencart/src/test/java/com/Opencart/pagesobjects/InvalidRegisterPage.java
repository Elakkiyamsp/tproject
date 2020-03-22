package com.Opencart.pagesobjects;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverException;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class InvalidRegisterPage 
	{
		
			WebDriver driver;
			By my_account=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
			By register=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
			By first_name=By.name("firstname");
			By last_name=By.name("lastname");
			By email=By.name("email");
			By telephone=By.name("telephone");
			By password=By.name("password");
			By confirm=By.name("confirm");
			By agree=By.name("agree");
			By register_submit=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
			
			public void url(String browser) 
			{
				try//to launch chrome browser
				{
					if(browser.equalsIgnoreCase("chrome"))
					{
						System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
						driver=new ChromeDriver();
					}//to launch firefox browser
					else if(browser.equalsIgnoreCase("firefox"))
					{
						System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
						driver=new FirefoxDriver();
					}
					
					driver.manage().window().maximize();//maximize the window
					driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//wait for specified time
					
				}
				// Gets executed if above conditions fail
				catch(WebDriverException e)
				{
					System.out.println("Browser could not be launched");
				}
				
				driver.get("https://demo.opencart.com/");//open site

			}
			
			public void opencart_register()
			{
				driver.findElement(my_account).click();//click my account in the site
				driver.findElement(register).click();//select register from my account
			}
			
			public void register_details() throws InterruptedException
			{
				driver.findElement(first_name).sendKeys("a");//get first name
				driver.findElement(last_name).sendKeys("b");//get last name
				driver.findElement(email).sendKeys("abgmail.com");//get email_id
				driver.findElement(telephone).sendKeys("9873212");//get telephone number
				driver.findElement(password).sendKeys("1");//get first name
				driver.findElement(confirm).sendKeys("2");//get first name
				driver.findElement(agree).click();//agree to terms and conditions
				driver.findElement(register_submit).click();//click submit 
				Thread.sleep(3000);
			}
			public void quit()
			{
				driver.close();//close browser
			}

	
}
