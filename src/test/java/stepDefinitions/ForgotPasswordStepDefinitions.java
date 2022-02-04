package stepDefinitions;

import static org.testng.Assert.assertTrue;

import automation.pages.ForgotPasswordPage;
import automation.framework.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ForgotPasswordStepDefinitions extends TestBase {
	public ForgotPasswordPage page;
	
	@Given("I am on the Forgot Password Page")
	public void i_am_on_the_forgot_password_page() {
		super.setup();
		this.page = new ForgotPasswordPage(this.getDriver());
		this.page.navigate();
	}

	@When("I submit my email")
	public void i_enter_my_email() {
		this.page.submit("atbaptiste.shinadark@gmail.com");
	}

	@Then("my password is reset")
	public void my_password_is_reset() {
		assertTrue(page.isSuccess());
		super.cleanup();
	}
}
