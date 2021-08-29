package stepDefinations;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import base.InitBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignIn_Page;

public class SignInStepDefination extends InitBase{
	public SignIn_Page signInPage;
	public String url = "SignOn";
	public SignInStepDefination()
	{
		super();
		openBrowser(url);
		signInPage = new SignIn_Page();
	}	
	
	@Given("^user is on signon page$")
	public void user_is_on_signon_page(){
		
		String actual = signInPage.getPageTitle();
		String expected = "Sign-on: Mercury Tours";
		Assert.assertEquals(actual,expected);
		System.out.println("user is on signon page");
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String urlText){
	    if(urlText.equals("signOn"))
	    {
	    	signInPage.clickOnSignOnLink();
	    }
	    else if(urlText.equals("register"))
	    {
	    	signInPage.clickOnRegisterLink();
	    }
	    else if(urlText.equals("support"))
	    {
	    	signInPage.clickOnSupportLink();
	    }
	    else if(urlText.equals("contact"))
	    {
	    	signInPage.clickOnContactLink();
	    }
	}

	@Then("^user should validate the url for \"([^\"]*)\"$")
	public void user_should_validate_the_url_for(String url){
	
		boolean actual ;
		boolean expected = true;
		String retrievedUrl ="";
		if(url.equals("signOn"))
		{
			retrievedUrl = signInPage.getCurrentUrl();
			actual = retrievedUrl.contains("http://newtours.demoaut.com/mercurysignon.php");
			Assert.assertEquals(actual,expected);
		}
		else if(url.equals("register"))
		{
			retrievedUrl = signInPage.getCurrentUrl();
			actual = retrievedUrl.contains("http://newtours.demoaut.com/mercuryregister.php");
			Assert.assertEquals(actual,expected);
		}
		else if(url.equals("support"))
		{
			retrievedUrl = signInPage.getCurrentUrl();
			actual = retrievedUrl.contains("http://newtours.demoaut.com/mercuryunderconst.php");
			Assert.assertEquals(actual,expected);
		}
		else if(url.equals("contact"))
		{
			retrievedUrl = signInPage.getCurrentUrl();
			actual = retrievedUrl.contains("http://newtours.demoaut.com/mercuryunderconst.php");
			Assert.assertEquals(actual,expected);
		}
	}

	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username){
		signInPage.enterUserName(username);
		System.out.println("succesfully entered the username");
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password){
		signInPage.enterPassword(password);
		System.out.println("succesfully entered the password");
	}
	
	@Then("^user should see four web links$")
	public void user_should_see_four_web_links(){
		List<Boolean> list = new ArrayList<Boolean>();
			list.add(signInPage.isSignOnLinkPresent());
			list.add(signInPage.isRegesterLinkPresent());
			list.add(signInPage.isContactLinkPresent());
			list.add(signInPage.isSupportLinkPresent());
			
		List<Boolean> trueList = new ArrayList<Boolean>();
			trueList.add(true);
			trueList.add(true);
			trueList.add(true);
			trueList.add(true);
			
			Assert.assertEquals(list, trueList);
			System.out.println("user is able to see all four links");
			
	}

	@When("^user clicks on submit$")
	public void user_clicks_on_submit(){
		signInPage.clickSubmit();
	}

}
