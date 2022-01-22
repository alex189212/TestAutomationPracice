package automation.tests;

import org.testng.annotations.Test;

import automation.pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ContactUsTests extends TestBase {
	@Test
	public void canTestContactUs() {

		new HomePage(this.getDriver()).navigate().clickContactUs().selectSubjectheading()
				.enterEmailAddress("abc@xyz.com").enterOrderreference("59087").enterMessage("kgadkfgadkcva")
				.clickSendButton();

		Assert.assertEquals("Your message has been successfully sent to our team.",
				this.getDriver().findElement(By.cssSelector("p[class='alert alert-success']")).getText());

	}

	@BeforeMethod
	public void setUp() {
		super.setup();
	}

	@AfterMethod
	public void tearDown() {

		super.cleanup();
	}

}
