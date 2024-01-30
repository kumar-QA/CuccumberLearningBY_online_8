package hook;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class demohooks {
	
	@Before
	public void launch() {
		System.out.println("befor all scenario");
	}
	@After
	public void close() {
		System.out.println("after all scenario");
	}
	@BeforeStep
	public void m1() {
	System.out.println("hi");	
	}
	@AfterStep
	public void m2() {
		System.out.println("bye");
	}
}
