@regression @loginAmazon
Feature: Verify user should not be able to login with invalid credentials

  Background:
    Given I am on Amazon home page

  @loginAmazon-1
  Scenario: Verify login error message
    When I hover over to Accounts & List
    And I click on signIn button
    And I enter MrYou@yahoo.com into email text box
    And I enter whatever into password text box
    And I click on submit button
    Then I verify error or warning message

