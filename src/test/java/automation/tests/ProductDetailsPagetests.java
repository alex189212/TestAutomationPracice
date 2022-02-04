package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.ProductDetailsPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ProductDetailsPagetests extends TestBase {
	@Test
	public void canTestAddToCart() {

		new ProductDetailsPage(this.getDriver()).navigation().addToCart();
		WebDriverWait wait = new WebDriverWait(this.getDriver(), 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(((By.cssSelector("a[title='Proceed to checkout'] span")))));

		Assert.assertTrue(
				this.getDriver().findElement(By.cssSelector("a[title='Proceed to checkout'] span")).isDisplayed());
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
