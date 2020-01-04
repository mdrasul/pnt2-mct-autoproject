Feature: Adding Coupon
  I want to add a coupon on Coupon Codes section.

  Background: User on HOme Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    And I goto myaccount page
    Given I go to seller dashboard page
     And I go to Coupon Codes section

  Scenario: User sees add coupon option.
   
    Then I see add new coupon code label

  Scenario: User can add coupon code.
    Given I am on the adding coupon page
    Then I fill out the details
    Then I add the coupon code.
