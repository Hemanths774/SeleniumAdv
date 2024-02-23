package Runner_package;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =".//Cucumber/orangehrm.feature", glue = "step_defenations" )
// in glue parameter we should provide the step_defenation package name in which we create all the @given and all

public class OrangeHRM_Homepage {
	

}
