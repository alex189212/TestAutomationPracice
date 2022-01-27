package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.UI.ProductControlExtension;

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
		return driver.findElement(By.xpath("//i[@class='icon-check']/..[@class='title']")).getText();
	}
	
	public ShoppingCartSummaryPage proceedToCheckout() {
		driver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();
		return new ShoppingCartSummaryPage(this.driver);
	}
}