package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGnclusionExclusion {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup for CHrome");
	}
	
	
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Login");
	}
	

	@BeforeMethod
	public void enterURL() {
		System.out.println("EnterUrl");
	}
		
	@Test(priority=2)
	private void googleTitleTest1() {
		System.out.println("Google Title Test 1");
	}
	@Test(priority=1)
	private void googleTitleTest2() {
		System.out.println("Google Title Test 2");
	}
	@Test
	public void googleTitleTest3() {
		System.out.println("Google Title Test 3");	
	}
	@Test(priority=0, dependsOnMethods= {"googleTitleTest1"})
	public void googleTitleTest4() {
		System.out.println("Google Title Test 4");
	}
	@Test(priority=1, dependsOnMethods= {"googleTitleTest2"})
	public void googleTitleTest5() {
		System.out.println("Google Title Test 5");
	}
	
	@AfterSuite
	public void deletesetUp() {
		System.out.println("Delete the Setup");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the Browser");
	}
	

	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	@AfterTest
	public void DeleteallCookies() {
		System.out.println("DeleteallCookies");
	}

}
