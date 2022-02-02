package automation.tests;

import org.testng.annotations.Test;

import automation.pages.PrintedDressPage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class SizeSelectTest extends TestBase {
  @Test
  public void canChooseMediumSize() {
	  PrintedDressPage page = new PrintedDressPage(this.getDriver());
	  page.navigate();
	  
	  page.selectSize("M");
	  	  
	  assertEquals(page.sizeSelected(), "M");
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.setup();
  }

  @AfterMethod
  public void afterMethod() {
	  super.cleanup();
  }

}
