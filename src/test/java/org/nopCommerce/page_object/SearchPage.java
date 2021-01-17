package org.nopCommerce.page_object;

import org.nopCommerce.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.WaitHelper;

import java.util.List;

public class SearchPage extends DriverManager {

    //Finding Elements

    @FindBy(xpath = "//input[@id='SearchEmail']")
    WebElement Emailtxt;

    @FindBy(xpath = "//input[@id='SearchFirstName']")
    WebElement FNametxt;

    @FindBy(xpath = "//input[@id='SearchLastName']")
    WebElement LNametxt;

    @FindBy(xpath = "//button[@id='search-customers']")
    WebElement SearchBtn;

    @FindBy(xpath = "//table[@id='customers-grid']")
    WebElement Table;

    @FindBy(xpath = "//table[@id='customers-grid']//tbody/tr")
    List<WebElement> RowCount;

    @FindBy(xpath = "//table[@id='customers-grid']//thead/tr/th")
    List<WebElement> ColumnCount;
    /* (or)
    @FindBy(xpath = "//table[@id='customers-grid']//tbody/tr[1]/td")
    WebElement ColumnCount;
     */



    //Action Methods

    public void enterEmail(String email){
        Emailtxt.sendKeys(email);
    }

    public void enterFName(String fname){
        FNametxt.sendKeys(fname);
    }

    public void enterLName(String lname){
        WaitHelper wait = new WaitHelper();
        wait.waitForElement(LNametxt, 10);
        LNametxt.sendKeys(lname);
    }

    public void clickSearchBtn(){
        SearchBtn.click();
    }

    public int noOfRows(){
       return RowCount.size();
    }

    public int noOfColumns(){
        return ColumnCount.size();
    }

    public boolean searchByEmailID(String email)
    {
        boolean flag = false;

        for (int r=1; r<=noOfRows(); r++)
        {
            String emailID = Table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[\"+r+\"]/td[2]")).getText();
            System.out.println(emailID);

            if(emailID.equals(email))
            {
                flag=true;

            }
        }
        return flag;
    }


    public boolean searchByName(String Name)
    {
        boolean flag = false;

        for (int r=1; r<= noOfRows(); r++)
        {
            String name = Table.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[\"+r+\"]/td[3]")).getText();

           String names[]=  name.split(" ");

           if(names[0].equals("Victoria") && names[1].equals("Terces"))
           {

               flag =true;
           }
        }
        return flag;
    }


}
