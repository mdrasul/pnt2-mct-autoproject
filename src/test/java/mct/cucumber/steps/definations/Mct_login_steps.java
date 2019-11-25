package mct.cucumber.steps.definations;

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
	
	@When("User complete login with id {string} password {string}")
	public void user_complete_login_with_id_password(String id, String password) {
		
		page.getHomePage().loginTest(id,password);
	}

	@Then("User see  profile name as {string}")
	public void user_see_profile_name_as(String expectedProfileName) {
		
		String actualProfileName = page.getHomePage().getProfileNameLabel();
		Assert.assertEquals(actualProfileName.toLowerCase(),expectedProfileName.toLowerCase(),"Failed To FInd Proper Profile Name ");
	}

	
}
