package mct.cucumber.steps.definations;



import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class MCT_Footer_steps {

	Mct_page_loader page; 
	public  MCT_Footer_steps(Mct_page_loader page) {
		this.page=page;
	}

      @When("User enter the URL")
      public void user_enter_the_URL() {
	  page.getHomePage().gotoHomePage();

	
}

	@Then("User should Scrool to see MTC Footer Table")
	public void user_should_Scrool_to_see_MTC_Footer_Table() {
		page.getHomePage().scrollDown();
		
	}

	@When("User inisde the footer")
	public void user_inisde_the_footer() {
		page.getHomePage().scrollDown();
		
		page.getMyFooterPage();
	
		
	}

	@Then("User see all Footer Element Options in below table")
	public void user_see_all_Footer_Element_Options_in_below_table(DataTable optionTable) {
		
		List<String> list =	optionTable.asList();
		String expected = "";
		for (int i = 0; i < list.size(); i++) {
			expected = list.get(i);
			
		}
		
		
		//page.getMyFooterPage().checkIfAllfooterTableAreDisplyed();
		
		
	String actual=	page.getMyFooterPage().FindAllFooterPageElements();
	
	Assert.assertEquals(actual,expected, "Not found");
	
	//assertThat(actual,equalTo(expected));
	
	
	}

	
	}





