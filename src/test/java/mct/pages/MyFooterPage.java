package mct.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFooterPage extends MasterPage {
	
	String Footer = "Xpath://section";
	String withoutFooter="Xpath://div[@class='footersep_inner']//ul";
	

	public MyFooterPage(WebDriver driver) {
		super(driver);
		
	}

	public String FindAllFooterPageElements() {
	List<String> list =	getElementsText(withoutFooter);
	String aList ="";
	for (int i = 0; i < list.size(); i++) {
		aList = list.get(i);
	}
		
	return aList;
	
		}
	
	}
