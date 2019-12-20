
Feature: adding and deleting in cart
  	As a user  of MCT Website i can add 
  	or delete products from cart


Background: Singing in & going to Home Page Shop now
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    

  Scenario: User can shop from home page
    When User click shop now 
    Then User see product category and able to add product to cart

    
  Scenario: User can continue to shop
    When User click shop now 
    Given User can see and select category
    When user landed on specefic category page and select product
    Then User can see second product added and able to delete 
    And User can see product added to cart
 
