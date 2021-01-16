package utilities;

import org.nopCommerce.drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitHelper extends DriverManager {

// Driver manager class is extended: webdriver is paused
    public void waitForElement(WebElement ele, long TimeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(ele));

    }
}


