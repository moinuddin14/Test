package com.techm.testng.listeners;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultClass extends Assert{
	
	
  @Test
  public void foo() {
/*	  fail("Failing Foo Method");
*/	  System.out.print("Inside Test Method - ");
  }
  
  @Test()
  public void bar() {
	  System.out.print("Inside Test Method - ");
	  fail("Method bar is a failure :( ");
	  
  }
  
  @Test
  public void wine() {
	  System.out.print("Inside Test Method - ");
  }
  
  @Test
  public void coke() {
	  System.out.print("Inside Test Method - ");
  }
  
  @Test
  public void orange() {
	  System.out.print("Inside Test Method - ");
  }
  
  @SuppressWarnings("static-access")
@AfterMethod
  public void afterMethodITestResult(ITestResult iTest){
	 /* System.out.println(iTest.getMethod().getMethodName()+" and the status is: "+iTest.getStatus());
	  System.out.println(iTest.SUCCESS);*/
	  if(iTest.getStatus()==ITestResult.SUCCESS){
		  System.out.println("The Method is Pass and its Method name is: "+iTest.getMethod().getMethodName());
	  } else if(iTest.getStatus()==ITestResult.FAILURE){
		  System.out.println("The Method is fail and its Method name is: "+iTest.getMethod().getMethodName());
	  }
  }
  
}