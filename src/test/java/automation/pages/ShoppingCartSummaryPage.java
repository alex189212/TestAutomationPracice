package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.ActionsCtrlExtn;

public class ShoppingCartSummaryPage extends PageObjectBase {

	@FindBy(how = How.CSS, using = "a[class='button btn btn-default standard-checkout button-medium'] span")
	private WebElement proceedToCheckOut;

	public ShoppingCartSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void clickOnCheckout() {
		
		new ActionsCtrlExtn(this.proceedToCheckOut,this.driver).clickOnCheckout();
	}

	public LoginPage proceedToCheckout() {
		driver.findElement(By.cssSelector("a[title='Proceed to checkout']"));
		return new LoginPage(this.driver);
	}
}
