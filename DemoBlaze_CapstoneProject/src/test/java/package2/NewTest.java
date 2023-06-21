package package2;

import org.testng.annotations.Test;

public class NewTest {
	@Test(enabled = true)
	public void Test1() {
		System.out.println("Running in Test1() ");
	}

	@Test
	public void Test2() {
		System.out.println("Running in Test2() ");

	}

	@Test
	public void Test3() {
		System.out.println("Running in Test3() ");

	}

	@Test(enabled = false)
	public void Test4() {
		System.out.println("Running in Test4() ");

	}

	@Test(enabled = false)
	public void Test5() {
		System.out.println("Running in Test5() ");

	}
}
