package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	
	@Test
	public void test1() {
		
		SoftAssert sa = new SoftAssert();
		Assert.assertEquals(2, 5);
		System.out.println("Assertions test 1");
		boolean b = 2>4;
		sa.assertEquals(4, 5);
		sa.assertEquals('s', 'b');
		sa.assertFalse(4>1);
		sa.assertAll();
		
	}
	



}
