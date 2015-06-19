package com.techm.testng;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

//Same Data provider - Multuple Test Cases - Same Params
//Same Data Provider - Multiple Test Cases - Different Params


public class DataProviderClass1 {
	
  /*@Test(dataProvider="data1", dataProviderClass=DataProviderSpecificClass.class)
  public void testCaseOne(String userName, String password) {
	  
	  System.out.println("UserName: "+userName+" Password: "+password);
  }*/
  
  @Test(dataProvider="data1", dataProviderClass=DataProviderSpecificClass.class)
  public void testCaseTwo(String userName, String password) {
	  
	  Assert.fail("Failing the testCasetwo Method inside Class: "+Method.class);
	  System.out.println("UserName: "+userName+" Password: "+password);
  }
  
  @Test(dataProvider="data1", dataProviderClass=DataProviderSpecificClass.class)
  public void testCaseThree(String cardNumber, String acctNum, int pin, String userName, String password) {
	  
	  System.out.println("Card: "+cardNumber+" acct: "+acctNum+" pin: "+pin+" UserName: "+userName+" Password: "+password);
  }
  
}