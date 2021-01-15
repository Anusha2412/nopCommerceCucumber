$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "As a end User\nI want to add a new customer\nSo that I can check that the add customer menu is working correctly",
  "id": "",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4187004345,
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
  "duration": 4370541524,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.i_click_on_customer_menu()"
});
formatter.result({
  "duration": 200546776,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.click_on_add_customer_sub_menu_button()"
});
formatter.result({
  "duration": 1231453032,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.click_on_Add_new_button()"
});
formatter.result({
  "duration": 986703149,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.i_can_view_Add_a_new_customer_page()"
});
formatter.result({
  "duration": 33284906,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.i_enter_customer_information()"
});
formatter.result({
  "duration": 737733514,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerSteps.click_on_save_button()"
});
formatter.result({
  "duration": 1695375377,
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
  "duration": 131919237,
  "error_message": "java.lang.AssertionError: \nExpected: a string containing \"The new customer has been added successfully.\"\n     but: was \"  John Smith\nLogout\nDashboard\nCatalog\nSales\nCustomers\nCustomers\nCustomer roles\nOnline customers\nVendors\nActivity log\nActivity Types\nGDPR requests (log)\nPromotions\nContent management\nConfiguration\nSystem\nReports\nHelp\nAdd a new customer back to customer list\nSave\nSave and Continue Edit\nEmail is already registered\nCustomer info\nEmail\nPassword\nFirst name\nLast name\nGender\nMale\nFemale\nDate of birth\nCompany name\nIs tax exempt\nNewsletter\nCustomer roles\nRegistered\n*\nManager of vendor\nNot a vendor\nVendor 1\nVendor 2\nNote: if you have a vendor associated with this customer, then also ensure it is in \"Vendors\" customer role.\nActive\nAdmin comment\nPowered by nopCommerce\nnopCommerce version 4.30\nThursday, January 14, 2021 10:09 AM\"\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:8)\n\tat org.nopCommerce.step_definitions.AddCustomerSteps.i_should_get_a_confirmation_message(AddCustomerSteps.java:84)\n\tat ✽.Then I should get a confirmation message \"The new customer has been added successfully.\"(src/test/resources/AddCustomer.feature:14)\n",
  "status": "failed"
});
formatter.match({
  "location": "AddCustomerSteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});