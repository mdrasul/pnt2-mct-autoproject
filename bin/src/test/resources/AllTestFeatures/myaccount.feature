Feature: My Account
  as a logged in user i  can do all my account a activities

  Background: User on HOme Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    And I goto myaccount page

  Scenario: User is on my account page
    Then User see my account  label

  Scenario: User see all my account option
    Then User see all my account options in below table
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |
