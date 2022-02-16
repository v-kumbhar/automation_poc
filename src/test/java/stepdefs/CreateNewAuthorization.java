package stepdefs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import constants.EndPoint;
import constants.TestData;
import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.InitiationPage;
import pages.LoginPage;
import utils.ConfigFileLoader;

public class CreateNewAuthorization {

	private WebDriver driver;
	private LoginPage loginPage = new LoginPage(driver);
	private HomePage homePage = new HomePage(driver);
	private InitiationPage initiationPage = new InitiationPage(driver);
	String randString = RandomStringUtils.randomAlphabetic(6);
	String randNum = RandomStringUtils.random(3);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

	@Given("user is on home page of MobilityX application after entering valid login id and Password")
	public void user_is_on_home_page_of_mobility_x_application_after_entering_valid_login_id_and_password() {
		loginPage.load(EndPoint.SAMLTESTENDPOINT.urlEndPoint);
	    Assert.assertTrue(loginPage.getPageTitle().contains(TestData.MOBILITYX_PAGETITLE.data));
	    loginPage.setUserName(ConfigFileLoader.getInstance().getproperty(TestData.USERNAME.data));
		loginPage.clickOnNext();
		loginPage.setPassword(ConfigFileLoader.getInstance().getproperty(TestData.PASSWORD.data));
		loginPage.clickOnLogin();
		homePage.acceptCookie();
		Assert.assertTrue(homePage.getPageTitle().contains(TestData.MOBILITYX_PAGETITLE.data));
		Assert.assertTrue(homePage.getPageSource().contains(TestData.MOBILITYX_PAGETITLE.data));
	}

	

	
	
	@When("user clicks on Create an Authorization menu")
	public void user_clicks_on_create_an_authorization_menu() {
		homePage.clickOnCreateAuthorization();
		
	}
	
	@When("user clicks on Submit to Aires option after filling all mandetory information")
	public void click_on_submit_to_aires_after_filling_all_mandetory_information() throws InterruptedException, AWTException {
		homePage.fillAllMandetoryFieldToCreateAuthorizationOnHomePage();
	
		initiationPage.fillAllMandatoryFields();
		initiationPage.clickOnUploadDocumnet();
		initiationPage.clickOnFileUploadLink();
		initiationPage.enterFileUploadPath(System.getProperty("user.dir")+TestData.FILE_UPLOAD_PATH.data);
		initiationPage.submitUploadPath();
		initiationPage.clickOnContributors();
		initiationPage.clickOnAddContributor();
		initiationPage.selectTypeOfContribution(TestData.TYPE_OF_CONTRIBUTION.data);
		initiationPage.selectContributorName(TestData.CONTRIBUTOR_NAME.data);
		initiationPage.clickOnAddContributorButton();
		initiationPage.clickOnSubmitToAires();
		initiationPage.clickOnSubmitButton();
	}

	@Then("user should get submit to AIRES message")
	public void user_should_get_successful_submit_message() {
		Assert.assertTrue(initiationPage.initiationSubmitToAIRESMessage());
	}

}
