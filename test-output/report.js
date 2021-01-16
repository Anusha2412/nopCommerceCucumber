$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As a end User\nI want to add a new customer\nSo that I can check that the add customer menu is working correctly",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3776062759,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Im on nopCommerce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on customer menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on add customer sub menu button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I can view Add a new customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter customer information",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should get a confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.im_on_nopCommerce_homepage()"
});
formatter.result({
  "duration": 4605713849,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.i_click_on_customer_menu()"
});
formatter.result({
  "duration": 221326501,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.click_on_add_customer_sub_menu_button()"
});
formatter.result({
  "duration": 1971560397,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.click_on_Add_new_button()"
});
formatter.result({
  "duration": 1205494525,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.i_can_view_Add_a_new_customer_page()"
});
formatter.result({
  "duration": 19574547,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.i_enter_customer_information()"
});
formatter.result({
  "duration": 765110399,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.click_on_save_button()"
});
formatter.result({
  "duration": 2290693152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 37
    }
  ],
  "location": "AddCustomerSteps.i_should_get_a_confirmation_message(String)"
});
formatter.result({
  "duration": 139913565,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.close_browser()"
});
formatter.result({
  "duration": 112534939,
  "status": "passed"
});
});