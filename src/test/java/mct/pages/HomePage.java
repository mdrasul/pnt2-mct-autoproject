package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
String validate = "Xpath://h5//a";
	

	
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
	
		
	public void logOut() {
		clickElement(profileNameLabel);
		clickElement(logOutLink);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	 public void ourProducts() {
		 
			// check told product
				List<WebElement> value = driver.findElements(By.xpath("//h5//a"));
				System.out.println(value.size());
				for (int i = 0; i < value.size(); i++) {
					System.out.println(value.get(i).getText()); 
		 }
	 }
	
	 
	 public List<String> verifyourProducts( ) {
		 
				return getElementsText(validate); 
	 }
	
	
	
	
	
}
