package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources/features"},
		plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber-reports/Cucumber.json" },
				glue = {"stepDefinations"})

public class MyRunner  {

   
}
