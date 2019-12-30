package com.test2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest1 {

	
	@Test(invocationCount=3)
	@Parameters("FirstName1")
	public void TestParametersinTest(String name) {
		
		System.out.println("First Name is " +name );
			
	}
	
	
}
