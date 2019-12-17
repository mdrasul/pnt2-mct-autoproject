 package mct.cucumber.testNg.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = {"src/test/resources/AllTestFeatures"}, 
		//features = {"src/test/resources/AllTestFeatures/Validation_FotterLinks.feature"}, 
		glue={"mct.cucumber.steps.definations","mct.cucumber.steps.supportcode"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}, 
		monochrome=true,
		tags = { "~@ignore"}
		)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}

