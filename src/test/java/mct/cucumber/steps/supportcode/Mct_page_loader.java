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

import mct.pages.ChangedPassword;
import mct.pages.HomePage;
import mct.pages.MyAccountPage;
import mct.pages.MyFavoriteProducts;
import mct.pages.MyFavoriteSellers;
import mct.pages.MyOrdersPage;
import mct.pages.MyReturnRequest;
import mct.pages.ProfilePage;
import mct.pages.SellersDashboard;
import mct.util.SharedConfig;

public class Mct_page_loader {

	WebDriver driver;

	// All Page Reference Coming From Page Object Model
	public HomePage homePage;
	public MyAccountPage myAccountPage;
	public MyOrdersPage myOrdersPage;
	public ProfilePage ProfilePage;
	public MyReturnRequest myRequestPage;
	public ChangedPassword changedPasswordPage;
	public MyFavoriteProducts myFavoriteProductsPage;
	public MyFavoriteSellers myFavoriteSellersPage;
	public SellersDashboard sellersDashboardPage;

	public WebDriver getDriver() {

		if (driver == null) {

			// Setup Chrome Driver so it can work in all place
			System.out.println("Driver Starting....");

			// Sauce Variables
			String username = SharedConfig.config.get("Sauce-username");
			String accesskey = SharedConfig.config.get("Sauce-accesskey");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			capabilities.setCapability(CapabilityType.VERSION, "latest");
			capabilities.setCapability(CapabilityType.PLATFORM, "Windows 10");

			if (SharedConfig.config.get("seleniumEnvironment").trim().toLowerCase().equals("grid")) {
				// Code to send all test to Sauce Lab
				try {
					driver = new RemoteWebDriver(
							new URL("https://" + username + ":" + accesskey + "@ondemand.saucelabs.com:443/wd/hub"),
							capabilities);
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}

			} else if (SharedConfig.config.get("seleniumEnvironment").trim().toLowerCase().equals("local")) {

				String os = System.getProperty("os.name").toLowerCase();
				System.out.println(os);

				if (os.contains("mac")) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver");
					driver = new ChromeDriver();
				} else if (os.contains("windows")) {
					System.setProperty("webdriver.chrome.driver",
							System.getProperty("user.dir") + "//chromedriver.exe");
					driver = new ChromeDriver();

				}
			}
		}
		return driver;
	}

	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}

	public MyAccountPage getMyAccountPage() {
		if (myAccountPage == null) {
			myAccountPage = new MyAccountPage(driver);
		}
		return myAccountPage;
	}

	public MyOrdersPage getMyOrdersPage() {
		if (myOrdersPage == null) {
			myOrdersPage = new MyOrdersPage(driver);
		}
		return myOrdersPage;
	}

	/// New

	public ProfilePage getProfilePage() {
		if (ProfilePage == null) {
			ProfilePage = new ProfilePage(driver);
		}
		return ProfilePage;

	}

	public MyReturnRequest getMyReturnRequeste() {
		if (myRequestPage == null) {
			myRequestPage = new MyReturnRequest(driver);
		}
		return myRequestPage;

	}

	public ChangedPassword getChangedPassword() {
		if (changedPasswordPage == null) {
			changedPasswordPage = new ChangedPassword(driver);
		}
		return changedPasswordPage;

	}

	public MyFavoriteProducts getMyFavoriteProducts() {
		if (myFavoriteProductsPage == null) {
			myFavoriteProductsPage = new MyFavoriteProducts(driver);
		}
		return myFavoriteProductsPage;

	}

	public MyFavoriteSellers getMyFavoriteSellers() {
		if (myFavoriteSellersPage == null) {
			myFavoriteSellersPage = new MyFavoriteSellers(driver);
		}
		return myFavoriteSellersPage;
	}

	public SellersDashboard getSellersDashboard() {
		if (sellersDashboardPage == null) {
			sellersDashboardPage = new SellersDashboard(driver);
		}
		return sellersDashboardPage;
	}

}