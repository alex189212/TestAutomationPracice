package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HomePageTests extends TestBase {

	public String expectedUrl = "http://automationpractice.com/index.php?id_product=1&controller=product";

	@Test
	public void canTestUserReg() {

		new HomePage(this.getDriver()).navigate().clickImage();
		String actualUrl = this.getDriver().getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
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
