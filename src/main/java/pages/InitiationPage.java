package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import constants.JSExecutorStatements;
import constants.TestData;
import utils.Helper;

public class InitiationPage extends BasePage {

	public InitiationPage(WebDriver driver) {
		super(driver);	
	}
	
//	@FindBy(id = "") private WebElement ;
	@FindBy(id = "aRegion:0:startDate::content") private WebElement startDate;
	@FindBy(id = "aRegion:0:relocationPolicy::content") private WebElement relocationPolicy;
	@FindBy(id= "aRegion:0:originAddress::content" ) private WebElement originAddress;
	@FindBy(id= "aRegion:0:originCity::content" ) private WebElement originCity;
	@FindBy(id = "aRegion:0:originState::content") private WebElement originState;
	@FindBy(id = "aRegion:0:originZip::content") private WebElement originZip;
	@FindBy(id = "aRegion:0:originCountry::content") private WebElement originCountry;
	@FindBy(id="aRegion:0:destAddress::content") private WebElement destinationAddress;
	@FindBy(id= "aRegion:0:destCity::content") private WebElement destinationCity;
	@FindBy(id = "aRegion:0:destinationState::content") private WebElement destinationState;
	@FindBy(id ="aRegion:0:destZip::content") private WebElement destinationZip;
	@FindBy(id = "aRegion:0:destCountry::content") private WebElement destinationCountry;
	@FindBy(id = "aRegion:0:newJobTitle::content") private WebElement newJobTitile;
	@FindBy(id = "aRegion:0:officePhone::content") private WebElement officeTelephone;
	@FindBy(id = "aRegion:0:faxNumber::content") private WebElement faxNumber;
	@FindBy(id = "aRegion:0:mobileTelephone::content") private WebElement mobileTelephoneNo;
	@FindBy(id = "aRegion:0:emailType_Type::content") private WebElement emailType;
	@FindBy(id = "aRegion:0:emailType_Value::content") private WebElement emailTypeValue;
	@FindBy(id = "aRegion:0:email::content") private WebElement emailContent;
	@FindBy(id = "aRegion:0:transferType100::content") private WebElement transferTypeNewHire;
	@FindBy(id = "aRegion:0:transferType101::content") private WebElement transferTypeTransferOfCurrentEmployee;
	@FindBy(id = "aRegion:0:homeStatus100::content") private WebElement homeStatusHomeOwner; 
	@FindBy(id = "aRegion:0:homeStatus101::content") private WebElement homeStatusRenter;
	@FindBy(id = "aRegion:0:assignmentType::content") private WebElement assignmentType;
	@FindBy(id = "aRegion:0:comments::content") private WebElement commentModificationOrException;
	@FindBy(id = "aRegion:0:marriageStatus100::content") private WebElement maritalStatusSingle;
	@FindBy(id = "aRegion:0:marriageStatus101::content") private WebElement maritalStatusMarried;
	@FindBy(id = "aRegion:0:spouseName::content") private WebElement spouseName;
	@FindBy(id = "aRegion:0:spousePrimaryContact::content") private WebElement spouseIsPrimaryContactForRelocation;
	@FindBy(id = "aRegion:0:spouseMobileTelephone::content") private WebElement spouseMobileNumber;
	@FindBy(id = "aRegion:0:familySize::content") private WebElement familySize;
	@FindBy(id = "aRegion:0:childrenNamesAges::content") private WebElement childrenNamesAndAges;
	@FindBy(id = "aRegion:0:altEmail::content") private WebElement alternateEmail;
	@FindBy(id = "aRegion:0:employeeID::content") private WebElement employeeID;
	@FindBy(id = "aRegion:0:department::content") private WebElement department;
	@FindBy(id = "aRegion:0:costCenter::content") private WebElement costCenter;
	@FindBy(id = "aRegion:0:gradeLevel::content") private WebElement gradeLevel;
	@FindBy(id = "aRegion:0:POnumber::content") private WebElement poNumber;
	@FindBy(id = "aRegion:0:businessGroup::content") private WebElement businessGroup;
	@FindBy(id = "aRegion:0:division::content") private WebElement division;
	@FindBy(id = "aRegion:0:companyNumber::content") private WebElement companyNumber;
	@FindBy(id = "aRegion:0:reloBenefitsExpire::content") private WebElement relocationBenifitExpire;
	@FindBy(id = "aRegion:0:floatingMenuIterator:2:displayName") private WebElement saveYourProgress;
	@FindBy(xpath = "//span[text()='Upload a document'][contains(@class,'RXSmallText')]") private WebElement uploadDocument;
	@FindBy(css = "iframe[title='Content'][id*='j_id'][onload='AdfDhtmlInlineFramePeer.__iframeLoadHandler(event)'][data-afr-panelwindowid*='j_id'][style='position: absolute; width: 100%; height: 100%;'][src*='/mobilityx/faces/adf.dialog-request?_rtrnId='][data-afr-rtnid]") private WebElement fileUploadFrame;
	@FindBy(id = "fileUpload::content") private WebElement fileUploadpath;
	@FindBy(css = "span[id='fileUploadLink']") private WebElement fileUploadLink;
	@FindBy(id = "submitButton") private WebElement submitUploadFileButton;
	@FindBy(id = "aRegion:0:ot1w") private WebElement uploadMessage;
	@FindBy(xpath = "//span[text()='Collaboration'][contains(@class,'RXText')]") private WebElement collaboration;
	@FindBy(id = "aRegion:1:afwfots2") private WebElement addContributor;
	@FindBy(css = "iframe[title='Content'][id*='j_id'][onload='AdfDhtmlInlineFramePeer.__iframeLoadHandler(event)'][data-afr-panelwindowid*='j_id'][style='position: absolute; width: 100%; height: 100%;'][src*='/mobilityx/faces/adf.dialog-request?_rtrnId='][data-afr-rtnid]") private WebElement addContributorFrame;
	@FindBy(id = "cpRequestHelp0::content") private WebElement contributeToTheAuthorization;
	By contributeToTheAuthorizationEle = By.id("cpRequestHelp0::content");
	@FindBy(id = "cpRequestHelp1::content") private WebElement reviewTheInitiation;
	@FindBy(id = "cpsoc2::content") private WebElement selectContributorName;
	By contributorName = By.xpath("//*[text()=\'"+TestData.CONTRIBUTOR_NAME.data+"\']");
	@FindBy(xpath = "//label[text()='Comments']") private WebElement comments;
	@FindBy(id = "startCollaboratingBtn") private WebElement addContributorButton;
	@FindBy(xpath = "//span[text()='Submit to Aires'][contains(@class,'RXSecondaryText')]") private WebElement submitToAires;
	@FindBy(id = "aRegion:1:wwproceedApproverListBtnwww") private WebElement submitButton;
	@FindBy(xpath = "//iframe[@class='AFMaskingFrame'][@data-afr-inuse='true']") private WebElement submitToAIRESFrame;
	@FindBy(id = "aRegion:1:wwproceedApproverListBtnwww") private WebElement submitInitiation;
	
	By successMessage = By.xpath("//*[contains(text(),'is in the submission process. You will receive an email notification when the initiation has been successfully submitted')]");
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	
	
	public void setStartDate(String sDate) {
		Helper.waitUntilVisibilityOfelement(driver, startDate);
		Helper.clearText(startDate);
		Helper.setText(startDate, sDate);
		
		//wait.until(ExpectedConditions.visibilityOf(startDate));
		//startDate.clear();
		//startDate.sendKeys(sDate);
	}
	
	public void selectRelocationPolicy(String relocPolicy) {
		js.executeScript(JSExecutorStatements.SELECT.statement, relocationPolicy, relocPolicy);
	}
	
	public void enterOriginAddress(String oriAddress) {
		originAddress.clear();
		originAddress.sendKeys(oriAddress);
	}
	
	public void enterOriginCity(String oriCity) {
		originCity.clear();
		originCity.sendKeys(oriCity);
	}
	
	public void selectOriginState(String state) {
		js.executeScript(JSExecutorStatements.SELECT.statement, originState, state);
	}
	public void enterOriginZip(String oriZip) {
		originZip.clear();
		originZip.sendKeys(oriZip);
	}
	
	public void selectOriginCountry(String oriCountry) {
		js.executeScript(JSExecutorStatements.SELECT.statement, originCountry, oriCountry);
	}
	
	public void eneterDestinationAddress(String destAddress) {
		destinationAddress.clear();
		destinationAddress.sendKeys(destAddress);
	}
	
	public void enterDestinationCity(String destCity) {
		destinationCity.clear();
		destinationCity.sendKeys(destCity);
	}
	
	public void selectDestinationState(String destState) {
		js.executeScript(JSExecutorStatements.SELECT.statement, destinationState, destState);
	}
	
	public void enterDestinationZip(String destZip) {
		destinationZip.clear();
		destinationZip.sendKeys(destZip);
	}
	
	public void selectDestinationCountry(String destCountry) {
		js.executeScript(JSExecutorStatements.SELECT.statement, destinationCountry, destCountry);
	}
	
	public void enterNewJobTitle(String newJobTit) {
		newJobTitile.clear();
		newJobTitile.sendKeys(newJobTit);
	}
	
	public void enterOfficeTelephone(String officTelephome) {
		officeTelephone.clear();
		officeTelephone.sendKeys(officTelephome);
	}
	
	public void enterFaxNumber(String faxNum) {
		faxNumber.sendKeys(faxNum);
	}
	
	public void enterMobileTelephoneNumber(String mobTelNum) {
		mobileTelephoneNo.sendKeys(mobTelNum);
	}
	
		
	public void selectEmailType(String emaiType) {
		js.executeScript(JSExecutorStatements.SELECT.statement, emailType, emaiType);
	}
	
	public void eneterEmailTypeValue(String emailTypeVal) {
		emailTypeValue.sendKeys(emailTypeVal);
	}
	
	public void enterEmaitContent(String email) {
		emailContent.sendKeys(email);
	}
	
	public void selectTransferType(String transferType) {
		if(transferType.contains("New Hire")) {
			js.executeScript(JSExecutorStatements.CLICK.statement, transferTypeTransferOfCurrentEmployee);
			js.executeScript(JSExecutorStatements.CLICK.statement, transferTypeNewHire);
		}else if(transferType.contains("Transfer of Current Employee")) {
			js.executeScript(JSExecutorStatements.CLICK.statement, transferTypeTransferOfCurrentEmployee);
			js.executeScript(JSExecutorStatements.CLICK.statement, transferTypeNewHire);
		}
	}
	
	public void selectHomeStatus(String hmStatus) {
		if(hmStatus.contains("Homeowner")) {
			js.executeScript(JSExecutorStatements.CLICK.statement, homeStatusRenter);
			js.executeScript(JSExecutorStatements.CLICK.statement, homeStatusHomeOwner);
			js.executeScript(JSExecutorStatements.CLICK.statement, homeStatusRenter);
			js.executeScript(JSExecutorStatements.CLICK.statement, homeStatusHomeOwner);
		}else if(hmStatus.contains("Renter")) {
			js.executeScript(JSExecutorStatements.CLICK.statement, homeStatusHomeOwner);
			js.executeScript(JSExecutorStatements.CLICK.statement, homeStatusRenter);
			js.executeScript(JSExecutorStatements.CLICK.statement, homeStatusHomeOwner);
			js.executeScript(JSExecutorStatements.CLICK.statement, homeStatusRenter);
		}
	}
	
	public void selectAssignmentType(String assignment) {
		js.executeScript(JSExecutorStatements.SELECT.statement, assignmentType, assignment);
	}
	
	public void enterCommnetModification(String comment) {
		 
		commentModificationOrException.sendKeys(comment);
	}
	public void selectMaritalStatus(String maritalStatus) {
		if(maritalStatus.contains("Single")) {
			
			js.executeScript(JSExecutorStatements.CLICK.statement, maritalStatusSingle);
			maritalStatusSingle.click();
		}else {
			
			js.executeScript(JSExecutorStatements.CLICK.statement, maritalStatusMarried);
		}
	}
	
	public void enetrSpouseName(String spouseNm) {
		spouseName.sendKeys(spouseNm);
	}
	
	public void selectSpouseIsPrimaryContactForRelocation(String option) {
		if(option.equalsIgnoreCase("yes")) {
			spouseIsPrimaryContactForRelocation.click();
		}
	}
	
	public void enterSpouseMobileNumber(String spouseMobNum) {
		spouseMobileNumber.clear();
		spouseMobileNumber.sendKeys(spouseMobNum);
	}
	
	public void selectFamilySize(String fSize) {
		js.executeScript(JSExecutorStatements.SELECT.statement, familySize, fSize);
	}
	public void enterChildrenNamesAndAges(String childNamesAndAges) {
		childrenNamesAndAges.clear();
		childrenNamesAndAges.sendKeys(childNamesAndAges);
	}
	public void enterAlternateEmail(String altEmail) {
		alternateEmail.clear();
		alternateEmail.sendKeys(altEmail);
	}
	
	public void enterEmployeeID(String empID) {
		employeeID.clear();
		employeeID.sendKeys(empID);
	}
	
	public void enterDepartment(String dept) {
		department.clear();
		department.sendKeys(dept);
	}
	
	public void enterCostCenter(String cstCenter) {
		costCenter.clear();
		costCenter.sendKeys(cstCenter);
	}
	
	public void enterGrade1Level(String grdLevel) {
		gradeLevel.clear();
		gradeLevel.sendKeys(grdLevel);
	}
	
	public void eneterPONumber(String pONumber) {
		poNumber.clear();
		poNumber.sendKeys(pONumber);
	}
	
	public void enterBusinessGroup(String businessGrp) {
		businessGroup.clear();
		businessGroup.sendKeys(businessGrp);
	}
	
	public void enterDivision(String div) {
		division.clear();
		division.sendKeys(div);
	}
	
	public void enterCompanyNumber(String cmpNumber) {
		companyNumber.clear();
		companyNumber.sendKeys(cmpNumber);
	}
	
	public void enterRelocationBenefitExpireDate(String date) {
		relocationBenifitExpire.sendKeys(date);
	}
	
	public void clickOnSaveYourProgress() {
		saveYourProgress.click();
	}
	 public void clickOnUploadDocumnet() {
		 js.executeScript(JSExecutorStatements.CLICK.statement, uploadDocument);
		
	 }
	 
	 public void clickOnFileUploadLink() {
		wait.until(ExpectedConditions.visibilityOf(fileUploadFrame));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(fileUploadFrame));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fileUpload::content")));
		wait.until(ExpectedConditions.elementToBeClickable(submitUploadFileButton));
		 js.executeScript(JSExecutorStatements.CLICK.statement,  fileUploadLink);
		 
		 fileUploadLink.click();
	 }
	 public void enterFileUploadPath(String filePath) {
		wait.until(ExpectedConditions.visibilityOf(fileUploadFrame));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(fileUploadFrame));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fileUpload::content")));
		wait.until(ExpectedConditions.elementToBeClickable(submitUploadFileButton));
		fileUploadpath.sendKeys(filePath);
	 }
	 
	 public void submitUploadPath() {
		wait.until(ExpectedConditions.elementToBeClickable(submitUploadFileButton));
		 js.executeScript(JSExecutorStatements.CLICK.statement, submitUploadFileButton);
		 wait.until(ExpectedConditions.invisibilityOf(submitUploadFileButton));
	 }
	 
	 public void clickOnContributors() {
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.elementToBeClickable(collaboration));
		js.executeScript(JSExecutorStatements.CLICK.statement, collaboration);
	 }
	 
	 public void clickOnAddContributor() {
		 wait.until(ExpectedConditions.visibilityOf(addContributor));
		 js.executeScript(JSExecutorStatements.CLICK.statement, addContributor);
	 }
	 
	 public void selectTypeOfContribution(String contriType) {
		 
		wait.until(ExpectedConditions.visibilityOf(addContributorFrame));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(addContributorFrame));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("startCollaboratingBtn")));
		
		 if(contriType.contains(TestData.CONTRIBUTE_TO_AUTORIZATION.data)) {
			 js.executeScript(JSExecutorStatements.CLICK.statement, contributeToTheAuthorization);
		 }else { 	
			js.executeScript(JSExecutorStatements.CLICK.statement, reviewTheInitiation);	 
		 }
	 }
	 
	 public void selectContributorName(String contName) {
		 js.executeScript(JSExecutorStatements.CLICK.statement, selectContributorName); 
		 js.executeScript(JSExecutorStatements.CLICK.statement, addContributorButton);
		 wait.until(ExpectedConditions.presenceOfElementLocated(contributorName));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(contributorName));
		 js.executeScript(JSExecutorStatements.SELECT.statement, selectContributorName, contName);
	 }
	 
	 public void clickOnAddContributorButton() {
		 js.executeScript(JSExecutorStatements.CLICK.statement, addContributorButton);
	 }
	 
	 public void clickOnSubitInitiation() {
		 submitInitiation.click();
	 }
	 
	 public void enterContributionComment(String commentcon) {
		 comments.click();
		 comments.sendKeys(commentcon);
	 }
	 
	 public void clickOnSubmitToAires() {
		 driver.switchTo().defaultContent();
		 js.executeScript(JSExecutorStatements.CLICK.statement, submitToAires);
	 }
	 
	 public void clickOnSubmitButton() {
		js.executeScript(JSExecutorStatements.CLICK.statement, submitButton);
	 }
	 
	 public boolean initiationSubmitToAIRESMessage() {
		 wait.until(ExpectedConditions.presenceOfElementLocated(successMessage));
		return driver.getPageSource().contains(TestData.SUBMIT_INITIATION_SUCCESS_MESSAGE.data);
	 }
	 
	 public void fillAllMandatoryFields() {
		 setStartDate(dtf.format(LocalDateTime.now().plusDays(15)));
			selectRelocationPolicy(TestData.RELOCATION_POLICY.data);
			enterOriginAddress(TestData.ORIGIN_ADDRESS.data + TestData.randString);
			enterOriginCity(TestData.ORIGIN_CITY.data + TestData.randString);
			selectOriginState(TestData.ORIGIN_STATE.data);
			enterOriginZip(TestData.ORIGIN_ZIP.data);
			selectOriginCountry(TestData.ORIGIN_COUNTRY.data);
			eneterDestinationAddress(TestData.DESTINATION_ADDRESS.data + TestData.randString);
			enterDestinationCity(TestData.DESTINATION_CITY.data + TestData.randString);
			selectDestinationState(TestData.DESTINATION_STATE.data);
			enterDestinationZip(TestData.DESTINATION_ZIP.data);
			selectDestinationCountry(TestData.DESTINATION_COUNTRY.data);
			enterNewJobTitle(TestData.NEW_JOB_TITLE.data);
			enterOfficeTelephone(TestData.OFFICETELEPHONE.data);
			enterFaxNumber(TestData.FAX_NUMBER.data);
			enterMobileTelephoneNumber(TestData.MOBILE_TELEPHONE_NUMBER.data);
			selectEmailType(TestData.EMAIL_TYPE.data);
			eneterEmailTypeValue(TestData.FIRSTNAME.data + TestData.randString + TestData.ALTERNATE_EMAIL_PART2.data);
			enterEmaitContent(TestData.LASTNAME.data + TestData.randString + TestData.ALTERNATE_EMAIL_PART2.data);
			selectTransferType(TestData.TRANSFER_TYPE.data);
			selectHomeStatus(TestData.HOME_STATUS.data);
			selectAssignmentType(TestData.ASSIGNMENT_TYPE.data);
			enterCommnetModification(TestData.COMMENT_MODIFICATION.data);
			String maritalStatus = TestData.SINGLE.data;
			selectMaritalStatus(TestData.MARRIED.data);
			if (maritalStatus.contains(TestData.MARRIED.data)) {
				enetrSpouseName(TestData.SPOUSE_NAME.data + TestData.randString);
				selectSpouseIsPrimaryContactForRelocation(TestData.SPOUSE_IS_PRIMARY_CONTACT_FOR_RELOCATION.data);
			}

			selectFamilySize(TestData.FAMILY_SIZE.data);
			enterChildrenNamesAndAges(TestData.CHILDREN_NAME_AND_AGES.data);
			enterAlternateEmail(TestData.ALTERNATE_EMAIL_PART1.data + TestData.randString + TestData.ALTERNATE_EMAIL_PART2.data);
			enterEmployeeID(TestData.EMPLOYEE_ID.data);
			enterDepartment(TestData.DEPARTMENT.data);
			enterCostCenter(TestData.COST_CENTER.data);
			enterGrade1Level(TestData.GRADELEVEL.data);
			eneterPONumber(TestData.PO_NUMBER.data);
			enterBusinessGroup(TestData.BUSINESS_GROUP.data);
			enterDivision(TestData.DIVISION.data);
			enterCompanyNumber(TestData.COMPANY_NUMBER.data);
			enterRelocationBenefitExpireDate(dtf.format(LocalDateTime.now().plusMonths(9)));
	 }
	 
	 public void dragAndDrop() throws AWTException {
		 Robot rbt = new Robot();
		 
		
	 }
	 
	 
	 
}











































//package pages;
//
//
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//
//public class InitiationPage extends BasePage {
//
//	public InitiationPage(WebDriver driver) {
//		super(driver);	
//	}
//	
////	@FindBy(id = "") private WebElement ;
//	//@FindBy(id = "aRegion:0:startDate::content") private WebElement startDate;
//	By startDate = By.id("aRegion:0:startDate::content");
//	//@FindBy(id = "aRegion:0:relocationPolicy::content") private WebElement relocationPolicy;
//	By relocationPolicy =By.id("aRegion:0:relocationPolicy::content");
////	@FindBy(id= "aRegion:0:originAddress::content" ) private WebElement originAddress;
//	By originAddress = By.id("aRegion:0:originAddress::content");
////	@FindBy(id= "aRegion:0:originCity::content" ) private WebElement originCity;
//	By originCity = By.id("aRegion:0:originCity::content");
////	@FindBy(id = "aRegion:0:originState::content") private WebElement originState;
//	By originState = By.id("aRegion:0:originState::content");
////	@FindBy(id = "aRegion:0:originZip::content") private WebElement originZip;
//	By originZip = By.id("aRegion:0:originZip::content");
////	@FindBy(id = "aRegion:0:originCountry::content") private WebElement originCountry;
//	By originCountry = By.id("aRegion:0:originCountry::content");
////	@FindBy(id="aRegion:0:destAddress::content") private WebElement destinationAddress;
//	By destinationAddress = By.id("aRegion:0:destAddress::content");
////	@FindBy(id= "aRegion:0:destCity::content") private WebElement destinationCity;
//	By destinationCity = By.id("aRegion:0:destCity::content");
////	@FindBy(id = "aRegion:0:destinationState::content") private WebElement destinationState;
//	By destinationState = By.id("aRegion:0:destinationState::content");
////	@FindBy(id ="aRegion:0:destZip::content") private WebElement destinationZip;
//	By destinationZip = By.id("aRegion:0:destZip::content");
////	@FindBy(id = "aRegion:0:destCountry::content") private WebElement destinationCountry;
//	By destinationCountry = By.id("aRegion:0:destCountry::content");
////	@FindBy(id = "aRegion:0:newJobTitle::content") private WebElement newJobTitile;
//	By newJobTitile = By.id("aRegion:0:newJobTitle::content");
////	@FindBy(id = "aRegion:0:officePhone::content") private WebElement officeTelephone;
//	By officeTelephone = By.id("aRegion:0:officePhone::content");
////	@FindBy(id = "aRegion:0:faxNumber::content") private WebElement faxNumber;
//	By faxNumber = By.id("aRegion:0:faxNumber::content");
////	@FindBy(id = "aRegion:0:mobileTelephone::content") private WebElement mobileTelephoneNo;
//	By mobileTelephoneNo = By.id("aRegion:0:mobileTelephone::content");
////	@FindBy(id = "aRegion:0:emailType_Type::content") private WebElement emailType;
//	By emailType = By.id("aRegion:0:emailType_Type::content");
////	@FindBy(id = "aRegion:0:emailType_Value::content") private WebElement emailTypeValue;
//	By emailTypeValue = By.id("aRegion:0:emailType_Value::content");
////	@FindBy(id = "aRegion:0:email::content") private WebElement emailContent;
//	By emailContent = By.id("aRegion:0:email::content");
////	@FindBy(id = "aRegion:0:transferType100::content") private WebElement transferTypeNewHire;
//	By transferTypeNewHire = By.id("aRegion:0:transferType100::content");
////	@FindBy(id = "aRegion:0:transferType101::content") private WebElement transferTypeTransferOfCurrentEmployee;
//	By transferTypeTransferOfCurrentEmployee = By.id("aRegion:0:transferType101::content");
////	@FindBy(id = "aRegion:0:homeStatus100::content") private WebElement homeStatusHomeOwner; 
//	By homeStatusHomeOwner = By.id("aRegion:0:homeStatus100::content");
////	@FindBy(id = "aRegion:0:homeStatus101::content") private WebElement homeStatusRenter;
//	By homeStatusRenter = By.id("aRegion:0:homeStatus101::content");
////	@FindBy(id = "aRegion:0:assignmentType::content") private WebElement assignmentType;
//	By assignmentType = By.id("aRegion:0:assignmentType::content");
////	@FindBy(id = "aRegion:0:comments::content") private WebElement commentModificationOrException;
//	By commentModificationOrException = By.id("aRegion:0:comments::content");
////	@FindBy(id = "aRegion:0:marriageStatus100::content") private WebElement maritalStatusSingle;
//	By maritalStatusSingle = By.id("aRegion:0:marriageStatus100::content");
////	@FindBy(id = "aRegion:0:marriageStatus101::content") private WebElement maritalStatusMarried;
//	By maritalStatusMarried = By.id("aRegion:0:marriageStatus101::content");
////	@FindBy(id = "aRegion:0:spouseName::content") private WebElement spouseName;
//	By spouseName = By.id("aRegion:0:spouseName::content");
////	@FindBy(id = "aRegion:0:spousePrimaryContact::content") private WebElement spouseIsPrimaryContactForRelocation;
//	By spouseIsPrimaryContactForRelocation = By.id("aRegion:0:spousePrimaryContact::content");
////	@FindBy(id = "aRegion:0:spouseMobileTelephone::content") private WebElement spouseMobileNumber;
//	By spouseMobileNumber = By.id("aRegion:0:spouseMobileTelephone::content");
////	@FindBy(id = "aRegion:0:familySize::content") private WebElement familySize;
//	By familySize = By.id("aRegion:0:familySize::content");
////	@FindBy(id = "aRegion:0:childrenNamesAges::content") private WebElement childrenNamesAndAges;
//	By childrenNamesAndAges = By.id("aRegion:0:childrenNamesAges::content");
////	@FindBy(id = "aRegion:0:altEmail::content") private WebElement alternateEmail;
//	By alternateEmail = By.id("aRegion:0:altEmail::content");
////	@FindBy(id = "aRegion:0:employeeID::content") private WebElement employeeID;
//	By employeeID = By.id("aRegion:0:employeeID::content");
////	@FindBy(id = "aRegion:0:department::content") private WebElement department;
//	By department = By.id("aRegion:0:department::content");
////	@FindBy(id = "aRegion:0:costCenter::content") private WebElement costCenter;
//	By costCenter = By.id("aRegion:0:costCenter::content");
////	@FindBy(id = "aRegion:0:gradeLevel::content") private WebElement gradeLevel;
//	By gradeLevel = By.id("aRegion:0:gradeLevel::content");
////	@FindBy(id = "aRegion:0:POnumber::content") private WebElement poNumber;
//	By poNumber = By.id("aRegion:0:POnumber::content");
////	@FindBy(id = "aRegion:0:businessGroup::content") private WebElement businessGroup;
//	By businessGroup = By.id("aRegion:0:businessGroup::content");
////	@FindBy(id = "aRegion:0:division::content") private WebElement division;
//	By division = By.id("aRegion:0:division::content");
////	@FindBy(id = "aRegion:0:companyNumber::content") private WebElement companyNumber;
//	By companyNumber = By.id("aRegion:0:companyNumber::content");
////	@FindBy(id = "aRegion:0:reloBenefitsExpire::content") private WebElement relocationBenifitExpire;
//	By relocationBenifitExpire = By.id("aRegion:0:reloBenefitsExpire::content");
////	@FindBy(id = "aRegion:0:floatingMenuIterator:2:displayName") private WebElement saveYourProgress;
//	By saveYourProgress = By.id("aRegion:0:floatingMenuIterator:2:displayName");
////	@FindBy(xpath = "//span[text()='Upload a document'][contains(@class,'RXSmallText')]") private WebElement uploadDocument;
//	By uploadDocument = By.xpath("//span[text()='Upload a document'][contains(@class,'RXSmallText')]");
////	@FindBy(xpath = "//iframe[@title='Content']") private WebElement fileUploadFrame;
//	By fileUploadFrame = By.xpath("//iframe[@title='Content']");
////	@FindBy(id = "fileUpload::content") private WebElement fileUploadpath;
//	By fileUploadpath = By.id("fileUpload::content");
////	@FindBy(id = "submitButton") private WebElement submitUploadFileButton;
//	By submitUploadFileButton = By.id("submitButton");
////	@FindBy(id = "aRegion:0:ot1w") private WebElement uploadMessage;
//	By uploadMessage = By.id("aRegion:0:ot1w");
////	@FindBy(xpath = "//span[text()='Collaboration'][contains(@class,'RXText')]") private WebElement collaboration;
//	By collaboration = By.xpath("//span[text()='Collaboration'][contains(@class,'RXText')]");
////	@FindBy(id = "aRegion:1:afwfots2") private WebElement addContributor;
//	By addContributor = By.id("aRegion:1:afwfots2");
////	@FindBy(xpath = "//iframe[@title='Content']") private WebElement addContributorFrame;
//	By addContributorFrame = By.xpath("//iframe[@title='Content']");
////	@FindBy(id = "cpRequestHelp0::content") private WebElement contributeToTheAuthorization;
//	By contributeToTheAuthorization = By.id("cpRequestHelp0::content");
////	@FindBy(id = "cpRequestHelp1::content") private WebElement reviewTheInitiation;
//	By reviewTheInitiation = By.id("cpRequestHelp1::content");
////	@FindBy(id = "cpsoc2::content") private WebElement contributorName;
//	By contributorName = By.id("cpsoc2::content");
////	@FindBy(xpath = "//label[text()='Comments']") private WebElement comments;
//	By comments = By.xpath("//label[text()='Comments']");
////	@FindBy(id = "startCollaboratingBtn") private WebElement addContributorButton;
//	By addContributorButton = By.id("startCollaboratingBtn");
//	
//	
////	@FindBy(xpath = "//span[text()='Submit to Aires'][contains(@class,'RXSecondaryText')]") private WebElement submitToAires;
//	By submitToAires = By.xpath("//span[text()='Submit to Aires'][contains(@class,'RXSecondaryText')]");
////	@FindBy(id = "aRegion:1:wwproceedApproverListBtnwww") private WebElement submitButton;
//	By submitButton = By.id("aRegion:1:wwproceedApproverListBtnwww");
////	@FindBy(xpath = "//iframe[@class='AFMaskingFrame'][@data-afr-inuse='true']") private WebElement submitToAIRESFrame;
//	By submitToAIRESFrame = By.xpath("//iframe[@class='AFMaskingFrame'][@data-afr-inuse='true']");
////	@FindBy(id = "aRegion:1:wwproceedApproverListBtnwww") private WebElement submitInitiation;
//	By submitInitiation = By.id("aRegion:1:wwproceedApproverListBtnwww");
//	
//	
//	
//	
//	public void setStartDate(String sDate) {
//		driver.findElement(startDate).clear();
//		driver.findElement(startDate).sendKeys(sDate);
//	}
//	
//	public void selectRelocationPolicy(String relocPolicy) {
//		Select sel = new Select(driver.findElement(relocationPolicy));
//		sel.selectByVisibleText(relocPolicy);
//	}
//	
//	public void enterOriginAddress(String oriAddress) {
//		driver.findElement(originAddress).clear();
//		driver.findElement(originAddress).sendKeys(oriAddress);
//	}
//	
//	public void enterOriginCity(String oriCity) {
//		driver.findElement(originCity).clear();
//		driver.findElement(originCity).sendKeys(oriCity);
//	}
//	
//	public void selectOriginState(String state) {
//		Select sel =  new Select(driver.findElement(originState));
//		sel.selectByVisibleText(state);
//	}
//	public void enterOriginZip(String oriZip) {
//		driver.findElement(originZip).clear();
//		driver.findElement(originZip).sendKeys(oriZip);
//	}
//	
//	public void selectOriginCountry(String oriCountry) {
//		Select sel = new Select(driver.findElement(originCountry));
//		sel.selectByVisibleText(oriCountry);
//	}
//	
//	public void eneterDestinationAddress(String destAddress) {
//		driver.findElement(destinationAddress).clear();
//		driver.findElement(destinationAddress).sendKeys(destAddress);
//	}
//	
//	public void enterDestinationCity(String destCity) {
//		driver.findElement(destinationCity).clear();
//		driver.findElement(destinationCity).sendKeys(destCity);
//	}
//	
//	public void selectDestinationState(String destState) {
//		Select sel = new Select(driver.findElement(destinationState));
//		sel.selectByVisibleText(destState);
//	}
//	
//	public void enterDestinationZip(String destZip) {
//		driver.findElement(destinationZip).clear();
//		driver.findElement(destinationZip).sendKeys(destZip);
//	}
//	
//	public void selectDestinationCountry(String destCountry) {
//		Select sel= new Select(driver.findElement(destinationCountry));
//		sel.selectByVisibleText(destCountry);
//	}
//	
//	public void enterNewJobTitle(String newJobTit) {
//		driver.findElement(newJobTitile).clear();
//		driver.findElement(newJobTitile).sendKeys(newJobTit);
//	}
//	
//	public void enterOfficeTelephone(String officTelephome) {
//		driver.findElement(officeTelephone).clear();
//		driver.findElement(officeTelephone).sendKeys(officTelephome);
//	}
//	
//	public void enterFaxNumber(String faxNum) {
//		driver.findElement(faxNumber).sendKeys(faxNum);
//	}
//	
//	public void enterMobileTelephoneNumber(String mobTelNum) {
//		driver.findElement(mobileTelephoneNo).sendKeys(mobTelNum);
//	}
//	
//		
//	public void selectEmailType(String emaiType) {
//		Select sel = new Select(driver.findElement(emailType));
//		sel.selectByVisibleText(emaiType);
//	}
//	
//	public void eneterEmailTypeValue(String emailTypeVal) {
//		driver.findElement(emailTypeValue).sendKeys(emailTypeVal);
//	}
//	
//	public void enterEmaitContent(String email) {
//		driver.findElement(emailContent).sendKeys(email);
//	}
//	
//	public void selectTransferType(String transferType) {
//		if(transferType.contains("New Hire")) {
//			js.executeScript("arguments[0].click()", driver.findElement(transferTypeNewHire));
//		}else if(transferType.contains("Transfer of Current Employee")) {
//			js.executeScript("arguments[0].click()",driver.findElement(transferTypeTransferOfCurrentEmployee) );
//		}
//	}
//	
//	public void selectHomeStatus(String hmStatus) {
//		if(hmStatus.contains("Homeowner")) {
//			js.executeScript("arguments[0].click()", driver.findElement(homeStatusRenter));
//			js.executeScript("arguments[0].click()", driver.findElement(homeStatusHomeOwner));
//		}else if(hmStatus.contains("Renter")) {
//			js.executeScript("arguments[0].click()",driver.findElement(homeStatusHomeOwner));
//			js.executeScript("arguments[0].click()",driver.findElement(homeStatusRenter));
//		}
//	}
//	
//	public void selectAssignmentType(String assignment) {
//		Select sel = new Select(driver.findElement(assignmentType));
//		sel.selectByVisibleText(assignment);
//	}
//	
//	public void enterCommnetModification(String comment) {
//		 
//		driver.findElement(commentModificationOrException).sendKeys(comment);
//	}
//	public void selectMaritalStatus(String maritalStatus) {
//		if(maritalStatus.contains("Single")) {
//			
//			js.executeScript("arguments[0].click()", driver.findElement(maritalStatusSingle));
//			driver.findElement(maritalStatusSingle).click();
//		}else {
//			
//			js.executeScript("arguments[0].click()",driver.findElement(maritalStatusMarried) );
//		}
//	}
//	
//	public void enetrSpouseName(String spouseNm) {
//		driver.findElement(spouseName).sendKeys(spouseNm);
//	}
//	
//	public void selectSpouseIsPrimaryContactForRelocation(String option) {
//		if(option.equalsIgnoreCase("yes")) {
//			driver.findElement(spouseIsPrimaryContactForRelocation).click();
//		}
//	}
//	
//	public void enterSpouseMobileNumber(String spouseMobNum) {
//		driver.findElement(spouseMobileNumber).clear();
//		driver.findElement(spouseMobileNumber).sendKeys(spouseMobNum);
//	}
//	
//	public void selectFamilySize(String fSize) {
//		Select sel = new Select(driver.findElement(familySize));
//		sel.selectByVisibleText(fSize);
//	}
//	public void enterChildrenNamesAndAges(String childNamesAndAges) {
//		driver.findElement(childrenNamesAndAges).clear();
//		driver.findElement(childrenNamesAndAges).sendKeys(childNamesAndAges);
//	}
//	public void enterAlternateEmail(String altEmail) {
//		driver.findElement(alternateEmail).clear();
//		driver.findElement(alternateEmail).sendKeys(altEmail);
//	}
//	
//	public void enterEmployeeID(String empID) {
//		driver.findElement(employeeID).clear();
//		driver.findElement(employeeID).sendKeys(empID);
//	}
//	
//	public void enterDepartment(String dept) {
//		driver.findElement(department).clear();
//		driver.findElement(department).sendKeys(dept);
//	}
//	
//	public void enterCostCenter(String cstCenter) {
//		driver.findElement(costCenter).clear();
//		driver.findElement(costCenter).sendKeys(cstCenter);
//	}
//	
//	public void enterGrade1Level(String grdLevel) {
//		driver.findElement(gradeLevel).clear();
//		driver.findElement(gradeLevel).sendKeys(grdLevel);
//	}
//	
//	public void eneterPONumber(String pONumber) {
//		driver.findElement(poNumber).clear();
//		driver.findElement(poNumber).sendKeys(pONumber);
//	}
//	
//	public void enterBusinessGroup(String businessGrp) {
//		driver.findElement(businessGroup).clear();
//		driver.findElement(businessGroup).sendKeys(businessGrp);
//	}
//	
//	public void enterDivision(String div) {
//		driver.findElement(division).clear();
//		driver.findElement(division).sendKeys(div);
//	}
//	
//	public void enterCompanyNumber(String cmpNumber) {
//		driver.findElement(companyNumber).clear();
//		driver.findElement(companyNumber).sendKeys(cmpNumber);
//	}
//	
//	public void enterRelocationBenefitExpireDate(String date) {
//		driver.findElement(relocationBenifitExpire).sendKeys("15-Nov-2022");
//	}
//	
//	public void clickOnSaveYourProgress() {
//		driver.findElement(saveYourProgress).click();
//	}
//	 public void clickOnUploadDocumnet() {
//		 js.executeScript("arguments[0].click()", driver.findElement(uploadDocument));
//	 }
//	 
//	 public void enterFileUploadPath(String filePath) {
//		 try {
//				Thread.sleep(15000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(fileUploadFrame)));
//		driver.findElement(fileUploadpath).sendKeys(filePath);
//	 }
//	 
//	 public void submitUploadPath() {
//		 
//		 js.executeScript("arguments[0].click()", driver.findElement(submitUploadFileButton));
//		 try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//	 }
//	 
//	 public void clickOnContributors() {
//		driver.switchTo().defaultContent();
//		js.executeScript("arguments[0].click()", driver.findElement(collaboration));
//	 }
//	 
//	 public void clickOnAddContributor() {
//		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(addContributor)));
//		 js.executeScript("arguments[0].click()", driver.findElement(addContributor));
//		 try {
//			Thread.sleep(15000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//	 }
//	 
//	 public void selectTypeOfContribution(String contriType) {
//		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(addContributorFrame)));
//		 
//		 
//		 if(contriType.contains("Contribute to the authorization")) {
//			 js.executeScript("arguments[0].click()", driver.findElement(contributeToTheAuthorization));
//			 
//		 }else {
//			js.executeScript("arguments[0].click()", driver.findElement(reviewTheInitiation));
//		 }
//	 }
//	 
//	 public void selectContributorName(String contName) {
//		 Select sel = new Select(driver.findElement(contributorName));
//		 
//		 js.executeScript("arguments[0].click()", driver.findElement(addContributorButton));
//		 js.executeScript("arguments[0].click()", driver.findElement(contributorName)); 
//		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Test One']")));
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Test One']")));
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 sel.selectByVisibleText("Test One");
//	 }
//	 
//	 public void clickOnAddContributorButton() {
//		 js.executeScript("arguments[0].click()", driver.findElement(addContributorButton));	
//	 }
//	 
//	 public void clickOnSubitInitiation() {
//		 driver.findElement(submitInitiation).click();
//	 }
//	 public void enterContributionComment(String commentcon) {
//		 
//		 driver.findElement(comments).click();
//		 driver.findElement(comments).sendKeys(commentcon);
//	 }
//	 
//	 public void clickOnSubmitToAires() {
//		 driver.switchTo().defaultContent();
//
//		 js.executeScript("arguments[0].click()", driver.findElement(submitToAires));
//	 }
//	 
//	 public void clickOnSubmitButton() {
//		js.executeScript("arguments[0].click()", driver.findElement(submitButton));
//	 }
//	 public boolean initiationSubmitToAIRESMessage() {
//		return driver.getPageSource().contains("is in the submission process. You will receive an email notification when the initiation has been successfully submitted");
//	 }
//	 
//	 
//
//}


