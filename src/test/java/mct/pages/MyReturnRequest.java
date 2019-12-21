package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyReturnRequest extends MasterPage {
	
	String validate = "Xpath://h3[text()='My Return Requests']";



	// All Locators Or XPath for this Page 

	public MyReturnRequest(WebDriver driver) {
		super(driver);
	}

	
	// Navigate backward added by me
			public void navigateBack() {
				driver.navigate().back();
				System.out.println("Back to My Account page3");
			}
			
		public String verifiedMyReturnRequest() {
			return getElementText(validate);
		}
		



}
