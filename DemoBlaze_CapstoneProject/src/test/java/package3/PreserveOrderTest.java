package package3;

import org.testng.annotations.Test;

// How to prioritize the execution order of the test cases

public class PreserveOrderTest {

	@Test(priority = 0)
	public void A() {
		System.out.println("Modify Customer");
	}

	@Test(priority = -1)
	public void B() {
		System.out.println("Create Customer");
	}

	@Test(priority = 3)
	public void C() {
		System.out.println("Verify Customer");
	}

	@Test(priority = 4)
	public void D() {
		System.out.println("Delete Customer");
	}

}
