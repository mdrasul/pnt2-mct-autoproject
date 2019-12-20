package mct.pages;

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
	
	String orderSearch = "Xpath://select[@id='cmbSearchType']";
	String orderId =  "Xpath://option[text()='Order Date']";
	//"Xpath://select[@id='cmbSearchType']";
	String typeOrderNum = "Xpath://input[@id='txtSearch']";
	String clickOnGo = "Xpath://input[@value='Go ']";

	public boolean isOrderTableExist() {

		if (elementExist(myOrderTable) == true) {
			return true;
		}

		return false;
	}

	public int getTotalTableRowsCount() {
		return driver.findElements(By.xpath("//table[@class='table table-bordered oder_table']//tr")).size();

	}

	public void orderSearchClick(String putId) {
		
		Select dropdown = new Select(driver.findElement(By.id("cmbSearchType")));
		clickElement(orderSearch);
		dropdown.selectByVisibleText("Order ID");
		typeOnElement(typeOrderNum, putId);
		clickElement(clickOnGo);

	}
	
    public WebElement validation() { 
    	return driver.findElement(By.xpath("//a[contains(text(),'45')]"));
    	
}
    
    public WebElement negativeValidation() {
    	return driver.findElement(By.xpath("//td[@class='text_information']"));
    	
		
	}


}

