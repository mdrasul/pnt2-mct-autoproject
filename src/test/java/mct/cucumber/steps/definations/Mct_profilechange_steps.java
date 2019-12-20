package mct.cucumber.steps.definations;

import java.util.Random;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_profilechange_steps {
	 Mct_page_loader page;
	  
	  public Mct_profilechange_steps(Mct_page_loader page) { this.page = page; }

	@When("User navigate to SignUp Page")
	public void user_navigate_to_SignUp_Page() {
		page.getHomePage().takeMetoSignUPPage();
	}

	@Then("User create account with user id and email and firstName and lastName")
	public void user_create_account_with_user_id_and_email_and_firstName_and_lastName() {
		
			  
			  Random rand = new Random(); int regNumber = rand.nextInt(1000);
			  
			  page.getRegPage().completeREgistraionWith("abc" + regNumber + "@gmail.com",
			  "abc" + regNumber, "Mr", "abc" + regNumber);
			  
			  }
	

	@Then("User goto myaccount page")
	public void user_goto_myaccount_page() {
		page.getHomePage().takeMetoMyAccountPage();
	}

	@Then("User navigate to profile page")
	public void user_navigate_to_profile_page() {
		page.getMyAccountPage().takeMetoProfilePage();
	}

	@Then("User can Update the profile Information with All required Feild")
	public void user_can_Update_the_profile_Information_with_All_required_Feild() {
	    page.getProfilePage().completeProfileWith("1020 11th st", "xyz", "United State", "Alabama", "11111");
	}

	@Then("User go back to MyAccount page")
	public void user_go_back_to_MyAccount_page() {
	    page.getProfilePage().goBackToMyAccountPage();
	}

	@When("User Login with user and pass")
	public void user_Login_with_user_and_pass() {
	    page.getHomePage().loginTest("abc", "123");
	}
	
	@Then("User go to MyAccount Page")
	public void user_go_to_MyAccount_Page() {
	    page.getHomePage().takeMetoMyAccountPage();
	}

	@Then("User nevigate to profilePage")
	public void user_nevigate_to_profilePage() {
	    page.getMyAccountPage().takeMetoProfilePage();
	}

	@Then("User change the the address and save that")
	public void user_change_the_the_address_and_save_that() {
	    page.getProfilePage().profileChangeWithAddress("555 122th st");
	}
	
	@Then("User logout")
	public void user_logout() {
	    page.getHomePage().logOut();
	}

	

	
	@Then("User  veriry the address changed as {string}")
	public void user_veriry_the_address_changed_as(String expected) {
		 String changedAdd = page.getProfilePage().getAdd1();
				  
				  
	 Assert.assertEquals(changedAdd.toLowerCase(), expected.toLowerCase(),"Failed to changed");
				   
				  
	}
	    

}
