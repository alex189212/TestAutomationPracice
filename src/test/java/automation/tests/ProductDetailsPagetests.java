package automation.tests;

import org.testng.annotations.Test;

import automation.pages.ProductDetailsPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ProductDetailsPagetests extends TestBase {
	@Test
	public void canTestAddToCart() {
		
		new ProductDetailsPage(this.getDriver()).navigation().addToCart();
	}

	@BeforeMethod
	public void setUp() {
		
		super.setup();
	}

	@AfterMethod
	public void tearDown() {
		
		//super.cleanup();
	}

}
