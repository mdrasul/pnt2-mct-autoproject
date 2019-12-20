package mct.cucumber.steps.definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;
import mct.pages.ProductCategoryPage;

public class Mct_cart_Addition_Deletion {
	
Mct_page_loader page; 
	
	// Constructor 
	public Mct_cart_Addition_Deletion(Mct_page_loader page) {
		this.page = page;
	}
	
	@When("User click shop now")
	public void user_click_shop_now() {
	
		page.getHomePage().shopNow();
	
		
	}

	@Then("User see product category and able to add product to cart")
	public void user_see_product_category_and_able_to_add_product_to_cart() {
	   
		page.getProductCategoryPage().takeMeToClothingCategory();
		page.getProductsPage().addCutCurbTshit();
		page.getViewCartPage().keetShopping();
	}

	@Given("User can see and select category")
	public void user_can_see_and_select_category() {
		page.getProductCategoryPage().takeMeToClothingCategory();
		
	}

	@When("user landed on specefic category page and select product")
	public void user_landed_on_specefic_category_page_and_select_product() {
		page.getProductsPage().addAvocadTshirt();
	}

	@Then("User can see second product added and able to delete")
	public void user_can_see_second_product_added_and_able_to_delete() {
	    page.getViewCartPage().checkBox(); 
	    page.getViewCartPage().deleteProduct();
	    
	}

	@Then("User can see product added to cart")
	public void user_can_see_product_added_to_cart() {
		page.getViewCartPage().keetShopping();
		page.getProductCategoryPage().takeMetoCoffeeCategory();
		page.getProductsPage().addCoffee();
		
	}



	

}
