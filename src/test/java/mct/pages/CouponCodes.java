package mct.pages;

import org.openqa.selenium.WebDriver;

public class CouponCodes extends MasterPage {

	public CouponCodes(WebDriver driver) {
		super(driver);
		
	}
	
	String addnew = "Xpath://a[@class='add_new_button']";
	String couponCode = "Xpath://input[@id='txtCouponCode']";
	String startDate = "Xpath://input[@name='txtCouponStartDate']";
	String endDate = "Xpath://input[@name='txtCouponStartDate']";
	String discount = "Xpath://input[@id='txtCouponDiscount']";
	String addButton = "Xpath://input[@name='add']";
	
	public String addCouponLabel() {
		return getElementText(addnew);
	}
	public void addCouponOption() {
		clickElement(addnew);
	}
	public void addCouponDetails (String number, String idate, String edate, String percent) {
	typeOnElement(couponCode, number);
	typeOnElement(startDate, idate);
	typeOnElement(endDate, edate);
	typeOnElement(discount, percent);
}
	public void clickButton() {
		clickElement(addButton);
	}
}
