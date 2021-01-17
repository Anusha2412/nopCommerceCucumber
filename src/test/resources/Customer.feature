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

    Scenario:
      Given Im on nopCommerce homepage
      When I click on customer menu
      And click on add customer sub menu button
      Then I enter an email address
      And click on search button
      Then I should be able to see the search results matching the email address entered
      And close browser

  Scenario:
    Given Im on nopCommerce homepage
    When I click on customer menu
    And click on add customer sub menu button
    Then I enter FirstName and LastName
    And click on search button
    Then I should be able to see the search results matching the name entered
    And close browser
