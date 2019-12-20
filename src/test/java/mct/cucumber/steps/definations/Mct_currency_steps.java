package mct.cucumber.steps.definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;
import mct.pages.HomePage;
import mct.util.SharedConfig;

public class Mct_currency_steps {

	
	Mct_page_loader page; 
	
	// Constructor 
	public Mct_currency_steps(Mct_page_loader page) {
		this.page = page;
	}
	
	@Then("User accesses United States Dollar in the dropdown")
	public void user_accesses_United_States_Dollar_in_the_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		page.homePage.currencyDropDown1();
		

	
		
	}
	
	@Then("User sees a currency symbol of a $ under {string}")
	public void user_sees_a_currency_symbol_of_a_$_under(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		String usDollarSymbol = "Xpath://span[contains(text(),'$')]";
		String isDollarSymbol = page.homePage.getElementText(usDollarSymbol);
		
		
	    Assert.assertEquals(isDollarSymbol,true,"Failed To Find the $ symbol ");
		
		
		
		
		
	}

	@When("User selects Indian Rupee from dropdown on MCT home page")
	public void user_selects_Indian_Rupee_from_dropdown_on_MCT_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException(); 
		
	 page.homePage.currencyDropDown2();
		
		
	}

	@When("User sees a currency symbol of ₹ under {string}")
	public void user_sees_a_currency_symbol_of_₹_under(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		String rupeeSymbol = "Xpath://span[contains(text(),'₹')]";
		String isIndianSymbol = page.homePage.getElementText(rupeeSymbol);
		
	    Assert.assertEquals(isIndianSymbol,true,"Failed To Find the ₹ symbol ");
	}

	@When("User selects Japanese Yen from dropdown on MCT home page")
	public void user_selects_Japanese_Yen_from_dropdown_on_MCT_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		page.homePage.currencyDropDown3();
		
		
	}

	@When("User sees a currency symbol of ¥ under {string}")
	public void user_sees_a_currency_symbol_of_¥_under(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		String yenSymbol = "Xpath://span[contains(text(),'¥')]";
		String isYenSymbol = page.homePage.getElementText(yenSymbol);
		
	    Assert.assertEquals(isYenSymbol,true,"Failed To Find the ¥ symbol ");
	}

	
}
