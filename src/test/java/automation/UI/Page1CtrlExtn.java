package automation.UI;

import org.openqa.selenium.WebElement;

public class Page1CtrlExtn {

	private WebElement element;

	public Page1CtrlExtn(WebElement element) {

		this.element = element;

	}

	public void enteremailaddress(String text) {
		this.element.sendKeys(text);
	}

	public void submit() {
		this.element.click();

	}

	public String noOderElementGetText() {

		return this.element.getText();

	}

	public boolean oderListTableIsDisplayed() {
		return this.element.isDisplayed();
	}

}
