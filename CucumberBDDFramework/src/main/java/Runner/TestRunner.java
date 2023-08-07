package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Automation_Selenium\\CucumberBDDFramework\\src\\main\\java\\Features", //the path of the feature files
		glue={"stepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout"}, //to generate different types of reporting
		dryRun = true
		 	
		)

public class TestRunner {

}
