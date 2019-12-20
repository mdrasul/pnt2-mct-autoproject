Feature: MCT LogoValidation on Home Page
	As a user I can click on MCT Logo
	and the click will return user to Home Page
	
	
  Background: User on HOme Page
    Given User is on MCT home page
    When User complete login with id "user" password "pass"
    Then User see  profile name as "James Williams"
     
	
   
   
  Scenario: Logged in user can goto Home Page clicking on MCTLogo
  And I goto myaccount page
  When User click on the MCT Logo, or anywhere surounding logo area
  Then User finds Home Page is refresed
  
  Scenario: Logged in user can goto Home Page clicking on MCTLogo
  And I goto myaccount page
	And I navigate to order page
  When User click on the MCT Logo, or anywhere surounding logo area
  Then User finds Home Page is refresed
  

  Scenario: Logged in user can goto Home Page clicking on MCTLogo
  And I goto myaccount page
	And I navigate to Profile page
  When User click on the MCT Logo, or anywhere surounding logo area
  Then User finds Home Page is refresed
  
     Scenario: Logged in user can goto Home Page clicking on MCTLogo
	And I navigate to an order from Home Page
  When User click on the MCT Logo, or anywhere surounding logo area
  Then User finds Home Page is refresed
  
  Scenario: Logged in user can goto Home Page clicking on MCTLogo
	And I navigate to Accessories Page
  When User click on the MCT Logo, or anywhere surounding logo area
  Then User finds Home Page is refresed