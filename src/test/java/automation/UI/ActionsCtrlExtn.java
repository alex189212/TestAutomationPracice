package automation.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsCtrlExtn {

	private WebElement element;
	private WebDriver driver;
	Actions action;

	public ActionsCtrlExtn(WebElement element, WebDriver driver) {

		this.element = element;
		this.driver = driver;
		this.action = new Actions(this.driver);

	}

	public void clickOnImage() {
		action.moveToElement(this.element, 50, 70).click().build().perform();

	}

}
