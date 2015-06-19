package com.techm.testng;

import org.testng.annotations.Test;

public class TestCaseOne {
	
	
  @Test(timeOut=2)
  public void testMethodOne() throws InterruptedException {
	  
	  System.out.println("Inside Test Method One");
	  Thread.sleep(5000);
	  System.out.println("After waiting for 5 seconds");
  }
}