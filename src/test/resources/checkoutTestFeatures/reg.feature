#Author: Pranob Tusher Kaysthagir (pkaysthagir@yahoo.co.uk)
#Keywords Summary : User registration to successfully product placement.  
Feature: Registration to MCT
  	As a new user of MCT Website i can do a registration 
  	SO i can do all loggedin activities

  Background: User on Home Page
    Given User is on MCT home page
    Then goto registration page

  Scenario: Some Scenario Test
  	Given User complete registration with email "email" id "user" first name "pranob" last name "tusher" address "38 arkansas"
  	And User see  profile name as "pranob tusher"
  	When User click to Product Name
  	And User click on buy now button
  	Then User click on Check Out button
  	When User complete billing address
  	Then User click on Proceed button
  	And User click on payment method
  	Then User complete the card details
  	And User click confirm order
  	Then User successfully complete the order
  
  
  
  
