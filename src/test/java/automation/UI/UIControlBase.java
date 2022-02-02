package automation.UI;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public abstract class UIControlBase {
	protected WebDriver driver;
	protected JavascriptExecutor controlExecutor;
	protected UIControlBase(WebDriver driver) {
		this.driver = driver;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		controlExecutor = jse;
	}
	
	protected JavascriptExecutor getExecutor() {
		return controlExecutor;
	}
}
