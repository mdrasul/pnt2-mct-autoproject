package mct.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;

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
    
	String changePassword = "Xpath://a[@href='changepassword.php'][1]";
    String oldPassword = "Xpath://input[@name='txtOldPassword']";
    String newPassword ="Xpath://input[@name='txtPassword']";
    String confirmPassword ="Xpath://input[@name='txtConfirmPassword']";
    String submitchangePassword ="Xpath://input[@value='Change Password']";

    String clickonMyprofile ="Xpath://i[@class='fa fa-user-circle-o']";
    String goToMyProfile ="Xpath://*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
  String succefullyChangePassword = "Xpath://div[@class='success']";

	// What the Page Can Do Functions 

	public void completeREgistraionWith( ) {
Random random = new Random();
int number = random.nextInt();
		typeOnElement(emailField, "abc"+number+"@gmail.com"); 
		typeOnElement(userNameField, "abc"+number+"d");

		typeOnElement(passwordField, "challenge");
		typeOnElement(cnfPassword, "challenge");

		typeOnElement(firstNameField, "abc");
		typeOnElement(lastNameField, "cb");
		typeOnElement(addressField, "123 Fifth Ave");

		clickElement(checknewsBox);
		clickElement(btnRegister);
	}
	
public void goToABCProfile() {
	
	
		clickElement(clickonMyprofile);
	
	}
		
	
public void gotoRegPagAccount() {
	
	clickElement(goToMyProfile);
}
	public void changePassword() {
		Random random = new Random();
		int number = random.nextInt();
		clickElement(changePassword);
		typeOnElement(oldPassword, "challenge");
		typeOnElement(newPassword, "abc"+number+"d");
		typeOnElement(confirmPassword, "abc"+number+"d");
		clickElement(submitchangePassword);
		
	}
	public String validateCangePassword() {
		return getElementText(succefullyChangePassword);
		
	
	}
}




