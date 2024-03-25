package Runner_package;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Cucumber//login.feature",glue ="step_defenations",
                 plugin = {"html:target/Cucumberreport.html","pretty"},tags = "@smoke")
public class loginRunner {
	
	
	}

