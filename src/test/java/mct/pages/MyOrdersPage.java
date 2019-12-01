package mct.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class MyOrdersPage extends MasterPage {



	// All Locators Or XPath for this Page 

	public MyOrdersPage(WebDriver driver) {
		super(driver);
	}

	
	
	
	
	String myOrderTable = "Xpath://table[@class='table table-bordered oder_table']";
	
	
	
	public boolean isOrderTableExist() {
		
		
		if(elementExist(myOrderTable)==true) {
			return true;
		}
		
		return false;
	}
	

	//	String myAccountLabel = "Xpath:.//*[@id='item_details']/section/div/h3";
	//	String LocatorsOfAllOptions = "Xpath://div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a";
	//	
	//	String myorderLink = "Xpath://a[text()='My Orders']";


	// Getter & Setters -

	//	public String getMyAccountLabel() {
	//		return getElementText(myAccountLabel);
	//	}
	//
	//
	//	public List<String> getAllOptions() {
	//		
	//		// Get the Locators Of all the Option And Return the Text in All Options Back 
	//		return getElementsText(LocatorsOfAllOptions);
	//		
	//	}
	//
	//	
	//	public void takeMetoMyOrderPage() {
	//		
	//		clickElement(myorderLink);
	//
	//		
	//	}


	// What the Page Can Do Functions 



}
