package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
	
	public void setChromePreference() {
		String currentDir = System.getProperty("user.dir");
		String expected_dir = currentDir+"\\src\\test\\resources\\download";
		String driver_path = currentDir+"\\src\\main\\resources\\Drivers\\chromedriver.exe";
		
		File file = new File(expected_dir);
		if(file.exists()) {
			//deleteAllFiles(file);
		}
		
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String,Object> chromePref = new HashMap<>();
		chromePref.put("download.default_directory", expected_dir);
		chromePref.put("download.prompt_for_download", "true");
		chromePref.put("profile.default_content_settings.popups", 0);
		chromePref.put("safebrowsing.enabled", "false");
		
		options.setExperimentalOption("prefs", chromePref);
	    System.setProperty("webdriver.chrome.driver", driver_path);
	    driver = new ChromeDriver(options);
		
	}
	
	public static void deleteAllFiles(File file) {
		for(File subfile : file.listFiles()) {
			if(subfile.isDirectory()) {
				deleteAllFiles(subfile);
			}
			subfile.delete();
		}
	}
	
	public static void openBrowser(String url)
	{
		driver.get(url);
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
