package mct.cucumber.steps.definations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import io.cucumber.java.en.And;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_search_steps {

    Mct_page_loader page;

    public Mct_search_steps(Mct_page_loader page) {
        this.page = page;
    }


    @When("User clicks on searchbox")
    public void user_clicks_on_searchbox() {

        page.getHomePage().clickSearchBox();
    }

    @And("User enters negative keys")
    public void send_negative_keys_to_searchbox() {

        page.getHomePage().sendNegativeKeysToSearchBox();
    }

    @And("User enters positive keys")
    public void positive() {

        page.getHomePage().sendPositiveKeysToSearchBox();
    }

    @And("User clicks search button")
    public void click_search_button() {

        page.getHomePage().clickSearcButton();
    }

    @Then("User sees a error message")
    public void error_message(){
        Assert.assertEquals(page.getHomePage().getNoSearchResultMessage(), ("No Results Found !!"));
    }

    @Then("User sees shirt description")
    public void shirt_description(){
        Assert.assertEquals(page.getHomePage().getShirtDescription(), ("MEN BLUE SOLID ROUND NECK.."));
    }
}