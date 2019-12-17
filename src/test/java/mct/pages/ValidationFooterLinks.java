package mct.pages;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import org.openqa.selenium.WebDriver;

import mct.util.LinkTest;

public class ValidationFooterLinks extends MasterPage{
	//Get To know Us 
	int FooterLocatorSize =18;
	String [] LocatorsOfFooter = new String[FooterLocatorSize];
	
	String About_Us = "Xpath://a[text()='About Us']";
	String FAQ = "Xpath://a[text()='FAQ']";
	String Help = "Xpath://a[text()='Help']";
	String Site_FeedBack = "Xpath://a[text()='Site Feedback']";
	String Terms_Condition = "Xpath://a[text()=' Terms & Conditions']";
	String Contact_Us ="Xpath://a[text()='Contact Us']";
	
	//Shop With us
	String Combo_Products = "Xpath://a[text()='Combo Products']";
	String New_Products = "Xpath://a[text()='New Products']";
	String Featured_Products = "Xpath://a[text()='Featured Products']";
	String Categories = "Xpath://a[text()='Categories']";
	String ViewCart = "Xpath://*[text()='View Cart']";
	String Gift_Cert = "Xpath://a[text()='Gift Certificate']";
	
	//Make Money with us
	String Affiliated = "Xpath://a[text()='Affiliates']";
	String Home_Link = "Xpath://a[text()='Home']";
	String Sellers = "Xpath://a[text()='Sellers']";
	
	
	//Twitter and Facebook
	
	String Twitter_Img = "Xpath://a[@title='Twitter']";
	String Facebook_Img = "Xpath://a[@title='Facebook']";
	
	
	
	//Email
	String Email_Textbox = "Xpath://input[@name='footer_user_email']";
	
	
	
	public ValidationFooterLinks(WebDriver driver) {
		super(driver);
	}
	public void getFooterLinkInformation() throws ClientProtocolException, IOException {
		LocatorsOfFooter[0]=About_Us;
		LocatorsOfFooter[1]=FAQ;
		LocatorsOfFooter[2]=Help;
		LocatorsOfFooter[3]=Site_FeedBack;
		LocatorsOfFooter[4]=Terms_Condition;
		LocatorsOfFooter[5]=Contact_Us;
		LocatorsOfFooter[6]=Combo_Products;
		LocatorsOfFooter[7]=New_Products;
		LocatorsOfFooter[8]=Featured_Products;
		LocatorsOfFooter[9]=Categories;
		LocatorsOfFooter[10]=ViewCart;
		LocatorsOfFooter[11]=Gift_Cert;
		LocatorsOfFooter[12]=Home_Link;
		LocatorsOfFooter[13]=Sellers;
		LocatorsOfFooter[14]=Twitter_Img;
		LocatorsOfFooter[15]=Facebook_Img;
		LocatorsOfFooter[16]=Email_Textbox;
		LocatorsOfFooter[17]=Affiliated;
		
		
		
		
		//initial testing Started.
		
		System.out.println("\t\tTitle Of Footer Page:\n");
		for(int i=0;i<LocatorsOfFooter.length; i++) {
			
			System.out.print("TITLE::::::::");
			clickElement(LocatorsOfFooter[i]);
			waitFor(1000);
			System.out.println("*************\nThe "+ getElementTitle(LocatorsOfFooter[i])+ " Is clicked. \n **********");
			waitFor(1000);
			System.out.println("LINK: "+driver.getCurrentUrl());
			LinkTest.linkWorks(driver.getCurrentUrl(),getElementTitle(LocatorsOfFooter[i]));
			
		}
		
	}



}
