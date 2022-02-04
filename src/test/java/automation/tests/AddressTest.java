package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AddressTest extends TestBase {
	final String email = "abc@abc.com";
	final String loginpassword = "davidwarner123";

	@Test
	public void canTestAddress() {

		new LoginPage(this.getDriver()).navigate().login(email, loginpassword).hoverOverProductImage()
				.clickOnHoverAddToCartButton().clickOnProceedToCheckout().clickOnCheckout();
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
