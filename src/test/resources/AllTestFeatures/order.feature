Feature: My Orders
  as a logged in user i  do all order related activities

  Background: User on HOme Page
    Given User is on MCT home page
    And as a user i scroll down our products
    

  #Scenario: user can see the order history
    #And I navigate to order page
    #Then I see a table with al lmy orderes

  Scenario: user see correct count of place orderes
	  
			Then I exepct items options in below table 
      | BLACK KAJAL                 |
			| CUTLERY & STATIONARY HOL... |
			| WOMEN MAROON PRINTED ANA... |
			| WOMEN BLACK & GOLD-TONED... |
			| CANDY                       |
			| SKY VANITY BAG              |
			| VANIA SHOULDER VANITY BA... |
			| CREAM LABER BAG             |
			
			
		