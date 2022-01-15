package automation.tests;

import org.testng.annotations.Test;

import automation.pages.WomenCatagoryPage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;

public class FilterTest extends TestBase {
	@Test
	public void canFilterForTops() {
		WomenCatagoryPage page = new WomenCatagoryPage(super.getDriver());
		page.navigate();

		page.selectTops();

		assertTrue(page.isUpdated());
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
