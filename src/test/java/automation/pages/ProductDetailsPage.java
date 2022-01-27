package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.ActionsCtrlExtn;

public class ProductDetailsPage extends PageObjectBase {

	private String url = "http://invenauto.tech/index.php?id_product=2&controller=product";

	@FindBy(how = How.CSS, using = "#add_to_cart>button")
	private WebElement addToCart;

	@FindBy(how = How.CSS, using = "li[class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered'] div[class='right-block'] a[title='Faded Short Sleeves T-shirt']")
	private WebElement productImg;
	@FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")
	private WebElement productTitle;

	public ProductDetailsPage(WebDriver driver) {

		super(driver);

	}

	public ProductDetailsPage navigation() {

		driver.get(url);
		return this;
	}

	public ProductDetailsPage addToCart() {

		new ActionsCtrlExtn(addToCart, this.driver).addToCart();
		return this;
	}

	
}
