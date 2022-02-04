package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.ActionsCtrlExtn;
import automation.framework.PageObjectBase;

public class ShoppingCartSummaryPage extends PageObjectBase {

	
	@FindBy(how = How.CSS, using = "a[class='button btn btn-default standard-checkout button-medium'] span")
	private WebElement proceedToCheckOut;

	public ShoppingCartSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	
	public AddressesPage clickOnCheckout() {
		
		new ActionsCtrlExtn(this.proceedToCheckOut,this.driver).clickOnCheckout();
		return new AddressesPage(this.driver);
	}

	public LoginPage proceedToCheckout() {
		driver.findElement(By.className("standard-checkout")).click();
		return new LoginPage(this.driver);
	}
}
