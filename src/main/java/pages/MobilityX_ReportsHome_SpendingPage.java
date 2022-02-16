package pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class MobilityX_ReportsHome_SpendingPage {
	// Spending text
		@FindBy(how = How.XPATH, using = "//span[text()='Spending']")
		private WebElement _lnkSpendingTab;

		// Spending text highlighted/active
		@FindBy(how = How.CSS, using = "a.RXLinkTab.active.af_link")
		private WebElement _txtSpendingTabActive;

		// Spending History heading
		@FindBy(how = How.XPATH, using = "//span[text()='Spending History']")
		private WebElement _txtSpendingHistoryHeading;

		// Edit Filter of Spending tab
		@FindBy(how = How.ID, using = "mxrRgn:1:otspend69")
		private WebElement _lnkEditFilterSpendingTab;

		// Spending Date Ranges Dropdown
		@FindBy(how = How.ID, using = "mxrRgn:1:pgl1spend222")
		private WebElement _lnkSpendingDateRangesDateDrpdwn;

		// Spending Date Ranges Dropdown Text
		@FindBy(how = How.ID, using = "mxrRgn:1:socspend2::content")
		private WebElement _lnkSpendingDateRangesDateDrpdwnText;

		// Spending Expense Date TextBox
		@FindBy(how = How.CSS, using = ".RXInputContainer")
		private List<WebElement> _lnkSpendingExpenseDateTxtBox;

		// Spending Expense Date TextBox text
		@FindBy(how = How.CLASS_NAME, using = "RXInputLabel af_outputLabel")
		private WebElement _lnkTextSpendingExpenseDateTxtBox;

		// Spending Edit Filter Tab
		@FindBy(how = How.CSS, using = ".RXBigLink > span")
		private List<WebElement> _lnkSpendingEditFilterTab;

		// Spending Apply Filter button
		@FindBy(how = How.ID, using = "mxrRgn:1:applyBtn")
		private WebElement _btnApplyFilterSpending;

		// Spending Clear all Apply Filter button
		@FindBy(how = How.ID, using = "mxrRgn:1:resetEditFilterBtn")
		private WebElement _btnClearApplyFilterSpending;

		// Home Own Stats CheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:1\\:PEOPLEDimPGL > div:nth-child(1)")
		private WebElement _chkbxhomeOwnStatsHighlight;

		// Hire Type CheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:1\\:PEOPLEDimPGL > div:nth-child(4)")
		private WebElement _chkbxHireTypeHighlight;

		// Policy CheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:1\\:PEOPLEDimPGL > div:nth-child(7)")
		private WebElement _chkbxPolicyHighlight;

		// Defin CheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:1\\:PEOPLEDimPGL > div:nth-child(10)")
		private WebElement _chkbxDefinHighlight;

		// Paytroll FeedCheckBoxes Highlight
		@FindBy(how = How.CSS, using = "#mxrRgn\\:1\\:PEOPLEDimPGL > div:nth-child(13)")
		private WebElement _chkbxPaytrollFeedHighlight;

		// Spending Home Own Stats CheckBoxes
		@FindBy(how = How.XPATH, using = "//div[contains(@id,'PEOPLEDimPGL')]//span[@class ='MXRLabelText' and contains(.,'Home owners')]")
		private List<WebElement> _chkbxSpendinghomeOwnStats;

		// Spending Hire Type CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:PEOPLEDimPGL']//div[6]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxSpendingHireType;

		// Spending Policy CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:PEOPLEDimPGL']//div[9]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxSpendingPolicy;

		// Spending Defin CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:PEOPLEDimPGL']//div[12]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxSpendingDefin;

		// Spending Paytroll Feed CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:PEOPLEDimPGL']//div[15]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxSpendingPaytrollFeed;

		// Spend by Category
		@FindBy(how = How.XPATH, using = "//span[text()='Spend by Category']")
		private WebElement _linkSpendByCategory;

		// bar chart
		@FindBy(how = How.XPATH, using = "//*[@cursor='pointer']")
		private WebElement _barChart;

		// Total spend Category popUp
		@FindBy(how = How.XPATH, using = "//*[contains(@id,'ownpp1Cat12')]")
		private WebElement _textTotalSpendCategory;

		// Employees name on Total spend Category popUp
		@FindBy(how = How.XPATH, using = "//*[contains(@id,'oo1312')]")
		private WebElement _linkEmployee;

		@FindBy(how = How.CSS, using = "select[id*='socspend2']")
		private WebElement _drpDwnDateRange;

		@FindBy(how = How.CSS, using = "select[id*='socspend1']")
		private WebElement _drpDwnSpending;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'applyBtn')]//span[contains(.,'Apply filters')]")
		private WebElement _btnApplyFilters;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'spendHistoryPGL')]//span[contains(@id,'valueTextCurrency')]")
		private WebElement _txtCurrencySpendingTrends;

		@FindBy(how = How.CSS, using = "span[id*='otsepndi']")
		private WebElement _lnkSaveThisView;

		@FindBy(how = How.CSS, using = "input[id*='filterName::content']")
		private WebElement _inputFilterName;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'saveViewBtn')]//span[contains(.,'Save')]")
		private WebElement _btnSave;

		@FindBy(how = How.XPATH, using = "//table[2]//div[contains(.,'Please enter a unique filter name!')]")
		private WebElement _txtErrUniqueFilterName;

		@FindBy(how = How.XPATH, using = "//div[@id='growls']/div")
		private WebElement _txtGrowlMessage;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'editFilter::text')]//span[contains(.,'Edit Filters')]")
		private WebElement _lnkEditFilter;

		// Radio Button Label List
		@FindBy(how = How.XPATH, using = "//div[contains(@id,'PEOPLEDimPGL')]//span[@class ='MXRLabelText']")
		private List<WebElement> _checkboxListForPeopleTab;

		@FindBy(how = How.CSS, using = "span[id*='otsepndi18']")
		private WebElement _txtDelete;

		@FindBy(how = How.CSS, using = "div[id*='deleteFilterBtn']")
		private WebElement _btnDelete;

		@FindBy(how = How.CSS, using = "#mxrRgn\\:1\\:cancelFilterPopupBtn\\:\\:text")
		private WebElement _addFilterCloseIcon;

		@FindBy(how = How.XPATH, using = "//span[contains(@id, 'openOptMenuPopup')]//span[text()='Options']")
		private List<WebElement> _optionMenuList;

		@FindBy(how = How.XPATH, using = "//span[text()='Search relevant reports']")
		private WebElement _searchRelevantReportLink;

		@FindBy(how = How.XPATH, using = "//input[contains(@id,'idsepnd1::content')]")
		private WebElement _startDateTextField;

		@FindBy(how = How.XPATH, using = "//input[contains(@id,'idspend2::content')]")
		private WebElement _endDateTextField;

		@FindBy(how = How.XPATH, using = "//div[@style='max-height: 560px; min-height: auto;']")
		private WebElement _floatingFilterWindow;

		@FindBy(how = How.CSS, using = ".RXBigTextMuted")
		private WebElement _floatingFilterName;

		@FindBy(how = How.CSS, using = ".RXSmallerTextMuted")
		private WebElement _floatingFilterExpenseDate;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'floatingEditBtn')]//span[text()='Edit Filters']")
		private WebElement _floatingFilterEditBtn;

		@FindBy(how = How.XPATH, using = "//span[text()='People']")
		private WebElement _peopleTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Location']")
		private WebElement _locationTab;

		@FindBy(how = How.XPATH, using = "//span[text()='File']")
		private WebElement _fileTab;

		@FindBy(how = How.XPATH, using = "//span[text()='Business Structure']")
		private WebElement _businessStructureTab;

		@FindBy(how = How.XPATH, using = "//label[text()='Home Oner Status']")
		private WebElement _lblHomeOwnerStatus;

		@FindBy(how = How.XPATH, using = "//label[text()='Hire Type']")
		private WebElement _lblHireType;

		@FindBy(how = How.XPATH, using = "//label[text()='Policy']")
		private WebElement _lblPolicy;

		@FindBy(how = How.XPATH, using = "//label[text()='Defin']")
		private WebElement _lblDefin;

		@FindBy(how = How.XPATH, using = "//label[text()='Paytroll Feed']")
		private WebElement _lblPaytrollFeed;

		@FindBy(how = How.CSS, using = ".MXRLabelText >label")
		private WebElement _floatingFilterValues;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'PEOPLEDimPGL')]/div[3]//span[@class='MXRLabelText']")
		private List<WebElement> _chkBoxesHomeOwnerStatus;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'PEOPLEDimPGL')]/div[6]//span[@class='MXRLabelText']")
		private List<WebElement> _chkBoxesHireType;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'PEOPLEDimPGL')]/div[9]//span[@class='MXRLabelText']")
		private List<WebElement> _chkBoxesPolicy;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'PEOPLEDimPGL')]/div[12]//span[@class='MXRLabelText']")
		private List<WebElement> _chkBoxesDefin;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'PEOPLEDimPGL')]/div[15]//span[@class='MXRLabelText']")
		private List<WebElement> _chkBoxesPaytrollFeed;

		@FindBy(how = How.CSS, using = "div[id*='mainInfoByte:infoBytePgl'] span.icon-download")
		private WebElement _iconQuickDownload;

		@FindBy(how = How.XPATH, using = "//span[text()='Spending Trends']")
		private WebElement _subTabSpendingTrends;

		@FindBy(how = How.XPATH, using = "//span[text()='Spend by Timeframe']")
		private WebElement _subTabSpendByTimeFrame;

		@FindBy(how = How.XPATH, using = "//span[text()='Spend by Category']")
		private WebElement _subTabSpendByCategory;

		@FindBy(how = How.CSS, using = "span[id*='pgl5'] > span[id*='ot4']")
		private List<WebElement> _qtrsYearCol;

		@FindBy(how = How.CSS, using = "span[id*='surround3op'] > table[id*='pgl3'] > tbody > tr")
		private List<WebElement> _spendingDetailsRow;

		@FindBy(how = How.CSS, using = "table[id*='pgl3'] > tbody > tr:nth-child(1) >td:nth-child(4)")
		private List<WebElement> _employeesCount;

		@FindBy(how = How.CSS, using = "div[id*='spendHistoryDetailPopup::content'] table.af_panelWindow_main")
		private WebElement _spendTimeFramePopUp;

		@FindBy(how = How.CSS, using = "div[id*='spendHistoryDetailPopup::content'] span.RXBiggerTextMuted.RXThin")
		private WebElement _dateRangeInPopUp;

		@FindBy(how = How.CSS, using = "span.RXLink.RXThin")
		private List<WebElement> _emplListInPopUp;

		@FindBy(how = How.CSS, using = "span[id*='top10EmployeesPGl'] .RXTextMuted.RXThin")
		private List<WebElement> _emplHeadingInPopUp;

		@FindBy(how = How.CSS, using = "div[id$='locQuickDimValuePd'] span.MXRLabelText")
		private List<WebElement> _chkBoxQuickPathLocationTab;

		// bar chart
		@FindBy(how = How.CSS, using = "span[id*=spendingDetailsPGL] [cursor='pointer']")
		private List<WebElement> _spendingDetailsBarChart;

		@FindBy(how = How.CSS, using = "span[id*='spendExceptionPGL'] [cursor='pointer']")
		private List<WebElement> _spendingExceptionBarChart;

		@FindBy(how = How.XPATH, using = "//span[text()='Spend by Policy']")
		private WebElement _subTabSpendByPolicy;

		@FindBy(how = How.XPATH, using = "//span[text()='Exception Spend by Category']")
		private WebElement _subTabExceptionSpendByCategory;

		@FindBy(how = How.XPATH, using = "//span[text()='Exception Spend by Policy']")
		private WebElement _subTabExceptionSpendByPolicy;

		@FindBy(how = How.XPATH, using = "//span[text()='Historical Exceptions']")
		private WebElement _subTabHistoricalException;

		// Spending Details heading
		@FindBy(how = How.XPATH, using = "//span[text()='Spending Details']")
		private WebElement _txtSpendingDetails;

		// Exception Spend heading
		@FindBy(how = How.XPATH, using = "//span[text()='Exception Spend']")
		private WebElement _txtExceptionSpend;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:1:PEOPLEDimPGL')]/div[3]//span[contains(@id,'mxrRgn:1:labl')]")
		private List<WebElement> _listHomeOwnStatesDimentions;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:1:PEOPLEDimPGL')]/div[6]//span[contains(@id,'mxrRgn:1:labl')]")
		private List<WebElement> _listHireTypeDimentions;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:1:PEOPLEDimPGL')]/div[9]//span[contains(@id,'mxrRgn:1:labl')]")
		private List<WebElement> _listPolicyDimentions;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:1:PEOPLEDimPGL')]/div[12]//span[contains(@id,'mxrRgn:1:labl')]")
		private List<WebElement> _listDefinDimentions;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:1:PEOPLEDimPGL')]/div[15]//span[contains(@id,'mxrRgn:1:labl')]")
		private List<WebElement> _listPaytrollFeedDimentions;

		// Exception Spend heading
		@FindBy(how = How.CSS, using = "div[id*='pgl0Cat123'] span.RXBiggerTextMuted.RXThin")
		private WebElement _dateRangeInSpendingDetailsDrillPopup;

		@FindBy(how = How.CSS, using = "span.RXTextMuted.RXThin")
		private List<WebElement> _emplHeadingPopup;

		@FindBy(how = How.CSS, using = ".MXRLink")
		private List<WebElement> _locationHeadingDimentions;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'fglb')]//label")
		private List<WebElement> _filterDimentionsHeading;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:1:fglb')]//label")
		private List<WebElement> _locationSubHeadingDimentions;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:1:fglb')]//label[text()='States']")
		private WebElement _locationSubHeadingStatesAnotherClient;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:1:fglb')]//label[text()='Countries']")
		private WebElement _locationSubHeadingCountryAnotherClient;

		@FindBy(how = How.CSS, using = ".MRXBigFontSize")
		private List<WebElement> _locationQuickPath;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:1:domOrgPgl')]//span[contains(@id,'mxrRgn:1:labl')]")
		private List<WebElement> _listStatesDimentions;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:1:cntryOrgPgl')]//span[contains(@id,'mxrRgn:1:labl')]")
		private List<WebElement> _listCountriesDimentions;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:1:domOrgPgl')]//span[contains(text(),'Show all ')]")
		private WebElement _linkShowAllStates;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'mxrRgn:1:cntryOrgPgl')]//span[contains(text(),'Show all ')]")
		private WebElement _linkShowAllCountries;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:1:PEOPLEDimPGL')]/div[9]//span[contains(text(),'Show all ')]")
		private WebElement _linkShowAllPolicy;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'mxrRgn:1:PEOPLEDimPGL')]/div[15]//span[contains(text(),'Show all ')]")
		private WebElement _linkShowAllPayTrollFeed;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'BUSISTRDimPGL')]/div[3]//span[contains(text(),'Show all ')]")
		private WebElement _linkShowAllBusinessUnit;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'BUSISTRDimPGL')]/div[6]//span[contains(text(),'Show all ')]")
		private WebElement _linkShowAllCostCenter;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'BUSISTRDimPGL')]/div[12]//span[contains(text(),'Show all ')]")
		private WebElement _linkShowAllAuthorizationStage;

		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Options')]")
		private WebElement _menuOptions;

		@FindBy(how = How.XPATH, using = "//span[text()='Add Filter Dimension']")
		private WebElement _linkAddFilterDimention;

		@FindBy(how = How.XPATH, using = "//span[text()='Remove Filter Dimension']")
		private WebElement _linkRemoveFilterDimention;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'afrDropDownContent::db')]//tr[not(@selected)][not(@title='Select One')]")
		private List<WebElement> _listAddFilterVariableName;

		@FindBy(how = How.CSS, using = ".af_inputComboboxListOfValues_dropdown-icon-style")
		private WebElement _addFilterVariableName;

		@FindBy(how = How.XPATH, using = "//select[contains(@id,'groupDropdown::content')]")
		private WebElement _listAddFilterGroupName;

		@FindBy(how = How.XPATH, using = "//input[contains(@id,'addRenameDim::content')]")
		private WebElement _txtAddFilterEnterNewName;

		@FindBy(how = How.XPATH, using = "//span[text()='Save']")
		private WebElement _btnAddFilterSaveBtn;

		@FindBy(how = How.XPATH, using = "//span[text()='Yes']")
		private WebElement _btnAddFilterYesBtn;

		@FindBy(how = How.XPATH, using = "//input[@aria-owns='mxrRgn:1:iclov3::_afrautosuggestpopup']")
		private WebElement _txtRemoveFilterDimentionName;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'BUSISTRDimPGL')]/div[3]//span[@class='MXRLabelText']")
		private List<WebElement> _listBusinessUnitDimentions;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'BUSISTRDimPGL')]/div[6]//span[@class='MXRLabelText']")
		private List<WebElement> _listCostCenterDimentions;

		@FindBy(how = How.XPATH, using = "//div[contains(@id,'BUSISTRDimPGL')]/div[12]//span[@class='MXRLabelText']")
		private List<WebElement> _listAuthorizationStageDimentions;

		@FindBy(how = How.CSS, using = ".AFAutoSuggestItemsContainer")
		private WebElement _selectRemoveFilterDimentionName;

		@FindBy(how = How.XPATH, using = "//span[text()='Confirm']")
		private WebElement _btnConfirmRemoveFilterDimention;

		@FindBy(how = How.XPATH, using = "//span[contains(@id,'bb:openOptMenuPopup::text')]//span[contains(text(),'Options')]")
		private WebElement _filterDimentionMenuOptions;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Screen Capture']")
		private WebElement _screenCapture;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Do you want to include values in the image?']")
		private WebElement _includeValuesInImageText;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Yes']")
		private WebElement _buttonYes;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Download']")
		private List<WebElement> _downloadLinkList;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Excel']")
		private WebElement _excelLink;

		@FindBy(how = How.XPATH, using = "//span[text()='PDF']")
		private WebElement _pdfLink;
		
		@FindBy(how = How.CSS, using = "a[id*=':downloadMXRReportOptionPanel::close']")
		private WebElement _iconClosePopUp;
		
		@FindBy(how = How.CSS, using = "circle[fill='#ffffff']")
		private List<WebElement> _iconCircleSpendingHistory;
		
		@FindBy(how = How.CSS, using = "span[id*='spendHistoryPGL'] input[id*='grossupCheckbox::content']")
		private WebElement _chkTaxGrossUpSpendingHistory;
		
		@FindBy(how = How.CSS, using = "span[id*='spendHistoryPGL'] label.p_OraHiddenLabel[id*=':sbc15::Label']")
		private WebElement _lblDataLabelSpendingHistory;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Change Variable Name']")
		private WebElement _changeVariableName;
		
		@FindBy(how = How.XPATH, using = "//input[@id='mxrRgn:1:iclov2::content']")
		private WebElement _oldVariableName;
		
		@FindBy(how = How.XPATH, using = "//input[@id='mxrRgn:1:renameDim::content']")
		private WebElement _newVariableName;

		@FindBy(how = How.XPATH, using = "//div[@id='mxrRgn:1:brdp1']/a")
		private WebElement _saveButtonNewVariableName;
		
		@FindBy(how = How.XPATH, using = "//div[@id='mxrRgn:1:brdcp1']/a")
		private WebElement _confirmButtonChangeVariableDialogue;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Back To Dashboard']")
		private WebElement _backToDashboard;
		
		@FindBy(how = How.XPATH, using = "(//div[@class='af_panelWindow_close-icon-region'])[2]")
		private WebElement _cancelPopOut;
		
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Spending Trends')]")
		private WebElement _tabSpendingTrends;


}
