package org.nopCommerce;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.nopCommerce.drivers.DriverManager;
import org.openqa.selenium.WebDriver;

public class Hooks {

DriverManager dm = new DriverManager();

@Before
public void setUp(){
    dm.openBrowser();
    dm.navigateTo("https://admin-demo.nopcommerce.com/login");
    dm.maximiseBrowser();
}

//@After
  //  public void tearDown(){
 //   dm.closeBrowser();
//}


}
