package stepdefs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constants.EndPoint;
import constants.TestData;
import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigFileLoader;

public class Login_Steps {
	
	private WebDriver driver;
	private LoginPage loginPage= new LoginPage(driver);
	private HomePage homePage = new HomePage(driver);

	@Given("user is on login page of MobilityX application")
	public void user_is_on_login_page_AiresRelonet_Application() {
		//driver = DriverFactory.getDriver();
		//loginPage = new LoginPage(driver);
		loginPage.load(EndPoint.SAMLTESTENDPOINT.urlEndPoint);
	    Assert.assertTrue(loginPage.getPageTitle().contains(TestData.MOBILITYX_PAGETITLE.data));
	}

	@When("user enters valid username and password")
	public void user_enters_username_and_password() {
		loginPage.setUserName(ConfigFileLoader.getInstance().getproperty(TestData.USERNAME.data));
		loginPage.clickOnNext();
		loginPage.setPassword(ConfigFileLoader.getInstance().getproperty(TestData.PASSWORD.data));
	}
	
	@When("user clicks on Login button")
	public void user_click_on_Login_button() {
		loginPage.clickOnLogin();
	}

	@Then("user should redirect to home page of MobilityX application")
	public void user_should_on_home_page_of_aires_MobilityX_application() {
	//	homePage = new HomePage(driver);
		homePage.acceptCookie();
		Assert.assertTrue(homePage.getPageTitle().contains(TestData.MOBILITYX_PAGETITLE.data));
		Assert.assertTrue(homePage.getPageSource().contains(TestData.MOBILITYX_PAGETITLE.data));
	}
	
	@Then("user is on home page of MobilityX application")
	public void user_is_on_home_page_of_aires_MobilityX_application() {
		homePage = new HomePage(driver);
		homePage.acceptCookie();
		Assert.assertTrue(homePage.getPageTitle().contains(TestData.MOBILITYX_PAGETITLE.data));
		Assert.assertTrue(homePage.getPageSource().contains(TestData.MOBILITYX_PAGETITLE.data));
	}

	@When("user clicks on Log out button")
	public void user_click_on_log_out_button() {
		homePage.clickOnUserProfileText();
		homePage.clickOnLogOut();
	}

	@Then("user should redirect to login page")
	public void user_navigate_to_login_page() {
		Assert.assertTrue(loginPage.getPageTitle().contains(TestData.MOBILITYX_PAGETITLE.data));
	}

}
