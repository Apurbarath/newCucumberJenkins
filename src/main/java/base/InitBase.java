package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public InitBase()
	{
		File file = new File("C:\\APURBA\\ApurvQA\\QAWorkSpace\\ApurvCucumberProject\\src\\main\\java\\config\\config.properties");
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void openBrowser(String url)
	{
		String browserName = prop.getProperty("browserName");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\APURBA\\ApurvQA\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(url.equals("SignOn"))
			driver.get(prop.getProperty("SignOnurl"));
		else if(url.equals("Register"))
			driver.get(prop.getProperty("RegistrationUrl"));
	}
	
	public void deleteAllCookies()
	{
		driver.manage().deleteAllCookies();
	}
	
	public void alertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getAlertText() {
		String alertTextMessage = driver.switchTo().alert().getText();
		return alertTextMessage;
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public void closeCurrentBrowser() {
		driver.close();
	}
	
	public void closeAllBrowser() {
		driver.quit();
	}
	
	public void forwardBrowser() {
		driver.navigate().forward();
	}
	
	public void backBrowser() {
		driver.navigate().back();
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void sendText(WebElement element , String text) {
		element.sendKeys(text);
	}
	
	public void clearAndType(WebElement element , String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public boolean isDisplayed(WebElement element) {
		boolean check = element.isDisplayed();
		return check;
	}
	
	

}
