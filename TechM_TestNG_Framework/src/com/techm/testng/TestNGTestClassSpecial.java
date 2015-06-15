package com.techm.testng;

import org.testng.annotations.DataProvider;

public class TestNGTestClassSpecial {
	
	
	
  @DataProvider(name="dataSpecial")
  public static Object[][] dataMethod() {
	  
	  
	  Object[][] data = new Object[5][5];
	  
	  
	  data[0][0] = "user00";
	  data[0][1] = "pass00";
	  data[0][2] = "sq100";
	  data[0][3] = "sq200";
	  data[0][4] = "sq300";
	  
	  
	  data[1][0] = "user11";
	  data[1][1] = "pass11";
	  data[1][2] = "sq111";
	  data[1][3] = "sq211";
	  data[1][4] = "sq311";
	  
	  data[2][0] = "user22";
	  data[2][1] = "pass22";
	  data[2][2] = "sq122";
	  data[2][3] = "sq222";
	  data[2][4] = "sq322";
	  
	  
	  data[3][0] = "user33";
	  data[3][1] = "pass33";
	  data[3][2] = "sq133";
	  data[3][3] = "sq233";
	  data[3][4] = "sq333";
	  
	  data[4][0] = "user44";
	  data[4][1] = "pass44";
	  data[4][2] = "sq144";
	  data[4][3] = "sq244";
	  data[4][4] = "sq344";
	  
	  return data;
	  
	  
	  
	  
	  
  }
  
  
}