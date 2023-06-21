package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforevaldiation()
	{
		System.err.println("Before Mobile  hook is working");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.err.println("After Mobile  hook is working");
	}
	
	@Before("@WebTest")
	public void beforeWebValdiation()
	{
		System.err.println("Before Web  hook is working");
	}
	
	@After("@WebTest")
	public void AfterWebValdiation() {
		System.err.println("After Web  hook is working");
	}
	
	}

