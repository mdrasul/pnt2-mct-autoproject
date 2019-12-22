package mct.pages;

import org.openqa.selenium.WebDriver;

public class ProfilePage extends MasterPage {
	
	String ProfilePageLink="Xpath://a[text()='Profile']";
	String FirstName="Xpath://*[@name='txtFirstName']";
	String SaveChangeButton="Xpath://*[@value='Save Changes']";
	String LastName="Xpath://*[@name='txtLastName']";
	
	
	
	
	public ProfilePage(WebDriver driver) {
		super(driver); // Giving it to its master or parent calss
	}
	
	public void goToProfilePage() {
		clickElement(ProfilePageLink);
	}
	public void ChangeFirstName(String Firstname) {
		clearElement(FirstName);
		typeOnElement(FirstName, Firstname);
		clickElement(SaveChangeButton);
	}
	public void ChangeLastName(String lastname) {
		clearElement(LastName);
		typeOnElement(LastName, lastname);
		clickElement(SaveChangeButton);
	}

}