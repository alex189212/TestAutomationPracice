package automation.UI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectCtrlExtn {

	private WebElement element;
	private Select select;

	public SelectCtrlExtn(WebElement element) {
		this.element = element;
		this.select = new Select(this.element);

	}

	public void selectCountry(String text) {
		select.selectByVisibleText(text);
	}

	public void selectDay(String text) {
		select.selectByValue(text);
	}

	public void selectMonth(String text) {
		select.selectByValue(text);
	}

	public void selectYear(String text) {
		select.selectByValue(text);
	}

	public void selectState(String text) {
		select.selectByVisibleText(text);
	}
}
