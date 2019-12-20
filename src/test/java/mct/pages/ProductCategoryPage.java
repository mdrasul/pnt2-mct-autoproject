package mct.pages;

import org.openqa.selenium.WebDriver;

public class ProductCategoryPage extends MasterPage {

	public ProductCategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	String clothingCategory = "Xpath:/html/body/div[2]/div/div/div/form/div[1]/section[2]/div[1]/div[2]/div/a";	
	String coffeeCategory = "Xpath://a[contains(text(),'Cofee makers> (1)')]";


	
	
	
	public void takeMeToClothingCategory () {
		
		clickElement(clothingCategory);
		
		}
	
	
	public void takeMetoCoffeeCategory () {
		
		clickElement(coffeeCategory);
	}
	
	
	
	
}
