package org.test.ng.mypackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Mydemo {
  @Test(priority = 0)
  public void mytestcase() {
	  Assert.assertEquals("A", "actuals"); //hard assertion
	  System.out.println("This is my first testcase");
  }
  @Test(priority = 1,dependsOnMethods = "mytestcase")
  public void myothertestcase() {
	  SoftAssert s = new SoftAssert();
	  s.assertEquals("actual", "expected");//fail
	  s.assertAll(); 
	  System.out.println("This is my othertestcase");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is my beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is my aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is my beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is my afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is my precondition");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is my postcondition");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is my beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is my aftersuite");
  }

}
