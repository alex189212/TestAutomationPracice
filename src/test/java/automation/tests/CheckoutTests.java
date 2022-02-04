package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CheckoutTests extends TestBase {

	@Test
	public void canTestCheckOut() {

		new HomePage(this.getDriver()).navigate().hoverOverProductImage().clickOnHoverAddToCartButton()
				.clickOncontinueShopping().clickOnCart().clickOnCheckout();

		Assert.assertEquals(this.getDriver().getCurrentUrl(),
				"http://invenauto.tech/index.php?controller=authentication&back=http%3A%2F%2Finvenauto.tech%2Findex.php%3Fcontroller%3Dorder%26step%3D1");
	}

	@BeforeMethod
	public void beforeMethod() {
		super.setup();
	}

	@AfterMethod
	public void afterMethod() {
		super.cleanup();
	}

}
