package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.Page1CtrlExtn;
import automation.framework.PageObjectBase;

public class OrderHistoryPage extends PageObjectBase {

	@FindBy(how = How.CSS, using = "p[class='alert alert-warning']")
	WebElement noOdersElement;
	@FindBy(how = How.CSS, using = "table[id='order-list']")
	WebElement orderListTable;

	protected OrderHistoryPage(WebDriver driver) {
		super(driver);

	}

	public String noOderElementGetText() {

		return new Page1CtrlExtn(this.noOdersElement).noOderElementGetText();

	}

	public boolean oderListTableIsDisplayed() {
		return new Page1CtrlExtn(this.orderListTable).oderListTableIsDisplayed();
		
	}
}
