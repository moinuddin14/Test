package com.techm.practise;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class ITestResultClass extends Assert{

	@Test
	public void testCaseA(){
		fail("Failing the test case A");
	}

	
	@Test
	public void testCaseB(){
		assertEquals(true, true);
	}
	
	@AfterMethod
	public void resultMethod(ITestResult iTest){
		
		System.out.println(iTest.getStatus()+" : "+iTest.getMethod().getMethodName());
		
		
	}
}