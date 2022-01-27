package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.UI.LoginControlExtension;

public class LoginPage extends PageObjectBase {
	final private String destination = "http://invenauto.tech/index.php?controller=authentication&back=my-account";
	@FindBy(how = How.ID, using = "email")
	private WebElement emailBoxElement;
	@FindBy(how = How.ID, using = "passwd")
	private WebElement passwordElement;
	@FindBy(how = How.CSS, using = "button[id='SubmitLogin'] span")
	private WebElement signInButton;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public LoginPage navigate() {
		this.driver.navigate().to(destination);
		return this;
	}

	public void enterLoginInfo(String email, String password) {
		LoginControlExtension loginElements = new LoginControlExtension(this.driver, emailBoxElement, passwordElement);
		loginElements.sendLogin(email, password);
        signInButton.click();
	}

}
