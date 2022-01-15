package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import automation.UI.ActionsCtrlExtn;
import automation.UI.HomePageCtrlExtn;

public class HomePage extends PageObjectBase {

	private String url = "http://automationpractice.com/index.php";

	@FindBy(how = How.XPATH, using = "//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]")
	private WebElement productImage;

	@FindBy(how = How.LINK_TEXT, using = "Faded Short Sleeve T-shirts")
	private WebElement productTilte;

	public HomePage(WebDriver driver) {

		super(driver);

	}

	public HomePage navigation() {

		driver.get(url);
		return this;
	}

	public void clickImage() {

		new ActionsCtrlExtn(this.productImage, this.driver).clickOnImage();

	}

	public void clickTitle() {

		new HomePageCtrlExtn(this.productTilte).clickOnTitle();
		;

	}
}
