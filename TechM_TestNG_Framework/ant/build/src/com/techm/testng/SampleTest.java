package com.techm.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SampleTest {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.findElement(By.xpath("")).sendKeys("hello");
		
	}
	
	@Test
	public void helloWorld(){
		
		System.out.println("Hello World!");
	}

}
