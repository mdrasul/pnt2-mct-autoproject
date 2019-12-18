package mct.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage  extends MasterPage{

	// All Locators Or XPath for this Page 
		// Billing
		String billingAddress1 = "ID:txtBillingAddress1";
		String billingCity = "ID:txtBillingCity";	
		String billStateSelect = "ID:billStateSelect";
		String billingZIP = "ID:txtBillingZIP";
		String billingPhone = "ID:txtBillingPhone";
		
		// Shipping
		String shippingFirstName = "ID:txtShippingFirstName";
		String shippingLastName = "ID:txtShippingLastName";
		String shippingAddress1 = "ID:txtShippingAddress1";
		String shippingCity = "ID:txtShippingCity";	
		String shippingZIP = "ID:txtShippingZIP";
		String shippingEmail = "ID:txtShippingEmail";
		String shippingPhone = "ID:txtShippingPhone";
		//String addressField = "Xpath://input[@placeholder='Address *']";
		//String checknewsBox = "Name:chkSameAsAbove";
		String shippingCheckBox = "Xpath://*[@id='shipping_address_block']/div[1]/input[@type='checkbox']";
		
		//*[@id="shipping_address_block"]/div[1]/input[@type='checkbox']
		//String btnRegister = "ID:btnRegister";
		
		String shippingRadio = "Xpath://*[@id='shipping_block']/div/div/div[4]/input";
		String btnConfirmOrder = "ID:btnConfirmOrder";
		
		
	public ShippingPage(WebDriver driver) {
		super(driver);
	}
	
	
	
public void completeShippingWith() {
		
//		Random random = new Random();
//		int regNumber = random.nextInt(1000);
//		
		//typeOnElement(emailField, "pranob"); 
		//typeOnElement(userNameField, "fadsf");
	
		// Billing
		typeOnElement(billingAddress1, "address");
		typeOnElement(billingCity, "bay");
		typeOnElement(billStateSelect, "ny");
		typeOnElement(billingZIP, "11735");
		typeOnElement(billingPhone, "2256987453");
		
		// Shipping
		/*
		 * typeOnElement(shippingFirstName, "pranob"); typeOnElement(shippingLastName,
		 * "tusher"); typeOnElement(shippingAddress1, "address");
		 * typeOnElement(shippingCity, "bay");
		 * 
		 * typeOnElement(shippingZIP, "11735"); typeOnElement(shippingEmail,
		 * "abc@gmail.com"); typeOnElement(shippingPhone, "2536489724");
		 */

		waitFor(7000);
		clickElement(shippingCheckBox);
		waitFor(5000);
		clickElement(shippingRadio);
		clickElement(btnConfirmOrder);
	}



}
