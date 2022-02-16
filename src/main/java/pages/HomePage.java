package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import constants.JSExecutorStatements;
import constants.TestData;
import utils.Helper;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "cookiePupupButtonId") private WebElement cookieAcceptButton;
	@FindBy(id = "dcmjhhr:openUserProfileText") private WebElement userProfileNameText;
	@FindBy(id = "dcmjhhr:pgl2") private WebElement userProfile;
	@FindBy(id = "dcmjhhr:logouticon") private WebElement logOut;
	@FindBy(id = "ot1") private WebElement createAuthorization;
	@FindBy(css = "iframe[title='Content'][id*='j_id'][onload='AdfDhtmlInlineFramePeer.__iframeLoadHandler(event)'][data-afr-panelwindowid*='j_id'][style='position: absolute; width: 100%; height: 100%;'][src*='/mobilityx/faces/adf.dialog-request?_rtrnId='][data-afr-rtnid]") private WebElement createNewAuthorizationFrame;
	@FindBy(id = "xlsbr2::content") private WebElement manuallyInputOption;
	@FindBy(id = "xlsbr1::content") private WebElement UploadFileWithEmployeeInformation;
	@FindBy(id = "stec1") private WebElement continueButton ; 
	@FindBy(id = "fname::content") private WebElement firstName;
	@FindBy(id = "lname::content") private WebElement lastName;
	@FindBy(id = "cdot2") private WebElement newTransferOrAssignment;
	@FindBy(id = "soc2::content") private WebElement authorizationForm ; 
	@FindBy(id = "ctb1") private WebElement continueAuthForm ;
	@FindBy(id = "dRegion:0:rptSubTitle") private WebElement accessProgramReporting ;
	@FindBy(xpath = "//span[text()='Activity History']") private WebElement activityHistoryText ;
	@FindBy(xpath = "//span[text()='Options'][@class='RXLink RXBold']") private List<WebElement> optionsMenuOnPage ;
	@FindBy(xpath = "//span[text()='Screen Capture']") private WebElement screenCapture ;
	@FindBy(xpath = "//span[text()='Download']") private WebElement download ;
	@FindBy(xpath = "//span[text()='Yes']") private WebElement yesOption ;
	@FindBy(xpath = "//span[text()='PDF']") private WebElement pdfDownload ;
	@FindBy(id = "mxrRgn:0:downloadMXRReportOptionPanel::close") private WebElement closeDownload;
	
	
	
	public void acceptCookie() {
		Helper.waitUntilVisibilityOfelement(driver, cookieAcceptButton);
		Helper.waitUntilElementToBeClicable(driver, cookieAcceptButton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//Helper.jsExecuteScript(js, JSExecutorStatements.CLICK.statement, cookieAcceptButton);
		cookieAcceptButton.click();
		//wait.until(ExpectedConditions.visibilityOf(cookieAcceptButton)).click();
	}
	
	public String getPageTitle() {
		return Helper.getPageTitle(driver);
		
		//return driver.getTitle();
	}
	
	public String getPageSource() {
		return Helper.getPageSource(driver);
		
		//return driver.getPageSource();
	}
	
	public void clickOnUserProfileText() {
		Helper.waitUntilElementToBeClicable(driver, userProfileNameText);
		Helper.jsExecuteScript(js, JSExecutorStatements.CLICK.statement, userProfileNameText);
		
		//wait.until(ExpectedConditions.elementToBeClickable(userProfileNameText));
		//js.executeScript(JSExecutorStatements.CLICK.statement, userProfileNameText);
	
	}
	
	public void clickOnLogOut() {
		
		Helper.waitUntilVisibilityOfelement(driver, logOut);
		Helper.clickOn(logOut);
		
		//wait.until(ExpectedConditions.visibilityOf(logOut)).click();
	}
	
	public void clickOnCreateAuthorization() {
		Helper.waitUntilVisibilityOfelement(driver, createAuthorization);
		Helper.waitUntilElementToBeClicable(driver, createAuthorization);
		Helper.jsExecuteScript(js, JSExecutorStatements.CLICK.statement, createAuthorization);
		
		//wait.until(ExpectedConditions.visibilityOf(createAuthorization));
		//wait.until(ExpectedConditions.elementToBeClickable(createAuthorization));
		//js.executeScript(JSExecutorStatements.CLICK.statement, createAuthorization);
	}
	
	public void howToCreateAuthorization(String wayOfAutorization) {
		Helper.waitUntilVisibilityOfelement(driver, createNewAuthorizationFrame);
		Helper.waitUntilFrameToBeAvailableAndSwitchToIt(driver, createNewAuthorizationFrame);
		
		//wait.until(ExpectedConditions.visibilityOf(createNewAuthorizationFrame));
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(createNewAuthorizationFrame));
		if(wayOfAutorization.contains("Upload a file with employee information")) {
			Helper.jsExecuteScript(js, JSExecutorStatements.CLICK.statement, UploadFileWithEmployeeInformation);
			Helper.jsExecuteScript(js, JSExecutorStatements.CLICK.statement, continueButton);
			
			//js.executeScript(JSExecutorStatements.CLICK.statement, UploadFileWithEmployeeInformation);
			//js.executeScript(JSExecutorStatements.CLICK.statement, continueButton);
		}else {
			Helper.jsExecuteScript(js, JSExecutorStatements.CLICK.statement, manuallyInputOption);
			Helper.jsExecuteScript(js, JSExecutorStatements.CLICK.statement, continueButton);
			
			//js.executeScript(JSExecutorStatements.CLICK.statement, manuallyInputOption);
			//js.executeScript(JSExecutorStatements.CLICK.statement, continueButton);
		}
	}
	
	public void setFirstName(String fName) {
		Helper.waitUntilVisibilityOfelement(driver, firstName);
		Helper.setText(firstName, fName);
		
		//wait.until(ExpectedConditions.visibilityOf(firstName));
		//firstName.sendKeys(fName);
	}
	
	public void enterlastName(String lName) {
		Helper.waitUntilVisibilityOfelement(driver, lastName);
		Helper.setText(lastName, lName);
		
		//wait.until(ExpectedConditions.visibilityOf(lastName));
		//lastName.sendKeys(lName);
	}

	public void clickOnContinueButton() {
		Helper.clickOn(continueButton);
		
		//continueButton.click();
	}
	
	public void clickOnNewTransferOrAssignment() {
		Helper.waitUntilVisibilityOfelement(driver, newTransferOrAssignment);
		Helper.clickOn(newTransferOrAssignment);
		
		//wait.until(ExpectedConditions.visibilityOf(newTransferOrAssignment));
		//newTransferOrAssignment.click();
	}
	
	public void selectAuthorizationForm(String option) {
		Helper.waitUntilVisibilityOfelement(driver, authorizationForm);
		Helper.jsExecuteSelectScript(js, JSExecutorStatements.SELECT.statement, authorizationForm, option);
		
		//wait.until(ExpectedConditions.visibilityOf(authorizationForm));
		//js.executeScript(JSExecutorStatements.SELECT.statement, authorizationForm, option);
	}
	
	public void clickOnContinueAuthForm(){
		Helper.clickOn(continueAuthForm);
		Helper.waitUntilInvisibilityOfelement(driver, continueAuthForm);
		
		//continueAuthForm.click();
		//wait.until(ExpectedConditions.invisibilityOf(continueAuthForm));
	}
	
	public void fillAllMandetoryFieldToCreateAuthorizationOnHomePage() {
		String howTocreateAuth = TestData.HOW_TO_CREATE_AUTHORIZATION.data;
		howToCreateAuthorization(howTocreateAuth);
		if (howTocreateAuth.contains(TestData.MANUALLY_INPUT_EMPLOYEE_INFORMATION.data)) {
			setFirstName(TestData.FIRSTNAME.data + TestData.randString);
			enterlastName(TestData.LASTNAME.data + TestData.randString);
		}

		clickOnContinueButton();
		clickOnNewTransferOrAssignment();
		selectAuthorizationForm(TestData.AUTHORIZATION_FORM.data);
		clickOnContinueAuthForm();
	}
	
	public void clickOnAccessMSReportsPage() {
		Helper.moveToElementUsingActions(driver, UploadFileWithEmployeeInformation);
		long start = System.currentTimeMillis();
		Helper.jsExecuteScript(js,JSExecutorStatements.CLICK.statement , accessProgramReporting);
		Helper.waitUntilVisibilityOfelement(driver, activityHistoryText);
		long finish = System.currentTimeMillis();
		long actionCompletionTime= finish-start;
		System.out.println("Page load time is = "+actionCompletionTime+" ms");
	}
	
	
	public void screenCaptureAndDownloadreports() {
		for(WebElement optionMenu: optionsMenuOnPage) {
			Helper.waitHandler(5);
			long start = System.currentTimeMillis();
			//Helper.moveToElementUsingActions(driver, optionMenu);
			//Helper.waitUntilElementToBeClicable(driver, optionMenu);
			Helper.jsExecuteScript(js,JSExecutorStatements.CLICK.statement , optionMenu);
			//Helper.waitUntilVisibilityOfelement(driver, screenCapture);
			Helper.waitHandler(5);
			//Helper.moveToElementUsingActions(driver, screenCapture);
			//Helper.waitUntilElementToBeClicable(driver, screenCapture);
			Helper.jsExecuteScript(js,JSExecutorStatements.CLICK.statement , screenCapture);
			Helper.waitHandler(5);
			//Helper.waitUntilVisibilityOfelement(driver, yesOption);
			//Helper.moveToElementUsingActions(driver, yesOption);
			//Helper.waitUntilElementToBeClicable(driver, yesOption);
			yesOption.click();
			long finish = System.currentTimeMillis();
			long actionCompletionTime= finish-start-10000;
			System.out.println("Screen capture time is = "+actionCompletionTime+" ms");
			
			
			Helper.waitHandler(5);
			//Helper.moveToElementUsingActions(driver, optionMenu);
			//Helper.waitUntilElementToBeClicable(driver, optionMenu);
			start = System.currentTimeMillis();
			Helper.jsExecuteScript(js,JSExecutorStatements.CLICK.statement , optionMenu);
			Helper.waitHandler(5);
			//Helper.waitUntilVisibilityOfelement(driver, download);
			//Helper.moveToElementUsingActions(driver, download);
			//Helper.waitUntilElementToBeClicable(driver, download);
			Helper.jsExecuteScript(js,JSExecutorStatements.CLICK.statement , download);
			Helper.waitHandler(5);
			//wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(pdfDownload)));
			//Helper.waitUntilVisibilityOfelement(driver, pdfDownload);
			//Helper.waitUntilElementToBeClicable(driver, pdfDownload);
			Helper.jsExecuteScript(js,JSExecutorStatements.CLICK.statement , pdfDownload);
			Helper.waitHandler(5);
			//Helper.waitUntilElementToBeClicable(driver, closeDownload);
			Helper.jsExecuteScript(js,JSExecutorStatements.CLICK.statement , closeDownload);;
			finish = System.currentTimeMillis();
			actionCompletionTime= finish-start-10000;
			System.out.println("PDF download time is = "+actionCompletionTime+" ms");
		}
	}
}




