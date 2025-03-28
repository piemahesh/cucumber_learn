package cucumber.learn.stepDefinition;

public enum LoginExpectedConditions {
	LOGIN_EXPECTED(LoginExpectedConditions.change), TOP_EXPECTED(LoginExpectedConditions.change);

	private final String LOGIN_ERROR, TOP_ERROR;
	private static final String change = "";

	private final String ERROR_MESSAGE = "Your username is invalid!";
	private final String TOP_MESSAGE = "sUMMA";

	private LoginExpectedConditions(String val) {
		this.LOGIN_ERROR = val + ERROR_MESSAGE;
		this.TOP_ERROR = val + ERROR_MESSAGE;
	}

	public String getMessage() {
		return this.ERROR_MESSAGE.toString();
	}

}
