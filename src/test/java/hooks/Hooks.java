package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigFileLoader;

public class Hooks {
	private WebDriver driver;

	@Before
	public void before() {
		
		driver = DriverFactory.initializeDriver(ConfigFileLoader.getInstance().getproperty("browser"));
		//driver = DriverFactory.getDriver();

	}

	@After
	public void after0() {
		driver.quit();
	}

	@AfterStep
	public void after1(Scenario scenario) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		if (scenario.isFailed()) {
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName().replaceAll(" ", "_"));
		}
	}

}
