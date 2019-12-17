package mct.cucumber.steps.supportcode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import mct.pages.HomePage;
import mct.pages.MyAccountPage;
import mct.pages.MyOrdersPage;
import mct.pages.ValidationFooterLinks;
import mct.util.SharedConfig;

public class Mct_page_loader {


	WebDriver  driver;

	// All Page Reference Coming From Page Object Model
	public HomePage homePage;
	public MyAccountPage myAccountPage;
	public MyOrdersPage myOrdersPage;
	public ValidationFooterLinks V_Link;



	public WebDriver getDriver(){

		if (driver == null){

			// Setup Chrome Driver so it can work in all place 
			System.out.println("Driver Starting....");
			  
		    // Sauce Variables 
		    String username = SharedConfig.config.get("Sauce-username");
		    String accesskey = SharedConfig.config.get("Sauce-accesskey");
		    
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	        capabilities.setCapability(CapabilityType.VERSION, "latest");
	        capabilities.setCapability(CapabilityType.PLATFORM, "Windows 10");

	  		
	        if(SharedConfig.config.get("seleniumEnvironment").trim().toLowerCase().equals("grid")) {
				// Code to send all test to Sauce Lab 
				try {
					driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com:443/wd/hub"), capabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}	

	        }else if(SharedConfig.config.get("seleniumEnvironment").trim().toLowerCase().equals("local")) {
	        	
	    	    String os = System.getProperty("os.name").toLowerCase();
			    System.out.println(os);

	        	if(os.contains("mac")) {
					System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"//geckodriver");
					driver = new FirefoxDriver();
				}else if(os.contains("windows")) {
					System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir")+"//geckodriver.exe");
					driver = new FirefoxDriver();

				}
	        }		
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

	
	public MyOrdersPage getMyOrdersPage() {
		if (myOrdersPage == null){
			myOrdersPage = new MyOrdersPage(driver);
		}
		return myOrdersPage;
	}
	
	public ValidationFooterLinks getFooterLinkValidation() {
		if (V_Link == null){
			V_Link = new ValidationFooterLinks(driver);
		}
		return V_Link;
	}
	
}