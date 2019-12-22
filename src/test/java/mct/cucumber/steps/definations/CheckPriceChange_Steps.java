package mct.cucumber.steps.definations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mct.cucumber.steps.supportcode.Mct_page_loader;

public class CheckPriceChange_Steps {
Mct_page_loader page; 
static String Total;	
	// Constructor 
	public CheckPriceChange_Steps(Mct_page_loader page) {
		this.page = page;
	}
	@When("User add products to cart")
	public void user_add_products_to_cart() {
	   page.getCheckPriceChangePage().addProducts();
	}

	@When("User see total {string} of prducts")
	public void user_see_total_price_of_prducts(String Price) {
	    Price = page.getCheckPriceChangePage().getTotal();
	    Total =Price;
	    //System.out.println(Total);
	}

	@When("User delete a products")
	public void user_delete_a_products() {
	   page.getCheckPriceChangePage().deleteProduct();
	}

	@Then("User see total {string} of products change")
	public void user_see_total_price_of_products_change(String Total) {
	   Total = page.getCheckPriceChangePage().getTotal();
	   if(Total.equals(this.Total)) {
		   System.out.print("Price didnt Change. Price:" + this.Total);
		   
	   }else {
		   System.out.print("Price Changed to\n" + Total);
	   }
	}
}