package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyFavoriteProducts extends MasterPage {



	// All Locators Or XPath for this Page 

	public MyFavoriteProducts(WebDriver driver) {
		super(driver);
	}
String validate= "Xpath://h3[text()='My Favorite Products']";
	
	// Navigate backward added by me
			public void navigateBack() {
				driver.navigate().back();
				System.out.println("Back to My Account page5");
			}
			
		public String verifiedMyFavoriteProducts() {
			return getElementText(validate);
		}
		


}
