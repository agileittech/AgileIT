#Author: your.email@your.domain.com
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
@ReqId1
Feature: Click on a link 
  I want to click on a link of a webpage

  @Countlinks1
  Scenario: Click on a link using browser 
    Given To Open a Firefox Browser
    And Open URL 
    When I click on a link available in my webpage 
    Then I should open the clicked link
    #But  Ensure that the count defined changes frequently

