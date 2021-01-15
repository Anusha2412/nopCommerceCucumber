package org.nopCommerce.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    //Constructor
    public DriverManager(){
        PageFactory.initElements(driver,this);
    }

    //Object
    public static WebDriver driver;

    //Methods
    public String browser = "";
    public void openBrowser(){
        switch (browser){
            case "ie":
                WebDriverManager.iedriver().setup();
                driver= new InternetExplorerDriver();

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();

            default:
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
        }
    }



    public void navigateTo(String url){
        driver.get(url);
    }

    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.quit();
    }



    public void applyExplicitWait(WebElement ele, long timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(ele));

    }



}
