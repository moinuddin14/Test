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
 * @Date 6:11:44 PM
 * @FileName SeleniumHomePage.java
 * @PackageName org.pom
 * @ProjectName POMProject
 *
 **/
public class SeleniumHomePage {

	public SeleniumHomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='header']/ul/li[@id='menu_download']/a")
	public WebElement linkDownload;
	
	
	@FindBy(css="#header > h1 > a")
	public WebElement linkHome;
	
	public void clickLinkDownload(){
		linkDownload.click();
	}
	
	public void clickLinkHome(){
		linkHome.click();
	}
	
}