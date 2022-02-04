package automation.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import automation.framework.UIControlBase;

public class PrintedDressControlExtension extends UIControlBase {
	public PrintedDressControlExtension(WebDriver driver) {
		super(driver);
	}

	public void click(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element);
		action.perform();
	}
}
