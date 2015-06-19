package com.techm.testng;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DataProviderSpecificClass {
	
	@DataProvider(name="data1")
	  public static Object[][] dataProviderMethod(Method m){
		  
		  Object[][] data = null;
		  
		  if(m.getName().equalsIgnoreCase("testCaseTwo")){
			  
			  data = new Object[2][2];
			  
			  //1st Row
			  
			  data[0][0] = "user0";
			  data[0][1] = "pass0";
			  
			  //2nd Row
			  
			  data[1][0] = "user1";
			  data[1][1] = "pass1";
			  
		  }else if(m.getName().equalsIgnoreCase("testCaseThree")){
			  
			  data = new Object[2][5];
			  
			  //1st Row
			  
			  data[0][0] = "5267432109875690";
			  data[0][1] = "AZ677Y435";
			  data[0][2] = 1234;
			  data[0][3] = "user0";
			  data[0][4] = "pass0";
			  
			  //2nd Row
			  
			  data[1][0] = "5267432146627760";
			  data[1][1] = "FJ76FG56";
			  data[1][2] = 1234;
			  data[1][3] = "user1";
			  data[1][4] = "pass1";  
		  }
		  return data;  
	  }
}
