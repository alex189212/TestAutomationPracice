package automation.framework;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TestBase {

	private ChromeDriver driver;

	protected WebDriver getDriver() {
		return this.driver;
	}

	protected void setup() {
		launchChromeDriver();
	}

	protected void cleanup() {
		this.driver.quit();
	}

	private void launchChromeDriver() {
		Path resourceDirectory = Paths.get("src", "test", "resources");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		Path driverFile = Paths.get(absolutePath, "chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", driverFile.toFile().getAbsolutePath());

		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();

		long pageLoadTimeout = 10;
		this.driver.manage().timeouts().implicitlyWait(pageLoadTimeout, TimeUnit.SECONDS);
	}
}
