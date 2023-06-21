package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenricLib.Constants;
import GenricLib.Driver;
import GenricLib.ExcelLib;
import GenricLib.WebdriverCommonLib;

public class ExcelUserTest {

	static public WebDriver driver = null;
	ExcelLib elib = new ExcelLib();
	WebdriverCommonLib wLib = new WebdriverCommonLib();
	String url = null;
	String username = null;
	String password = null;

	@Test
	public void createUserTest() throws Exception {
		// get Test Data
		String url = elib.getExcelData("TestSheet", 1, 2);
		String username = elib.getExcelData("TestSheet", 1, 3);
		String password = elib.getExcelData("TestSheet", 1, 4);

		System.out.println(url);
		System.out.println(username);
		System.out.println(password);

		// Launch the empty browser.
		driver = Driver.getBrowser();
		
		// Login to facebook
		driver.get(Constants.Url);

		// Put the implicitly wait.
		wLib.waitForpageToLoad();

		// maximize the window.
		wLib.maximize();

		driver.findElement(By.id("email")).sendKeys(username);

		driver.findElement(By.id("pass")).sendKeys(password);

		driver.findElement(By.name("login")).click();

		Thread.sleep(5000);

		elib.setExcelData("Sheet1", 1, 5, "Pass");
	}

}
