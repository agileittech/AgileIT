package org.cumcumber.basics;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitionforonlinebooking {
@Given("To book flight ticket to {word}")
public void booktickets(String country) {
	System.out.println("To book flight ticket to"+country);
}
@When ("^I searched for ([a-z A-Z]{1,})")
public void search(String data){
	System.out.println("I searched for " +data);
}

@Then("I booked tickets successfully")
public void success() {
	System.out.println("I booked tickets successfully");
}
}
