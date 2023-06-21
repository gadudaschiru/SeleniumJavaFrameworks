package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenricLib.Constants;
import GenricLib.Driver;
import GenricLib.ExcelLib;
import GenricLib.WebdriverCommonLib;

import org.openqa.selenium.By;

import PgaeObjectRepositoryLib.Login;

public class UserTest {

	static public WebDriver driver = Driver.getBrowser();

	ExcelLib eLib = new ExcelLib();

	WebdriverCommonLib wLib = new WebdriverCommonLib();

	static String expectedValue = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";

	@Test
	public void createUserTest() throws Exception {

		// get browser
		//driver = Driver.driver;

		// Login to application.
		Login LoginPage = PageFactory.initElements(driver, Login.class);

		LoginPage.loginToApp();

		// wLib.waitForPageToLoad();

		String actualValue = driver.findElement(By.xpath("//div[@id='loginform']//div[@class='_9ay7']")).getText()
				.trim();

		System.out.println("Actual Value " + actualValue);

		// Assert.assertEquals(actualValue, expectedValue, "The Expected result does not
		// match the actual result");

	}
}
