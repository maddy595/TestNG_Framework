package com.test;

import org.testng.annotations.Test;

public class testNGFeatures {

	
	@Test()
	public void googleTitleTest3() {
		System.out.println("Google Title Test 3");
		int i =9/0;
		
	}
	
	@Test(dependsOnMethods="googleTitleTest3", alwaysRun=true, invocationCount=3)
	public void googleTitleTest4() {
		System.out.println("Google Title Test 4");
		
	}
	
	
}
