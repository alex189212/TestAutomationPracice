package stepDefinitions;

import automation.pages.HomePage;
import automation.pages.ShoppingCartSummaryPage;
import automation.tests.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step extends TestBase {

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

	}

}