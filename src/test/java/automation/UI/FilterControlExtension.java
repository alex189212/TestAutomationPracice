package automation.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FilterControlExtension extends UIControlBase {
	public FilterControlExtension(WebDriver driver) {
		super(driver);
	}
	
	public void click(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element);
		action.perform();
	}
}
