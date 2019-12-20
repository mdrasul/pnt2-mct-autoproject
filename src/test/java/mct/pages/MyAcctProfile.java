package mct.pages;

import org.openqa.selenium.WebDriver;

public class MyAcctProfile extends MasterPage {
	
	String ProfilePage= "Xpath://a[text()='Profile']";
	String FirstName= "Xpath://*[@name='txtFirstName']";
	String SaveChange= "Xpath://*[@name='btnSaveChanges']";
	
	
		public MyAcctProfile(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		public void GotoProfile() {
			
			clickElement(ProfilePage);
			
		}
 
}	
	 
	 
	 
	 
	 
	 
	