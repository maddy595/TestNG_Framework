package com.test.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class usedataprovider {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	
	@Test(dataProvider = "testData")
	public void ebayregistration(String FirstName, String LastName , String EmailAddress, String Password) {
		
		driver.get("https://reg.ebay.in/reg/PartialReg");
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(LastName);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(EmailAddress);
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys(Password);
		
	}
	
	@DataProvider
	public static Object[][] testData() throws Exception {
		
		TestUtil excel = new TestUtil("Sheet1");
		int rowcount = excel.getrowCount();
		System.out.println(rowcount);
		int columncount = excel.getColumnCount();
		System.out.println(columncount);
		
		Object [][] data = new Object[rowcount-1][columncount];
	
		for(int i=1; i<rowcount;i++) {
			for(int j=0; j<columncount;j++) {
				String CellData = excel.getCellDataString("Sheet1", i, j);
				System.out.print(CellData +  "  |  ");
				data[i-1][j]=CellData;
			}
			System.out.println();
		}
		return data;
	}

	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	

}
