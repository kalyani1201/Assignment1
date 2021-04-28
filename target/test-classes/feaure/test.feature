
@tag
Feature: Assignment1
  I want to use this template for my feature file


  @tag1
  Scenario: Signup
    Given userNavigatesto URL
    Then  click on Signup
   And enter data
    And click on create button
    Then User should be created  

    Then SendMessage  