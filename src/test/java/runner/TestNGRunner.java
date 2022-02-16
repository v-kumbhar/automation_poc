package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		dryRun=false,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:cucmber-reports/intsoftLogin.html"},
		features = "./src/test/resources/Features",
		glue={"stepdefs","hooks"},
		monochrome=true
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	
}
