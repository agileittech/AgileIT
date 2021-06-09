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
Feature: Counting no of links 
  I want to count no of links for any webpage

  @Countlinks1
  Scenario Outline: Counting links on any webpage using browser 
    Given To Open a <browsertype> Browser
    And Open URL 
    When I Count Links available in my webpage 
    Then My count equals the count defined
    #But  Ensure that the count defined changes frequently
    
Examples: 
      | browsertype  | 
      | Firefox      |   
      | chrome       | 



#Hooks or background
