package com.techm.practise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ITestListenerClass implements ITestListener{
	
	
  @Test
  public void f() {
  }

@Override
public void onFinish(ITestContext arg0) {

	System.out.println("########On Finish##########");
	
	ITestNGMethod[] methods = arg0.getAllTestMethods();
	
	for(ITestNGMethod method:methods){
		System.out.println(method.getMethodName());
	}
}

@Override
public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
}
