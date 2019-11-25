package mct.cucumber.steps.supportcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mct.pages.HomePage;
import mct.pages.MyAccountPage;

public class Mct_page_loader {


	WebDriver  driver;

	// All Page Reference Coming From Page Object Model
	public HomePage homePage;
	public MyAccountPage myAccountPage;


	public WebDriver getDriver(){

		if (driver == null){
			driver = new ChromeDriver();
		}
		return driver;		
	}


	public HomePage getHomePage() {
		if (homePage == null){
			homePage = new HomePage(driver);
		}
		return homePage;
	}

	public MyAccountPage getMyAccountPage() {
		if (myAccountPage == null){
			myAccountPage = new MyAccountPage(driver);
		}
		return myAccountPage;
	}

}