package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.ActionsCtrlExtn;

public class ShoppingCartSummaryPage extends PageObjectBase {
	final String expectedAccountName = "David Warner";

	final String emailAddress = "sarabcd@zycd.com";
	final String gender = "male";
	final String firstName = "Adam";
	final String lastname = "levine";
	final String password = "levine678";
	final String cityname = "NYC";
	final String address1 = "5454 70th st newyork";
	final String postCode = "11379";
	final String phonenumber = "01711111111";
	final String day = "8";
	final String month = "9";
	final String year = "1992";
	final String country = "United States";
	final String state = "New York";
	final String expected = "MY ACCOUNT";

	@FindBy(how = How.CSS, using = "a[class='button btn btn-default standard-checkout button-medium'] span")
	private WebElement proceedToCheckOut;

	@FindBy(how = How.CSS, using = ".address.first_item.item.box")
	private WebElement addressDiv;

	public ShoppingCartSummaryPage(WebDriver driver) {
		super(driver);
	}

	public void clickOnCheckout() {
		try {
			if (this.addressDiv.isDisplayed()) {
				new ActionsCtrlExtn(this.proceedToCheckOut, this.driver).clickOnCheckout();

			}
		} catch (Exception e) {

			new ActionsCtrlExtn(this.proceedToCheckOut, this.driver).clickOnCheckout();
			new AddressesPage(this.driver).enterAddress1(address1).enterCityName(cityname).selectState(state)
					.enterPostCode(postCode).selectCountry(country).enterPhoneNumber(phonenumber).clickregister();

		}

	}

	public LoginPage proceedToCheckout() {
		driver.findElement(By.className("standard-checkout")).click();
		return new LoginPage(this.driver);
	}
}
