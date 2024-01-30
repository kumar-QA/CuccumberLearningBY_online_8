package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "./src/test/featureFiles/LoginPage.feature",
		glue={"stepdefination","hook"},
		plugin="html:target/MyReports/report.html"
		
		)

public class runner {

	

}
