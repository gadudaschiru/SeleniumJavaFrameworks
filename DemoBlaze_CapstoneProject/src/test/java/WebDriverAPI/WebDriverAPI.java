package WebDriverAPI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverAPI {

	public static void main(String[] args) throws Exception {

		// Set the property to launch browser.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\git\\SeleniumJavaFrameworks\\DemoBlaze_CapstoneProject\\Drivers\\chromedriver.exe");

		// Launch the light and empty Chrome Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Broswer has been launched");

		// Implicitly wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Open demoblaze url
		driver.get("https://www.demoblaze.com//");

		// get the title of the page
		String title = driver.getTitle();
		System.out.println("Current page = " + title);

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// maximize the window
		driver.manage().window().maximize();
		System.out.println("Maximized the window");

		// try to click on Mobiles menu option
		WebElement home = driver.findElement(By.xpath("//a[contains(text(), 'Home')]"));

		// Explicit wait statement -
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(home));

		home.click();

		// try to click on Mobiles menu option
		WebElement cart = driver.findElement(By.xpath("//a[contains(text(), 'Cart')]"));

		cart.click();

		// Step 7: get the current page url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url = " + currentUrl);

		// test case validation step to check if the age is amazon page.
		if (currentUrl.contains("demo")) {
			System.out.println("Test case PASS = url contains demo keyword into it");
		} else {
			System.out.println("Test case FAIL = url does not contains demo keyword");
		}


		// Step 10: delete cookies
		driver.manage().deleteAllCookies();

		// Step 11: refresh the browser
		driver.navigate().refresh();

		// close the browser
		driver.quit();

	}

}
