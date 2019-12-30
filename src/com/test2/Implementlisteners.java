package com.test2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Implementlisteners implements ITestListener{
	
	@Override		
    public void onFinish(ITestContext arg0) {					
        
		System.out.println("Test is finished");
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        
    	System.out.println("Test is started");
        		
    }		
    
    @Override		
    public void onTestFailure(ITestResult arg0) {					

    	System.out.println("Test is Failed");			
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        
    	System.out.println("Test is Skipped");
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        
    	System.out.println("Test is started");
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        
    	System.out.println("Test is Successfull");
        		
    }		
    

}
