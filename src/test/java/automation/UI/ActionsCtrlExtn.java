package automation.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

}
