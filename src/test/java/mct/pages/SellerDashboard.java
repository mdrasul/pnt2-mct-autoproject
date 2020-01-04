package mct.pages;

import org.openqa.selenium.WebDriver;

public class SellerDashboard extends MasterPage{

	public SellerDashboard(WebDriver driver) {
		super(driver);
		
	}
	
	String myCouponCodeLink = "Xpath://a[contains(text(),'Coupon Codes')]";
	
	public void takeMeToCouponCodePage() {
		clickElement(myCouponCodeLink);
		
	}

}
