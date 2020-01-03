package mct.cucumber.steps.definations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class Mct_addingProduct_steps {

	Mct_page_loader page; 
	
	public Mct_addingProduct_steps(Mct_page_loader page) {
		this.page = page;
	}
		
		//@Given("User is on MCT home page")
		//	public void user_is_on_MCT_home_page() {		
		//		page.getHomePage().gotoHomePage();	
		//}

		//@When("UUser complete login with id {string} password {string}")
		//	public void user_complete_login_with_id_password(String id, String password) {
				
		//		page.getHomePage().loginTest(id,password);
		//}

		@Then("User go to Seller Dashboard page")
		public void user_go_to_Seller_Dashboard_page() {
		  page.getMyAccountPage().takeMetoSellerDashboardPage();
		}

		@Given("User is on the Seller Dashboard page")
		public void user_is_on_the_Seller_Dashboard_page() {
			 page.getMyAccountPage().takeMetoSellerDashboardPage();
		}

		@When("User go to my products")
		public void user_go_to_my_products() {
			page.getMySellerDashboardPage().takeMeToMyProductsPage();
		}

		@Then("User see option to add a product label")
		public void user_see_option_to_add_a_product_label() {
			String actualAddProductLabel = page.getMyProductsPage().getAddProductLabel();
			
			Assert.assertEquals(actualAddProductLabel.toLowerCase(),"add new product","Product can be added!");
		}

		@Given("User is on the my products page")
		public void user_is_on_the_my_products_page() {
			page.getMySellerDashboardPage().takeMeToMyProductsPage();
		}

		@Given("User is on the adding product page")
		public void user_is_on_the_adding_product_page() {
			page.getMyProductsPage().takeMeToAddingProduct();
		}

		@When("User fill out required information")
		public void user_fill_out_required_information() {
			page.getMyProductsPage().addDetails("hair dryer", "dries hair", "$40", "401", "1.5", "9", "5", "7");
		}

		@Then("product is added")
		public void product_is_added() {
		   page.getMyProductsPage().addProduct();
		   }

		

}
