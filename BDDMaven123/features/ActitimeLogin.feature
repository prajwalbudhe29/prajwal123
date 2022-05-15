
Feature: Actitime Login functionality
  I want to use this template for my feature file

  
  Scenario: Validate actitimelogin fuctionality using valid username and password
    Given User is already in actitime login page 
    When enter username 
    And enter password
    And click on login button
    Then verify actitime home page opened or not 
    


  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
