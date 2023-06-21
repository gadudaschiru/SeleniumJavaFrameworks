package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAPI2 {

	public static void main1(String[] args) {
		//static String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again. No customer account found";
	}
		public static void main(String[] args) throws InterruptedException {

			// Step 1: Set the property to launch browser.
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\New folder\\DemoBlaze_Automation\\Drivers\\chromedriver.exe");

			// Step 2: Launch the light and empty Chrome Browser
			WebDriver driver = new ChromeDriver();

			// Step 3: maximize the window
			driver.manage().window().maximize();

			// Step 4: Hit the facebook url
			driver.get("https://demoblaze.com");
			
			// try to click on Mobiles menu option
					WebElement signin = driver.findElement(By.xpath("//a[contains(text(), 'Log in')]"));
					signin.click();
					
			//until here executing the programme withou issue. but next steps not executed

			// Step 5: capture the Email webElement
			WebElement email = driver.findElement(By.id("loginusername"));
			email.click();
			
			// step 6: clear the text from edit box
			//email.clear();

			// step 7: Write your email id in Editbox
			email.sendKeys("gadudaschiru@gmail.com");

			// Step 8: capture password
			WebElement password = driver.findElement(By.name("Password"));

			// step 8: write the password
			password.clear();
			password.sendKeys("password123");

			// Step 9: Click on the login button
			WebElement loginButton = driver.findElement(By.xpath("//input[@class = 'button-1 login-button']"));

			// Step 10: Click on Login button
			loginButton.click();

			Thread.sleep(4000);

			// Step 11: Capture the error message during runtime.
			WebElement errorElement = driver.findElement(By.className("validation-summary-errors"));

			// step 12: capture the text from the element
			String currentErrorMessgae = errorElement.getText();
			System.out.println(currentErrorMessgae);

			// Step 13: verify if the expected error message and during run time error
			// message is equal or not
			//if (expectedErrorMessage.equalsIgnoreCase(currentErrorMessgae)) {
				System.out.println("Test Case == PASS, Error Messages are matching");
			//} else {
				System.out.println("Test Case == FAIL, Error Messages are not matching");
			}

			// Step 14: move back on the webpage
		//	driver.navigate().back();

			
			//driver.quit();

	}


