package com.test;

import org.testng.annotations.Test;

public class Exceptiontimeoutcheck {
	
	
	@Test(timeOut=10, expectedExceptions= NumberFormatException.class)
	public void ExceptionTImeoutCheck() {
		int i=1;
		while(i==1) {
			
			System.out.println("Hello");
		}
		
		
	}

}
