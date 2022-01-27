Feature: Forgot Password
  I want to reset my password

  Scenario: Reset password in the store
    Given I am on the Forgot Password Page
    When I submit my email
    Then my password is reset
    