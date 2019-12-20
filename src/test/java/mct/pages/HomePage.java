package mct.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import mct.util.SharedConfig;

public class HomePage extends MasterPage{
	
	perfect

	// All Locators Or XPath for this Page  
	String loginLink = "ID:dLabellogin";
	String usernameFIeld = "ID:username";
	String passwordField = "ID:password";
	String loginButton = "ID:jqLogin";
	String signUpButton = "ID:jqSignup";
	String profileNameLabel = "Xpath://*[@id=\"dLabel\"]/span";
	String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[2]/a";

	
	String myAccountLink = "Xpath:.//*[@id='drp_div']/ul/li/div/div[1]/a";
	
	String usDollar = "Xpath://select[@name='currency_type']";
	String usDollarSymbol = "Xpath://span[contains(text(),'$')]";
	
	String indianRupee = "Xpath://select[@name='currency_type']";
	String rupeeSymbol = "Xpath://span[contains(text(),'₹')]";
	
	String japaneseYen = "Xpath://select[@name='currency_type']";
	String yenSymbol = "Xpath://span[contains(text(),'¥')]";
	

	

	
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
	
	public void currencyDropDown1() {
		gotoURL(SharedConfig.config.get("URL"));
		Select currency = new Select(driver.findElement(By.xpath("//select[@name='currency_type']")));
		currency.selectByVisibleText("United States dollar");
	    
		
		
	}
	
	public void currencyDropDown2() {
		gotoURL(SharedConfig.config.get("URL"));
		Select currency1 = new Select(driver.findElement(By.xpath("//select[@name='currency_type']")));
		currency1.selectByVisibleText("Indian rupee");
		
	}
	
	public void currencyDropDown3() {
		gotoURL(SharedConfig.config.get("URL"));
		Select currency3 = new Select(driver.findElement(By.xpath("//select[@name='currency_type']")));
		currency3.selectByVisibleText("Japanese yen");
	}

	public void currencySymbols() {
		getElementText(usDollarSymbol);
		getElementText(rupeeSymbol);
		getElementText(yenSymbol);
		
	}
	
}



	
