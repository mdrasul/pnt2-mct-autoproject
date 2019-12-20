package mct.cucumber.steps.definations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class LogoNavigation_steps {
Mct_page_loader page; 


	
	// Constructor 
	public LogoNavigation_steps(Mct_page_loader page) {
		this.page = page;
	}

@When("User click on the MCT Logo, or anywhere surounding logo area")
public void user_click_on_the_MCT_Logo_or_anywhere_surounding_logo_area() {
	page.getLogoNavigationPage().GotoHomePg();
}

@Then("User finds Home Page is refresed")
public void user_finds_Home_Page_is_refresed() {
	page.getLogoNavigationPage().HomePageValidation();
}
@Then("I navigate to Profile page")
public void i_navigate_to_Profile_page() {
    page.getMyAcctProfile().GotoProfile();
}
@Then("I navigate to an order from Home Page")
public void i_navigate_to_an_order_from_Home_Page() {
    page.getHomePage().TakeMeToAnOrder();
}
@Then("I navigate to Accessories Page")
public void i_navigate_to_Accessories_Page() {
	page.getHomePage().TakeMeToAccessoriesPage();
}

}
