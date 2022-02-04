package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.PrintedDressPage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertFalse;
import org.testng.annotations.AfterMethod;

public class WishlistWithoutLoginTest extends TestBase{
	@Test
	public void canNotAddToWishlistWithoutLogin() {
		PrintedDressPage page = new PrintedDressPage(super.getDriver());
		page.navigate();

		page.addToWishlist();

		assertFalse(page.isAddedToWishlist());
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
