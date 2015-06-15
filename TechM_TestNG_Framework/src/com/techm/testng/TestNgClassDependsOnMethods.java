package com.techm.testng;

import org.testng.annotations.Test;

public class TestNgClassDependsOnMethods {
	
	
	
  @Test(groups="A")
  public void login() {
	  System.out.println("inside login");
	  
  }
  
  @Test(dependsOnMethods={"login", "payment", "pop$$"} )
  public void logout(){
	  System.out.println("inside logout");
  }
  
  
  @Test(groups="A")
  public void payment(){
	  System.out.println("inside payment");
	  
  }
  
  @Test(groups="A")
  public void pop$$(){
	  System.out.println("inside pop$$");
  }
}