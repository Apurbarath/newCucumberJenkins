package stepDefinations;

import org.testng.Assert;

import base.InitBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Registration_Page;
import pages.SignIn_Page;

public class RegistrationStepDefination extends InitBase{
	
	public Registration_Page registerPage;
	public String url = "Register";
	public RegistrationStepDefination()
	{
		super();
		openBrowser(url);
		registerPage = new Registration_Page();
	}	
	
	@Given("^user is on register page$")
	public void user_is_on_register_page(){
		String actual = registerPage.getPageTitle();
		String expected = "Register: Mercury Tours";
		Assert.assertEquals(actual,expected);
		System.out.println("user is on register page");
	}

	@When("^user enters firstname as \"([^\"]*)\"$")
	public void user_enters_firstname_as(String firstName){
		registerPage.enterFirstName(firstName);
	}

	@When("^user enters lastname as \"([^\"]*)\"$")
	public void user_enters_lastname_as(String lastName){
		registerPage.enterLastName(lastName);
	}

	@When("^user enters phone number as \"([^\"]*)\"$")
	public void user_enters_phone_number_as(String phoneNumber){
		registerPage.enterPhone(phoneNumber);
	}

	@When("^user enters email as \"([^\"]*)\"$")
	public void user_enters_email_as(String email){
		registerPage.enterEmail(email);
	}

	@When("^user enters address as \"([^\"]*)\"$")
	public void user_enters_address_as(String address){
		registerPage.enterAddress(address);
	}

	@When("^user enters city as \"([^\"]*)\"$")
	public void user_enters_city_as(String city){
		registerPage.enterCity(city);
	}

	@When("^user enters state as \"([^\"]*)\"$")
	public void user_enters_state_as(String state){
		registerPage.enterState(state);
	}

	@When("^user enters postal code as \"([^\"]*)\"$")
	public void user_enters_postal_code_as(String postalCode){
		registerPage.enterPostalCode(postalCode);
	}

	@When("^user selects country as \"([^\"]*)\"$")
	public void user_selects_country_as(String country){
		registerPage.selectCountry(country);
	}

	@When("^user enters username \"([^\"]*)\"$")
	public void user_enters_username(String username){
		registerPage.enterUserName(username);
	}

	@When("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String password){
		registerPage.enterPassword(password);
	}

	@When("^user enters confirm password \"([^\"]*)\"$")
	public void user_enters_confirm_password_as(String confirmPassword){
		registerPage.enterConfirmPassword(confirmPassword);
	}
	
}
