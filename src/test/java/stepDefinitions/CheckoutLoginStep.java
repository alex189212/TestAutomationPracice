package stepDefinitions;

import org.testng.Assert;

import automation.pages.AddressesPage;
import automation.pages.HomePage;
import automation.pages.LoginPage;
import automation.pages.ProductPage;
import automation.pages.ShoppingCartSummaryPage;
import automation.tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutLoginStep extends TestBase{
	private HomePage homepage;
	private ProductPage productToAdd;
	private ShoppingCartSummaryPage cartSummary;
	private LoginPage userLogin;
	private AddressesPage addressForm;
	
	private String endURL = "http://invenauto.tech/index.php?controller=authentication";
	
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
	    productToAdd = homepage.goToProductPage("Faded Short Sleeves T-shirt");
	}

	@When("Add it to the cart")
	public void add_it_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    productToAdd.addToCart();
	}

	@When("Proceed to checkout summary")
	public void proceed_to_checkout_summary() {
	    // Write code here that turns the phrase above into concrete actions
	    cartSummary = productToAdd.proceedToCheckout();
	}

	@When("Proceed to login screen")
	public void proceed_to_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
		cartSummary.proceedToCheckout();
	}

	@When("Enter my login")
	public void enter_my_login() {
	    // Write code here that turns the phrase above into concrete actions
		userLogin = new LoginPage(this.getDriver());
	    userLogin.enterLoginInfo("helloThere245@att.net", "theHighGround");
	}

	@Then("The address form appears")
	public void the_address_form_appears() {
	    // Write code here that turns the phrase above into concrete actions
		addressForm = new AddressesPage(this.getDriver());
		String result = addressForm.getURL();
		Assert.assertEquals(result, endURL);
		super.cleanup();
	}
}
