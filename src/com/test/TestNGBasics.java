package com.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGBasics {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup for Chrome");
	}
	
	
	@BeforeTest()
	public void LaunchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeClass()
	public void login() {
		System.out.println("Login");
	}
	

	@BeforeMethod()
	public void enterURL() {
		System.out.println("EnterUrl");
	}
		
	@Test(priority=1, timeOut=2000)
	public void googleTitleTest1() {
		System.out.println("Google Title Test 1");
		System.out.println(Thread.currentThread().getId());
	}
	@Parameters({"FirstName"})
	@Test()
	public void googleTitleTest2(String Name) {
		System.out.println("Name -> " +Name );
		System.out.println(Thread.currentThread().getId());
	}
	@Test(priority=1,groups= {"Mode1"})
	public void googleTitleTest3() {
		System.out.println("Google Title Test 3");	
		System.out.println(Thread.currentThread().getId());
	}
	@Test(priority=0, dependsOnMethods= {"googleTitleTest3"}, groups= {"Mode1"})
	public void googleTitleTest4() {
		System.out.println("Google Title Test 4");
		System.out.println(Thread.currentThread().getId());
		//throw new SkipException("");
	}
	
	@Test(priority=1, dependsOnMethods= {"googleTitleTest2"})
	public void googleTitleTest5() {
		System.out.println("Google Title Test 5");
		System.out.println(Thread.currentThread().getId());
	}
	
	@AfterSuite(enabled=false)
	public void deletesetUp() {
		System.out.println("Delete the Setup");
	}
	
	
	@AfterClass(enabled=false)
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}
	

	@AfterMethod(enabled=false)
	public void logout() {
		System.out.println("Logout");
	}
	
	@AfterTest
	public void DeleteallCookies() {
		System.out.println("DeleteallCookies");
	}

}
