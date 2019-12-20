Feature: My Categories
  as a logged in user i can navigate through all categories

  Background: User on Home Page
    Given User is on MCT home page
     When User complete login with id "user" password "pass"
    Then User see  profile name as "James Williams"


  @test1
  Scenario: user can see all the categories
    Then I see all categories on the header page below table
      |ACCESSORIES CLOTHING COFEE MAKERS DIGITAL MORE..|
       

  @test2
  Scenario: user see Accessories
    When I navigate to Accessories
    And I exepcte to see "HEADSET WITH MIC"

  @test3
  Scenario: user see Clothing
    When I navigate to Clothing
    And I exepcte to see "PETERS CASUAL"

  @test4
  Scenario: user see Cofee Makers
    When I navigate to COFEE MAKERS
    And I exepcte to see "CUPS COFFEE MAKER"

  @test5
  Scenario: user see Digital
    When I navigate to DIGITAL
   And I exepcte to see "MEDIA"

  @test6
  Scenario: user see More
    When I navigate to MORE..
    And I exepcte to see "HOME DECOR> (6)"
