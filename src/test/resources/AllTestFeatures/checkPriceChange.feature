Feature: Cart product Price
  as a logged in user add and subtract item from cart
  so user can see the price price change while shopping

  
Background: User on HOme Page
    Given User is on MCT home page
  When User complete login with id "user" password "pass"
    Then User see  profile name as "James Williams"
    
    Scenario: User can see price change while shopping
    When User add products to cart
    And User see total "price" of prducts
    When User delete a products
    Then User see total "price" of products change