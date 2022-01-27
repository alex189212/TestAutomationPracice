package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.UI.ForgotPasswordControlExtension;
import automation.UI.UIControlBase;
import automation.pages.PageObjectBase;

public class ForgotPasswordPage extends PageObjectBase {
	private final String url = "http://invenauto.tech/index.php?controller=password";
	private ForgotPasswordControlExtension controller = new ForgotPasswordControlExtension(this.driver);
	
	@FindBy(how=How.ID, using="email")
	private WebElement emailTextElement;
	
	@FindBy(how=How.CSS, using="#form_forgotpassword > fieldset > p > button")
	private WebElement retrievePasswordButtonElement;
	
	@FindBy(how=How.CLASS_NAME, using="#center_column > div > div")
	private WebElement errorMessageElement;
	
	@FindBy(how=How.CSS, using="#center_column > div > p")
	private WebElement successMessageElement;
	
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}

	public String getURL() {
		return url;
	}
	
	public UIControlBase getController() {
		return this.controller;
	}
	
	public PageObjectBase navigate() {
		this.driver.navigate().to(url);
		return this;
	}

	public void submit(String string) {
		controller.submitText(string, emailTextElement);
		retrievePasswordButtonElement.click();
		//controller.click(retrievePasswordButtonElement);
	}

	public boolean isSuccess() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(successMessageElement));
		return successMessageElement.getText().contains("confirmation");
	}
}
