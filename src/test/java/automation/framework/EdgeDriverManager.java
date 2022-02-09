package automation.framework;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverManager extends DriverManager {

	@Override
	public void createDriver() {
		Path resourceDirectory = Paths.get("src","test","resources");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		Path driverFile = Paths.get(absolutePath, "msedgedriver.exe");

		//EdgeOptions options = new EdgeOptions();

		//options.;

		
		System.setProperty("webdriver.edge.driver", driverFile.toFile().getAbsolutePath());

		WebDriver edge = new EdgeDriver();
		
		setDriver(edge);
	}

}
