package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavV extends Parent10{

    public LeftNavV() {PageFactory.initElements(GWD.getDriver(),this);}


    @FindBy(xpath = "//*[text()='Open New Account']")
    public WebElement openNewAccount;

    @FindBy(xpath = "(//*[text()='Accounts Overview'])[1]")
    public WebElement accountsOverview;

    @FindBy(xpath = "//*[text()='Transfer Funds']")
    public WebElement transferFunds;

    @FindBy(xpath = "//*[text()='Bill Pay']")
    public WebElement billPay;

    @FindBy(xpath = "//*[text()='Find Transactions']")
    public WebElement findTransaction;

    @FindBy(xpath = "//*[text()='Update Contact Info']")
    public WebElement uptadeContactInfo;

    @FindBy(xpath = "//*[text()='Request Loan']")
    public WebElement requestLoan;

    @FindBy(xpath = "//*[text()='Log Out']")
    public WebElement logOut;


    public WebElement getWebElement(String strElement){
        switch (strElement){

            case "accountsOverview": return this.accountsOverview;
        }

        return null;
    }





}
