package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.Page1CtrlExtn;

public class UserRegistrationPage extends PageObjectBase {
	private String url = "http://invenauto.tech/index.php?controller=authentication&back=my-account";

	@FindBy(how = How.ID, using = "email_create")
	private WebElement emailAddress;

	@FindBy(how = How.NAME, using = "SubmitCreate")
	private WebElement submitButton;

	public UserRegistrationPage(WebDriver driver) {

		super(driver);

	}

	public UserRegistrationPage navigation() {

		driver.get(url);
		return this;
	}

	public UserRegistrationPage enterEmailAddress(String text) {

		new Page1CtrlExtn(emailAddress).enteremailaddress(text);
		return this;
	}

	public PersonalInformationPage submit() {

		new Page1CtrlExtn(submitButton).submit();
		return new PersonalInformationPage(driver);

	}
}
