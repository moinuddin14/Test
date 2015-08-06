/**
 * 
 */
package org.pom;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Rehaan
 * @Date 4:56:54 AM
 * @FileName GoogleSearchTest.java
 * @PackageName org.pom
 * @ProjectName POMProject
 *
 **/
public class GoogleSearchTest {

	public static WebDriver driver = null;
	public static WebDriverWait wait;
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		driver = new FirefoxDriver();
		//driver.manage().timeouts().wait(5000);
		
		//Send the url
		driver.get("http://google.com");
		
		//Objects for the pages
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		SeleniumHomePage selHPage = new SeleniumHomePage(driver);
		
		//Search for the text selenium
		page.searchGoogle("Selenium");
		
		//Click on the button
		page.clickGoogleButton();
		
		//Clicking on the selenium link
		Thread.sleep(10000);
		//wait.until(ExpectedConditions.elementToBeClickable(page.linkSelenium));
		
		//Clicking on the first results link
		page.clickLinkSelenium();
		
		//Clicking on the download link
		selHPage.clickLinkDownload();
		
		//Clicking on the Selenium Home Image
		selHPage.clickLinkHome();
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(file, new File("C:\\Users\\Rehaan\\git\\Test\\POMProject\\output"));
	}

}