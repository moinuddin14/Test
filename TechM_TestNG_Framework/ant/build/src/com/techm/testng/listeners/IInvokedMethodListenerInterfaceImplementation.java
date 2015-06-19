package com.techm.testng.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class IInvokedMethodListenerInterfaceImplementation implements IInvokedMethodListener{
	
  @Test
  public void f() {
  }

@Override
public void beforeInvocation(IInvokedMethod paramIInvokedMethod,
		ITestResult paramITestResult) {
	
	System.out.println("Date of Run: "+paramIInvokedMethod.getDate()+" and the Method name is: "
	+paramIInvokedMethod.getTestMethod().getMethodName()+" and is this a Test Method? "+paramIInvokedMethod.isTestMethod());
}

@Override
public void afterInvocation(IInvokedMethod paramIInvokedMethod,
		ITestResult paramITestResult) {

	System.out.println(paramITestResult.getStatus());
	
}
  
  
}