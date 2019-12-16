Feature: My Orders
  as a logged in user i  do all order related activities

  Background: User on Order Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    And I goto myaccount page
    And I navigate to order page
@test1
  Scenario: user see correct ordere by valid date
    When I search order by order date "12/27/2017" and search
    Then I exepct to see the "12/27/2017" date order result.

@test2
  Scenario: user will be found message by searching foroward date
    When I search order by date "12/27/2019" and search
    Then I exepct to see "No Results Found !!".

@test3
  Scenario: user will be found message by searching previous date
    When I search order by previous date "12/27/2016" and search
    Then I exepct to see "No Results Found !!".
