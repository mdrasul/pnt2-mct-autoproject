Feature: Search
  	As a user  of MCT Website I can use the search bar as intended.

  Background: User on HOme Page
    Given User is on MCT home page

  Scenario: User can return a positive search case scenario
    When User clicks on searchbox
    Then User enters keys
    Then User clicks search button
