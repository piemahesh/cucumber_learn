package cucumber.learn.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = { "src/test/resources/features" }, dryRun = false, glue = {
		"cucumber.learn.stepDefinitions" }, snippets = SnippetType.UNDERSCORE)
public class Runner extends AbstractTestNGCucumberTests {

}
