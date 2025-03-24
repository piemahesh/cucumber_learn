package cucumber.learn.stepDefinitions;

import org.testng.Assert;

import cucumber.learn.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition {

	
	@Given("user go to login page")
	public void user_go_to_login_page() {
		System.out.println(ConfigReader.getValue("url"));
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user go to login page");
//		Assert.fail("manaully throw some error");
	}

	@Then("user enter the username")
	public void user_enter_the_username() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user enter the username");

	}

	@Then("user enter the password as {string}")
	public void user_enter_the_password_as(String password) {
		System.out.println(password);
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("click the submit button")
	public void click_the_submit_button() {
		Assert.fail("manaully throw some error");
		// Write code here that turns the phrase above into concrete actions
		System.out.println("click the submit button");

	}

	@Then("user enter the wrong password")
	public void user_enter_the_wrong_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user enter the wrong password");
	}

}
