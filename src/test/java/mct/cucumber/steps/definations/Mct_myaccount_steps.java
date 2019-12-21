package mct.cucumber.steps.definations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_myaccount_steps {

	Mct_page_loader page; 
	
	public Mct_myaccount_steps(Mct_page_loader page) {
		this.page = page;
	}

		
	@When("I goto myaccount page")
	public void i_goto_myaccount_page() {

		page.getHomePage().takeMetoMyAccountPage();
	}

	/*
	 * @Then("User see my account  label") public void user_see_my_account_label() {
	 * String actualAccountPageLabel = page.getMyAccountPage().getMyAccountLabel();
	 * 
	 * Assert.assertEquals(actualAccountPageLabel.toLowerCase(),"my account"
	 * ,"Failed To Land On My Account Page !!! "); }
	 * 
	 * 
	 * 
	 * @Then("User see all my account options in below table") public void
	 * user_see_all_my_account_options_in_below_table(DataTable optionTable) {
	 * 
	 * // Converting GHERKIN Data Table to a List List<String> expOptionList =
	 * optionTable.asList();
	 * 
	 * 
	 * // Getting the List Of option from our Real MCT My Account Page List<String>
	 * actualOptionResult = page.getMyAccountPage().getAllOptions();
	 * 
	 * 
	 * // Validation Both List are Identical assertThat(actualOptionResult,
	 * equalTo(expOptionList));
	 * 
	 * }
	 */

@When("I click My Order Page")
public void i_click_My_Order_Page() {
    
	page.getMyAccountPage().takeMetoMyOrderPage();
}

@Then("I saw My Order Page")
public void i_saw_My_Order_Page() {

  String actual = page.getMyOrdersPage().verifiedOrder();
  Assert.assertEquals(actual, "Orders", "Not Found");
  page.getMyOrdersPage().navigateBack();

}

@When("I click Profile Page")
public void i_click_Profile_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	page.getMyAccountPage().takeMetoProfilePage();
	
}

@Then("I saw My Profile Page")
public void i_saw_My_Profile_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	  String actual = page.getProfilePage().verifiedProfile();
	  Assert.assertEquals(actual, "Profile", "Not Found");
	  page.getProfilePage().navigateBack();
	  
	
}

@When("I click My Return Requests Page")
public void i_click_My_Return_Requests_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	page.getMyAccountPage().takeMetoReturnPage();
}

@Then("I saw My Return Request Page")
public void i_saw_My_Return_Request_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	  String actual = page.getMyReturnRequeste().verifiedMyReturnRequest();
	  Assert.assertEquals(actual, "My Return Requests", "Not Found");
	  page.getMyReturnRequeste().navigateBack();
	
	
}

@When("I click Change Password Page")
public void i_click_Change_Password_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	page.getMyAccountPage().takeMetoPasswordPage();
}

@Then("I saw Change Password Page")
public void i_saw_Change_Password_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	  String actual = page.getChangedPassword().verifiedChangePassword();
	  Assert.assertEquals(actual, "Change Password", "Not Found");
	  page.getChangedPassword().navigateBack();
}

@When("I click My Favorite Products Page")
public void i_click_My_Favorite_Products_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	page.getMyAccountPage().takeMetoFavoriteProductPage();
}

@Then("I saw My Favorite Products Page")
public void i_saw_My_Favorite_Products_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	  String actual = page.getMyFavoriteProducts().verifiedMyFavoriteProducts();
	  Assert.assertEquals(actual, "My Favorite Products", "Not Found");
	  page.getMyFavoriteProducts().navigateBack();
}

@When("I click My Favorite Sellers Page")
public void i_click_My_Favorite_Sellers_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	
	page.myAccountPage.takeMetoFavoriteSeller();
}

@Then("I saw My Favorite Sellers Page")
public void i_saw_My_Favorite_Sellers_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	  String actual = page.getMyFavoriteSellers().verifiedFavoriteSeller();
	  Assert.assertEquals(actual, "My Favorite Sellers", "Not Found");
	  page.getMyFavoriteSellers().navigateBack();
}

@When("I click Seller Dashboard Page")
public void i_click_Seller_Dashboard_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	page.myAccountPage.takeMetoSellerDashboardPage();
}

@Then("I saw Seller Dashboard Page")
public void i_saw_Seller_Dashboard_Page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	
	  String actual = page.getSellersDashboard().verifiedSellersDashboard();
	  Assert.assertEquals(actual, "Catalog", "Not Found");
	  page.getSellersDashboard().navigateBack();
}


	
	
	
	
	
	

}
