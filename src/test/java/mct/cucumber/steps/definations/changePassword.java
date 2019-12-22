package mct.cucumber.steps.definations;

import java.awt.print.Pageable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class changePassword {
	
Mct_page_loader page; 
	
	// Constructor 
	public changePassword(Mct_page_loader page) {
		this.page = page;
	}
	
	

@When("user click on LogIn& Sign Up")
public void user_click_on_LogIn_Sign_Up() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 page.getHomePage().takeMetoSignUPPage();
	 page.getRegPage().completeREgistraionWith();
	
}




//@
@Given("user can see his name and click the myaccount")
public void user_can_see_his_name_and_click_the_myaccount() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
page.getRegPage().goToABCProfile();

}
@Given("User can click myaccount")
public void user_can_click_myaccount() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	page.getRegPage().gotoRegPagAccount();
	
}


@Given("im on my profil account")
public void im_on_my_profil_account() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
    page.getRegPage().goToABCProfile();
    page.getRegPage().gotoRegPagAccount();
    
    
}

@Then("I can change my password")
public void i_can_change_my_password() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	
	page.regPage.changePassword();
	
}

@Then("i excpet Password Change Succefully")
public void i_excpet_Password_Change_Succefully() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	page.getRegPage().validateCangePassword();
}

	
}
