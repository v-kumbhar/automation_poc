package pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class MobilityX_ReportsHome_RealEstatePage {
	
	// Real Estate History heading
		@FindBy(how = How.CLASS_NAME, using = "RXHugestTextMuted")
		private WebElement _txtRealEstateHistoryHeading;

		// Real Estate text highlighted/active
		@FindBy(how = How.ID, using = "mxrRgn:1:rptl2re::text")
		private WebElement _txtRealEstateActive;

		// Real Estate text
		@FindBy(how = How.XPATH, using = "//span[text()='Real Estate']")
		private WebElement _lnkRealEstateTab;

		// Edit Filter of Real Estate tab
		@FindBy(how = How.ID, using = "mxrRgn:1:pglsependi66")
		private WebElement _lnkEditFilterRealEstateTab;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Excel']")
		private WebElement _fileTypeExcel;
		
		@FindBy(how = How.XPATH, using = "//span[text()='PDF']")
		private WebElement _fileTypePdf;
		
		// Real Estate Date Ranges Dropdown
		@FindBy(how = How.ID, using = "mxrRgn:1:pgl1spend222")
		private WebElement _lnkRealEstateDateRangesDrpdwn;

		// Real Estate Date Ranges Dropdown Text
		@FindBy(how = How.ID, using = "mxrRgn:1:socspend2::content")
		private WebElement _lnkSRealEstateDateRangesText;

		// Real Estate Closing Date TextBox
		@FindBy(how = How.CSS, using = ".RXInputContainer")
		private List<WebElement> _lnkRealEstateClosingTxtBox;

		// Real Estate Edit Filter Tab
		@FindBy(how = How.CSS, using = ".RXBigLink > span")
		private List<WebElement> _lnkRealEstateEditFilterTab;

		// Real Estate Apply Filter button
		@FindBy(how = How.ID, using = "mxrRgn:1:applyBtn")
		private WebElement _btnApplyFilterRealEstate;

		// Real Estate Clear all Apply Filter button
		@FindBy(how = How.ID, using = "mxrRgn:1:resetEditFilterBtn")
		private WebElement _btnClearApplyFilterRealEstate;

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

		// Real Estate Home Own Stats CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:pglspend1']//div[3]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxRealEstatehomeOwnStats;

		// Real Estate Hire Type CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:pglspend1']//div[6]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxRealEstateHireType;

		// Real Estate Policy CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:pglspend1']//div[9]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxRealEstatePolicy;

		// Real Estate Defin CheckBoxes
		@FindBy(how = How.XPATH, using = "//*[@id='mxrRgn:1:pglspend1']//div[12]//span[@class='checkbox-unchecked']")
		private List<WebElement> _chkbxRealEstateDefin;
		
		@FindBy(how = How.XPATH, using = "//span[contains(@id, 'openOptMenuPopup')]//span[text()='Options']")
		private List<WebElement> _optionMenuList;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Search relevant reports']")
		private WebElement _searchRelevantReportLink;	
		
		@FindBy(how = How.XPATH, using = "//span[text()='Screen Capture']")
		private WebElement _screenCapture;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Do you want to include values in the image?']")
		private WebElement _includeValuesInImageText;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Yes']")
		private WebElement _buttonYes;
		
		@FindBy(how = How.XPATH, using = "//span[text()='Download']")
		private List<WebElement> _downloadLinkList;
		
		@FindBy(how = How.CSS, using = "a[id*=':downloadMXRReportOptionPanel::close']")
		private WebElement _iconClosePopUp;
		
		@FindBy(how = How.CSS, using = "div[id*='mainInfoByte:infoBytePgl'] span[id*='valueTextCurrency']")
		private WebElement _averageHomeSaleValue;
		
		
		
		final By _downloadLinkByLocator = By.xpath("//span[text()='Download']");
		
		private ArrayList<String> downloadedFiles = new ArrayList<String>();
		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<String> sortedlist = new ArrayList<String>();

}
