package automation.UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import automation.framework.UIControlBase;

public class AddressFormControl extends UIControlBase {

	public AddressFormControl(WebDriver driver) {
		super(driver);
	}
	
	public void fillForm(FormData formData) {
		
		WebElement firstNameTextbox = driver.findElement(By.id("firstname"));
		WebElement lastNameTextbox = driver.findElement(By.id("lastname"));
		WebElement address1Textbox = driver.findElement(By.id("address1"));
		WebElement city = driver.findElement(By.id("city"));
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select stateDropdown = new Select(state);
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select countryDropdown = new Select(country);
		
		WebElement zipCode = driver.findElement(By.id("postcode"));
		WebElement mobileno = driver.findElement(By.id("phone"));
		WebElement addressTitle = driver.findElement(By.id("alias"));
		TextBoxExtension boxFiller = new TextBoxExtension(driver, firstNameTextbox);
		
		boxFiller.fill(formData.getFirstName());
		
		boxFiller.setActiveElement(lastNameTextbox);
		boxFiller.fill(formData.getlastName());
		
		boxFiller.setActiveElement(address1Textbox);
		boxFiller.fill(formData.getAddress());
		
		boxFiller.setActiveElement(city);
		boxFiller.fill(formData.getCity());
		
		stateDropdown.selectByVisibleText(formData.getState());
		
		boxFiller.setActiveElement(zipCode);
		boxFiller.fill(formData.getZipCode());
		
		countryDropdown.selectByVisibleText(formData.getCountry());
		
		boxFiller.setActiveElement(mobileno);
		boxFiller.fill(formData.getMobilePhone());
		
		boxFiller.setActiveElement(addressTitle);
		boxFiller.fill(formData.getAddressTitle());
		
	}

}
