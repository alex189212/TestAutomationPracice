package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.ContactUsPageCtrlExtn;
import automation.UI.SelectCtrlExtn;

public class ContactUsPage extends PageObjectBase {

	@FindBy(how = How.CSS, using = "select[id='id_contact']")
	WebElement subjectHeading;

	@FindBy(how = How.CSS, using = "input[id='email']")
	WebElement emailAddress;

	@FindBy(how = How.CSS, using = "input[id='id_order']")
	WebElement orderReference;

	@FindBy(how = How.CSS, using = "textarea[id='message']")
	WebElement messageBox;

	@FindBy(how = How.CSS, using = "button[id='submitMessage']")
	WebElement sendButton;

	public ContactUsPage(WebDriver driver) {

		super(driver);

	}

	public ContactUsPage selectSubjectheading() {

		new SelectCtrlExtn(this.subjectHeading).selectSubjectHeading();
		return this;
	}

	public ContactUsPage enterEmailAddress(String text) {

		new ContactUsPageCtrlExtn(this.emailAddress).enterEmailAddress(text);
		return this;
	}

	public ContactUsPage enterOrderreference(String text) {

		new ContactUsPageCtrlExtn(this.orderReference).enterOrderreference(text);
		return this;
	}
	
	public ContactUsPage enterMessage(String text) {

		new ContactUsPageCtrlExtn(this.messageBox).enterMessage(text);
		return this;
	}
	
	public void clickSendButton() {

		new ContactUsPageCtrlExtn(this.sendButton).clickSendButton();
	}

}
