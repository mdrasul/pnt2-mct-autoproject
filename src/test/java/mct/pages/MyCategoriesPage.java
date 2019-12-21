package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyCategoriesPage extends MasterPage {

	public MyCategoriesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	String MyCategory = "Xpath://div[@id='category_list']";
	String Accessories = "Xpath://a[@title='Accessories']";
	String Clothing = "Xpath://a[@title='Clothing']";
	String CofeeMakers = "Xpath://a[@title='Cofee makers']";
	String Digital = "Xpath://a[@title='Digital']";
	String More = "Xpath://a[@title='Category List']";

	String ValidateAccessories = "Xpath://*[@title='Headset With Mic']";
	String ValidateClothing = "Xpath://*[@title='Peters casual']";
	String ValidateCofeeMakers = "Xpath://*[@title='cups Coffee Maker  ']";
	String ValidateDigital = "Xpath://*[@title='Media']";
	String ValidateMore = "Xpath://*[@title='Gift Certificate'][2]";

	public List<String> getMyCategory() {

		return getElementsText(MyCategory);

	}

	public void takeeMeToAccessories() {
		clickElement(Accessories);

	}

	public String ValedateAccessories() {

		return getElementText(ValidateAccessories);
	}

	public void takeeMeToClothing() {
		clickElement(Clothing);
         System.out.println("");
	}

	public String ValedateClothing() {

		return getElementText(ValidateClothing);
	}

	public void takeeMeToCofeeMakers() {
		clickElement(CofeeMakers);

	}

	public String ValidateCofeeMakers() {

		return getElementText(ValidateCofeeMakers);
	}

	public void takeeMeToDigital() {
		clickElement(Digital);

	}

	public String ValidateDigital() {

		return getElementText(ValidateDigital);
	}

	public void takeeMeToMorel() {
		clickElement(More);

	}

	public String ValidateMore() {

		return getElementText(ValidateMore);
	}

}
