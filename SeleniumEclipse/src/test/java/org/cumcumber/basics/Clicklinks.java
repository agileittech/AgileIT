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

public class Clicklinks  {
	Connector conn;
	
	List<WebElement> links;
	public Clicklinks(Connector conn) {
	  this.conn = conn;
	}
    
@When("I click on a link available in my webpage")
public void countlinks() {
	  links = conn.Browser.findElements(By.tagName("a"));
	  links.get(3).click();
	 
	}
@Then("I should open the clicked link")
public void countequals() {
	System.out.println("Linkopenend");	
}
}
