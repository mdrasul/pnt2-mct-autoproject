package mct.pages;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class ProfilePage extends MasterPage {
	
	String validate = "Xpath://div[@id='items_top_area_ttl']";


	// All Locators Or XPath for this Page 

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	
	// Navigate backward added by me
				public void navigateBack() {
					waitFor(3000);
					driver.navigate().back();
					System.out.println("Back to My Account page2");
				}
				
			public String verifiedProfile() {
				return getElementText(validate);
			}
			




}
