package CukeRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		tags="@login",
		features="/Users/abrahamben/git/GTBank2/Gtpl Bank/src/test/resources/feature",
		plugin= {"html:target/cucmber-html-report"},
		glue="StepDefinition",
		dryRun = false
		
		
		
		
		
		
		
		)





public class Runners {

}
