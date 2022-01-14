package automation.UI;

import org.openqa.selenium.WebElement;

public class Page2CtrlExtn {

	private WebElement element;

	public Page2CtrlExtn(WebElement element) {

		this.element = element;

	}

	public void clickRegister() {
		this.element.click();
	}

	public void enterMobNo(String number) {
		this.element.sendKeys(number);
	}

	public void enterPostCode(String number) {

		this.element.sendKeys(number);

	}

	public void clickGenderChkBox() {
		this.element.click();
	}

	public void enterFirstName(String text) {
		this.element.sendKeys(text);
	}

	public void enterLastName(String text) {
		this.element.sendKeys(text);
	}

	public void enterAddress1(String text) {
		this.element.sendKeys(text);
	}

	public void enterCityName(String text) {
		this.element.sendKeys(text);
	}

	public void enterPassword(String text) {
		this.element.sendKeys(text);
	}

}
