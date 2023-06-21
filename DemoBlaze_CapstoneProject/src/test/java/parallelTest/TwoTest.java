package parallelTest;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TwoTest {

	Alert alert;

	@Test(groups = { "Regression Test" })
	public void DragAndDropTest() {
		WebDriver driver;

		// Step 1. Set the property to launch Chrome.
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");

		// maximize the window.

		driver.manage().window().maximize();

		// Element(BANK) which need to drag.
		WebElement From1 = driver.findElement(By.xpath("//*[@id='credit2']/a"));

		// Element(DEBIT SIDE) on which need to drop.
		WebElement To1 = driver.findElement(By.xpath("//*[@id='bank']/li"));

		// Element(SALES) which need to drag.
		WebElement From2 = driver.findElement(By.xpath("//*[@id='credit1']/a"));

		// Element(CREDIT SIDE) on which need to drop.
		WebElement To2 = driver.findElement(By.xpath("//*[@id='loan']/li"));

		// Element(5000) which need to drag.
		WebElement From3 = driver.findElement(By.xpath("//*[@id='fourth']/a"));

		// Element(DEBIT SIDE) on which need to drop.
		WebElement To3 = driver.findElement(By.xpath("//*[@id='amt7']/li"));

		// Element(5000) which need to drag.
		WebElement From4 = driver.findElement(By.xpath("//*[@id='fourth']/a"));

		// Element(CREDIT SIDE) on which need to drop.
		WebElement To4 = driver.findElement(By.xpath("//*[@id='amt8']/li"));

		// Using Action class for drag and drop.
		Actions act = new Actions(driver);

		// BANK drag and drop.
		act.dragAndDrop(From1, To1).build().perform();

		// SALES drag and drop.
		act.dragAndDrop(From2, To2).build().perform();

		// 500 drag and drop debit side.
		act.dragAndDrop(From3, To3).build().perform();

		// 500 drag and drop credit side.
		act.dragAndDrop(From4, To4).build().perform();

		// Verifying the Perfect! message.
		if (driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed()) {
			System.out.println("Perfect Displayed !!!");
		} else {
			System.out.println("Perfect not Displayed !!!");
		}

		driver.quit();
	}

	@Test(groups = { "Smoke Test" })
	public void AlertTest() throws Exception {
		// Step 1: Set the property to launch browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\New folder\\DemoBlaze_Automation\\Drivers\\chromedriver.exe");

		// Step 2: Launch the light and empty Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Step 3: maximize the window
		driver.manage().window().maximize();

		// step 4: hit the Irctc url
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		Thread.sleep(3000);

		// Step 5: click on Js Confirm Button
		WebElement clickForJsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		clickForJsConfirm.click();

		// Step 6: Pass the control to the Alert box
		alert = driver.switchTo().alert();

		// step 7: capture the message from alert box

		String alertMessage = alert.getText();

		System.out.println("Alert Message is = " + alertMessage);

		// step 8: Accept the alert message
		// alert.accept();

		// step 9: Dismiss the alert message
		alert.dismiss();

		// step 10: capture the button - click for JS prompt
		WebElement clickForJsPromt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickForJsPromt.click();

		// pass the control
		alert = driver.switchTo().alert();
		// Step 11: pass your message in alert and accept it.
		alert.sendKeys("password123");
		alert.accept();
		
		driver.quit();
	}
}
