package com.techm.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterClass {

  @Test()
  @Parameters(value={"url"})
  public void paramterMethod(String param) {
	  
	  System.out.println("Hello World! Inside Parameter Method: "+param);
  }
  
  
}