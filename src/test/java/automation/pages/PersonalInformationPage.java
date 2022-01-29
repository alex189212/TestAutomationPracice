package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.Page2CtrlExtn;
import automation.UI.SelectCtrlExtn;

public class PersonalInformationPage extends PageObjectBase {

	@FindBy(how = How.ID, using = "id_gender1")
	private WebElement malegenderchekcbox;
	@FindBy(how = How.ID, using = "id_gender2")
	private WebElement femalegenderchekcbox;
	@FindBy(how = How.ID, using = "customer_firstname")
	private WebElement firstname;
	@FindBy(how = How.ID, using = "customer_lastname")
	private WebElement lastname;
	@FindBy(how = How.ID, using = "passwd")
	private WebElement password;
	@FindBy(how = How.ID, using = "days")
	private WebElement dayselect;
	@FindBy(how = How.ID, using = "months")
	private WebElement monthselect;
	@FindBy(how = How.ID, using = "years")
	private WebElement yearselect;
	/*@FindBy(how = How.ID, using = "address1")
	private WebElement address1;
	@FindBy(how = How.ID, using = "city")
	private WebElement city;
	@FindBy(how = How.ID, using = "id_state")
	private WebElement state;
	@FindBy(how = How.ID, using = "postcode")
	private WebElement postcode;
	@FindBy(how = How.ID, using = "id_country")
	private WebElement country;
	@FindBy(how = How.ID, using = "phone_mobile")
	private WebElement mobileno;*/
	@FindBy(how = How.ID, using = "submitAccount")
	private WebElement registerbutton;

	public PersonalInformationPage(WebDriver driver) {

		super(driver);
	}

	public PersonalInformationPage selectGenderCheckbox(String text) {

		if (text.toLowerCase().contains("male")) {
			new Page2CtrlExtn(this.malegenderchekcbox).clickGenderChkBox();
		}
		if (text.toLowerCase().contains("female")) {
			new Page2CtrlExtn(this.femalegenderchekcbox).clickGenderChkBox();
		}
		return this;

	}

	public PersonalInformationPage enterFirstname(String text) {
		new Page2CtrlExtn(this.firstname).enterFirstName(text);
		return this;

	}

	public PersonalInformationPage enterlastname(String text) {
		new Page2CtrlExtn(this.lastname).enterLastName(text);
		return this;

	}

	public PersonalInformationPage enterPassword(String text) {
		new Page2CtrlExtn(this.password).enterPassword(text);
		return this;

	}

	public PersonalInformationPage selectDay(String text) {
		new SelectCtrlExtn(this.dayselect).selectDay(text);
		return this;

	}

	public PersonalInformationPage selectMonth(String text) {
		new SelectCtrlExtn(this.monthselect).selectMonth(text);
		return this;

	}

	public PersonalInformationPage selectYear(String text) {
		new SelectCtrlExtn(this.yearselect).selectYear(text);
		return this;

	}

	/*public PersonalInformationPage enterAddress1(String address) {
		new Page2CtrlExtn(this.address1).enterAddress1(address);

		return this;

	}

	public PersonalInformationPage enterCityName(String text) {

		new Page2CtrlExtn(this.city).enterCityName(text);
		return this;

	}

	public PersonalInformationPage selectState(String text) {

		new SelectCtrlExtn(this.state).selectState(text);
		return this;

	}

	public PersonalInformationPage enterPostCode(String number) {

		new Page2CtrlExtn(this.postcode).enterPostCode(number);
		return this;

	}

	public PersonalInformationPage selectCountry(String text) {
		new SelectCtrlExtn(this.country).selectCountry(text);
		return this;

	}

	public PersonalInformationPage enterPhoneNumber(String number) {
		new Page2CtrlExtn(this.mobileno).enterMobNo(number);
		return this;

	}*/

	public void clickregister() {

		new Page2CtrlExtn(this.registerbutton).clickRegister();

	}

}
