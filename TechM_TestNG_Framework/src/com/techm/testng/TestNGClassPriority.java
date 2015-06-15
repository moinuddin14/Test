package com.techm.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGClassPriority {
	
  @Test(groups="sanity", description="A Description about Test Case A")
  public void testCaseA() {
	  
	  System.out.println("Inside Test Case A Method");
  }
  
  @Test(groups="regression")
  public void testCaseB() {
	  System.out.println("Inside Test Case B Method");
  }
  
  @Test(groups="sanity", dependsOnGroups="regression")
  public void testCaseC() {
	  System.out.println("Inside Test Case C Method");
  }
  
  @Test(groups="regression")
  public void testCaseD() {
	  System.out.println("Inside Test Case D Method");
  }
  
  @Test(groups="regression")
  public void testCaseE() {
	  System.out.println("Inside Test Case E Method");
  }
  
  @Test(groups="sanity")
  public void testCaseF() {
	  System.out.println("Inside Test Case F Method");
  }
  
  @Test(groups="sanity")
  public void testCaseG(){
	  try{
	  throw new SkipException("Skipping Method Test Case G");
	  }catch(Exception e){
		  
	  }
	  
	  System.out.println("Continue with the Test Case G");
  }
  
}