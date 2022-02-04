package automation.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import automation.framework.UIControlBase;

public class ForgotPasswordControlExtension extends UIControlBase {

	public ForgotPasswordControlExtension(WebDriver driver) {
		super(driver);
	}
	
	public void click(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element);
		action.perform();
	}

	public void submitText(String string, WebElement emailTextElement) {
		controlExecutor.executeScript("arguments[0].value=arguments[1];", emailTextElement,string);
	}


}
