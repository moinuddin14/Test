package com.techm.testng;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SalesForceTest {

	private static File file = null;
	private static final String url = "https://login.salesforce.com/";
	private static final String userIDXpath = "//input[@type='email']";
	private static final String passwordXpath = "//input[@type='password']";
	private static final String loginButton = "//button[@id='Login']";
	// Change the User ID value
	private static final String userID = "Hello";
	// Change the password value
	private static final String passwordID = "Password";
	private static final String valueAttribute = "value";
	//Create a folder with the name Output directly under your project name, not anywhere else
	private static final String outputFolder = "\\Output";

	@Test
	public static void loginSalesforce() throws InterruptedException,
			IOException {

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to(url);
		Thread.sleep(10000);
		List<WebElement> elements = driver.findElements(By.xpath(loginButton));
		System.out.println(elements.size());

		for (WebElement e : elements) {

			System.out.println(e.getAttribute("id") + " : " + e.getText());
		}

		file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(file,
				new File(System.getProperty("user.dir") + outputFolder));
		driver.findElement(By.xpath(userIDXpath)).sendKeys(userID);
		driver.findElement(By.xpath(passwordXpath)).sendKeys(passwordID);
		String getPassword = driver.findElement(By.xpath(passwordXpath))
				.getAttribute(valueAttribute);
		System.out.println("The Password Entered: " + getPassword);
		Thread.sleep(10000);
		file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(file,
				new File(System.getProperty("user.dir") + outputFolder));
		driver.findElement(By.xpath(loginButton)).click();
		Thread.sleep(10000);
		file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(file,
				new File(System.getProperty("user.dir") + outputFolder));
	}
}
