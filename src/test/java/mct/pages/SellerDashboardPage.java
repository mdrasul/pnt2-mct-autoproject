package mct.pages;

import org.openqa.selenium.WebDriver;

public class SellerDashboardPage extends MasterPage{

	public SellerDashboardPage(WebDriver driver) {
		super(driver);
	}
	String myProductLink = "Xpath://*[@id=\"layout\"]/div[2]/div[1]/div[9]/a";
	
	public void takeMeToMyProductsPage() {
		clickElement(myProductLink);
	}

}
