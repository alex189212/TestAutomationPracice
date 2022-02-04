package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.AccountPage;
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
	  
	  LoginPage login = new LoginPage(this.getDriver())
			  .navigate();
	  login.enterLoginInfo(email, password);
	  AccountPage myAccount = new AccountPage(this.getDriver());
	  String result = myAccount.getAccountName();
	  Assert.assertEquals(result, expectedAccountName);
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
