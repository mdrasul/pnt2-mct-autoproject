package mct.pages;


import org.openqa.selenium.WebDriver;

public class MyProductsPage extends MasterPage {

	public MyProductsPage(WebDriver driver) {
		super(driver);
		}

	String addProductLabel = "Xpath://a[@class='add_new_button']";
	String accessories = "Xpath://a[text()=\"Accessories\"]";
	String productName ="Xpath://*[@id=\"txtProductName\"]";
	String productDescription = "Xpath://*[@id=\"cke_1_contents\"]/iframe";
	String price = "Xpath://input[@id='txtPrice']";
	String publishOption = "Xpath://input[@id='jQPublish_Y']";
	String proceedbutton1 = "Xpath://button[@id='primery_btt_tab_1']";
	String proceedbutton2 = "Xpath://button[@id='primery_btt_tab_2']";
	String productStock = "Xpath://input[@id='product_stock[]']";
	String shippingWeight = "Xpath://*[@id=\"product_shipping_weight[]\"]";
	String length = "Xpath://input[@id='product_length[]']";
	String width = "Xpath://*[@id=\"product_width[]\"]";
	String height = "Xpath://*[@id=\"product_height[]\"]";
	String addProductButton = "Xpath://button[@name='btnAddProduct']";
	
	public String getAddProductLabel() {
		return getElementText(addProductLabel);
	}
	public void takeMeToAddingProduct() {
		clickElement(addProductLabel);
	}
		
	public void addDetails(String name, String description, String price$, String stock, String weight, 
			String lengthIn, String wide, String tall ) {
		clickElement(accessories);
		waitFor(1000);
		typeOnElement(productName, name);
		typeOnElement(productDescription, description);
		typeOnElement(price, price$);
		clickElement(publishOption);
		clickElement(proceedbutton1);
		clickElement(proceedbutton2);
		typeOnElement(productStock, stock);
		typeOnElement(shippingWeight, weight);
		typeOnElement(length, lengthIn);
		typeOnElement(width, wide);
		typeOnElement(height, tall);
	}
		public void addProduct() {
		clickElement(addProductButton);
		
	}
}
