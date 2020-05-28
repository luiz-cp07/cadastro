package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", tags= {"@OpenBrowser,@EditUser"},
glue = "classpath:pages",monochrome = true, dryRun = false,
plugin= {"html:target/cucumber-html-report", "json:target/cucumber.json"})

public class AllTests {}
