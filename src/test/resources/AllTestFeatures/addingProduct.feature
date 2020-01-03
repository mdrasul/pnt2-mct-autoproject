Feature: Adding Product
  As a user of MCT website, I want to be able to add a product.

  Background: 
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    And User see  profile name as "James Williams"
    When I goto myaccount page

  Scenario: User is on seller dashboard page
    When User see all my account options in below table
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |
    Then User go to Seller Dashboard page

  Scenario: User sees add product option
    Given User is on the Seller Dashboard page
    When User go to my products
    Then User see option to add a product label

  Scenario: User can add product
    Given User is on the Seller Dashboard page
    And User is on the my products page
    And User is on the adding product page
    When User fill out required information
    Then product is added
