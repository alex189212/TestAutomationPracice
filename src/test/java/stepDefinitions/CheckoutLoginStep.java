package stepDefinitions;

import automation.pages.HomePage;
import automation.tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutLoginStep extends TestBase{
	HomePage homepage;
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    super.setup();
	    homepage = new HomePage(this.getDriver())
	    		.navigate();
	}

	@When("Click on a product")
	public void click_on_a_product() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Add it to the cart")
	public void add_it_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Proceed to checkout summary")
	public void proceed_to_checkout_summary() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Proceed to login screen")
	public void proceed_to_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter my login")
	public void enter_my_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The address form appears")
	public void the_address_form_appears() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
