package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterTest {
	
	WebDriver driver;
	
	@Test
	public void zohologinTest(String userId, String pwd) {
		//https://accounts.zoho.in/signin?servicename=ZohoCRM&signupurl=https://www.zoho.com/crm/signup.html
		//if(browser == "chrome") {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.zoho.in/signin?servicename=ZohoCRM&signupurl=https://www.zoho.com/crm/signup.html");
		driver.findElement(By.xpath("//input[@id='lid']")).sendKeys(userId);
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[@id='signin_submit']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//}
	}

}
