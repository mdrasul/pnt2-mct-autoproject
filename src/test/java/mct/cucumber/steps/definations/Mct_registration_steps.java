package mct.cucumber.steps.definations;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;
import mct.pages.HomePage;
import mct.pages.RegPage;

public class Mct_registration_steps {
	
	Mct_page_loader mctPage;
	HomePage homePage;
	RegPage regPage;
	
	public Mct_registration_steps(Mct_page_loader page) {
		this.mctPage = page;
	}

	@Given("user is on mct home page")
	public void user_is_on_mct_home_page() {
		mctPage.getHomePage().gotoHomePage();
	}
	
	@Then("goto registration page")
	public void goto_registration_page() {
		mctPage.getHomePage().takeMetoSignUPPage();
	}
	
	@Given("User complete registration with email {string} id {string} first name {string} last name {string} address {string}")
	public void user_complete_registration_with_email_id_password_confirm_password_first_name_last_name_address(String email, String uname, String fname, String lname, String address) {
	    mctPage.getRegPage().completeREgistraionWith(email, uname, fname, lname, address);
	}
	
	@And("User see  profile name as pranob tusher")
	public void user_see_profile_name_as_PRANOB_TUSHER() {
		String actualProfileName = homePage.getProfileNameLabel();
		Assert.assertEquals(actualProfileName, "PRANOB TUSHER", "Failed To Find Profile Name");
	}
	
	@When("User click to Product Name")
	public void user_click_to_product_name() {
		mctPage.getHomePage().takeMetoProductDetailsPage();
	}
	/*
	 * @And("User click to go on product details page") public void
	 * user_click_to_go_on_product_details_page() { //String actualProductName =
	 * mctPage.getProductDetailsPage().getProductNameLabel();
	 * //System.out.println("ProductName: "+actualProductName);
	 * 
	 * 
	 * mctPage.getHomePage().takeMetoProductDetailsPage(); }
	 */
	
	
	  @And("User click on buy now button") 
	  public void user_click_on_buy_now_button() {
		  mctPage.getProductDetailsPage().addProductToShoppingCart(); 
	  }
	 
	  
	
	  @Then("User click on Check Out button") public void
	  user_click_on_check_out_button() {
	  mctPage.getMyOrdersPage().takeMeToShippingDetailsPage(); }
	 
	  
	  @When("User complete billing address")
	  public void user_complete_billing_address() {
		  mctPage.getShippingPage().completeShippingWith();
	  }
	  
	  @Then("User click on Proceed button")
	  public void user_click_on_proceed_button() {
		  mctPage.getCheckOutPage().proceedOnCheckOut();
	  }
	
	  @And("User click on payment method")
	  public void user_click_on_payment_method() {
		  mctPage.getCheckOutPage().goToPaymentMethods();
	  }
	  
	  @Then("User complete the card details")
	  public void user_complete_the_card_details() {
		  mctPage.getCheckOutPage().completeCardDetails();
	  }
	  
	  @And("User click confirm order")
	  public void user_click_confirm_order() {
		  mctPage.getCheckOutPage().completeOrder();
	  }
	  
	  @Then("User successfully complete the order")
	  public void user_successfully_complete_the_order() {
		  mctPage.getCheckOutPage().successfullyComplete();		  
	  }
	  
	
	/*
	 * @Then("User complete registration with email {string} id {string} password {string} confirm password {string} first name {string} last name {string} address {string}"
	 * ) public void User complete registration with() { // Write code here that
	 * turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 */
}


  