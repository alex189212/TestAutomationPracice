package automation.UI;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public abstract class UIControlBase {
	protected WebDriver driver;
	protected JavascriptExecutor control_executor;
	protected UIControlBase(WebDriver driver) {
		this.driver = driver;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		control_executor = jse;
	}
	
	protected JavascriptExecutor getExecutor() {
		return control_executor;
	}
}
