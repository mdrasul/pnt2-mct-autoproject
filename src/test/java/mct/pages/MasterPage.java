package mct.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MasterPage {


	public WebDriver driver;

	
	// ****** Constructor - 
	public MasterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoURL(String url) {
		driver.get(url);
	}


	public void clickElement(String locatores) {
		if(locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).click();
			waitFor(1000);
		} else if(locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).click();
			waitFor(1000);
		} else if(locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).click();
			waitFor(1000);
		}

	}

	public void typeOnElement(String locatores, String valueTotype) {
		if(locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).sendKeys(valueTotype);
		}  else if(locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).sendKeys(valueTotype);
		} else if(locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).sendKeys(valueTotype);
		}

	}

	// Singular 
	public String getElementText(String locatores) {
		
		try {
			if(locatores.contains("ID")) {
				return driver.findElement(By.id(locatores.split(":")[1])).getText();
			}  else if(locatores.contains("Xpath")) {
				return driver.findElement(By.xpath(locatores.split(":")[1])).getText();
			} else if(locatores.contains("Name")) {
				return driver.findElement(By.name(locatores.split(":")[1])).getText();
			}
		}catch(Exception e) {
			return "NULL";
		}
		
		return "NULL";

	}

	
	// === Plural 
	public List<String> getElementsText(String locatorsOfElements) {
		
		List<String> actualOptionResultList = new ArrayList<>();

		
		if(locatorsOfElements.contains("Xpath")) {
			List<WebElement> alloptionsinUI = driver.findElements(By.xpath(locatorsOfElements.split(":")[1]));
			System.out.println("Total List Size " + alloptionsinUI.size() );
			for(int i=0;i<alloptionsinUI.size();i++) {
				System.out.println(alloptionsinUI.get(i).getText());
				actualOptionResultList.add(alloptionsinUI.get(i).getText());
			}
		} 

		
		return actualOptionResultList;
	}
	
	
	
	

	
	public boolean elementExist(String locatores) {

		try {
			if(locatores.contains("ID")) {
				return driver.findElement(By.id(locatores.split(":")[1])).isDisplayed();
			}  else if(locatores.contains("Xpath")) {
				return driver.findElement(By.xpath(locatores.split(":")[1])).isDisplayed();
			} else if(locatores.contains("Name")) {
				return driver.findElement(By.name(locatores.split(":")[1])).isDisplayed();
			}	
		} catch(Exception e) {
			return false;
		}

		return false;
	}
	
	
	public boolean elementNotExist(String locatores) {

		try {
			if(locatores.contains("ID")) {
				return driver.findElement(By.id(locatores.split(":")[1])).isDisplayed();
			}  else if(locatores.contains("Xpath")) {
				return driver.findElement(By.xpath(locatores.split(":")[1])).isDisplayed();
			} else if(locatores.contains("Name")) {
				return driver.findElement(By.name(locatores.split(":")[1])).isDisplayed();
			}	
		} catch(Exception e) {
			return false;
		}

		return false;
	}
	
	public void selectElement(String locatores, String valueTotype) {
		
		
		WebElement dropDown = driver.findElement(By.id(locatores));
		Select select = new Select(driver.findElement(By.id(locatores)));
		   select.selectByValue(valueTotype);
		   
		      
		

	}
	public void typeOnElementForChange(String locatores, String valueTotype) {
		if(locatores.contains("ID")) {
			driver.findElement(By.id(locatores.split(":")[1])).clear();
			driver.findElement(By.id(locatores.split(":")[1])).sendKeys(valueTotype);
		}  else if(locatores.contains("Xpath")) {
			driver.findElement(By.xpath(locatores.split(":")[1])).clear();
			driver.findElement(By.xpath(locatores.split(":")[1])).sendKeys(valueTotype);
		} else if(locatores.contains("Name")) {
			driver.findElement(By.name(locatores.split(":")[1])).clear();
			driver.findElement(By.name(locatores.split(":")[1])).sendKeys(valueTotype);
		}

	}

	public void closeBrowser() {
		driver.close();
	}

	public void waitFor(int mls) {
		try {
			Thread.sleep(mls); // Sleep for one thousand milisecond 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
