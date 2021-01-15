package org.nopCommerce.page_object;

import org.nopCommerce.drivers.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

    // Finding Elements:

    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//input[@value='Log in'] ")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement btnLogOut;

    //Action methods

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getPageSource(){
        return driver.getPageSource();
    }

    public void setTxtEmail(String email){
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void setTxtPassword(String pswd){
        txtPassword.clear();
        txtPassword.sendKeys(pswd);
    }

    public void clickOnLogin(){
        btnLogin.click();
    }

    public void clickOnLogout(){
        btnLogOut.click();
    }






}
