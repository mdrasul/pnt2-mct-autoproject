Feature: Login
  	As a user  of MCT Website i can do a login 
  	SO i can  do all loggedin activities

  Background: User on HOme Page
    Given User is on MCT home page

  Scenario: User can do a login with valid credentials
    When User complete login with id "user" password "pass"
    Then User see  profile name as "James Williams"

  Scenario: User can do a login with valid id and password
    When User complete login with id "mrabc123" password "abc123"
    Then User see  profile name as "Mr Abc123"
    