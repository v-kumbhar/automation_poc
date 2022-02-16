package pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class MobilityX_ReportsHome_PerformancePage {
	
	@FindBy(how = How.XPATH, using = "//span[contains(@id, 'openOptMenuPopup')]//span[text()='Options']")
	private List<WebElement> _optionMenuList;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Search relevant reports']")
	private WebElement _searchRelevantReportLink;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Overall Performance']")
	private WebElement _performanceTitle;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Screen Capture']")
	private WebElement _screenCapture;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Do you want to include values in the image?']")
	private WebElement _includeValuesInImageText;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Yes']")
	private WebElement _buttonYes;

}
