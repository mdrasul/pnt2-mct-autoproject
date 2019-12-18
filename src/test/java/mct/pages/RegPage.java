package mct.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class RegPage extends MasterPage {

	public RegPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// All Locators Or XPath for this Page  
	String emailField = "ID:txtEmail";
	String userNameField = "ID:txtUserName";
	String passwordField = "ID:txtPassword";
	String cnfPassword = "ID:txtCnfPassword";	
	String firstNameField = "ID:txtFirstName";
	String lastNameField = "ID:txtLastName";
	String addressField = "Xpath://input[@placeholder='Address *']";
	String checknewsBox = "Name:check_news";
	String btnRegister = "ID:btnRegister";

	// What the Page Can Do Functions 

	//public void completeREgistraionWith(String email, String uname, String fname, String lname ) {
	public void completeREgistraionWith(String email, String uname, String fname, String lname, String address) {
		
		Random random = new Random();
		int regNumber = random.nextInt(1000);
		
		typeOnElement(emailField, "pranob"+regNumber+"@gmail.com"); 
		typeOnElement(userNameField, uname+regNumber);

		//typeOnElement(passwordField, "pass1234");
		//typeOnElement(cnfPassword, "pass1234");
		
		typeOnElement(passwordField, "pass1234");
		typeOnElement(cnfPassword, "pass1234");

		typeOnElement(firstNameField, fname);
		typeOnElement(lastNameField, lname);
		//typeOnElement(addressField, "38 Arkansas");
		typeOnElement(addressField, "address");

		clickElement(checknewsBox);
		clickElement(btnRegister);
	}
}
