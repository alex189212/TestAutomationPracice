package automation.tests;

import org.testng.annotations.Test;

import automation.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AddressTest extends TestBase {
	final String expectedAccountName = "David Warner";
	final String email = "abc@abc.com";
	final String loginpassword = "davidwarner123";

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

	@Test
	public void canTestAddress() {

		new LoginPage(this.getDriver()).navigate().login(email, loginpassword).hoverOverProductImage()
				.clickOnHoverAddToCartButton().clickOnProceedToCheckout().clickOnCheckout().enterAddress1(address1)
				.enterCityName(cityname).selectState(state).enterPostCode(postCode).selectCountry(country)
				.enterPhoneNumber(phonenumber).clickregister();

		Assert.assertTrue(this.getDriver()
				.findElement(By.cssSelector("ul[class='address item box'] h3[class='page-subheading']")).isDisplayed());
	}

	@BeforeMethod
	public void setUp() {
		super.setup();
	}

	@AfterMethod
	public void tearDown() {
		super.cleanup();
	}

}
