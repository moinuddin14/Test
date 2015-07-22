package com.spoon.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Rehaan
 * @Date 5:56:25 AM
 * @FileName SpoonGridClass.java
 * @PackageName com.spoon.selenium.grid
 * @ProjectName SpoonSeleniumGrid
 *
 **/
public class SpoonGridClass {

	public static WebDriver driver;
	public static DesiredCapabilities cap;
	
	@Parameters("browser")
	@Test
	public void spoonTest(String browser){
		
		if(browser.equals("firefox")){
			cap =DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setCapability("version", "32");
		} else if(browser.equals("ie")){
			cap = DesiredCapabilities.internetExplorer();
			cap.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
			cap.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			cap.setBrowserName("ie");
			cap.setCapability("version", "9");
		} else if(browser.equals("chrome")){
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setCapability("version", "39");
		}
		
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("http://google.com");
	}
}