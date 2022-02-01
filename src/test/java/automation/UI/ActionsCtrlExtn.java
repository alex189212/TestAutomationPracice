package automation.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsCtrlExtn {

	private WebElement element;
	private WebDriver driver;
	Actions action;

	public ActionsCtrlExtn(WebElement element, WebDriver driver) {

		this.element = element;
		this.driver = driver;
		this.action = new Actions(this.driver);

	}

	public void clickOnImage() {
		action.moveToElement(this.element, 50, 70).click().build().perform();

	}

	public void addToCart() {

		action.moveToElement(this.element).click().build().perform();
		/*
		 * action.moveToElement(driver.findElement(By.xpath(
		 * "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//span[contains(text(),'Add to cart')]"
		 * ))) .click().build().perform();
		 */

	}

	public void hoverOverProductImage() {

		action.moveToElement(this.element).build().perform();
		/*
		 * action.moveToElement(driver.findElement(By.cssSelector(
		 * "#blocknewproducts > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span"
		 * ))) .click().build().perform();
		 */

	}

	public void clickOnHoverAddToCartButton() {
		action.moveToElement(this.element).click().build().perform();
	}

	public void clickOncontinueShopping() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(this.element));
		action.moveToElement(this.element).click().build().perform();
	}

	public void clickOnCheckout() {
		action.moveToElement(this.element).click().build().perform();
	}

	public void clickOnCart() {
		action.moveToElement(this.element).click().build().perform();
	}

	public void clickOnProceedToCheckout() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(this.element));
		action.moveToElement(this.element).click().build().perform();
	}

	public void clickOnOrderHistory() {
		this.element.click();
	}

}
