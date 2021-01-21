package org.nopCommerce.step_definitions;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.nopCommerce.page_object.AddCustomerPage;
import org.nopCommerce.page_object.LoginPage;
import org.nopCommerce.page_object.SearchCustomerPage;
import utilities.RandomString;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CustomerSteps {

    private AddCustomerPage acp = new AddCustomerPage();
    private LoginPage lp = new LoginPage();
    private SearchCustomerPage scp = new SearchCustomerPage();



    @Given("^Im on nopCommerce homepage$")
    public void im_on_nopCommerce_homepage()  {
        lp.clickOnLogin();

        String actual = lp.getCurrentUrl();
        assertThat(actual, endsWith("admin/"));


    }


    @When("^I click on customer menu$")
    public void i_click_on_customer_menu()  {
        acp.SelectMenuOption("Customers");
      //  acp.applyImplicitWait();


    }

    @When("^click on add customer sub menu button$")
    public void click_on_add_customer_sub_menu_button()  {
        acp.SelectSubOption("Customers");

    }

    @When("^click on Add new button$")
    public void click_on_Add_new_button()  {
        acp.ClickAddNewCustomer();


    }

    @Then("^I can view Add a new customer page$")
    public void i_can_view_Add_a_new_customer_page()  {
       String actual= lp.getPageSource();
       assertThat(actual, containsString("Add a new customer"));
       // assertThat(actual, equalToIgnoringCase("Add a new customer"));


    }

    @When("^I enter customer information$")
    public void i_enter_customer_information()  {

        /* Note: Created RandomString class in Utilities package, instead of hard coding email address,
         we generate random email address as below
         */
        String email = new RandomString().randomStringGenerator()+ "@gmail.com";
        acp.enterEmail(email);
        acp.enterPassword("Shaanu");
        acp.enterFirstName("Anusha");
        acp.enterLastName("Asuri");
        acp.selectGender("Female");
        acp.enterDateOfBirth("12/24/1987");
        acp.enterCompanyName("Maven IT");
       // acp.selectNewsletter("Test store 2");
       // acp.selectCustomerRole("Guest");
        acp.SelectManagerOfVendor("Not a vendor");


    }

    @When("^click on save button$")
    public void click_on_save_button()  {
        acp.clickSave();

    }

    @Then("^I should get a confirmation message \"([^\"]*)\"$")
    public void i_should_get_a_confirmation_message(String arg1) {
        String actual = acp.htmlText();
       assertThat(actual, containsString("The new customer has been added successfully."));

    }

    @Then("^I enter an email address$")
    public void i_enter_an_email_address()  {
        scp.enterEmail("victoria_victoria@nopCommerce.com");

    }

    @Then("^click on search button$")
    public void click_on_search_button()  {
        scp.clickSearchBtn();

    }

    @Then("^I should be able to see the search results matching the email address entered$")
    public void i_should_be_able_to_see_the_search_results_matching_the_email_address_entered()  {
        boolean status =scp.searchByEmailID("victoria_victoria@nopCommerce.com");
        Assert.assertTrue(status);

    }


    @Then("^I enter FirstName and LastName$")
    public void i_enter_FirstName_and_LastName() {
        scp.enterFName("Victoria");
        scp.enterLName("Terces");
        scp.implwait();


    }

    @Then("^I should be able to see the search results matching the name entered$")
    public void i_should_be_able_to_see_the_search_results_matching_the_name_entered()  {
        boolean status2 = scp.searchByName("Victoria Terces");
        System.out.println(status2);
        scp.implwait();

        Assert.assertTrue(status2);

    }


    @Then("^Close browser$")
    public void close_browser()  {
    lp.closeBrowser();

    }

}
