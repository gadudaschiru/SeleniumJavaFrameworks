package parallelTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OneTest {

	static String expectedValue = "The password that you've entered is incorrect. Forgotten password?";
	static String actualValue;

	@Test(groups = { "Smoke Test" })
	public void facebookLoginTest() throws Exception {

		// Step1 : Set the property to launch Chrome browser

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		// Step 2 : Launch the empty browser.

		WebDriver driver = new ChromeDriver();

		// Step 3 : Hit the Google URL in the browser.

		driver.get("https://facebook.com");

		// maximize the window.

		driver.manage().window().maximize();

		// provide incorrect credentials

		driver.findElement(By.id("email")).sendKeys("gadudaschiru@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("password123");

		driver.findElement(By.name("login")).click();

		Thread.sleep(3000);

		String actualValue = driver.findElement(By.xpath("//div[@id='loginform']//div[@class='_9ay7']")).getText()
				.trim();

		try {
			System.out.println(10 / 0); // risky code
		} catch (ArithmeticException e) {
			// Alternate code for the risky code
			// Assert.assertEquals(actualValue, expectedValue, e.getMessage());

			if (expectedValue.equalsIgnoreCase(actualValue)) {
				System.out.println("Error message is matching");
			} else {
				System.out.println("Error message is not matching");
			}
		}

		// Compare the 2 values and check if the actual value is correct as per the req.

		/*
		 * if (expectedValue.equals(actualValue)) {
		 * System.out.println("Actual Value is as per the expectaiton"); } else {
		 * System.out.println("Actual Value is not as per the expectaiton"); }
		 */

		// System.out.println("Message is Displayed == PASS");

		// Step 4 : Close the browser.

		driver.quit();

	}

	@Test(groups = { "Regression Test" })
	public void FrameHandling() throws InterruptedException {
		// Set the property to launch Chrome.

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		// Launch the empty browser.

		WebDriver driver = new ChromeDriver();

		// Put the implicitly wait.

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Hit the URL.

		driver.get(
				"https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/remote/DesiredCapabilities.html");

		// maximize the window.

		driver.manage().window().maximize();

		// pass the driver control to Frame 3.

		driver.switchTo().frame("classFrame");

		// Perform an operation when an object is present inside the frame.

		// Click on Overview button above.

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class = 'topNav']//ul[@title = 'Navigation']//li[1]")).click();

		// Now click on the first package.

		// driver.findElement(By.linkText("com.thoughtworks.selenium")).click();

		// pass the control back to main window.

		driver.switchTo().defaultContent();

		// Pass the control over the next frame 2.

		driver.switchTo().frame("packageFrame");

		// perform an operation when an object is present inside the frame 2

		driver.findElement(By.linkText("Actions")).click();

		// navigate to Package List Frame

		driver.switchTo().defaultContent();

		driver.switchTo().frame("packageListFrame");

		driver.findElement(By.xpath("//a[text() = 'org.openqa.selenium']")).click();

		System.out.println("Test Case == Pass");

		// close driver
		driver.quit();
	}
}
