package cucumber.learn.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = { "src/test/resources/features/learnLogin.feature" }, dryRun = false, glue = {
		"cucumber.learn.stepDefinition" }, // Corrected the glue path
		snippets = SnippetType.CAMELCASE)
public class LearnRunner extends AbstractTestNGCucumberTests {
}
