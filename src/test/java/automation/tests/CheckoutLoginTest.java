package automation.tests;

import org.testng.annotations.Test;

import automation.pages.HomePage;
import automation.pages.ProductPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CheckoutLoginTest extends TestBase{
  @Test
  public void canCheckoutWithLogin() {
	  String product = "Faded Short Sleeves T-shirt";
	  HomePage homepage = new HomePage(this.getDriver())
			  .navigate();
	  homepage.goToProductPage(product);
	  ProductPage fadedTshirts = new ProductPage(this.getDriver());
	  
	  
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
