package automation.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.framework.TestBase;
import automation.pages.ForgotPasswordPage;

public class ForgotPasswordTest extends TestBase {
	@Test
	public void canRetrievePassword() {
		ForgotPasswordPage page = new ForgotPasswordPage(super.getDriver());
		page.navigate();

		page.submit("atbaptiste.shinadark@gmail.com");

		assertTrue(page.isSuccess());
	}
	
	@BeforeMethod
	protected void setup() {
		super.setup();
	}
	
	@AfterMethod
	protected void cleanup() {
		super.cleanup();
	}
}
