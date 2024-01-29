package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "./src/test/featureFiles",
		glue="stepdefination",
		plugin="html:target/MyReports/report.html",
		tags="@NegativeTesting"
		
		)

public class runner {

	

}
