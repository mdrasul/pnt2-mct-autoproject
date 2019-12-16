package mct.pages;

import org.openqa.selenium.WebDriver;

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
	String SearchBox = "Xpath://*[@id=\"search_header_top\"]/form/input[4]";
	String SearchButton = "Xpath://*[@id=\"search_header_btt\"]";
	String noSearchResultMessage = "Xpath://*[@id=\"items_display_area\"]/div";
	String shirtDescription = "Xpath://*[@id=\"items_display_area\"]/div/div[2]/div[1]/h5/a";


	String myAccountLink = "Xpath:.//*[@id='drp_div']/ul/li/div/div[1]/a";

	

	
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

	public void clickSearchBox() {
		clickElement(SearchBox);
	}

	public void sendNegativeKeysToSearchBox() {
		typeOnElement(SearchBox,"ABCD");
	}

	public void sendPositiveKeysToSearchBox() {
		typeOnElement(SearchBox,"Shirt");
	}

	public void clickSearcButton() {
		clickElement(SearchButton);
	}

	public String getNoSearchResultMessage() {
		return getElementText(noSearchResultMessage);
	}

	public String getShirtDescription() {
		return getElementText(shirtDescription);
	}
}
