package mct.pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyOrdersPage extends MasterPage {

	// All Locators Or XPath for this Page

	public MyOrdersPage(WebDriver driver) {
		super(driver);
	}

	String myOrderTable = "Xpath://table[@class='table table-bordered oder_table']";
	String allTableRows = "Xpath://table[@class='table table-bordered oder_table']//tr";
	String clickSelectSearch = "Xpath://select[@id='cmbSearchType']";
	String clickSelectSearchDate = "Xpath://option[text()='Order Date']";

	String searchDate = "Xpath://input[@id='datepicker']";
	String clickGo = "Xpath://div//input[@class='primary_btt']";
	String invalidDate = "Xpath://td[text()='No Results Found !!']";
	String validateDate ="Xpath://td[@align='left'][1]";

	public boolean isOrderTableExist() {

		if (elementExist(myOrderTable) == true) {
			return true;
		}

		return false;
	}

	public int getTotalTableRowsCount() {
		return driver.findElements(By.xpath("//table[@class='table table-bordered oder_table']//tr")).size();

	}
	
	
	public void searchOrderbySelect(String putDate) {
		Select dropDown = new Select(driver.findElement(By.id("cmbSearchType")));
		clickElement(clickSelectSearch);
		dropDown.selectByVisibleText("Order Date");
		typeOnElement(searchDate, putDate);
		clickElement(clickGo);	
	}
	
	
	public void searchOrder(String putDate) {
		clickElement(clickSelectSearch);
		clickElement(clickSelectSearchDate);
		typeOnElement(searchDate, putDate);
		clickElement(clickGo);
		
	}
	
	public String validateDate() {
		return  getElementText(validateDate);
			
	}
	
	public String invalidateDate() {
		return  getElementText(invalidDate);
			
	}
	
	
	
	
	
	

}
