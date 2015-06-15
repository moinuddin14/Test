package com.techm.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassName {
	
  @Test(dataProvider="dataProviderMethod")
  public void loginTestCase0(String userName, String password) {
	  System.out.println("User Name: "+userName+" Password: "+password);
  }
  
  @DataProvider()
  public Object[][] dataProviderMethod(){
	  
	  Object[][] data = new Object[3][2];
	  
	  //1st Row
	  
	  data[0][0] = "user0";
	  data[0][1] = "pass0";
	  
	  //1st Row
	  
	  data[1][0] = "user1";
	  data[1][1] = "pass1";
	  
	  //1st Row
	  
	  data[2][0] = "user2";
	  data[2][1] = "pass2";
	  
	  return data;
	  
  }
  
}