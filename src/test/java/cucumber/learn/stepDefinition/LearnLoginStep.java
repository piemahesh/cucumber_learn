package cucumber.learn.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cucumber.learn.pages.LoginPage;
import cucumber.learn.utils.ConfigReader;
import cucumber.learn.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LearnLoginStep {
	static WebDriver driver;
	static LoginPage loginPage;

//	@BeforeAll
//	public static void before_all() {
//
//		System.out.println("bf all");
//
//	}
//
//	@AfterAll
//	public static void after_all() {
//
//		System.out.println("af all");
//
//	}

//	static {
//		System.out.println("hello");
//	}

	@Before
	public static void before() {
		driver = DriverManager.getDriver();
		loginPage = new LoginPage(driver);
		driver.manage().window().maximize();
	}

	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(500);
	}

	@AfterStep
	public void afterStep() throws InterruptedException {
		Thread.sleep(500);
	}

	@Given("user enter into the login page")
	public void userEnterIntoTheLoginPage() {
		driver.get(ConfigReader.getValue("url"));
	}

//	@Given("user give the username")
//	public void userGiveTheUsername() {
//		loginPage.sendUserName("student");
//	}
//
//	@Then("user give the password")
//	public void userGiveThePassword() {
//		loginPage.sendPassword("Password123");
//	}
	@Given("user give the username as {string}")
	public void userGiveTheUsernameAs(String name) {
		System.out.println(name);
		loginPage.sendUserName(name);
	}

	@Then("user give the password as {string}")
	public void userGiveThePasswordAs(String password) {
		System.out.println(password);
		loginPage.sendPassword(password);
	}

	@Then("user press the submit button")
	public void userPressTheSubmitButton() {

		loginPage.clickSubmitButton();
		WebElement errorElmnt = loginPage.getErrorElmnt();
		System.out.println(LoginExpectedConditions.LOGIN_EXPECTED.getMessage());
		if (errorElmnt != null) {
			try {
				Assert.assertEquals(LoginExpectedConditions.LOGIN_EXPECTED.getMessage(), errorElmnt.getText());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("failure");
		} else {
			System.out.println("success");
		}

	}

	@After
	public void after() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(500);
			driver.quit();
		}
	}

}
