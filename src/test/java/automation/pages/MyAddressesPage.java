package automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.framework.PageObjectBase;

public class MyAddressesPage extends PageObjectBase {
	
	@FindBy(how = How.CSS, using="a[title='Add an address']")
	private WebElement addAddressButton;
	@FindBy(how = How.XPATH, using="//a/span[text() = ' Back to your account']")
	private WebElement backToAccountButton;
	@FindBy(how = How.CSS, using="ul.item li h3.page-subheading")
	private List<WebElement> addressTitles;
	@FindBy(how = How.CSS, using="li.address_update a[title='Delete']")
	private List<WebElement> deleteButtons;
	
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
	
	public void deleteAddress(String addressToDelete) {
		WebElement element;
		for (int i = 0; i < addressTitles.size(); i++) {
			element = addressTitles.get(i);
			if (element.getText().equals(addressToDelete)) {
				deleteButtons.get(i).click();
				driver.switchTo().alert().accept();
			}
		}
	}
	
	public void deleteAllAddresses() {
		for (WebElement element : deleteButtons) {
			element.click();
			driver.switchTo().alert().accept();
		}
	}
	
	public int numberOfAddresses() {
		List<WebElement> addresses = driver.findElements(By.xpath("//div[@class='bloc_adresses row']/div"));
		return addresses.size();
	}

}
