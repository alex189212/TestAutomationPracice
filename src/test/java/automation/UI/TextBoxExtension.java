package automation.UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxExtension extends UIControlBase {
	WebElement textBox;
	public TextBoxExtension(WebDriver driver, WebElement element) {
		super(driver);
		textBox = element;
	}
	
	public void fill(String data) {
		//use javascript executor here to change value attribute of textBox
		controlExecutor.executeScript("arguments[0].value= arguments[1]",
				textBox, data);
	}
	
	protected void setActiveElement(WebElement activeElement) {
		textBox = activeElement;
	}

}
