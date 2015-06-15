package com.techm.testng.listeners;

import org.testng.annotations.Test;


//@Listeners(value=IInvokedMethodListenerInterfaceImplementation.class)
public class IInvokedMethodListenerClass {
	
  @Test
  public void testCaseOne() {
	  System.out.println("Inside Test Case One");
  }
  
  @Test
  public void testCaseTwo() {
	  System.out.println("Inside Test Case Two");
  }
  
  @Test
  public void testCaseThree() {
	  System.out.println("Inside Test Case Three");
  }
  
  @Test
  public void testCaseFour() {
	  System.out.println("Inside Test Case Four");
  }
  
  @Test
  public void testCaseFive() {
	  System.out.println("Inside Test Case Five");
  }
  
  @Test
  public void testCaseSix() {
	  System.out.println("Inside Test Case Six");
  }
  
  
}