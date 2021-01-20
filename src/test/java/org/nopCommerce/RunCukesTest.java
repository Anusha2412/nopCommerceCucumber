package org.nopCommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        dryRun = false,
        plugin = {"json:target/cucumber.json", "pretty", "html:test-output"}


)
  public class RunCukesTest {

}


// For html reports : go to test-output package---->index.html----->right click-----> Open in Browser----->Default