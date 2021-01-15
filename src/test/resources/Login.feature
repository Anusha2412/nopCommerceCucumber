
Feature: Login
  As an end user
  I want to enter different Login credentials
  So that I can see all the possible entries

  Scenario Outline:
    Given User is on sign in page
    When User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User should login into homepage
    When User click log out link
    Then User should log out of the home page
    And close browser
    Examples:
    |        email             |  password |
    |  admin@yourstore.com     |  admin    |

