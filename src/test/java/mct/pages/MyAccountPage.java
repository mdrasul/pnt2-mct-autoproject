package mct.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends MasterPage {

	
	
	// All Locators Or XPath for this Page 
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
// My account page all the web elements xpath
	//String myOrder ="Xpath://a[text()='My Orders']";
	String profile ="Xpath://a[text()='Profile']";
	String myReturn = "Xpath://a[text()='My Return Requests']";
	String passWord ="Xpath://a[text()='Change Password']";
	String myFavoriteProduct="Xpath://a[text()='My Favorite Products']";
	String myFavoriteSellers ="Xpath://a[contains(text(),'My Favorite Sellers')]";
			//a[text()='My Favorite Sellers']"; 
    String SellerDashboard="Xpath://a[text()='Seller Dashboard']";
	

	String myAccountLabel = "Xpath:.//*[@id='item_details']/section/div/h3";
	String LocatorsOfAllOptions = "Xpath://div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a";
	
	String myorderLink = "Xpath://a[text()='My Orders']";

	
	// Getter & Setters -

	public String getMyAccountLabel() {
		return getElementText(myAccountLabel);
	}


	public List<String> getAllOptions() {
		
		// Get the Locators Of all the Option And Return the Text in All Options Back 
		return getElementsText(LocatorsOfAllOptions);
		
	}

	
	public void takeMetoMyOrderPage() {
		
		clickElement(myorderLink);	
	}
	
	/////// New
public void takeMetoProfilePage() {
		
		clickElement(profile);		
	}
	
public void takeMetoReturnPage() {
	
	clickElement(myReturn);

}
public void takeMetoPasswordPage() {
	
	clickElement(passWord);	
}
public void takeMetoFavoriteProductPage() {
	
	clickElement(myFavoriteProduct);
	
}

public void takeMetoFavoriteSeller() {
	
	clickElement(myFavoriteSellers);
}
	
public void takeMetoSellerDashboardPage() {
	
	clickElement(SellerDashboard);	
}
	
	// What the Page Can Do Functions 

	
	
}
