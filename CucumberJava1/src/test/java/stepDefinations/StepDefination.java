package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenricLib.Driver;
import PgaeObjectRepositoryLib.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {

	public static WebDriver driver = Driver.driver;
	static String expectedValue = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		// code to navigate to login url
		System.out.println("navigated to login url");
	}

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("deciding the browser to open");
	}

	@When("^Browser is triggered$")
	public void browser_is_triggered() throws Throwable {
		System.out.println("Browser is triggered");
	}

	@Then("^check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("Browser is started");
	}

	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable {
		// code to login
		System.out.println("Logged in success");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		// home page validation
		System.out.println("Validated home page");
	}

	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void applicationLogin(String arg1, String arg2) throws Throwable {
		System.out.println("parameter 1 " + arg1);
		System.out.println("parameter 2 " + arg2);
	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	}

	@When("^User sign up with following details$")
	public void dataTablReader(DataTable data) throws Throwable {

		List<List<String>> obj = data.cells();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));

	}

	@When("^User login in to application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
		System.out.println(username);
		System.out.println(password);
	}

	@And("^User navigates to the NetBanking Landing Page$")
	public void netbankingpage_navigation() {
		System.out.println("User navigates to the NetBanking Landing Page");
	}

	@Given("^Login to the Facebook Application$")
	public void loginToTheApplication() throws Exception {
		// Navigate to application.
		Login LoginPage = PageFactory.initElements(driver, Login.class);
		LoginPage.loginToApp();
	}

	@Then("^Verify that the error message is displayed$")
	public void verify_that_the_error_message_is_displayed() throws Throwable {
		String actualValue = driver.findElement(By.xpath("//div[contains(text(), 'The email address or mobile')]"))
				.getText().trim();
		
		Login loginpage = PageFactory.initElements(driver, Login.class);
		loginpage.verifyErrorMessage();
		//Assert.assertEquals(actualValue, expectedValue, "The Expected result does not match the actual result");
	}

	@Then("^Close the Browser$")
	public void close_the_Browser() throws Throwable {
		driver.quit();
	}

	@When("^user has performed the action$")
	public void performAction() throws Throwable {
		System.out.println("user has performed the action");
	}

	@Given("that the user has lauched the application")
	public void that_the_user_has_lauched_the_application() {
		System.out.println("that the user has lauched the application");
	}

	@Given("User have provided the valid credentials and clicked on login button")
	public void user_have_provided_the_valid_credentials_and_clicked_on_login_button() {
		System.out.println("User have provided the valid credentials and clicked on login button");
	}

	@Then("verify that the Timeline is displayed for invalid login")
	public void verify_that_the_timeline_is_displayed_for_invalid_login() {
		System.out.println("verify that the Timeline is displayed for invalid login");
	}

}
