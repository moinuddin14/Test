package com.techm.practise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TheInternetHerokuappComNestedFrames {
	
	public static WebDriver driver = null;
	public static final String url = "http://the-internet.herokuapp.com/nested_frames";
	
	@Test
	public void framemethod() throws InterruptedException{
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		
		try{
		for(int i=0;i<frames.size();i++){

			driver.switchTo().frame(i);
			
			if(driver.findElements(By.tagName("frame")).size()>0){
				for(int j=0;j<driver.findElements(By.tagName("frame")).size();j++){
					driver.switchTo().frame(j);
					System.out.println(driver.findElement(By.tagName("body")).getText());
					driver.get(url);
					driver.switchTo().frame(i);
				}
			}else if(driver.findElements(By.tagName("frame")).size()==0){
				driver.get(url);
				driver.switchTo().frame(i);
				System.out.println(driver.findElement(By.tagName("body")).getText());
			}
			
		}
		}catch(Exception e){
			
		}
	}

}
