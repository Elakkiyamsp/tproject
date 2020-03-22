package com.Opencart.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCertificatesPage
{
	
WebDriver driver;
	

	public void login_pass() 
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("soundaryariya27@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sound");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a")).click();

	}

	public void recipient() throws InterruptedException 
	{
		
		driver.findElement(By.name("to_name")).sendKeys("xxxx");//get name
		driver.findElement(By.name("to_email")).sendKeys("xxxx@gmail.com");//get email
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[5]/div/div[1]/label/input")).click();//get desired certificate theme clicked
		driver.findElement(By.id("input-message")).sendKeys("I love you and so here is your birthday present from me. Hope you love it.");//get message
		driver.findElement(By.name("amount")).sendKeys("10");//get price 
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[1]")).click();//click check box on agreeing to condition
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[2]")).click();//click continue
		Thread.sleep(3000);//wait for specified time
		driver.close();//close browser
	}
	
}
