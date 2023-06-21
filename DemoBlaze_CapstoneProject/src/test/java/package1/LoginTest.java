package package1;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(groups = {"Smoke Test"})
	public void login() {
		System.out.println("Running in login()");
	}

	@Test(groups = {"Smoke Test", "Regression Test" })
	public void login1() {
		System.out.println("Running in login1()");
	}

	@Test(groups = {"Regression Test" })
	public void login2() {
		System.out.println("Running in login2()");
	}

	@Test(groups = {"Regression Test" })
	public void login3() {
		System.out.println("Running in login3()");
	}

	@Test(groups = {"Regression Test"})
	public void login4() {
		System.out.println("Running in login4()");
	}
}
