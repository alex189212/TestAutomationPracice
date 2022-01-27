package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.ActionsCtrlExtn;

public class HomePage extends PageObjectBase {
	
	private final String homepageURL = "http://www.invenauto.tech/index.php";

	@FindBy(how = How.CSS, using = ".login")
	WebElement signinButton;
	@FindBy(how = How.CSS, using = ".account")
	WebElement accountButton;
	@FindBy(how = How.CSS, using = "a[title='Faded Short Sleeve T-Shirts']")
	WebElement fadedTshirtsElement;
	@FindBy(how = How.CSS, using = "#blocknewproducts > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img")
	WebElement productImage;
	@FindBy(how = How.CSS, using = "div[id='contact-link']>a")
	WebElement contactUs;
	@FindBy(how = How.CSS, using = "a[title='View my shopping cart']")
	WebElement cartButton;
	@FindBy(how = How.CSS, using = "li[class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered'] a[title='Add to cart'] span")
	WebElement onHoverAddToCartButton;
    @FindBy(how=How.CSS,using="#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
    WebElement continueShopping;
	Actions homepageActions = new Actions(driver);

	public HomePage(WebDriver driver) {
		super(driver);
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
		driver.findElement(By.cssSelector("a[title=" + product + "]")).click();
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

		new ActionsCtrlExtn(productImage, this.driver).hoverOverProductImage();
		return this;
	}
	
	public HomePage clickOnHoverAddToCartButton() {

		new ActionsCtrlExtn(onHoverAddToCartButton, this.driver).clickOnHoverAddToCartButton();
		return this;
	}
	
	public HomePage clickOncontinueShopping() {

		new ActionsCtrlExtn(continueShopping, this.driver).clickOncontinueShopping();
		return this;
	}
   public ShoppingCartSummaryPage clickOnCart() {
	   
	   new ActionsCtrlExtn(this.cartButton,this.driver).clickOnCart();
	   return new ShoppingCartSummaryPage(this.driver);
   }
}
