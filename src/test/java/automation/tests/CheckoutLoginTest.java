package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.AddressesPage;
import automation.pages.HomePage;
import automation.pages.ProductPage;
import automation.pages.ShoppingCartSummaryPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CheckoutLoginTest extends TestBase{
  @Test
  public void canCheckoutWithLogin() {
	  String product = "Faded Short Sleeves T-shirt";
	  String userEmail = "helloThere245@att.net";
	  String userPassword = "theHighGround";
	  String endURL = "http://invenauto.tech/index.php?controller=address&back=order.php%3Fstep%3D1";
	  String result = new HomePage(this.getDriver())
			  .navigate()
			  .goToProductPage(product)
			  .addToCart().proceedToCheckout()
			  .proceedToCheckout()
			  .checkoutLogin(userEmail, userPassword)
			  .getURL();
	  
	  Assert.assertEquals(result, endURL);
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
