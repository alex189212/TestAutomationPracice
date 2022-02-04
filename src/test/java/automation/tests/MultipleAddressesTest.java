package automation.tests;

import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.UI.FormData;
import automation.pages.HomePage;
import automation.pages.MyAddressesPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class MultipleAddressesTest extends TestBase{
  @Test
  public void canAddMultipleAddresses() {
	  //create FormData instance here
	  int expectedNumAddresses = 2;
	  String email = "helloThere245@att.net";
	  String password = "theHighGround";
	  String[] dataString1 = {"Obiwan", "Kenobi", "124 Jedi Temple Lane", "Corusant", "New York", "10014", "United States", "6462597334", "Home Base"};
	  String[] dataString2 = {"Obiwan", "Kenobi", "444 High Ground Boulevard", "Rainier", "Washington", "99301", "United States", "6462597334", "Retreat"};
	  FormData firstForm = new FormData(dataString1);
	  FormData secondForm = new FormData(dataString2);
	  MyAddressesPage myAddresses = new HomePage(this.getDriver())
			  .navigate()
			  .login()
			  .orderlogin(email, password)
			  .goToAddresses()
			  .addAddress()
			  .enterFormData(firstForm)
			  .addAddress()
			  .enterFormData(secondForm);
	  int numAddresses = myAddresses.numberOfAddresses();
	  myAddresses.deleteAddress("Home Base");
	  myAddresses.deleteAddress("Retreat");
	  Assert.assertEquals(numAddresses, expectedNumAddresses);
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
