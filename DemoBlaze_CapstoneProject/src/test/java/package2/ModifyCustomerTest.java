package package2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModifyCustomerTest {
	
	@Test(groups= {"Smoke Test"})
	public void modifyCustomer() {
		System.out.println("modify Customer and verify the modified customer");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login to application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout of application");
	}
	
	@BeforeClass
	public void browserlaunch() {
		System.out.println("Launch empty browser");
	}
	
	@AfterClass
	public void CloseBroser() {
		System.out.println("Close the browser");
	}
	
	
}