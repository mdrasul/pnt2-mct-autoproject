package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangedPassword extends MasterPage {



	// All Locators Or XPath for this Page 

	public ChangedPassword(WebDriver driver) {
		super(driver);
	}

	String validate ="Xpath://div[@id='items_top_area_ttl']";
	
	
	// Navigate backward added by me
			public void navigateBack() {
				driver.navigate().back();
				System.out.println("Back to My Account page4");
			}
			
		public String verifiedChangePassword() {
			return getElementText(validate);
		}
		



}
