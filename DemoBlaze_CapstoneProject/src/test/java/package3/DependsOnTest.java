package package3;

import org.testng.annotations.Test;

//How to create dependency of 1 test case on another

public class DependsOnTest {

	@Test(dependsOnMethods = "Test3")
	public void Test1() {
		System.out.println("Login to the private application");
	}

	@Test(dependsOnMethods = "Test1")
	public void Test2() {
		System.out.println("Create, Modify and verify the Cusomter");
	}

	@Test()
	public void Test3() {
		System.out.println("Verify Database connection is set");
	}

}
