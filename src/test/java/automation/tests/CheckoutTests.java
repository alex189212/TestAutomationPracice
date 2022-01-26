package automation.tests;

import org.testng.annotations.Test;

import automation.pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CheckoutTests extends TestBase {
	@Test
	public void canTestCheckOut() throws InterruptedException {

		HomePage hp = new HomePage(this.getDriver()).navigate().hoverOverProductImage().clickOnHoverAddToCartButton();
		Thread.sleep(5000);
		hp.clickOncontinueShopping().clickOnCart().clickOnCheckout();
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
