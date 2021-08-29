package stepDefinations;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Simple{
	
	@Given("^user is on correct website$")
	public void user_is_on_correct_website(){
		System.out.println("user is on correct website");
	
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		System.out.println("user clicks on login button");
	}

	@Then("^user should see the home page$")
	public void user_should_see_the_home_page(){
		System.out.println("user should see the home page");
	}
	
	@Given("^user is on belgium dashboard$")
	public void user_is_on_belgium_dashboard() throws Throwable {
	   System.out.println("User is in belgium dashboard");
		 File file = new File("C:\\APURBA\\ApurvQA\\MyWorkspace\\ApurbaCucumberGitJenkins\\src\\test\\resources\\MyProject.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("The url is "+prop.getProperty("prop1"));
			System.out.println(System.getProperty("env"));  //mvn clean install -Denv=devenv
			if((System.getProperty("env")).equalsIgnoreCase(prop.getProperty("dev_url"))) {
				System.out.println("Dev env is Here");
			}
			if((System.getProperty("env")).equalsIgnoreCase(prop.getProperty("st_url"))) {
				System.out.println("ST env is Here");
			}
	}

	@When("^user clicks on belgium login button$")
	public void user_clicks_on_belgium_login_button() throws Throwable {
		 System.out.println("User is in belgium login");
	}

	@Then("^user should see the belgium home page$")
	public void user_should_see_the_belgium_home_page() throws Throwable {
		 System.out.println("User is in belgium home");
	}
	
	

	@Given("^user is login page$")
	public void user_is_login_page() throws Throwable {
	   System.out.println("User is on the login page");
	}
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		System.out.println("User enters username and password successfully !");
	}
	
	@Then("^user is able to see the homepage$")
	public void user_is_able_to_see_the_homepage() throws Throwable {
		System.out.println("Now user can see the homepage");
	}


}
