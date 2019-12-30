package com.test2;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Implementlisteners.class)
public class TestCases {
	
	
	@Test		
	public void Login()				
	{		
	   System.out.println("Login is successful");				
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);	
	}
	
	@Test()
	public void test3() {
		
		if(2>3) {
			throw new SkipException("Skipping the test");
		}
	}

}
