package pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobilityX_ReportsHome_MyReportsPage {
	
	// Activity History heading
		@FindBy(how = How.ID, using = "mxrRgn:0:ot0")
		private WebElement _txtActivityHistory;

		// Activity text highlighted/active
		@FindBy(how = How.ID, using = "mxrRgn:0:rptl1::text")
		private WebElement _txtActivityTabActive;

		// My Reports text
		@FindBy(how = How.ID, using = "mxrRgn:0:rptl2mr::text")
		private WebElement _lnkMyReportsTab;

		// My Reports text highlighted/active
		// span#mxrRgn\:1\:rptl2mr\:\:text.af_link_text
		@FindBy(how = How.ID, using = "mxrRgn:1:rptl2mr::text")
		private WebElement _txtMyReportsTabActive;

		// My Favorites header
		@FindBy(how = How.ID, using = "mxrRgn:1:ot1h1x")
		private WebElement _hdrMyFavorites;

		// Reports Archive header
		@FindBy(how = How.ID, using = "mxrRgn:1:ot1h1f")
		private WebElement _hdrReportsArchive;

		// On Demand header
		@FindBy(how = How.ID, using = "mxrRgn:1:ot1h1xa")
		private WebElement _hdrOnDemand;

		// First Blue heart icon in Reports Archive section
		@FindBy(how = How.ID, using = "mxrRgn:1:docLV:0:otrepts21")
		private WebElement _blueHeartIconReportArchive;

		// First My Favorite text in Reports Archive section
		@FindBy(how = How.ID, using = "mxrRgn:1:docLV:0:otrepts22")
		private WebElement _txtMyFavoriteReportArchive;

		@FindBy(how = How.ID, using = "openUserProfileText")
		private WebElement txt_userNameTitle;

		// Reports/Documents in Reports Archive section.
		@FindBy(how = How.XPATH, using = "//*[@id=\"mxrRgn:1:docLV::db\"]//td[1]//span[@class='RXSmallLink RXBold']")
		private List<WebElement> _lstReportName;

		// Favorite text for heart icon in Reports Archive section.
		@FindBy(how = How.XPATH, using = "//*[@id=\"mxrRgn:1:docLV::db\"]//td[3]//span[contains(text(),'Favorite')]")
		private List<WebElement> _lstFavorite;

		// Reports/Documents in My Favorites section.
		@FindBy(how = How.XPATH, using = "//*[@id=\"mxrRgn:1:faviLV::db\"]//td[1]//span[@class='RXSmallLink RXBold']")
		private List<WebElement> _lstReportNameMyFavSection;

		// Favorite text for heart icon in My Favorite section.
		@FindBy(how = How.XPATH, using = "//*[@id=\"mxrRgn:1:faviLV::db\"]//td[3]//span[contains(text(),'Favorite')]")
		private List<WebElement> _lstFavoriteMyFavSection;

		// Heart icon in Reports Archive section.
		@FindBy(how = How.XPATH, using = "//*[@id=\"mxrRgn:1:docLV::db\"]//td[3]//span[starts-with(@class,'RXIcon icon-love')]")
		private List<WebElement> _lstHeartIcon;

		// Growl message in header
		@FindBy(how = How.XPATH, using = "//*[@id='growls']//div[@class='growl-message']")
		private WebElement _txtGrowlMessage;

		// Activity History Icon
		@FindBy(how = How.ID, using = "mxrRgn:0:otActHistIcn")
		private WebElement _iconActivityHistory;

		// All initiations last 12 months drop down
		@FindBy(how = How.ID, using = "mxrRgn:0:socspend1::content")
		private WebElement _drpDwnAllInitiations;

		@FindBy(how = How.ID, using = "mxrRgn:1:otrepts14")
		private WebElement _uploadReportResultsLink;

		// Favorite report name Upward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:favoritesFileSortingAsc")
		private WebElement btn_FavoriteReportNameUpArrow;

		// Favorite report name Downward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:favoritesDefaultFileSorting")
		private WebElement btn_FavoriteReportNameDownArrow;

		// Favorite Last Updated date Upward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:favoritesDateSortingAsc")
		private WebElement btn_FavoriteLastUpdatedUpArrow;

		// Favorite Last Updated date Downward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:favoritesDefaultDateSorting")
		private WebElement btn_FavoriteLastUpdatedDownArrow;

		// Report archive report name Downward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:uploadDefaultFileSorting")
		private WebElement btn_ReportArchiveReportNameDownArrow;

		// Report archive report name Upward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:uploadFileSortingAsc")
		private WebElement btn_ReportArchiveReportNameUpArrow;

		// Report archive Last Updated date Downward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:uploadDefaultDateSorting")
		private WebElement btn_ReportArchiveLastUpdatedDownArrow;

		// Report archive Last Updated date Upward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:uploadDateSortingAsc")
		private WebElement btn_ReportArchiveLastUpdatedUpArrow;

		// On Demand report name Downward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:webiDefaultFileSorting")
		private WebElement btn_OnDemandReportNameDownArrow;

		// On Demand report name Upward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:webiFileSortingAsc")
		private WebElement btn_OnDemandReportNameUpArrow;

		// On Demand Last Updated date Downward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:webiDefaultDateSorting")
		private WebElement btn_OnDemandLastUpdatedDownArrow;

		// On Demand Last Updated date Upward arrow
		@FindBy(how = How.ID, using = "mxrRgn:1:webiDateSortingAsc")
		private WebElement btn_OnDemandLastUpdatedUpArrow;

		@FindBy(how = How.XPATH, using = "//span[text() = 'Delete']")
		private WebElement deleteLatestReportButton;

		@FindBy(how = How.ID, using = "mxrRgn:1:delDocBtn")
		private WebElement confirmDeleteButton;

		@FindBy(how = How.ID, using = "mxrRgn:1:l2s1")
		private WebElement cancelDeleteButton;

		@FindBy(how = How.ID, using = "mxrRgn:1:searchBar1::content")
		private WebElement _txtboxSearch;

		@FindBy(how = How.ID, using = "dcmhhr1:ot1")
		private WebElement _txtKeyContact;

		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:faviLV::db']//td[2]//div[1]/span[@class='RXSmallTextMuted']")
		private List<WebElement> _listMyFavoritesLastUpdatedDate;

		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:docLV::db']//td[2]//div[1]/span[@class='RXSmallTextMuted']")
		private List<WebElement> _listReportsArchiveLastUpdatedDate;

		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:faviLV::db']//td[1]//span[@class='RXSmallLink RXBold']")
		private List<WebElement> _myFavorites;

		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:webiLV::db']//td[1]//span[@class='RXSmallLink RXBold']")
		private List<WebElement> _reportsList;

		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:docLV::db']//td[1]//span[@class='RXSmallLink RXBold']")
		private List<WebElement> _reportsArchive;

		@FindBy(how = How.XPATH, using = "//span[text()='Performance']")
		private WebElement _performanceTab;

		@FindBy(how = How.XPATH, using = "//span[contains(@id, 'openOptMenuPopup')]//span[text()='Options']")
		private List<WebElement> _optionMenuList;

		@FindBy(how = How.XPATH, using = "//span[text()='Search relevant reports']")
		private WebElement _searchRelevantReportLink;

		@FindBy(how = How.CSS, using = "div[class*='RXReportList'][id*='docLV'] a[id*='dl1stdRp'] span[id*='repts'][class='RXSmallLink RXBold']")
		private List<WebElement> _allArchivedReports;

		@FindBy(how = How.CSS, using = "span[id*='dl1dw::text'] table[id*='pglrepts'] span.RXSmallLink.RXBold")
		private List<WebElement> _downloadList;

		@FindBy(how = How.CSS, using = "span[id*='dl1stdRp::text'] span.RXSmallLink.RXBold")
		private List<WebElement> _documentNamListInReportArchiveSection;

		// Reports/Documents in On-Demand section.
		@FindBy(how = How.XPATH, using = "//*[contains(@id,'webiLV')]//span[contains(@id,'otrepts8')]")
		private List<WebElement> _listOnDemandReport;

		@FindBy(how = How.CSS, using = "table[id*='pglrepts18'] span.RXSmallLink.RXBold")
		private List<WebElement> _listOnDemandReportDownloadLink;

		// Report Parameters
		@FindBy(how = How.CSS, using = "span[id*='otfnpp']")
		private WebElement _popupTextReportParameters;

		// Report Parameters - Start date
		@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'(Start):')]")
		private WebElement _startDateReportParametersPopup;

		// Report Parameters - End date
		@FindBy(how = How.CSS, using = "input[placeholder*='(End):']")
		private WebElement _endDateReportParametersPopup;

		// Report Parameters - DownloadPDFReport
		@FindBy(how = How.CSS, using = "div[id*='downldPdfBtn'] span")
		private WebElement _buttonDownloadPDFReport;

		@FindBy(how = How.XPATH, using = "//span[text()='Run Live Report']")
		private List<WebElement> _listRunLiveReport;

		// Web Intelligence text on Webi Report
		@FindBy(how = How.XPATH, using = "//div[text()='Web Intelligence']")
		private WebElement _textWebIntelligence;

		@FindBy(how = How.CSS, using = "span[id='ariaLabelledBy_promptsDlg']")
		private WebElement _webiPromptsPopup;

		@FindBy(how = How.CSS, using = "div[id*='RightZone_oneTextField_date']>input")
		private WebElement _webiPromptsPopup_textBoxStartDate;

		@FindBy(how = How.CSS, using = "div[id*='RightZone_oneTextField_date']>input")
		private WebElement _webiPromptsPopup_textBoxEndDate;

		@FindBy(how = How.XPATH, using = "//span[text()='* Enter Initiation Date (Start):']")
		private WebElement _webiPromptsPopup_StartDate;

		@FindBy(how = How.XPATH, using = "//span[text()='* Enter Initiation Date (End):']")
		private WebElement _webiPromptsPopup_EndDate;

		@FindBy(how = How.CSS, using = "button[id='RealBtn_OK_BTN_promptsDlg']")
		private WebElement _webiPromptsPopup_buttonOK;

		// Aires logo on Webi report
		@FindBy(how = How.CSS, using = "td[class*='s-9 npd ovh'] span")
		private WebElement _logoAIRES;

		@FindBy(how = How.CLASS_NAME, using = "af_inputDate_launch-icon-style")
		private WebElement _iconCalender;

		@FindBy(how = How.CSS, using = "iframe[id='openDocChildFrame']")
		private WebElement _iframeOpenDocChild;

		@FindBy(how = How.CSS, using = "iframe[id='webiViewFrame']")
		private WebElement _iframeWebiView;

		@FindBy(how = How.CSS, using = "iframe[id*='BGIFramePool_']")
		private WebElement _iframePromptPopup;

		final By _popupTextReportParametersByLoc = By.cssSelector("span[id*='otfnpp']");
		final By _webiPromptsPopupByLoc = By.cssSelector("span[id='ariaLabelledBy_promptsDlg']");
		final By _performanceTabBylocator = By.xpath("//span[text()='Performance']");

}
