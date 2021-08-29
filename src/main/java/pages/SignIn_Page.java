package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.InitBase;

public class SignIn_Page extends InitBase{
	
	public static final String userName = "userName";
	public static final String passWord = "password";
	public static final String submit = "login";
	public static final String signonLink = "SIGN-ON";
	public static final String registerLink = "REGISTER";
	public static final String supportLink = "SUPPORT";
	public static final String contactLink = "CONTACT";
	
	
	@FindBy(name = userName)
	public WebElement element_username;
	
	@FindBy(name = passWord)
	public WebElement element_password;
	
	@FindBy(name = submit)
	public WebElement element_submit ;
	
	@FindBy(linkText = signonLink)
	public WebElement element_signonLink ;
	
	@FindBy(linkText = registerLink)
	public WebElement element_registerLink ;
	
	@FindBy(linkText = supportLink)
	public WebElement element_supportLink ;
	
	@FindBy(linkText = contactLink)
	public WebElement element_contactLink ;
	
	
	public SignIn_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle()
	{	
		String pageTitle = driver.getTitle();
		return pageTitle;	
	}
	
	public String getCurrentUrl()
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public void enterUserName(String uname)
	{
		sendText(element_username, uname);
	}
	
	public void enterPassword(String pword)
	{
		element_password.sendKeys(pword);
	}
	
	public void clickSubmit()
	{
		element_submit.click();
	}
	
	public boolean isSignOnLinkPresent()
	{
		boolean check = element_signonLink.isDisplayed();
		return check;
	}
	
	public boolean isRegesterLinkPresent()
	{
		boolean check = element_registerLink.isDisplayed();
		return check;
	}
	
	public boolean isSupportLinkPresent()
	{
		boolean check = element_supportLink.isDisplayed();
		return check;
	}
	
	public boolean isContactLinkPresent()
	{
		boolean check = element_contactLink.isDisplayed();
		return check;
	}
	public void clickOnSignOnLink()
	{
		element_signonLink.click();
	}
	
	public void clickOnRegisterLink()
	{
		element_registerLink.click();
	}
	
	public void clickOnSupportLink()
	{
		element_supportLink.click();
	}
	
	public void clickOnContactLink()
	{
		element_contactLink.click();
	}
}
