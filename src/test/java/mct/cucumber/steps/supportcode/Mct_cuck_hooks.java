package mct.cucumber.steps.supportcode;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Mct_cuck_hooks {

	Mct_page_loader page;
	WebDriver driver; 

	// Constructor 
	public Mct_cuck_hooks(Mct_page_loader page) {
		this.page = page;
	}


	@Before
	public void rampUp() {
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


		driver.close();
	}
}
