package mct.pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends MasterPage{

	public ProductsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	String productdetailPage = "Xpath://*[@title='Cut Carbs']";
	String buyNow = "Xpath://button[text()='   Buy Now']";
	
	
	String avocadDetailPage = "Xpath://*[@title='AVOCARD']";
	
	String coffeeDetailPage = "Xpath://a[@title='cups Coffee Maker  ']";
	
	
	
	public void addCutCurbTshit() {
		
		clickElement(productdetailPage);
		clickElement(buyNow);
	}
	
	public void addAvocadTshirt() {
		clickElement(avocadDetailPage);
		clickElement(buyNow);
		
	}
	
	public void addCoffee() {
		clickElement(coffeeDetailPage);
		clickElement(buyNow);
	}
	
	
}
