Feature: My Account
  as a logged in user i  can do all my account a activities

  Background: User on HOme Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    And I goto myaccount page

 # Scenario: User is on my account page
  #  Then User see my account  label

 # Scenario: User see all my account option
  #  Then User see all my account options in below table
  #    | My Orders            |
  #    | Profile              |
   #   | My Return Requests   |
  #    | Change Password      |
  #    | My Favorite Products |
  #    | My Favorite Sellers  |
  #    | Seller Dashboard     |

    @test1
        Scenario: I am on My Account page
	    When I click My Order Page
			Then I saw My Order Page
		@test2
			Scenario: I am on My Account page
	    When I click Profile Page
			Then I saw My Profile Page
			@test3
			Scenario: I am on My Account page
	    When I click My Return Requests Page
			Then I saw My Return Request Page
			@test4
			Scenario: I am on My Account page
	    When I click Change Password Page
			Then I saw Change Password Page
			@test5
			Scenario: I am on My Account page
	    When I click My Favorite Products Page
			Then I saw My Favorite Products Page
			@test6
			Scenario: I am on My Account page
	    When I click My Favorite Sellers Page
			Then I saw My Favorite Sellers Page
			@test7
			Scenario: I am on My Account page
	    When I click Seller Dashboard Page
			Then I saw Seller Dashboard Page
			
			