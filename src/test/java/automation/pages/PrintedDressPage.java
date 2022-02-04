package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.PrintedDressControlExtension;
import automation.framework.UIControlBase;
import automation.framework.PageObjectBase;

import org.openqa.selenium.support.ui.Select;

public class PrintedDressPage extends PageObjectBase {
	private final String url = "http://invenauto.tech/index.php?id_product=3&controller=product";
	private PrintedDressControlExtension controller = new PrintedDressControlExtension(this.driver);
	
	@FindBy(how=How.ID, using="wishlist_button")
	private WebElement wishlistButtonElement;
	
	@FindBy(how=How.CSS, using="#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > div > div > p")
	private WebElement wishlistErrorElement;
	
	@FindBy(how=How.CSS, using="#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1")
	private WebElement titleElement;
	
	@FindBy(how=How.ID, using="our_price_display")
	private WebElement priceElement;
	
	@FindBy(how=How.ID, using="bigpic")
	private WebElement imageElement;
	
	@FindBy(how=How.CSS, using="")
	private WebElement reviewsElement;
	
	@FindBy(how=How.CSS, using="")
	private WebElement ratingsElement;
	
	@FindBy(how=How.ID, using="group_1")
	private WebElement sizeSelectElement;
	
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

	public boolean isTitleVisible() {
		return titleElement.isDisplayed();
	}

	public boolean isImageVisible() {
		return imageElement.isDisplayed();
	}

	public boolean isPriceVisible() {
		return priceElement.isDisplayed();
	}

	public boolean areReviewsVisible() {
		return false;
	}

	public boolean areRatingsVisible() {
		return false;
	}

	public void selectSize(String string) {
		Select dropdown = new Select(sizeSelectElement);
		dropdown.selectByVisibleText(string);
		
	}

	public String sizeSelected() {
		Select dropdown = new Select(sizeSelectElement);
		return dropdown.getFirstSelectedOption().getText();
	}
}
