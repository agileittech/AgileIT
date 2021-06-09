package org.test.ng.mypackage;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class seleniumtestng {
	public WebDriver cd ;
	List<WebElement> links ;
  @Test(priority =1)
  public void openurl() {
	  cd.get("https://edition.cnn.com/");
	  cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  String Expectedresult = "CNN International - Breaking News, US News, World News and Video";
	  String Actualresult = cd.getTitle();
	  Assert.assertEquals(Expectedresult, Actualresult);
  }
  @Test(priority =2,dependsOnMethods = "openurl")
  public void countlinks() {
	  links = cd.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  int Actualresult = links.size();
	  int Expectedresult = 318;
	  Assert.assertEquals(Actualresult, Expectedresult);
	  
  }
  @BeforeTest
  public void precondition() {
	  String location = System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver",location+"\\chromedriver.exe");
	  cd = new ChromeDriver();
	   }
  
  @AfterTest
  public void afterTest() {
	  cd.close();
  }

}
