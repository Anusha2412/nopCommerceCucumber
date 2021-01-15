package org.nopCommerce.step_definitions;


import cucumber.api.java.en.*;
import org.nopCommerce.page_object.LoginPage;


import static org.hamcrest.MatcherAssert.*; //
import static org.hamcrest.Matchers.*;

public class LoginSteps {

   private LoginPage lp = new LoginPage();

    @Given("^User is on sign in page$")
    public void user_is_on_sign_in_page()  {

        String actual = lp.getCurrentUrl();
        assertThat(actual, endsWith("login"));
    }

    @When("^User enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enters_Email_as_and_Password_as(String email, String password)  {
        lp.setTxtEmail(email);
        lp.setTxtPassword(password);

    }

    @When("^Click on Login button$")
    public void click_on_Login_button()  {
        lp.clickOnLogin();

    }

    @Then("^User should login into homepage$")
    public void user_should_login_into_homepage() {
        String actual = lp.getPageTitle();
        assertThat(actual, equalToIgnoringCase("Dashboard / nopCommerce administration"));

    }

    @When("^User click log out link$")
    public void user_click_log_out_link()  {
       lp.clickOnLogout();
    }

    @Then("^User should log out of the home page$")
    public void user_should_log_out_of_the_home_page() {

       String actual = lp.getPageSource();
        assertThat(actual, containsString("please sign in"));


    }

    @Then("^close browser$")
    public void close_browser() {
        lp.closeBrowser();

    }





}