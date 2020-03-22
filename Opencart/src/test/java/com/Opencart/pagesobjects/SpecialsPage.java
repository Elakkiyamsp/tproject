package com.Opencart.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialsPage {
WebDriver driver;
	

	public void open_special()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[4]/a")).click();
	}

	public void offers() throws InterruptedException 
	{
		String s=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")).getText();//get product name
		System.out.println(s);//print product name
		String v=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a")).getText();//get product name
		System.out.println(v);//print product name
		Thread.sleep(3000);
		driver.close();
	}

}
