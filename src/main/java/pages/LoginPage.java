package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.Helper;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);		
	}
	
	@FindBy(id = "username::content") private WebElement userName;
	@FindBy(id = "nextButton") private WebElement nextButton;
	@FindBy(xpath = "//span[text()='Sign in']") private WebElement signIn;
	@FindBy(id = "password::content") private WebElement password;
	@FindBy(id = "loginButton") private WebElement loginButton;
	
	 Helper ele;
	 
	public void setUserName(String username) {
		Helper.setText(userName, username);
	}
	
	public void clickOnNext() {
		Helper.waitUntilVisibilityOfelement(driver, nextButton);
		Helper.clickOn(nextButton);
		//wait.until(ExpectedConditions.visibilityOf(nextButton)).click();
	}
	
	public String getSignInText() {
		return Helper.getTextfrom(signIn);
	}
	
	public String getPageTitle() {
		return Helper.getPageTitle(driver);
	}
	
	public String getPageSource() {
		return Helper.getPageSource(driver);
	}
	
	public void setPassword(String pswd) {
		Helper.waitUntilVisibilityOfelement(driver, password);
		Helper.setText(password, pswd);
		//wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pswd);
		
	}
	
	public void clickOnLogin() {
		Helper.clickOn(loginButton);
	}
	
	
}
