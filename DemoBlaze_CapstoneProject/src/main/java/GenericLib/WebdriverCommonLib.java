package GenericLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebdriverCommonLib {

	public static WebDriver driver = Driver.driver;
	public static WebdriverCommonLib wlib = new WebdriverCommonLib();
	public static Actions act = null;

	/**
	 * This is the method with the help of which we will be able to wait for the
	 * HTML document to be loaded entirely in the DOM
	 * 
	 */
	public void waitForpageToLoad() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.globalWait));
	}

	/**
	 * With the help of this method you will be able to wait for the webElement to
	 * be located by the xpath which comes from the user itself
	 * 
	 * @param xpath
	 */
	public void waitForElementPresent(By by) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.globalWait));

		wait.until(ExpectedConditions.presenceOfElementLocated(by));

	}

	/**
	 * This webDriver wait statement waits for the element to be visible using the
	 * xpath.
	 * 
	 * @param xpath
	 */
	public void waitForXpathPresent(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.globalWait));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public void verifytext(String xpath, String expectedValue) {

		wlib.waitForpageToLoad();
		// boolean flag = false; // buld concept
		WebElement element = driver.findElement(By.xpath(xpath));
		String actualtext = element.getText();

		if (expectedValue.equalsIgnoreCase(actualtext)) {
			System.out.println("Actual value is  matching  with expected Value");
		} else {
			System.out.println("Actual value is not matching  with expected Value");
		}
	}

	public static void switchToAlert() {
		driver.switchTo().alert();
	}

	public static void switchWindow(String windowId) {
		driver.switchTo().window(windowId);
	}

	public static void dragAndDrop(String fromXpath, String toXpath) {
		WebElement from = driver.findElement(By.xpath(fromXpath));
		WebElement To = driver.findElement(By.xpath(toXpath));
		// Using Actions class for Drag and Drop
		act = new Actions(driver);
		act.dragAndDrop(from, To).build().perform();
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

}
