Feature: Footer
  	As a user  of MCT Website evrytime i land in 
  	the homepage website i should see 	Footer page in the bottom

  Background: User on HOme Page
    Given User is on MCT home page

  @test1
  Scenario: User can see the homePage
    When User enter the URL
    Then User should Scrool to see MTC Footer Table

  @test2
  Scenario: User able to see all the Elements inside the footer page
    When User inisde the footer
    Then User see all Footer Element Options in below table 
      # |Get to know us, About Us, FAQ, Help, Site Feedback, Terms & Conditions, Contact Us, Shop with us, Combo Products, New Products, Featured Products, Categories, View Cart, Gift Certificate, Make money with us, Affiliates, Sellers, Home, Enter Your Email, Connect With Us|
          |Affiliates\nSellers\nHome|
     