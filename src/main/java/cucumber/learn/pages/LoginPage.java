package cucumber.learn.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	static WebDriverWait wait;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement usernameField;
	@FindBy(id = "password")
	private WebElement passwordField;
	@FindBy(id = "submit")
	private WebElement submitButton;

	@FindBy(id = "error")
	private WebElement errorElmnt;

	public WebElement getErrorElmnt() {
		return errorElmnt;
	}

	public void setErrorElmnt(WebElement errorElmnt) {
		this.errorElmnt = errorElmnt;
	}

	public WebElement getUsernameField() {
		return usernameField;
	}

	public void sendUserName(String name) {
		usernameField.sendKeys(name);
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public void sendPassword(String password) {
		passwordField.sendKeys(password);
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void clickSubmitButton() {
		submitButton.click();
		WebElement elmnt = wait.until(ExpectedConditions.visibilityOf(errorElmnt));
	}
	
	

}
