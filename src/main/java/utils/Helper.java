package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.JSExecutorStatements;

public class Helper{
//	WebDriver driver;
//	WebDriverWait wait;
	public static void clickOn(WebElement ele ) {
		ele.click();
	}
	
	public static void setText(WebElement ele, String text) {
		ele.sendKeys(text);
	}
	
	public static void clearText(WebElement ele) {
		ele.clear();
	}
	
	public static String getTextfrom(WebElement ele) {
		return ele.getText();
	}
	
	public static String getPageSource(WebDriver driver) {
		return driver.getPageSource();
	}
	
	public static String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	
	public static void waitUntilFrameToBeAvailableAndSwitchToIt(WebDriver driver,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
	}
	
	public static void jsExecuteScript(JavascriptExecutor js, String jsStatement, WebElement ele) {
		js.executeScript(jsStatement, ele);
	}
	
	public static void jsExecuteSelectScript(JavascriptExecutor js, String jsStatement, WebElement ele, String option) {
		js.executeScript(jsStatement, ele,option);
	}
	
	public static void waitUntilElementToBeClicable(WebDriver driver,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void waitUntilVisibilityOfelement(WebDriver driver,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ele)));
	}
	
	public static void waitHandler(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void waitUntilInvisibilityOfelement(WebDriver driver,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	
	public static void select(WebElement ele,String type, String value) {
		Select sel = new Select(ele); 
		switch(type) {
		case "index":
			sel.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			sel.deselectByValue(value);
			break;
		case "visibleText":
			sel.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please pass the correct selection criterion");
		}
	}
	
	public static void moveToElementUsingActions(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element);
		
	}
	
	
}
