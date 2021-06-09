package org.cumcumber.basics;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Hotel {
@When("I want to book hotel in paris")
public void bookhotel() {
	System.out.println("I want to book hotel in paris");
}
}
