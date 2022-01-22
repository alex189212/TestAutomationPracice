package automation.UI;

import org.openqa.selenium.WebElement;

public class ContactUsPageCtrlExtn {

	private WebElement mappedelement;

	public ContactUsPageCtrlExtn(WebElement mappedelement) {

		this.mappedelement = mappedelement;

	}

	public void enterEmailAddress(String text) {
		this.mappedelement.sendKeys(text);
	}

	public void enterOrderreference(String text) {
		this.mappedelement.sendKeys(text);
	}

	public void clickSendButton() {
		this.mappedelement.click();
	}

	public void enterMessage(String text) {
		this.mappedelement.sendKeys(text);
	}

}
