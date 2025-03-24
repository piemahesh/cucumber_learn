package cucumber.learn.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LearnLoginStep {

	@BeforeAll
	public static void before_all() {

		System.out.println("bf all");

	}

	@AfterAll
	public static void after_all() {

		System.out.println("af all");

	}

	static {
		System.out.println("hello");
	}

	@Before
	public void before() {
		System.out.println("before");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("before step");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("after step");
	}

	@Given("user enter into the login page")
	public void userEnterIntoTheLoginPage() {

	}

	@Given("user give the username")
	public void userGiveTheUsername() {

	}

	@Then("user give the password")
	public void userGiveThePassword() {

	}

	@Then("user press the submit button")
	public void userPressTheSubmitButton() {
	}

}
