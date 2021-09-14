package stepDefinations;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.InitBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignIn_Page;

public class Apurba extends InitBase{
	
	public Apurba() throws MalformedURLException {
		super();
		setChromePreference();
		openBrowser("http://demo.guru99.com/test/yahoo.html");
	}
	
	
	
	@Given("^apurba is on home page$")
	public void apurbaIsOnHomePage(){
		System.out.println("User is on homepasge");
	
	}

	@When("^apurba downloaded a file$")
	public void apurbaDownloadedAFile() throws InterruptedException{
	driver.findElement(By.id("messenger-download")).click();
	Thread.sleep(10000);
	}
	    

	@Then("^apurba validated the file$")
	public void apurbaValidatedTheFile(){
	 System.out.println("validating the file");
	 String currentDir = System.getProperty("user.dir");
	 String expected_dir = currentDir+"\\src\\test\\resources\\download";
	 
	 System.out.println("exp directory is : "+expected_dir);
	 File folder = new File(expected_dir);
	 for (final File fileEntry : folder.listFiles()) {
	       
	            System.out.println("file name is "+fileEntry.getName());
	        
	    }
	 
	 //driver.close();
		
	}

	
}
