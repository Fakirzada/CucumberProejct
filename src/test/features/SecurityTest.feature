Feature: Navigate to sing in page and sign in with valid username and password
  Scenario: Login with valid username and password
    When user click on sign in link
    When user enter username and password and click on login
    Then user should be able to see account link
