package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.PrintedDressControlExtension;
import automation.UI.UIControlBase;

public class PrintedDressPage extends PageObjectBase {
	private final String url = "http://automationpractice.com/index.php?id_product=3&controller=product";
	private PrintedDressControlExtension controller = new PrintedDressControlExtension(this.driver);
	
	@FindBy(how=How.ID, using="wishlist_button")
	private WebElement wishlistButtonElement;
	
	@FindBy(how=How.CSS, using="#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > div > div > p")
	private WebElement wishlistErrorElement;
	
	public PrintedDressPage(WebDriver driver) {
		super(driver);
	}

	public String getURL() {
		return url;
	}
	
	public UIControlBase getController() {
		return this.controller;
	}
	
	public PageObjectBase navigate() {
		this.driver.navigate().to(url);
		return this;
	}

	public void addToWishlist() {
		wishlistButtonElement.click();
	}

	public Boolean isAddedToWishlist() {
		return !wishlistErrorElement.isDisplayed();
	}
}
