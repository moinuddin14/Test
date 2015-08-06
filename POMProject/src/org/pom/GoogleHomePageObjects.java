/**
 * 
 */
package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Rehaan
 * @Date 4:57:30 AM
 * @FileName GoogleHomePageObjects.java
 * @PackageName org.pom
 * @ProjectName POMProject
 *
 **/
public class GoogleHomePageObjects {
	
	//This constructor initializes object in this page.
	public GoogleHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="q")
	public WebElement txtSearch;

	@FindBy(name="btnG")
	public WebElement btnSearch;
	
	@FindBy(linkText="Selenium - Web Browser Automation")
	public WebElement linkSelenium;
	
	public void searchGoogle(String searchText){
		txtSearch.sendKeys(searchText);
	}
	
	public void clickGoogleButton(){
		btnSearch.click();
	}
	
	public void clickLinkSelenium(){
		linkSelenium.click();
	}
}