package automation.tests;

import org.testng.annotations.Test;

import automation.pages.AddressesPage;
import automation.pages.HomePage;
import automation.pages.ProductPage;
import automation.pages.ShoppingCartSummaryPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CheckoutLoginTest extends TestBase{
  @Test
  public void canCheckoutWithLogin() {
	  String product = "Faded Short Sleeves T-shirt";
	  String userEmail = "helloThere245@att.net";
	  String userPassword = "theHighGround";
	  HomePage homepage = new HomePage(this.getDriver())
			  .navigate();
	  ProductPage productToAdd = homepage.goToProductPage(product);
	  productToAdd.addToCart();
	  ShoppingCartSummaryPage cartSummary = productToAdd.proceedToCheckout();
	  cartSummary.proceedToCheckout().enterLoginInfo(userEmail, userPassword);
	  AddressesPage addressForm = new AddressesPage(this.getDriver());
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
