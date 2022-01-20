package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends PageObjectBase {
	private final String homepageURL = "http://automationpractice.com";
	
	@FindBy (how=How.CSS, using=".login")
	WebElement signinButton;
	@FindBy (how=How.CSS, using="a[title='Faded Short Sleeve T-Shirts']")
	WebElement fadedTshirtsElement;
	
	Actions homepageActions = new Actions(driver);
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage navigate() {
		this.driver.navigate().to(homepageURL);
		return this;
	}
	
	public void accessAccount() {
		if (signinButton.getText() == "Sign in") {
			login();
		}
		else
		{
			signinButton.click();
		}
	}

	public void login() {
		if (signinButton.getText() == "Sign in") {
			signinButton.click();
		}
		else
		{
			accessAccount();
		}
	}
	
	public String addToCartandWishlist() {
		String result = "";
		return result;
	}
	
	public void clickImage() {

		new ActionsCtrlExtn(this.productImage, this.driver).clickOnImage();

	}

	public void clickTitle() {

		new HomePageCtrlExtn(this.productTilte).clickOnTitle();

	}
}
