Feature: Check Login Scenario

  Scenario:
    Given User is on login page
    When User enters valid user name and password
    And Clicks on Login Button
    Then user is navigated to the home page
