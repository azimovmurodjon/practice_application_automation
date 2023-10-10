Feature: practice application page

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
