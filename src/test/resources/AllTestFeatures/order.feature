Feature: My Orders
  as a logged in user i  do all order related activities

  Background: User on HOme Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    And I goto myaccount page

  #Scenario: user can see the order history
    #And I navigate to order page
    #Then I see a table with al lmy orderes

  Scenario: user see correct count of place orderes
	    And I navigate to order page
			Then I exepct count 10 in my order table