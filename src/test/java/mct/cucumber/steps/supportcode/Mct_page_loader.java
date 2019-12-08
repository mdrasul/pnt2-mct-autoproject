package mct.cucumber.steps.supportcode;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import mct.pages.HomePage;
import mct.pages.MyAccountPage;
import mct.pages.MyOrdersPage;

public class Mct_page_loader {


	WebDriver  driver;

	// All Page Reference Coming From Page Object Model
	public HomePage homePage;
	public MyAccountPage myAccountPage;
	public MyOrdersPage myOrdersPage;



	public WebDriver getDriver(){

		if (driver == null){

			// Setup Chrome Driver so it can work in all place 
			System.out.println("Driver Starting....");
			
		    String os = System.getProperty("os.name").toLowerCase();
		    System.out.println(os);

		    
		     os = "sauce-grid"; // Hard Coded to RUn in Sauce Lab 

		    
		    // Sauce Variables 
		    String username = "pntsaucelabuser";
		    String accesskey = "c27a360c-ab15-4314-b02c-609e4d65f51a";
		    
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(CapabilityType.BROWSER_NAME, "internet explorer");
	        capabilities.setCapability(CapabilityType.VERSION, "latest");
	        capabilities.setCapability(CapabilityType.PLATFORM, "Windows 10");

	        
	        
	        // capabilities.setCapability(CapabilityType., "2360x1770")
		    
//	        MutableCapabilities sauceOptions = new MutableCapabilities();
//	        
//	        sauceOptions.setCapability("screenResolution", "2360x1770");
//	        FirefoxOptions browserOptions = new FirefoxOptions();
//	        browserOptions.setCapability("platformName", "macOS 10.14");
//	        browserOptions.setCapability("browserVersion", "latest-1");
//	        browserOptions.setCapability("sauce:options", sauceOptions);
	        
	        
	        
		    
			if(os.contains("mac")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver");
				driver = new ChromeDriver();
			}else if(os.contains("windows")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
				driver = new ChromeDriver();

			}else if(os.contains("sauce-grid")) {
				// Code to send all test to Sauce Lab 
				try {
					driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com:443/wd/hub"), capabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
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
	
	
}