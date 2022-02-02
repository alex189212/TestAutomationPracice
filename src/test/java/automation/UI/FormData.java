package automation.UI;

public class FormData {
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String mobilePhone;
	private String addressTitle;
	
	public FormData(String[] formArguments) {
		firstName = formArguments[0];
		lastName = formArguments[1];
		address = formArguments[2];
		city = formArguments[3];
		state = formArguments[4];
		zipCode = formArguments[5];
		country = formArguments[6];
		mobilePhone = formArguments[7];
		addressTitle = formArguments[8];
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getMobilePhone() {
		return mobilePhone;
	}
	
	public String getAddressTitle() {
		return addressTitle;
	}
	
	public void setFirstName(String name) {
		firstName = name;
	}
	
	public void setlastName(String name) {
		lastName = name;
	}
	
	public void setAddress(String addr) {
		address = addr;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setMobilePhone(String mobile) {
		this.mobilePhone = mobile;
	}
	
	public void setAddressTitle(String addressTitle) {
		this.addressTitle = addressTitle;
	}
}
