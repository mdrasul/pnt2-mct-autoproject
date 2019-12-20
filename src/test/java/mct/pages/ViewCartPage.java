package mct.pages;

import org.openqa.selenium.WebDriver;

public class ViewCartPage extends MasterPage {
	
	
	public ViewCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String continueShopping = "Xpath://input[@class='cart_contshopbtn']";
	String checkbox = "Xpath://tr[3]//td[1]//input[1]";	
	String deleteProduct = "Xpath://input[@name='btnDeleteSelected']";
	
	
	
	
	public void keetShopping() {
		
		clickElement(continueShopping);
	}
	
	public void checkBox () {
		
		clickElement(checkbox);
	}
	
	public void deleteProduct() {
		clickElement(deleteProduct);
		
	}

}
