package mct.cucumber.steps.definations;



import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_ChangeProfile_Steps {

	Mct_page_loader page; 
	
	// Constructor 
	public Mct_ChangeProfile_Steps(Mct_page_loader page) {
		this.page = page;
	}
	@When("User is in Profile Page")
	public void user_is_in_Profile_Page() {
		page.getProfilePage().goToProfilePage();
	}

@When("User chnage profile first name {string}")
public void user_chnage_profile_first_name(String FirstName) {
		   page.getProfilePage().ChangeFirstName(FirstName);
}

@When("User change profile last name {string}")
public void user_change_profile_last_name(String LastName) {
	page.getProfilePage().ChangeLastName(LastName);
    
}
}