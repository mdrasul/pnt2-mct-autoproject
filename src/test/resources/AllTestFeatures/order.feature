Feature: My Orders
  as a logged in user i  do all order related activities

  Background: User on Order Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    And I goto myaccount page
    And I navigate to order page

  @test1
  Scenario: user see correct order number from place orderes
	    And On search option I chose order ID and write order number "45"
			Then I exepct to see order number "45" from order table
			
	@test2		
	Scenario: user see Incorrect order number from place orderes
	    And On search option I chose order ID and write order number "67"
			Then I exepct to see No Results Found !!
			
			
			
			
			
  #Scenario: user can see the order history
    #And I navigate to order page
    #Then I see a table with al lmy orderes