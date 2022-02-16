package pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobilityX_ReportsHome_ActivityPage extends BasePage {
	
	public MobilityX_ReportsHome_ActivityPage(WebDriver driver) {
		super(driver);
	}
	
	
	// Edit Filter of Activity tab
		@FindBy(how = How.XPATH, using = "//span[@class='MXRFontColor RXBold' and text()='Edit Filters']")
		private WebElement _lnkEditFilterActivityTab;

		// Activity Edit Filter Date TextBox
		@FindBy(how = How.CSS, using = ".RXInputContainer")
		private List<WebElement> _lnkActivityEditFilterDateTxtBox;

		// Activity Edit Filter Tab
		@FindBy(how = How.CSS, using = ".RXBigLink > span")
		private List<WebElement> _lnkActivityEditFilterTab;

		// Apply Filter button
		@FindBy(how = How.ID, using = "mxrRgn:0:applyBtn")
		private WebElement _btnApplyFilter;

		// Clear all Apply Filter button
		@FindBy(how = How.ID, using = "mxrRgn:0:resetEditFilterBtn")
		private WebElement _btnClearApplyFilter;

		// Home Own Stats CheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:0\\:PEOPLEDimPGL > div:nth-child(1)")
		private WebElement _chkbxhomeOwnStatsHighlight;

		// Hire Type CheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:0\\:PEOPLEDimPGL > div:nth-child(4)")
		private WebElement _chkbxHireTypeHighlight;

		// Policy CheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:0\\:PEOPLEDimPGL > div:nth-child(7)")
		private WebElement _chkbxPolicyHighlight;

		// Defin CheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:0\\:PEOPLEDimPGL > div:nth-child(10)")
		private WebElement _chkbxDefinHighlight;

		// Paytroll FeedCheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:0\\:PEOPLEDimPGL > div:nth-child(13)")
		private WebElement _chkbxPaytrollFeedHighlight;

		// Home Own Stats CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:0:PEOPLEDimPGL']//div[3]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxhomeOwnStats;

		// Hire Type CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:0:PEOPLEDimPGL']//div[6]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxHireType;

		// Policy CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:0:PEOPLEDimPGL']//div[9]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxPolicy;

		// Defin CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:0:PEOPLEDimPGL']//div[12]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxDefin;

		// Paytroll Feed CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:0:PEOPLEDimPGL']//div[15]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxPaytrollFeed;

		// Activity Edit Filter Date DropDown
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:0:pglspend21']//select[@class='af_selectOneChoice_content']")
		private List<WebElement> _lnkActivityEditFilterDateDrpdwn;

		// Origin link on Mobility Journey Overview
		@FindBy(how = How.XPATH, using = "//span[contains(@id,'origLinkId::text')]")
		private WebElement _linkOrigin;

		// USA country on map in Mobility Journey Overview
		// @FindBy(how = How.XPATH, using = "//*[contains(@aria-label,'United
		// States:')]")
		// @FindBy(how = How.XPATH, using = "//*[@cursor='pointer' and @role='img']")
		@FindBy(how = How.XPATH, using = "//*[@vector-effect='non-scaling-stroke' and @stroke='#FFFFFF']")
		private WebElement _countryOnMap;

		@FindBy(how = How.XPATH, using = "//*[contains(@aria-label,'United States:')]")
		private WebElement _countryUSA;

		// Mobility journeys originating popup header
		@FindBy(how = How.XPATH, using = "//span[contains(@id,'otmjov44')]")
		private WebElement _textMobilityJourneysOriginating;

		// Employees name on Mobility journeys originating PopUp
		@FindBy(how = How.XPATH, using = "//span[contains(@id,'otmjov18')]")
		private WebElement _linkEmployee;

		// Employee name on MobilityJourneyHome page
		@FindBy(how = How.XPATH, using = "//span[contains(@id,'ottrs4')]")
		private WebElement _textEmployeeName;

		// link Back to Reporting on MobilityJourneyHome page
		@FindBy(how = How.XPATH, using = "//span[text()='Back to Reporting']")
		private WebElement _linkBackToReporting;

		@FindBy(how = How.XPATH, using = "//span[contains(@id, 'openOptMenuPopup')]//span[text()='Options']")
		private List<WebElement> _optionMenuList;

		@FindBy(how = How.XPATH, using = "//span[text()='Search relevant reports']")
		private WebElement _searchRelevantReportLink;

		@FindBy(how = How.XPATH, using = "//span[text()='Download']")
		private WebElement _downloadLink;

		@FindBy(how = How.XPATH, using = "//span[text()='Download']")
		private List<WebElement> _downloadLinkList;

		@FindBy(how = How.XPATH, using = "//span[text()='Excel']")
		private WebElement _excelLink;

		@FindBy(how = How.XPATH, using = "//span[text()='PDF']")
		private WebElement _pdfLink;

		@FindBy(how = How.XPATH, using = "//span[text()='Spending']")
		private WebElement _lnkSpendingTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Activity']")
		private WebElement _lnkActivityTab;

		@FindBy(how = How.CSS, using = "select[id*='socspend2']")
		private WebElement _drpDwnDateRange;

		@FindBy(how = How.XPATH, using = "//input[contains(@id,'idsepnd1::content')]")
		private WebElement _startDateTextField;

		@FindBy(how = How.XPATH, using = "//input[contains(@id,'idspend2::content')]")
		private WebElement _endDateTextField;

		@FindBy(how = How.CSS, using = "input[id*='filterName::content']")
		private WebElement _inputFilterName;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'applyBtn')]//span[contains(.,'Apply filters')]")
		private WebElement _btnApplyFilters;

		@FindBy(how = How.CSS, using = "span[id*='otsepndi']")
		private WebElement _lnkSaveThisView;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'saveViewBtn')]//span[contains(.,'Save')]")
		private WebElement _btnSave;

		@FindBy(how = How.XPATH, using = "//table[2]//div[contains(.,'Please enter a unique filter name!')]")
		private WebElement _txtErrUniqueFilterName;

		@FindBy(how = How.XPATH, using = "//a[contains(@id,'filterNamePW::close')]")
		private WebElement _addFilterCloseIcon;

		@FindBy(how = How.CSS, using = "select[id*='socspend1']")
		private WebElement _drpDwnSpending;

		@FindBy(how = How.CSS, using = "span[id*='otsepndi18']")
		private WebElement _txtDelete;

		@FindBy(how = How.CSS, using = "div[id*='deleteFilterBtn']")
		private WebElement _btnDelete;

		@FindBy(how = How.CLASS_NAME, using = "growl-message")
		private WebElement _txtGrowlMessage;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'PEOPLEDimPGL')]//span[@class ='MXRLabelText']")
		private List<WebElement> _checkboxListForPeopleTab;

		@FindBy(how = How.XPATH, using = "//span[text()='People']")
		private WebElement _peopleTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Location']")
		private WebElement _locationTab;

		@FindBy(how = How.XPATH, using = "//span[text()='File']")
		private WebElement _fileTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Business Structure']")
		private WebElement _businessStructureTab;

		@FindBy(how = How.XPATH, using = "//label[text()='Policy']//ancestor::div[contains(@id,'PEOPLEDimPGL')]//div[contains(@id,'mxrRgn:0:dvlPgl')]//a[contains(@id,'mxrRgn:0:fgl')]//span[contains(text(),'Show ')]")
		private WebElement _linkPolicyShowAll;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:0:vl1Pgl')]/div[4]//span[contains(@id,'mxrRgn:0:labl')]")
		private List<WebElement> _listOfAllPolicies;

		@FindBy(how = How.XPATH, using = "//span[text()='Show all (10)']")
		private WebElement _linkAssignmentTypeShowAll;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:0:FILEDimPGL')]/div[3]//span[contains(@id,'mxrRgn:0:labl')]")
		private List<WebElement> _listOfAllAssignmentType;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:0:FILEDimPGL')]/div[9]//span[contains(@id,'mxrRgn:0:labl')]")
		private List<WebElement> _listOfAllAuthStatus;

		@FindBy(how = How.ID, using = "mxrRgn:0:otspend8")
		private WebElement _InitiationStartAndEndDate;

		@FindBy(how = How.CSS, using = "div[id*='InfoByte:infoBytePgl'] span.icon-download")
		private WebElement _iconQuickDownload;

		@FindBy(how = How.XPATH, using = "//span[text()='New and Active Mobility Journey Details']")
		private WebElement _mobilityJourneyDetailsTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Screen Capture']")
		private WebElement _screenCapture;

		@FindBy(how = How.XPATH, using = "//span[text()='Do you want to include values in the image?']")
		private WebElement _includeValuesInImageText;

		@FindBy(how = How.XPATH, using = "//span[text()='Yes']")
		private WebElement _buttonYes;

		@FindBy(how = How.CSS, using = "a[id*=':downloadMXRReportOptionPanel::close']")
		private WebElement _iconClosePopUp;

		@FindBy(how = How.XPATH, using = "//span[text()='Activity Details']")
		private WebElement _sectionActivityDetails;

		@FindBy(how = How.XPATH, using = "//span[text()='Mobility Journey Details']")
		private WebElement _sectionMobilityJourneyDetails;

		@FindBy(how = How.CSS, using = "span[id*='nmjoa1']")
		private WebElement _txtOriginCountryCount;

		@FindBy(how = How.CSS, using = "span[id*='destLinkId']")
		private WebElement _lnkDestination;

		@FindBy(how = How.CSS, using = "span[id*='nmjoa1d']")
		private WebElement _txtDestinationCountryCount;

		// Activity page - visual and functional review of sections/ sub-tabs
	// Activity history

		@FindBy(how = How.XPATH, using = "//span[text()='Activity History']")
		public WebElement _activityHistoryVerify;

		@FindBy(how = How.XPATH, using = "//span[text()='New Initiation Trends']")
		public WebElement _ahNewInitiationTrendsVerify;

		@FindBy(how = How.XPATH, using = "//span[text()='Total New Initiations:']")
		public WebElement _ahTotalNewInitiationVerify;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'lineChartInfoByte:value')]") // also for
		private WebElement _ahTotaloNewInitiationValueVerify; // _ahTotalActiveMobilityJourneyValue

		@FindBy(how = How.XPATH, using = "//span[text()='Active Mobility Journey Trends']")
		private WebElement _ahActiveMobilityJourneyTrendsClick;

		@FindBy(how = How.XPATH, using = "//span[text()='Total Active Mobility Journeys:']")
		private WebElement _ahTotalActiveMobilityJourneyVerify;

		@FindBy(how = How.XPATH, using = "//span[text()='New and Active Mobility Journey Details']")
		private WebElement _ahNewAndActiveMobilityClick;
	//_ahTotalNewInitiationVerify   &&  _ahTotalActiveMobilityJourneyVerify

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:0:ibnamjd1:valueTextNonCurrency')]") // locator change
		private WebElement _ahNewAndActiveTotalNewInitiationVerify;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:0:ibnamjd2:valueTextNonCurrency')]") // locator
																											// changes
																											// 12/14/2021
		private WebElement _ahNewAndActiveTotalActiveMoblityJourneyVerify;

		// Activity details

		@FindBy(how = How.XPATH, using = "//span[text()='Activity Details']")
		private WebElement _activityDetailsVerify;

		@FindBy(how = How.XPATH, using = "//span[text()='Initiations by Policy']")
		private WebElement _adInitiationsByPolicyVerify;

		@FindBy(how = How.XPATH, using = "//span[text()='Top 5 Policy New Initiations:']")
		private WebElement _adTopPolicyNewInitiationVerify;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:0:actbc1:barChartInfoByte:valueTextNonCurrency')]") // locator
		private WebElement _adTopPolicyNewInitiationValue; // changes
		// 12/14/2021
		@FindBy(how = How.XPATH, using = "//span[text()='Activity by Policy']")
		private WebElement _adActivityByPolicyClck;

		@FindBy(how = How.XPATH, using = "//span[text()='Top 5 Policies Active Mobility Journeys:']")
		private WebElement _adActivityByPolicyVerify;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:0:actbc2:barChartInfoByte:valueTextNonCurrency')]") // locator
																															// changes
																															// 12/14/2021
		private WebElement _adActivityByPolicyValue;

		// Mobility Journey Details

		@FindBy(how = How.XPATH, using = "//span[text()='Mobility Journey Details']")
		private WebElement _mobiityJourneyDetailsVerify;

		@FindBy(how = How.XPATH, using = "//span[text()='Mobility Journey Overview']")
		private WebElement _mobiityJourneyOverviewVerify;

		@FindBy(how = How.XPATH, using = "//span[text()='The Number of Origin States:']")
		private WebElement _mjdNumOfOriginStatesVerify;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:0:mjota1')]") // locator changes 12/14/2021
		private WebElement _mjdNumOfOriginStatesValue;

		@FindBy(how = How.XPATH, using = "//span[text()='The Number of Origin Countries:']")
		private WebElement _mjdNumOfOriginCountryVerify;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:0:nmjoa1')]") // locator changes 12/14/2021
		private WebElement _mjdNumOfOriginCountryValue;

		@FindBy(how = How.XPATH, using = "//span[text()='Mobility Journey Lanes']")
		private WebElement _mjdMobilityJourneyLanesClick;

		@FindBy(how = How.XPATH, using = "//span[text()='Top 10 Lanes']")
		private WebElement _mjdMobilityJourneyLanesTopLanesVerify;

		final By _textEmployeeNameByLocator = By.xpath("//span[contains(@id,'ottrs4')]");
		final By _growlMessageByLocator = By.className("growl-message");
		final By _closeGrowlMessageByLocator = By.className("growl-close");
		final By _lnkSpendingTabByLocator = By.xpath("//span[text()='Spending']");
		final By _lnkActivityTabByLocator = By.xpath("//span[text()='Activity']");
		final By _downloadLinkByLocator = By.xpath("//span[text()='Download']");
		public static String expenseStartDate;
		public static String expenseEndDate;
		public String policyName;
		public FileInputStream fis = null;
//		private HSSFWorkbook workbook = null;
//		private HSSFSheet sheet = null;
		String path = null;
		private ArrayList<String> downloadedFiles = new ArrayList<String>();
		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<String> sortedlist = new ArrayList<String>();
		
		
		
	

}
