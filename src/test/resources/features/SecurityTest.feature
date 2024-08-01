Feature: Security Test scenario
  Scenario: validate sign in functionality with valid credential
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "saeed@gmail.com" and "Saeed@12345" and click on login
    Then user should be able to see account link
