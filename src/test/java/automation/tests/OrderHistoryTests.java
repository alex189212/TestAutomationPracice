package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.LoginPage;
import automation.pages.OrderHistoryPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class OrderHistoryTests extends TestBase {

	final String email = "abc@abc.com";
	final String loginpassword = "davidwarner123";

	@Test
	public void canTestOrderHistory() {

		OrderHistoryPage orderhistorypage = new LoginPage(this.getDriver()).navigate().orderlogin(email, loginpassword)
				.clickOnOrderHistory();

		Assert.assertTrue(orderhistorypage.oderListTableIsDisplayed());

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
