package package2;

import org.testng.annotations.Test;

// How to enable and disable the test cases in testNG

public class EnabledAndDisbaledTest {

	@Test(enabled = true, groups= {"Smoke Test", "Regression Test"})
	public void Test1() {
		System.out.println("Login to the private application");
	}

	@Test(groups= {"Regression Test"} )
	public void Test2() {
		System.out.println("Create, Modify and verify the Cusomter");
	}
	
	@Test(invocationCount = 150)
	public void Registration() {
		System.out.println("Create 150 registrations");
	}
	
	@Test(enabled = false)
	public void Test4() {
		System.out.println("Create slaes order");
	}

	@Test(enabled = false)
	public void Test3() {
		System.out.println("Verify Database connection is set");
	}
}
