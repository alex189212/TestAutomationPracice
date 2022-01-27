package automation.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductControlExtension extends UIControlBase {

	public ProductControlExtension(WebDriver driver) {
		super(driver);
	}
	
	public void addToCart() {
		driver.findElement(By.cssSelector(".exclusive")).click();
		//verify added to cart in page class
	}
	
	public void addToWishlist() {
		//driver.findElement(By.cssSelector(addtoWishlistLink)).click();
		//driver.findElement(By.cssSelector(addedtoWishListSuccessText));
	}
}
