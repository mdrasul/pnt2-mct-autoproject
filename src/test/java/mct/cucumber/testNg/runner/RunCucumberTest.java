package mct.cucumber.testNg.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		// features = {"src/test/resources/AllTestFeatures/order.feature"}, 
		features = {"src/test/resources/AllTestFeatures/order.feature"}, 
		glue={"mct.cucumber.steps.definations","mct.cucumber.steps.supportcode","mct.util","mct.pages"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}, 
		monochrome=true,
		tags =  { "@test1,@test2"}
		//tags = { "~@ignore"}
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
	
}

