package automation.pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import automation.UI.ProductControlExtension;
import automation.framework.PageObjectBase;

public class ProductPage extends PageObjectBase {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	/*
	public String addToCartandWishlist() {
		ProductControlExtension productToAdd = new ProductControlExtension(driver);
		productToAdd.addToCart();
		productToAdd.addToWishlist();
	}
	*/
	
	public String addToCart() {
		ProductControlExtension productToAdd = new ProductControlExtension(driver);
		productToAdd.addToCart();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(this.driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		WebElement productAddedText = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//i[@class='icon-check']"));
			}
		});
		return productAddedText.getText();
	}
	
	public ShoppingCartSummaryPage proceedToCheckout() {
		/*WebDriverWait wait = new WebDriverWait(this.driver, 30);
		WebElement checkoutButton = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By
						.cssSelector("button[title='Proceed to checkout']"))));
		checkoutButton.click();
		*/
		driver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();
		return new ShoppingCartSummaryPage(this.driver);
	}
}