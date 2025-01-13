package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Loginflow/login.feature",
		         glue = { "StepDefinitions","Hooks"},
				 plugin = {"pretty","html:target/Cucumber Report/Cucumber.html" },
				 dryRun = false,
				 monochrome = true
//				 "src/test/resources/Adminportal/1loginresources",
			     
		)


public class RunnerTestclass {

}
