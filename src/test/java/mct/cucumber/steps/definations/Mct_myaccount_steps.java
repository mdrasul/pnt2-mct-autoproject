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

	@Then("User see my account  label")
	public void user_see_my_account_label() {		
		String actualAccountPageLabel = page.getMyAccountPage().getMyAccountLabel();
		
		Assert.assertEquals(actualAccountPageLabel.toLowerCase(),"my account","Failed To Land On My Account Page !!! ");
	}

	
	
	@Then("User see all my account options in below table")
	public void user_see_all_my_account_options_in_below_table(DataTable optionTable) {
		
		// Converting GHERKIN Data Table to a List 
		List<String> expOptionList = optionTable.asList();

		
		// Getting the List Of option from our Real MCT My Account Page 
		List<String> actualOptionResult = page.getMyAccountPage().getAllOptions();
		
		
		// Validation Both List are Identical 
		assertThat(actualOptionResult, equalTo(expOptionList));

	}


}
