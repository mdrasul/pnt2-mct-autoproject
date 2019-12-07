package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyOrdersPage extends MasterPage {



	// All Locators Or XPath for this Page 

	public MyOrdersPage(WebDriver driver) {
		super(driver);
	}

	
	
	
	
	String myOrderTable = "Xpath://table[@class='table table-bordered oder_table']";
	String allTableRows = "Xpath://table[@class='table table-bordered oder_table']//tr";

	
	
	public boolean isOrderTableExist() {
		
		
		if(elementExist(myOrderTable)==true) {
			return true;
		}
		
		return false;
	}
	
	public int getTotalTableRowsCount() {
		return driver.findElements(By.xpath("//table[@class='table table-bordered oder_table']//tr")).size();

	}
	




}
