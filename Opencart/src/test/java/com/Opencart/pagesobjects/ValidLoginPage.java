package com.Opencart.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidLoginPage 
{
	WebDriver driver;
	
	By my_account=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By email=By.name("email");
	By password=By.name("password");
	By login_submit=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
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
			
			driver.manage().window().maximize(); //maximize the window
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //wait for specified time
			
		}
		
		catch(WebDriverException e)
		{
			System.out.println("Browser could not be launched");
		}
		
		driver.get("https://demo.opencart.com/");//open open-cart web-site

	}
	
	public void opencart_login()
	{
		driver.findElement(my_account).click();//click my account
		driver.findElement(login).click();//select login
	}
	
	public void login_details(String emailid,String pass) throws InterruptedException
	{
		driver.findElement(email).sendKeys(emailid);//get email id from user
		driver.findElement(password).sendKeys(pass);//get password id from user
		driver.findElement(login_submit).click();//click submit button
		Thread.sleep(3000);
	}
	public void quit()
	{
		driver.close();//close the browser
	}

}
