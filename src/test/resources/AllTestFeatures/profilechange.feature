Feature: ProfileChange
   As a first time user I can  create my account and my profile
    I can update my profile Information

  Background: User on HOme Page
    Given User is on MCT home page

  Scenario: User can do  signup/register with valid credentials
    When User navigate to SignUp Page
    Then User create account with user id and email and firstName and lastName
    Then User goto myaccount page
    Then User navigate to profile page
    Then User can Update the profile Information with All required Feild
    Then User go back to MyAccount page

  Scenario: User can change  Profile Information with Address
    When User Login with user and pass
    Then User go to MyAccount Page
    Then User nevigate to profilePage
    Then User change the the address and save that
    Then User logout

  Scenario: User can change  Profile Information with Address
    When User Login with user and pass
    Then User go to MyAccount Page
    Then User navigate to profile page
    Then User  veriry the address changed as "555 122th st"
