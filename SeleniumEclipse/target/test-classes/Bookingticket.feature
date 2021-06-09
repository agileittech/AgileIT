#Author: ABC@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Booking
Feature: Book tickets for holiday
  I want to book tickets for my summer holidays 

Background:
 Given To book flight ticket to 'paris'
 

  @Bookflightonline
  Scenario: Booking flight tickets from online
    When  I searched for booking sites
    And   I searched for some good offers
    Then  I booked tickets successfully
    
   @Bookflightoffline
   Scenario: Booking flight tickets from offline agency
    When  I searched for good offline agency
    And   I found an agency near me
    Then  I booked tickets successfully
  
 @Bookhotel
 Scenario: Booking hotel tickets in paris
 Given  I want to book hotel in paris
   
#scenario optimization - background
#Step optimization - Expressions [Regex]

