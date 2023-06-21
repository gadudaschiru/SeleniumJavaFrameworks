package PgaeObjectRepositoryLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import GenericLib.Constants;
import GenericLib.Driver;
import GenericLib.Excellib;
import GenericLib.WebdriverCommonLib;

public class Login {

	WebdriverCommonLib webLib = new WebdriverCommonLib();
	WebDriver driver = Driver.driver;
	Excellib excel = new Excellib();
	
	static String expectedErrorMessage = "The password that you've entered is incorrect. Forgotten password?";

	@FindBy(id = "email")
	private WebElement usernameEdit;

	@FindBy(id = "pass")
	private WebElement passwordEdit;

	@FindBy(name = "login")
	private WebElement LoginBtn;

	@FindBy(xpath = "//div[@id='loginform']//div[@class='_9ay7']")
	private WebElement actualtext;

	@FindBy(xpath = "//img[@alt= 'Facebook']")
	private WebElement FacobookLogo;

	public void loginToApp() throws Exception {
		driver.get(Constants.Url);
		webLib.maximize();
		usernameEdit.sendKeys(excel.getStringExcelData("Sheet1", 1, 3));
		passwordEdit.sendKeys(excel.getStringExcelData("Sheet1", 1, 4));
		LoginBtn.click();
	}

	public void forgottenPassword(String email) {
		WebdriverCommonLib.driver.get(Constants.Url);
		// Code - logic------
	}

	public void createNewAccount() {

	}

	public void createNewPage() {

	}
	
	public void verifyErrorMessage() {
		//System.out.println(actualtext.getText());
		
		if(expectedErrorMessage.equalsIgnoreCase(actualtext.getText()))
		{
			System.out.println("Error Messages are matching");
		} else {
			System.out.println("Error Messages are not matching");
		}
	}
}