package com.techm.testng;

import org.testng.annotations.Test;

public class TestNgGroupsClass {

	@Test(groups = "sanity")
	public void groupsMethod1() {
		System.out.println("Inside Groups 1 Method");
	}
	
	@Test(groups = "Regression")
	public void groupsMethod2() {
		System.out.println("Inside Groups 2 Method");
	}
	
	@Test(groups = "Regression")
	public void groupsMethod3() {
		System.out.println("Inside Groups 3 Method");
	}
	
	@Test(groups = "Regression")
	public void groupsMethod4() {
		System.out.println("Inside Groups 4 Method");
	}
	
	@Test(groups = "sanity")
	public void groupsMethod5() {
		System.out.println("Inside Groups 5 Method");
	}

}