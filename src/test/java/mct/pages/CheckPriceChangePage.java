package mct.pages;


	import org.openqa.selenium.WebDriver;

	public class CheckPriceChangePage extends MasterPage{
		
		String product1 ="Xpath://a[@title='Levt Cloth']";
		String product2 ="Xpath://div/h5/a";
		String BuyNow ="Xpath://button[@class='detail_page_buynow_btt']";
		String ContinueShopping ="Xpath://input[@value='Continue Shopping']";
		String DeleteProduct = "Xpath://input[@value='Delete Selected']";
		String Clothing = "Xpath://a[@title='Clothing']";
		String HeadSet ="Xpath://div/a[@title='Head sets']";
		String Accessories ="Xpath://a[@title='Accessories']";
		String Total = "Xpath://td[@class='total_td_right']";
		String SelectCheckBox = "Xpath://tr[4]/td/input[@type='checkbox']";
		
		
		public CheckPriceChangePage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		public void addProducts() {
			clickElement(Clothing);
			clickElement(product1);
			clickElement(BuyNow);
			clickElement(ContinueShopping);
			clickElement(HeadSet);
			clickElement(product2);
			clickElement(BuyNow);
			}
		
		public String getTotal() {
			System.out.println("The Total is:\n" +getElementText(Total));
			return getElementText(Total);
			
		}
		public void deleteProduct() {
			clickElement(SelectCheckBox);
			clickElement(DeleteProduct);
			System.out.println("After deleting a Product\nThe Total is:\n"+ getElementText(Total));
			getElementText(Total);
			
		}
		
	}

