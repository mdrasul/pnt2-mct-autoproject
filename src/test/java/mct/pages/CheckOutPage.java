package mct.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends MasterPage{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	
	  String proceedButton ="Xpath://*[@id='item_details']/div[3]/div/table/tbody/tr[5]/td/input[@type='submit']";
	  String paymentMethodImage = "Xpath://div[@class='payment_page_options']/table/tbody/tr[4]/td/a/img[@title='Pay with Credit Card']";
	  String cardNumberField = "ID:txtCCNumber";
	  String cardValidationCode = "ID:txtCVV2";
	  //String validYearField = "Xpath://select[@id='txtYY']/option";
	  String validYearField = "Xpath://select[@id='txtYY']";
	  String completeOrder = "Xpath://div[@class='payments_styles']/table/tbody/tr[8]/td/input[@id='btnCompleteOrder']";
	  
	
	  public void proceedOnCheckOut() { 
		  waitFor(5000);
		  clickElement(proceedButton); 
		  
	  }
	  
	  public void goToPaymentMethods() { 
		  waitFor(5000);
		  clickElement(paymentMethodImage); 
		  
	  }
	  
	  public void completeCardDetails() { 
		  Select select = new Select(driver.findElement(By.id("txtYY")));
		  select.selectByVisibleText("2021");
		  String strSelect = String.valueOf(select);
		typeOnElement(cardNumberField, "4111111111111111");
		typeOnElement(cardValidationCode, "132");
		waitFor(3000);
		typeOnElement(validYearField,strSelect);
		
	  }
	  
	  public void completeOrder() {
		  waitFor(7000);
		  clickElement(completeOrder); 
	  }
	  
	  public void successfullyComplete() {
		  System.out.println("Your order has been successfully placed!");
	  }
	 
	
	
	
}


