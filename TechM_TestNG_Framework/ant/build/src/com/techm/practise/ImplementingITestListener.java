package com.techm.practise;

import org.testng.annotations.Test;


//@Listeners(value=ITestListenerClass.class)
public class ImplementingITestListener {
	
  @Test
  public void foo() {
	  System.out.println("Inside foo method");
  }
  
  @Test
  public void bar() {
	  System.out.println("Inside bar method");
  }
  
  @Test
  public void wine() {
	  System.out.println("Inside wine Method");
  }
  
  @Test
  public void coke() {
	  System.out.println("Inside Coke Method");
  }

}