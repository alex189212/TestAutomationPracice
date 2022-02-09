package automation.framework;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

	private WebDriver driver;

	protected WebDriver getDriver() {
		return this.driver;
	}
	
	@BeforeMethod
	protected void setup()  {
		try {
			launchDriver();
		} catch (FileNotFoundException e) {
			System.out.println("Browserdriver not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Wrong input in config");
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	protected void cleanup() {
		this.driver.quit();
	}
	
	private void launchDriver() throws FileNotFoundException, IOException {

		Path resourceDirectory = Paths.get("src","test","resources");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		Path configFile = Paths.get(absolutePath, "config.properties");
		
		Properties driverProperties = new Properties();
		driverProperties.load(new FileInputStream(configFile.toString()));

		String browser = driverProperties.getProperty("browser");
		
		DriverManager manager = DriverManagerFactory.getManager(browser);
		manager.createDriver();
		this.driver = manager.getDriver();

		long pageLoadTimeout = 60;
		this.driver.manage().timeouts().implicitlyWait(pageLoadTimeout , TimeUnit.SECONDS);
	}
}