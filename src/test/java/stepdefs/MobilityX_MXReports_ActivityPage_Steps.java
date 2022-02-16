package stepdefs;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class MobilityX_MXReports_ActivityPage_Steps {
	private WebDriver driver;
	private LoginPage loginPage = new LoginPage(driver);
	private HomePage homePage = new HomePage(driver);
	@Given("He is on MXReports Activity Tab with default filter applied")
	public void he_is_on_mx_reports_activity_tab_with_default_filter_applied() {
		
	    homePage.clickOnAccessMSReportsPage();
	    homePage.screenCaptureAndDownloadreports();
	}

	@When("He applies different filters and perform following actions on different sections")
	public void he_applies_different_filters_and_perform_following_actions_on_different_sections(DataTable dataTable) {
	    
	}

	@Then("He should be able to see reports within expected time")
	public void he_should_be_able_to_see_reports_within_expected_time() {
	    
	}


	
}
