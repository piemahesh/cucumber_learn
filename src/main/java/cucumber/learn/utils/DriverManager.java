package cucumber.learn.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		setDriver(new ChromeDriver());
		return driver;
	}

	public static void setDriver(WebDriver specDriver) {
		driver = specDriver;
	}

}
