package mct.cucumber.steps.definations;

import io.cucumber.java.en.And;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_login_steps {

	
	Mct_page_loader page; 
	
	// Constructor 
	public Mct_login_steps(Mct_page_loader page) {
		this.page = page;
	}
	
	@Given("User is on MCT home page")
	public void user_is_on_MCT_home_page() {		
		page.getHomePage().gotoHomePage();		
	}
	
	@When("User clicks on Login link")
	public void user_clicks_on_Login_link() {
	page.getHomePage().clickLoginLink();
	}

	@And("User enters username")
	public void user_enters_username() {
		page.getHomePage().SendKeysToUserName();
	}

	@And("User enters invalid username")
	public void user_enters_invalid_username() {
		page.getHomePage().SendInvalidKeysToUserName();
	}

	@And("User enters invalid password")
	public void user_enters_invalid_password() {
		page.getHomePage().SendInvalidKeysToPassWord();
	}

	@And("User enters password")
	public void user_enters_password() {
		page.getHomePage().SendKeysToPassWord();
	}

	@And("User clicks login")
		public void user_clicks_login() {
			page.getHomePage().clickLoginButton();
		}

	@Then("User validates profile name")
	public void user_validates_profile_name() {
		Assert.assertEquals(page.getHomePage().getProfileName(), "TEST USER");
	}

	@Then("User validates Invalid Login Link")
	public void user_validates_invalid_login_link() {
		Assert.assertEquals(page.getHomePage().getURL(), "https://www.demo.iscripts.com/multicart/demo/login.php?flag=0&txtUserName=IncorrectUsername");
	}

	@Then("User can logout")
	public void user_can_logout() {
page.getHomePage().clickLogoutButton();	}

	@Then("User can click on profile name")
	public void user_can_click_profilelabel() {
		page.getHomePage().clickProfileName();	}
}


