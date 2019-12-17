package mct.cucumber.steps.definations;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import io.cucumber.java.en.Given;
import mct.cucumber.steps.supportcode.Mct_page_loader;



public class Mct_ValidateFooter_steps {
	
	
	public static int i=0;
Mct_page_loader page; 
	public Mct_ValidateFooter_steps(Mct_page_loader page) {
		this.page = page;
	}
	
	@Given("User can go to footer links")
	public void user_can_go_to_footer_links() throws ClientProtocolException, IOException {
		page.getFooterLinkValidation().getFooterLinkInformation();
	}
}
	
