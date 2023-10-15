Feature: Home Page Validation

  Background: Open the practice application home page
    Given I open the practice application home page

  Scenario: Verify the practice application page
    Given I navigate to client server point link and click
    When I enter "Khabibjan" to first name field
    And I enter "Nurmugammedov" to last name field
    And I enter "31" to age field
    Then I select "United States of America" from country field
    And  I add "This is the testing" to note field
    When I click submit button
    Then I close the browser

  Scenario: Navigate to Basic Web Page Example
    Given I navigate to Basic Web Page Example

  Scenario: Navigate to Element Attributes Examples
    Given I navigate to Element Attributes Examples

  Scenario: Navigate to Locators - Find By Playground Test Page
    Given I navigate to Locators - Find By Playground Test Page

  Scenario: Navigate to WebDriver Example Page
    Given I navigate to WebDriver Example Page

  @HTML_Tag_Examples
  Scenario: Navigate to Table Test Page
    Given I navigate to Table Test Page

  Scenario: Navigate to Dynamic Table Test Page
    Given I navigate to Dynamic Table Test Page

  @Alerts
  Scenario: Navigate to Alerts (JavaScript)
    Given I navigate to Alerts (JavaScript)

  Scenario: Navigate to Fake Alerts
    Given I navigate to Fake Alerts