package mct.cucumber.steps.supportcode;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import mct.util.ReadConfigFile;
import mct.util.SharedConfig;

public class Mct_cuck_hooks {

	Mct_page_loader page;
	WebDriver driver; 
	

	// Constructor 
	public Mct_cuck_hooks(Mct_page_loader page) {
		this.page = page;
	}


	@Before
	public void rampUp() throws FileNotFoundException, IOException {
		
		// Read The Prop & Make it Shareable for the entire Project 
		SharedConfig.config = ReadConfigFile.readProperties();
	
		System.out.println("Ramp Up  Started...");
		driver = page.getDriver();

	}


	@After
	public  void  rampDown(Scenario scenario) {



		if (scenario.isFailed()) {
			try {
				// Casting 	
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
				 ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + (scenario.isFailed() ?  "Failed":"Passed"));
			} catch (Exception e) {
				e.printStackTrace();
				 ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + (scenario.isFailed() ?  "Failed":"Passed"));
			}
		}
		driver.close();
		System.out.println("Driver closed");
	}
}
