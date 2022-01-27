package automation.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.pages.PrintedDressPage;

public class ViewListingDetailsTest extends TestBase {
  @Test
  public void canViewTitle() {
	  PrintedDressPage page = new PrintedDressPage(super.getDriver());
	  
	  page.navigate();
	  
	  assertTrue(page.isTitleVisible());
  }
  @Test
  public void canViewImage() {
	  PrintedDressPage page = new PrintedDressPage(super.getDriver());

	  page.navigate();

	  assertTrue(page.isImageVisible());
  }
  @Test
  public void canViewPrice() {
	  PrintedDressPage page = new PrintedDressPage(super.getDriver());

	  page.navigate();

	  assertTrue(page.isPriceVisible());
  }
  @Test
  public void canViewReviews() {
	  PrintedDressPage page = new PrintedDressPage(super.getDriver());

	  page.navigate();

	  assertTrue(page.areReviewsVisible());
  }
  @Test
  public void canViewRatings() {
	  PrintedDressPage page = new PrintedDressPage(super.getDriver());

	  page.navigate();

	  assertTrue(page.areRatingsVisible());
  }

  @BeforeMethod
  protected void setup() {
	  super.setup();
  }

  @AfterMethod
  protected void cleanup() {
	  super.cleanup();
  }
}
