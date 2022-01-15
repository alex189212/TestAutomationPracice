package automation.UI;

import org.openqa.selenium.WebElement;

public class HomePageCtrlExtn {

	private WebElement element;

	public HomePageCtrlExtn(WebElement element) {

		this.element = element;

	}

	public void clickOnTitle() {
		this.element.click();

	}

}
