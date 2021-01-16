package org.nopCommerce.page_object;

import org.nopCommerce.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.RandomString;
import utilities.WaitHelper;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddCustomerPage extends DriverManager {



    @FindBy(xpath = "//li[@class='treeview']")
    List<WebElement> MainMenuOptions;

    public void SelectMenuOption(String MainOptionName) {
        for (WebElement MainOption : MainMenuOptions) {
            String Option1 = MainOption.getText();

            if (Option1.equalsIgnoreCase(MainOptionName)) {
                MainOption.click();
                break;
            }
        }

    }

    // @FindBy(xpath = "//span[@class= 'menu-item-title']")
    @FindBy(xpath = "//a[@class= 'menu-item-link']")
    List<WebElement> SubMenuOptions;


    public void SelectSubOption(String SubOptionName) {
        for (WebElement SubOption : SubMenuOptions) {
            String Option2 = SubOption.getText();

            if (Option2.equalsIgnoreCase(SubOptionName)) {
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                SubOption.click();
                break;

            }
        }
    }

    @FindBy(xpath = "//a[@class='btn bg-blue']")
    WebElement AddNewCustomerBtn;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement EmailTxtBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement PasswordTxtBox;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement FNametxt;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement LNametxt;

    @FindBy(xpath = "//input[@id='Gender_Male']")
    WebElement MaleRadioBtn;

    @FindBy(xpath = "//input[@id='Gender_Female']")
    WebElement FemaleRadioBtn;

    @FindBy(xpath = "//input[@id='DateOfBirth']")
    WebElement DOBtxt;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement CompanyNameTxt;

    //  @FindBy(xpath = "//ul[@id='SelectedNewsletterSubscriptionStoreIds_taglist']")
    @FindBy(xpath = "//select[@id='SelectedNewsletterSubscriptionStoreIds']")
    //select[@id='SelectedNewsletterSubscriptionStoreIds']
            WebElement NewsletterBtn;

    // @FindBy(xpath = "//div[@class='k-multiselect-wrap k-floatwrap']")
    @FindBy(xpath = "//select[@id='SelectedCustomerRoleIds']")
    WebElement CustomerRolesDrp;

    @FindBy(xpath = "//select[@id='VendorId']")
    WebElement ManagerOfVendorDrp;

    @FindBy(xpath = "//textarea[@id='AdminComment']")
    WebElement AdminCommentBox;

    @FindBy(xpath = "//button[@name='save']")
    WebElement SaveBtn;


    //  Action Methods:

    public void ClickAddNewCustomer() {


      /* Note: Created WaitHelper class in Utilities package
      we can call waitForElement() method either as below
      new WaitHelper().waitForElement(AddNewCustomerBtn, 10);
                    or by initialization
       */

        WaitHelper wait = new WaitHelper();
        wait.waitForElement(AddNewCustomerBtn, 10);
        AddNewCustomerBtn.click();
    }


    // Note: Created RandomString class in Utilities package
    public void enterEmail( String email ) {
        EmailTxtBox.sendKeys(email);
    }

    public void enterPassword(String pswd) {
        PasswordTxtBox.sendKeys(pswd);
    }

    public void enterFirstName(String fName) {
        FNametxt.sendKeys(fName);
    }

    public void enterLastName(String lName) {
        LNametxt.sendKeys(lName);
    }

    public void selectGender(String gender) {

        if (gender == "Male") {
            MaleRadioBtn.click();
        } else if (gender == "Female") {
            FemaleRadioBtn.click();
        }
    }

    public void enterDateOfBirth(String DOB) {
        DOBtxt.sendKeys(DOB);
    }

    public void enterCompanyName(String CompanyName) {
        CompanyNameTxt.sendKeys(CompanyName);
    }

    public void selectNewsletter(String text) {
        NewsletterBtn.click();
        Select s1 = new Select(NewsletterBtn);
        s1.selectByVisibleText(text);
    }

    public void selectCustomerRole(String drp) {
        CustomerRolesDrp.click();
        Select s2 = new Select(CustomerRolesDrp);
        s2.selectByVisibleText(drp);
    }

    public void SelectManagerOfVendor(String Dropdown) {
        Select s3 = new Select(ManagerOfVendorDrp);
        s3.selectByVisibleText(Dropdown);
    }

    //  public void getHomePageUrl(String url){
    //      navigateTo(url);
    //  }

    public void clickSave() {
        SaveBtn.click();
    }

    public void applyImplicitWait() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @FindBy(tagName = "Body")
    WebElement htmlBody;

    public String htmlText() {
      return htmlBody.getText();

    }




















}
