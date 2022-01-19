package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage extends PageObjectBase {
	private String url = "http://automationpractice.com/index.php?controller=my-account";
	@FindBy (how = How.CSS, using=".account span")
	private WebElement accountNameElement;
	@FindBy (how = How.CSS, using="a.home")
	private WebElement navigationHomeElement;
	
	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	public String getAccountName() {
		return accountNameElement.getText();
	}
	
	public void returnHome() {
		navigationHomeElement.click();
	}
}
