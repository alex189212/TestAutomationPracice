package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAddressesPage extends PageObjectBase {
	
	@FindBy(how = How.CSS, using="a[title='Add an address']")
	private WebElement addAddressButton;
	@FindBy(how = How.XPATH, using="//a/span[text() = ' Back to your account']")
	private WebElement backToAccountButton;
	
	public MyAddressesPage(WebDriver driver) {
		super(driver);
	}
	
	public AddressesPage addAddress() {
		addAddressButton.click();
		return new AddressesPage(driver);
	}
	
	public AccountPage backToAccount() {
		backToAccountButton.click();
		return new AccountPage(driver);
	}

}
