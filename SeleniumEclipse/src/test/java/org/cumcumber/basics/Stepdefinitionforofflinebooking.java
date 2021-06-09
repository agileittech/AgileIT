package org.cumcumber.basics;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitionforofflinebooking {

@And("I found an agency near me")
public void agency() {
	System.out.println("I found an agency near me");
}
}
