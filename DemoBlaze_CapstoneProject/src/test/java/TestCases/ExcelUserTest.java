package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import GenericLib.Driver;
import PgaeObjectRepositoryLib.Login;

public class ExcelUserTest {

	public static WebDriver driver = Driver.getBrowser();

	@Test
	public void loginUserTest() throws Exception {

		// No need to launch the Browser because in this class we have already called
		// getBrower method

		// login to the application
		Login login = PageFactory.initElements(driver, Login.class);
		login.loginToApp();

		// Validate the error message is being Displayed or not
		login.verifyErrorMessage();
	}
}
