package mct.cucumber.steps.definations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_order_steps {

	Mct_page_loader page; 
	
	public Mct_order_steps(Mct_page_loader page) {
		this.page = page;
	}

	@When("I navigate to order page")
	public void i_navigate_to_order_page() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new cucumber.api.PendingException();
		
		page.getMyAccountPage().takeMetoMyOrderPage();
		
	}

	@Then("I see a table with al lmy orderes")
	public void i_see_a_table_with_al_lmy_orderes() {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new cucumber.api.PendingException();
		
		boolean isActualOrderTableisExist = page.getMyOrdersPage().isOrderTableExist();
		
		Assert.assertEquals(isActualOrderTableisExist,true,"Failed To Find the Order History Table ");
		
	}
	
	
	@Then("I exepct count {int} in my order table")
	public void i_exepct_count_in_my_order_table(int expCount) {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new cucumber.api.PendingException();
		
		// =>> Get the total number of rows from a web table 
		int actualCount = page.getMyOrdersPage().getTotalTableRowsCount()-1;
		
		
		
		Assert.assertEquals(actualCount,expCount,"Failed To Find the Correct Number of!!!");

		
	}


}
