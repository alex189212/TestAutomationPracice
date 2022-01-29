package automation.tests;

import org.testng.annotations.Test;

import automation.pages.UserRegistrationPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class UserRegTests extends TestBase {

	String emailAddress = "sarabcdy@zycd.com";
	String gender = "male";
	String firstName = "Adam";
	String lastname = "levine";
	String password = "levine678";
	String cityname = "NYC";
	String address1 = "5454 70th st newyork";
	String postCode = "11379";
	String phonenumber = "01711111111";
	String day = "8";
	String month = "9";
	String year = "1992";
	String country = "United States";
	String state = "New York";
	String expected = "MY ACCOUNT";

	@Test
	public void canTestUserReg() {

		new UserRegistrationPage(this.getDriver()).navigation().enterEmailAddress(emailAddress).submit()
				.selectGenderCheckbox(gender).enterFirstname(firstName).enterlastname(lastname).enterPassword(password)
				.selectDay(day).selectMonth(month).selectYear(year).clickregister();

		Assert.assertEquals(this.getDriver().findElement(By.className("page-heading")).getText(), expected);
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
