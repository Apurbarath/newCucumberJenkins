package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.InitBase;

public class Registration_Page extends InitBase {
	
	private static final String firstName = "firstName";
	private static final String lastName = "lastName";
	private static final String phone = "phone";
	private static final String email = "userName";
	private static final String address = "address1";
	private static final String city = "city";
	private static final String state = "state";
	private static final String postal_code = "postalCode";
	private static final String country = "country";
	private static final String username = "email";
	private static final String password = "password";
	private static final String confirmPassword = "confirmPassword";
	private static final String submit = "register";
	
	@FindBy(name = firstName)
	public WebElement element_firstname;
	
	@FindBy(name = lastName)
	public WebElement element_lastname;
	
	@FindBy(name = phone)
	public WebElement element_phone;
	
	@FindBy(name = email)
	public WebElement element_email;
	
	@FindBy(name = address)
	public WebElement element_address;
	
	@FindBy(name = city)
	public WebElement element_city;
	
	@FindBy(name = state)
	public WebElement element_state;
	
	@FindBy(name = postal_code)
	public WebElement element_postalCode;
	
	@FindBy(name = country)
	public WebElement element_country;
	
	@FindBy(name = username)
	public WebElement element_username;
	
	@FindBy(name = password)
	public WebElement element_password;
	
	@FindBy(name = confirmPassword)
	public WebElement element_confirmPassword;
	
	@FindBy(name = submit)
	public WebElement element_submit;
	
	public Registration_Page()
	{
		PageFactory.initElements(driver, this);
	}
		
	public String getPageTitle()
	{
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void enterFirstName(String first_name)
	{
		element_firstname.sendKeys(first_name);
	}
	
	public void enterLastName(String last_name)
	{
		element_lastname.sendKeys(last_name);
	}
	
	public void enterPhone(String phone_number)
	{
		element_phone.sendKeys(phone_number);
	}
	
	public void enterEmail(String email_address)
	{
		element_email.sendKeys(email_address);
	}
	
	public void enterAddress(String full_address)
	{
		element_address.sendKeys(full_address);
	}
	
	public void enterCity(String city_name)
	{
		element_city.sendKeys(city_name);
	}
	
	public void enterState(String state_name)
	{
		element_state.sendKeys(state_name);
	}
	
	public void enterPostalCode(String postal_code)
	{
		element_postalCode.sendKeys(postal_code);
	}
	
	public void selectCountry(String country_name)
	{
		Select dropdown = new Select(element_country);
			   dropdown.selectByVisibleText(country_name);
	}
	
	public void enterUserName(String user_name)
	{
		element_username.sendKeys(user_name);
	}
	
	public void enterPassword(String password_details)
	{
		element_password.sendKeys(password_details);
	}
	
	public void enterConfirmPassword(String confirm_password)
	{
		element_confirmPassword.sendKeys(confirm_password);
	}
	
	public void clickSubmit()
	{
		element_submit.click();
	}
	

}
