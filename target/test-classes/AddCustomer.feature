Feature:
  As a end User
  I want to add a new customer
  So that I can check that the add customer menu is working correctly

  Scenario:
    Given Im on nopCommerce homepage
    When I click on customer menu
    And click on add customer sub menu button
    And click on Add new button
    Then I can view Add a new customer page
    When I enter customer information
    And click on save button
    Then I should get a confirmation message "The new customer has been added successfully."
    And Close browser