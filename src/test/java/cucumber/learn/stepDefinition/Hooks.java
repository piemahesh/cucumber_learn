package cucumber.learn.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void before() {
		System.out.println("before hook");
		
	}

	@After
	public void after() {
		System.out.println("after hook");
	}
	

	public void takeScreenShot(Scenario scene) {
		
		System.out.println("hello");
	}
}
