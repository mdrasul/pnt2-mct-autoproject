package mct.cucumber.steps.definations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.*;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mct.cucumber.steps.supportcode.Mct_page_loader;



public class ProductVerify {

	Mct_page_loader page;
	WebDriver driver;

	public ProductVerify(Mct_page_loader page) {
		this.page = page;
	}

	@Given("as a user i scroll down our products")
	public void as_a_user_i_scroll_down_our_products() {

		page.getHomePage().ourProducts();

		//throw new cucumber.api.PendingException();
	}

	
	@Then("I exepct items options in below table")
	public void i_exepct_items_on_table(DataTable optionTable) {

		// Converting GHERKIN Data Table to a List 
				List<String> expOptionList = optionTable.asList();

				
				// Getting the List Of option from our Real MCT My Account Page ""
				List<String> actualOptionResult = page.getHomePage().verifyourProducts( );
				
				
				// Validation Both List are Identical 
				Assert.assertEquals(actualOptionResult, expOptionList);

		
	
		
		
		//throw new cucumber.api.PendingException();
	}

}

	
	
