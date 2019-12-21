package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyFavoriteSellers extends MasterPage {



	// All Locators Or XPath for this Page 

	public MyFavoriteSellers(WebDriver driver) {
		super(driver);
	}
String validate = "Xpath://h3[text()='My Favorite Sellers']";
	
		
	// Navigate backward added by me
			public void navigateBack() {
				waitFor(5000);
				driver.navigate().back();
				System.out.println("Back to My Account page6");
			}
			
		public String verifiedFavoriteSeller() {
			return getElementText(validate);
		}
		
	}
	





