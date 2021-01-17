$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Customer.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As a end User\nI want to add a new customer\nSo that I can check that the add customer menu is working correctly",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4780600938,
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
  "location": "CustomerSteps.im_on_nopCommerce_homepage()"
});
formatter.result({
  "duration": 4081049338,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_click_on_customer_menu()"
});
formatter.result({
  "duration": 224108596,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_add_customer_sub_menu_button()"
});
formatter.result({
  "duration": 2418267047,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_Add_new_button()"
});
formatter.result({
  "duration": 3727507493,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_can_view_Add_a_new_customer_page()"
});
formatter.result({
  "duration": 18610531,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_enter_customer_information()"
});
formatter.result({
  "duration": 716896218,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_save_button()"
});
formatter.result({
  "duration": 2076087193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 37
    }
  ],
  "location": "CustomerSteps.i_should_get_a_confirmation_message(String)"
});
formatter.result({
  "duration": 136537260,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.close_browser()"
});
formatter.result({
  "duration": 122991641,
  "status": "passed"
});
formatter.before({
  "duration": 2939965804,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Im on nopCommerce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on customer menu",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click on add customer sub menu button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter an email address",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should be able to see the search results matching the email address entered",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerSteps.im_on_nopCommerce_homepage()"
});
formatter.result({
  "duration": 4155721003,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_click_on_customer_menu()"
});
formatter.result({
  "duration": 186034822,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_add_customer_sub_menu_button()"
});
formatter.result({
  "duration": 1878031943,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_enter_an_email_address()"
});
formatter.result({
  "duration": 202774657,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_search_button()"
});
formatter.result({
  "duration": 90076663,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_should_be_able_to_see_the_search_results_matching_the_email_address_entered()"
});
formatter.result({
  "duration": 355206593,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.close_browser()"
});
formatter.result({
  "duration": 158751179,
  "status": "passed"
});
formatter.before({
  "duration": 2545499431,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "Im on nopCommerce homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I click on customer menu",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "click on add customer sub menu button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I enter FirstName and LastName",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I should be able to see the search results matching the name entered",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "CustomerSteps.im_on_nopCommerce_homepage()"
});
formatter.result({
  "duration": 4480943565,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_click_on_customer_menu()"
});
formatter.result({
  "duration": 201566699,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_add_customer_sub_menu_button()"
});
formatter.result({
  "duration": 1239435407,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_enter_FirstName_and_LastName()"
});
formatter.result({
  "duration": 222581848,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.click_on_search_button()"
});
formatter.result({
  "duration": 177300205,
  "status": "passed"
});
formatter.match({
  "location": "CustomerSteps.i_should_be_able_to_see_the_search_results_matching_the_name_address_entered()"
});
formatter.result({
  "duration": 400014249,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.close_browser()"
});
formatter.result({
  "duration": 153928096,
  "status": "passed"
});
});