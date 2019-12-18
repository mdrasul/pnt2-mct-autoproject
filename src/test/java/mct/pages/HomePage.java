package mct.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mct.util.SharedConfig;

public class HomePage extends MasterPage{

	// All Locators Or XPath for this Page  
	String loginLink = "ID:dLabellogin";
	String usernameFIeld = "ID:username";
	String passwordField = "ID:password";
	String loginButton = "ID:jqLogin";
	String signUpButton = "ID:jqSignup";
	String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
	String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[2]/a";

	
	String myAccountLink = "Xpath:.//*[@id='drp_div']/ul/li/div/div[1]/a";
	String productName = "Xpath://div[@class='products']/h5//a[contains(text(),'candy')]";
	
	// ****** Constructor -
	public HomePage(WebDriver driver) {
		super(driver); // Giving it to its master or parent calss
	}
	


	// Getter & Setters -
	public String getProfileNameLabel() {
		return getElementText(profileNameLabel);
	}
	
	// What the Page Can Do Functions 
	public void gotoHomePage() {
		// openBrowser(broowser);
		gotoURL(SharedConfig.config.get("URL"));
	}
	
	
	public void closeBrowser() {
		// closeBrowser();  // This Becomes a Recursive Function OMG !!!
		super.closeBrowser();
	}
	
	
	public void loginTest(String user, String password) {
		clickElement(loginLink);
		typeOnElement(usernameFIeld,user);
		typeOnElement(passwordField,password);
		clickElement(loginButton);		
	}

	public void takeMetoSignUPPage() {
		clickElement(loginLink);
		clickElement(signUpButton);
	}

	public void takeMetoMyAccountPage() {
		clickElement(profileNameLabel);
		clickElement(myAccountLink);
	}
	
	public void takeMetoProductDetailsPage() {
		waitFor(5000);
		clickElement(productName);
		
	}
	
		
	public void logOut() {
		clickElement(profileNameLabel);
		clickElement(logOutLink);
	}
	

}
