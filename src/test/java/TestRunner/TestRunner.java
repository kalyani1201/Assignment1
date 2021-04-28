package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/feature",
		glue= {"StepDefinition","utilities"},
		
		plugin= {"pretty", "html:target/cucumber-pretty"}
		)

public class TestRunner {
	
	

}
