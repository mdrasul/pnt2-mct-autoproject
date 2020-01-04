Feature: Login
  	As a user  of MCT Website i can do a login 
  	SO i can  do all loggedin activities

  Background: User on HOme Page
    Given User is on MCT home page

  Scenario: Positive Login Test
  When User clicks on Login link
  And User enters username
  And User enters password
  And User clicks login
  Then User validates profile name
  Then User can click on profile name
  Then User can logout

  Scenario: Negative Login Test
  When User clicks on Login link
  And User enters invalid username
  And User enters invalid password
  And User clicks login
  Then User validates Invalid Login Link