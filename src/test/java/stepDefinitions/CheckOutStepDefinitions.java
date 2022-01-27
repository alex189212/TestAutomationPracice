package stepDefinitions;

import org.testng.Assert;

import automation.pages.HomePage;
import automation.pages.ShoppingCartSummaryPage;
import automation.tests.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutStepDefinitions extends TestBase {

	HomePage homepage;

	@Given("Initialize the browser with chrome")
	public void initialize_the_browser_with_chrome() {
		super.setup();
	}

	@When("Navigate to HomePage")
	public void navigate_to_home_page() {
		this.homepage = new HomePage(this.getDriver());
		homepage.navigate();

	}

	@And("Hover over productimage")
	public void hover_over_productimage() {
		homepage.hoverOverProductImage();
	}

	@And("click on onHover add to cart button")
	public void click_on_on_hover_add_to_cart_button() {
		homepage.clickOnHoverAddToCartButton();

	}

	@And("click on continue shopping")
	public void click_on_continue_shopping() {
		homepage.clickOncontinueShopping();
	}

	@And("click on cart")
	public void click_on_cart() {
		homepage.clickOnCart();
	}

	@And("click on checkout button")
	public void click_on_checkout_button() {
		new ShoppingCartSummaryPage(this.getDriver()).clickOnCheckout();
	}

	@Then("verify the url of the page")
	public void verify_the_url_of_the_page() {
		Assert.assertEquals(this.getDriver().getCurrentUrl(),
				"http://invenauto.tech/index.php?controller=authentication&back=http%3A%2F%2Finvenauto.tech%2Findex.php%3Fcontroller%3Dorder%26step%3D1");
	}

	@And("Close the browser")
	public void close_the_browser() {
		super.cleanup();
	}

}