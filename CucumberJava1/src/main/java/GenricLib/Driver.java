package GenricLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;

	public static WebDriver getBrowser() {
		
		if(Constants.browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Eclipse Workspace\\Automation\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
		} else if (Constants.browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.firefox.driver",
					"D:\\Eclipse Workspace\\Automation\\Drivers\\chromedriver.exe");

			//change the constructor as per the browser 
			driver = new ChromeDriver();
			
		} else if(Constants.browser.equalsIgnoreCase("safari"))
		{

			System.setProperty("webdriver.safari.driver",
					"D:\\Eclipse Workspace\\Automation\\Drivers\\chromedriver.exe");

			//change the constructor as per the browser
			driver = new ChromeDriver();
		}

		return driver;
	}

}
