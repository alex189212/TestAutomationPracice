package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.AccountPage;
import automation.pages.HomePage;
import automation.pages.LoginPage;
import automation.pages.ProductPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class WishlistTest extends TestBase{
  @Test
  public void canAddtoWishlist() {
	  final String wishlistSuccess = "Added to your wishlist.";
	  final String email = "helloThere245@att.net";
	  final String password = "theHighGround";
	  
	  HomePage home = new HomePage(this.getDriver()).navigate();
	  home.login();
	  LoginPage login = new LoginPage(this.getDriver());
	  login.orderlogin(email, password);
	  AccountPage accountInfo = new AccountPage(this.getDriver());
	  accountInfo.returnHome();
	  HomePage loggedInHome = new HomePage(this.getDriver());
	  loggedInHome.goToProductPage("Faded Short Sleeve T-shirts");
	  ProductPage productToAdd = new ProductPage(this.getDriver());
	  //String result = productToAdd.addToCartandWishlist();
	  //Assert.assertEquals(result, wishlistSuccess);
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
