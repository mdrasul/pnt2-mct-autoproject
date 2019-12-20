Feature: Currency Symbol
  	As a user  of MCT Website I select different currencies from the dropdown 
  	So I can access multiple currency symbols

  Background: User on HOme Page
    Given User is on MCT home page

  Scenario: User views currency of United States Dollar 
    When User is on MCT home page
    Then User accesses United States Dollar in the dropdown
    Then User sees a currency symbol of a $ under 'Our Products'

  Scenario: User views currency of Indian Rupee
    When User selects Indian Rupee from dropdown on MCT home page
    And User sees a currency symbol of ₹ under 'Our Products'
    
  Scenario: User views currency of Japanese Yen
    When User selects Japanese Yen from dropdown on MCT home page
    And User sees a currency symbol of ¥ under 'Our Products'
    
    p
    
    