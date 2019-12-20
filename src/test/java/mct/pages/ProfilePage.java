package mct.pages;

import org.openqa.selenium.WebDriver;

public class ProfilePage extends MasterPage {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}

	String profileFirstNameField = "Xpath://input[contains(@name,'txtFirstName')]";
	String profileLastNameField = "Xpath://input[contains(@name,'txtLastName')]";
	String profileemailField = "Xpath://input[contains(@name,'txtEmail')]";
	String addressline1Field = "Xpath://input[contains(@name,'txtAddress1')]";
	String addressline2Field = "Xpath://input[contains(@name,'txtAddress2')]";
	String cityField = "Xpath://input[contains(@name,'txtCity')]";
	String countryField = "billCountrySelect";
	String stateField = "billStateSelect";
	String zipField = "Xpath://input[contains(@name,'txtZIP')]";
	String faxField = "Xpath://input[contains(@name,'txtFAX')]";
	String saveChangeBtn = "Xpath://input[contains(@name,'btnSaveChanges')]";
	String backToMyAccountBtn = "//input[contains(@name,'btnBack')]";

	public void completeProfileWith(String add1, String city, String country, String state, String zip) {

		typeOnElement(addressline1Field, add1);
		typeOnElement(cityField, city);

		selectElement(countryField, country);

		selectElement(stateField, state);

		typeOnElement(zipField, zip);

		clickElement(saveChangeBtn);
	}

	public void profileChangeWithEmail(String email) {
		
		

		typeOnElementForChange(profileemailField, email);
		clickElement(saveChangeBtn);
		
	}

	public String getEmail() {
		return getElementText(profileemailField);
	}

	public void profileChangeWithAddress(String add1) {

		typeOnElementForChange(addressline1Field, add1);
		clickElement(saveChangeBtn);
		
	}

	public String getAdd1() {
		return getElementText(addressline1Field);
	}
	
	public void goBackToMyAccountPage() {
		clickElement(backToMyAccountBtn);
	}

}
