package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressesPage extends PageObjectBase {
	
	@FindBy(how=How.ID, using="firstname")
	private WebElement firstNameTextbox;
	@FindBy(how=How.ID, using="lastname")
	private WebElement lastNameTextbox;
	@FindBy(how=How.ID, using="address1")
	private WebElement address1Textbox;
	@FindBy(how=How.ID, using="city")
	private WebElement cityTextbox;
	
	public AddressesPage(WebDriver driver) {
		super(driver);
	}
	
	public String getURL() {
		return driver.getCurrentUrl();
	}
}
