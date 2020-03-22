package com.Opencart.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressBookPage
{
	WebDriver driver;

	public void browser(String browser) 
	{
		try
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
		
		catch(WebDriverException e)
		{
			System.out.println("Browser could not be launched");
		}
	}
	
	public void url()//login to account
	{
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("soundaryariya27@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sound");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}

	public void address_entry() throws InterruptedException //address book details are entered
	{
		driver.findElement(By.linkText("Address Book")).click();
		driver.findElement(By.linkText("New Address")).click();
		driver.findElement(By.name("firstname")).sendKeys("xxxx");
		driver.findElement(By.name("lastname")).sendKeys("yyyy");
		driver.findElement(By.name("company")).sendKeys("CTS");
		driver.findElement(By.name("address_1")).sendKeys("14,chikum Street");
		driver.findElement(By.name("city")).sendKeys("canterbury");
		driver.findElement(By.name("postcode")).sendKeys("600 012");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[8]/div/select/option[107]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[9]/div/select/option[26]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
		Thread.sleep(5000);
	}
	public void close()
	{
		driver.close();
	}
}


