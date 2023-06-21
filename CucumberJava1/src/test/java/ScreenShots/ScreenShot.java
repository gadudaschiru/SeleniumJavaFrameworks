package ScreenShots;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenricLib.WebdriverCommonLib;


public class ScreenShot {
	
	WebdriverCommonLib wLib = new WebdriverCommonLib();
	
	@Test
	public void Screeshots() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rakes\\eclipse-workspace\\Automation\\resources\\chromedriver.exe");

		// Launch the empty browser.

		WebDriver driver = new ChromeDriver();

		// Launch the URL

		driver.get("https://gmail.com");

		// to create a random name for each screenshot
		//Date date = wLib.timeStamp();

		// Call TakesScreenShot function

		this.takeSnapShot(driver,
				"C:\\Users\\rakes\\eclipse-workspace\\Automation\\ScreenShots\\screenshot.png");

	}

	public void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {

		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

}