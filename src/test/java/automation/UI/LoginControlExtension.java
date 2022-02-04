package automation.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.framework.UIControlBase;

public class LoginControlExtension extends UIControlBase {
	private WebElement emailBox;
	private WebElement passwordBox;
	
	public LoginControlExtension(WebDriver driver, WebElement email, WebElement password) {
		super(driver);
		this.emailBox = email;
		this.passwordBox = password;
	}

	public void sendLogin(String email, String password) {
		emailBox.clear();
		emailBox.click();
		emailBox.sendKeys(email);
		passwordBox.clear();
		passwordBox.click();
		passwordBox.sendKeys(password);
	}

}
