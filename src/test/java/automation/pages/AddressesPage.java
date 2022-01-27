package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.Page2CtrlExtn;
import automation.UI.SelectCtrlExtn;

public class AddressesPage extends PageObjectBase {

	@FindBy(how = How.ID, using = "firstname")
	private WebElement firstNameTextbox;
	@FindBy(how = How.ID, using = "lastname")
	private WebElement lastNameTextbox;
	@FindBy(how = How.ID, using = "address1")
	private WebElement address1Textbox;
	@FindBy(how = How.ID, using = "city")
	private WebElement city;;
	@FindBy(how = How.ID, using = "id_state")
	private WebElement state;
	@FindBy(how = How.ID, using = "postcode")
	private WebElement zipCode;
	@FindBy(how = How.ID, using = "id_country")
	private WebElement country;
	@FindBy(how = How.ID, using = "phone")
	private WebElement mobileno;
	@FindBy(how = How.ID, using = "submitAddress")
	private WebElement savebutton;

	public AddressesPage(WebDriver driver) {
		super(driver);
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public AddressesPage enterFirstname(String text) {
		new Page2CtrlExtn(this.firstNameTextbox).enterFirstName(text);
		return this;

	}

	public AddressesPage enterlastname(String text) {
		new Page2CtrlExtn(this.lastNameTextbox).enterLastName(text);
		return this;
	}

	public AddressesPage enterAddress1(String address) {
		new Page2CtrlExtn(this.address1Textbox).enterAddress1(address);

		return this;

	}

	public AddressesPage enterCityName(String text) {

		new Page2CtrlExtn(this.city).enterCityName(text);
		return this;

	}

	public AddressesPage selectState(String text) {

		new SelectCtrlExtn(this.state).selectState(text);
		return this;
	}

	public AddressesPage enterPostCode(String number) {

		new Page2CtrlExtn(this.zipCode).enterPostCode(number);
		return this;

	}

	public AddressesPage selectCountry(String text) {
		new SelectCtrlExtn(this.country).selectCountry(text);
		return this;

	}

	public AddressesPage enterPhoneNumber(String number) {
		new Page2CtrlExtn(this.mobileno).enterMobNo(number);
		return this;

	}

	public void clickregister() {

		new Page2CtrlExtn(this.savebutton).clickRegister();

	}
}
