package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countinglinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String location = System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver",location+"\\chromedriver.exe");
		  ChromeDriver cd = new ChromeDriver();
		  cd.get("https://money.rediff.com/index.html");
		  List<WebElement> links = cd.findElements(By.tagName("a"));
		  System.out.println(links.size());
	}

}
