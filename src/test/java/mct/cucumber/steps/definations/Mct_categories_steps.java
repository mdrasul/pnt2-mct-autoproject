package mct.cucumber.steps.definations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.List;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_categories_steps {

	Mct_page_loader page;

	public Mct_categories_steps(Mct_page_loader page) {
		this.page = page;

	}

	@Then("I see all categories on the header page below table")
	public void i_see_all_categories_on_the_header_page_below_table(DataTable optionTable) {

		List<String> expOptionList = optionTable.asList();

		List<String> actualCategoryPage = page.getmyCategoriesPage().getMyCategory();
		assertThat(actualCategoryPage, equalTo(expOptionList));

	}

	@When("I navigate to Accessories")
	public void i_navigate_to_Accessories() {

		page.getmyCategoriesPage().takeeMeToAccessories();

	}

	@When("I  exepcte to see {string}")
	public void i_exepcte_to_see(String string) {
		page.getmyCategoriesPage().ValedateAccessories();
		page.getmyCategoriesPage().ValedateAccessories();
		page.getmyCategoriesPage().ValedateClothing();
		page.getmyCategoriesPage().ValidateCofeeMakers();
		page.getmyCategoriesPage().ValidateDigital();
		page.getmyCategoriesPage().ValidateMore();
	}

	@When("I  navigate to Clothing")
	public void i_navigate_to_Clothing() {
	   
		page.getmyCategoriesPage().takeeMeToClothing();
	}

	@When("I  navigate to COFEE MAKERS")
	public void i_navigate_to_COFEE_MAKERS() {
		
		page.getmyCategoriesPage().takeeMeToCofeeMakers();

	}

	@When("I  navigate to DIGITAL")
	public void i_navigate_to_DIGITAL() {
		
		page.getmyCategoriesPage().takeeMeToDigital();
	}

	@When("I  navigate to MORE..")
	public void i_navigate_to_MORE() {
		
		page.getmyCategoriesPage().takeeMeToMorel();
	}


}
