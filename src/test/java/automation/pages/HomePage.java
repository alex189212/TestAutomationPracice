package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.ActionsCtrlExtn;
import automation.framework.PageObjectBase;

public class HomePage extends PageObjectBase {

	private final String homepageURL = "http://www.invenauto.tech/index.php";

	@FindBy(how = How.CSS, using = ".login")
	WebElement signinButton;
	@FindBy(how = How.CSS, using = ".account")
	WebElement accountButton;
	@FindBy(how = How.CSS, using = "a[title='Faded Short Sleeve T-Shirts']")
	WebElement fadedTshirtsElement;
	@FindBy(how = How.CSS, using = "img[title='Faded Short Sleeves T-shirt']")
	WebElement productImage;
	@FindBy(how = How.CSS, using = "div[id='contact-link']>a")
	WebElement contactUs;
	@FindBy(how = How.CSS, using = "a[title='View my shopping cart']")
	WebElement cartButton;
	@FindBy(how = How.XPATH, using = "//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]")
	WebElement onHoverAddToCartButton;
	@FindBy(how = How.CSS, using = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
	WebElement continueShopping;
	@FindBy(how = How.CSS, using = "a[title='Proceed to checkout'] span")
	WebElement proceedToCheckout;

	Actions homepageActions = new Actions(driver);

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String getURL() {
		return homepageURL;
	}
	
	public HomePage navigate() {
		this.driver.navigate().to(homepageURL);
		return this;
	}

	public AccountPage accessAccount() {
		accountButton.click();
		return new AccountPage(this.driver);
	}

	public LoginPage login() {
		signinButton.click();
		return new LoginPage(this.driver);
	}

	public ProductPage goToProductPage(String product) {
		driver.findElement(By.cssSelector("a[title='" + product +  "']")).click();
		return new ProductPage(this.driver);
	}

	public void clickImage() {

		new ActionsCtrlExtn(this.productImage, this.driver).clickOnImage();

	}

	public ContactUsPage clickContactUs() {

		this.contactUs.click();

		return new ContactUsPage(this.driver);
	}

	public HomePage hoverOverProductImage() {

		new ActionsCtrlExtn(this.productImage, this.driver).hoverOverProductImage();
		return this;
	}

	public HomePage clickOnHoverAddToCartButton() {

		new ActionsCtrlExtn(this.onHoverAddToCartButton, this.driver).clickOnHoverAddToCartButton();
		return this;
	}

	public HomePage clickOncontinueShopping() {

		new ActionsCtrlExtn(this.continueShopping, this.driver).clickOncontinueShopping();
		return this;
	}

	public ShoppingCartSummaryPage clickOnCart() {

		new ActionsCtrlExtn(this.cartButton, this.driver).clickOnCart();
		return new ShoppingCartSummaryPage(this.driver);
	}

	public ShoppingCartSummaryPage clickOnProceedToCheckout() {

		new ActionsCtrlExtn(proceedToCheckout, this.driver).clickOnProceedToCheckout();
		return new ShoppingCartSummaryPage(this.driver);
	}
}
