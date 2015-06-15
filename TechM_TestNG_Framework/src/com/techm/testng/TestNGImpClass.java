package com.techm.testng;

import org.testng.annotations.Test;

public class TestNGImpClass {
	
  @Test(dataProvider="dataSpecial", dataProviderClass=TestNGTestClassSpecial.class)
  public void foo(String userName, String password, String sq1, String sq2, String sq3) {
	  System.out.println("User Name: "+userName+" Password: "+password+" Securtiy Question 1: "+sq1+" Securtiy Question 2: "+sq2+" Securtiy Question 3: "+sq3);
	  
  }
  
  

}