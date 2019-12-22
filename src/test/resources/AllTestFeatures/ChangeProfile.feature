Feature: User Change Profile
As a logged in user I can Change Profile

Background: User on HOme Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    Then User see  profile name as "Anderson Walsh"
     And I goto myaccount page
    
 Scenario: User Can change Profile 
 When User is in Profile Page
 And User chnage profile first name "James"
 And User change profile last name "Williams"
 Then User see  profile name as "James Williams"

 