package org.cumcumber.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mypackage.Connector;

public class Countinglinks {
	Connector conn;
	List<WebElement> links;
	public Countinglinks(Connector conn) { //initialization of picocontainer
		this.conn = conn;
	}
@Before
public void precondition() {
	
}
@After
public void postcondition() {
	conn.Browser.close();
}
@Given("To Open a {word} Browser")
public void openbrowser(String browser) {
	if(browser.equals("Firefox")) {
		conn.FirefoxBrowser();
		System.out.println("Openend Firefox Browser Successfully");
	}else {
		conn.ChromeBrowser();
		System.out.println("Openend Chrome Browser Successfully");
	}
	
}
@And("Open URL")
public void openurl() {
	conn.openurl();
	String Actualresult = conn.Browser.getTitle();
	assertEquals(Actualresult, "CNN International - Breaking News, US News, World News and Video");
}
@When("I Count Links available in my webpage")
public void countlinks() {
	  links = conn.Browser.findElements(By.tagName("a"));
	  System.out.println(links.size());
	}
@Then("My count equals the count defined")
public void countequals() {
	int Expected = 308;
	assertEquals(links.size(), Expected);
	
}
}
