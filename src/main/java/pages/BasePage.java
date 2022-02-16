package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverfactory.DriverFactory;
import utils.ConfigFileLoader;



public class BasePage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected WebDriverWait fwait;
	protected JavascriptExecutor js;
	
	public BasePage(WebDriver driver) {
		
		if(driver==null) {
			driver = DriverFactory.getDriver();
			this.driver = driver;
			js = (JavascriptExecutor) driver;
			wait= new WebDriverWait(driver, 120,1);
			PageFactory.initElements(driver, this);
		}else {
			this.driver = driver;
			wait= new WebDriverWait(driver, 120,1);
			js = (JavascriptExecutor) driver;
			PageFactory.initElements(driver, this);
		}
		
	}
	
	public void load(String url) {
		driver.get(ConfigFileLoader.getInstance().getproperty("baseUrl")+url);
	}
	

}
