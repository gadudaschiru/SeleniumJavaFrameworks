package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;

	public static WebDriver getBrowser() {

		if (Constants.browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (Constants.browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir") + "\\Drivers\\geckoDriver.exe");

			// change the constructor as per the browser
			driver = new ChromeDriver();

		} else if (Constants.browser.equalsIgnoreCase("safari")) {

			System.setProperty("webdriver.safari.driver",System.getProperty("user.dir") + "\\Drivers\\safariDriver.exe");

			// change the constructor as per the browser
			driver = new ChromeDriver();
		}

		return driver;
	}

}
