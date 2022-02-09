package automation.framework;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	private WebDriver driver;
	
	public abstract void createDriver();
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	protected void setDriver(WebDriver browser) {
		this.driver = browser;
	}
	
	public void quitDriver() {
		this.driver.quit();
	}
}
