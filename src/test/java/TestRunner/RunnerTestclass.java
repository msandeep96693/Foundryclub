package TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Incentives/Createincentive.feature",
		         glue = { "StepDefinitions","Hooks"},
				 plugin = {"pretty","html:target/Cucumber Report/Cucumber.html" },
				 dryRun = true,
				 monochrome = true
//				 "src/test/resources/Adminportal/1loginresources",
			     
		)


public class RunnerTestclass {

}
//"src/test/resources/Loginflow/login.feature",