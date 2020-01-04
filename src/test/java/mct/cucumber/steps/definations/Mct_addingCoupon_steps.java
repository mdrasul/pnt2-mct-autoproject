package mct.cucumber.steps.definations;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_addingCoupon_steps {

	Mct_page_loader page; 

	public Mct_addingCoupon_steps(Mct_page_loader page) {
		this.page = page;
	}


	@Given("I go to seller dashboard page")
	public void i_go_to_seller_dashboard_page() {
		page.getMyAccountPage().takeMeToSellerDashboardPage();
	}

	@Given("I go to Coupon Codes section")
	public void i_go_to_Coupon_Codes_section() {
		page.getSellerDashboard().takeMeToCouponCodePage();
	}

	@Then("I see add new coupon code label")
	public void i_see_add_new_coupon_code_label() {
		String actualAddCouponLabel = page.getCouponCodes().addCouponLabel();
		
		Assert.assertEquals(actualAddCouponLabel.toLowerCase(),"add new","new coupon code can be added!");
	}

	@Given("I am on the adding coupon page")
	public void i_am_on_the_adding_coupon_page() {
		page.getCouponCodes().addCouponOption();
	}

	@Then("I fill out the details")
	public void i_fill_out_the_details() {
		page.getCouponCodes().addCouponDetails("404", "01/15/2020", "02/22/2020", "20");
	}

	@Then("I add the coupon code.")
	public void i_add_the_coupon_code() {
	page.getCouponCodes().clickButton();
	}


}
