package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderTest {

	WebDriver driver = null;
	
	@BeforeTest
	public void setup() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html"); 
		
	}
	
	 @AfterTest
	 public void tearDown() throws Exception { 
	   driver.quit();
	 } 
	 
	 
	 @Test(dataProvider = "getData")
	 public void login(String userName, String Password) {
		 
		 driver.findElement(By.xpath("//input[@name='userid']")).clear();
		   driver.findElement(By.xpath("//input[@name='pswrd']")).clear();
		   driver.findElement(By.xpath("//input[@name='userid']")).sendKeys(userName);
		   driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys(Password);
		   driver.findElement(By.xpath("//input[@value='Login']")).click();
		   String alrt = driver.switchTo().alert().getText();
		   driver.switchTo().alert().accept();
		   System.out.println(alrt);
		 
	 }
	
	 
	 @DataProvider
	 public Object[][] getData(){
		 
		 Object [][] data = new Object[3][2];

		 data[0][0] = "UserId1";
		 data[0][1] = "Pass1";
		 
		 data[1][0] = "UserId2";
		 data[1][1] = "Pass2";
		 
		 data[2][0] = "UserId3";
		 data[2][1] = "Pass3";
		 
		return data;
 
	 }
	 
}
