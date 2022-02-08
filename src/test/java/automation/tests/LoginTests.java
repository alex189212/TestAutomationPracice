package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.AccountPage;
import automation.pages.HomePage;
import automation.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTests extends TestBase{
  @Test
  public void verifyLoginSuccessful() {
	  final String expectedAccountName = "David Warner";
	  final String email = "abc@abc.com";
	  final String password = "davidwarner123";
	  
	  String result = new LoginPage(this.getDriver())
			  .navigate()
			  .orderlogin(email, password)
			  .getAccountName();
	  
	  Assert.assertEquals(result, expectedAccountName);
  }
  
  @Test
  public void canSignOut() {
	 final String homepageURL = "http://invenauto.tech/index.php";
	 final String email = "helloThere245@att.net";
	 final String password = "theHighGround";
	 
	 String result = new HomePage(this.getDriver())
			 .navigate()
			 .login()
			 .orderlogin(email, password)
			 .returnHome()
			 .getURL();
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
