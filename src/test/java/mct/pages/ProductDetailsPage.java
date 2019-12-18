package mct.pages;

import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends MasterPage{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	String buyNowButton = "Xpath://button[@class='detail_page_buynow_btt']";
	
	String productName = "Xpath://div[@class='products']/h5//a[contains(text(),'candy')]";
	
	
	public String getProductNameLabel() {
		return getElementText(productName);
	}
	
	public void addProductToShoppingCart() {
		
		clickElement(buyNowButton);
		
	}
	
	
}
