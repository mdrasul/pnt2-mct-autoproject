package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SellersDashboard extends MasterPage {



	// All Locators Or XPath for this Page 

	public SellersDashboard(WebDriver driver) {
		super(driver);
	}
String validate = "Xpath://h3[text()='Catalog']";

//h2[text()='How Does it work ?']
	
	// Navigate backward added by me
			public void navigateBack() {
				driver.navigate().back();
				System.out.println("Back to My Account page7");
			}
			
		public String verifiedSellersDashboard() {
			return getElementText(validate);
		}
		




}
