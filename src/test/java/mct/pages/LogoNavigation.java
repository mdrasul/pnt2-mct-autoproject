package mct.pages;

import org.openqa.selenium.WebDriver;

public class LogoNavigation extends MasterPage{

	public LogoNavigation(WebDriver driver) {
		super(driver);
		
	}
	String MCTLogo="Xpath://*[@class='img-responsive']";
	String MCTWelcomeNote="Xpath://*[@class='welcomenote']";
public void GotoHomePg() {
	
	clickElement(MCTLogo);
	System.out.println("User clicked on MCT Logo");
	
}


public void HomePageValidation() {
	elementExist(MCTWelcomeNote);
	System.out.println("Home Page Welcome greeting:\n" +getElementText(MCTWelcomeNote));
	
}
}
