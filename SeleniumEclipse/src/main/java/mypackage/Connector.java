package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Connector {
	public WebDriver Browser;
	public void FirefoxBrowser() {
		String location = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",location+"\\geckodriver.exe");	
		Browser = new FirefoxDriver();
		
	}
	public void ChromeBrowser() {
		String location = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",location+"\\chromedriver.exe");
		Browser = new ChromeDriver();
		Browser.manage().window().maximize();
	}
	public void openurl() {
		Browser.get("https://www.cnn.com");
	}
}
