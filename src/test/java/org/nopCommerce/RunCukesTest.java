package org.nopCommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/AddCustomer.feature",
        dryRun = false,
        plugin = {"json:target/cucumber.json", "pretty", "html:test-output"}



)
  public class RunCukesTest {

}
