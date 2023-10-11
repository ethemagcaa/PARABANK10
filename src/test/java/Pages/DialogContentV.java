package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContentV extends Parent10V {
    public DialogContentV() {PageFactory.initElements(GWD.getDriver(), this);}

    //*regElements*
    @FindBy(xpath = "(//div[@id='loginPanel']//a)[2]")
    public WebElement regButton;
    @FindBy(xpath = "(//table[@class='form2']//input)[1]")
    public WebElement regFirstName;
    @FindBy(xpath = "(//table[@class='form2']//input)[2]")
    public WebElement regLastName;
    @FindBy(xpath = "(//table[@class='form2']//input)[3]")
    public WebElement regAddress;
    @FindBy(xpath = "(//table[@class='form2']//input)[4]")
    public WebElement regCity;
    @FindBy(xpath = "(//table[@class='form2']//input)[5]")
    public WebElement regState;
    @FindBy(xpath = "(//table[@class='form2']//input)[6]")
    public WebElement regZipCode;
    @FindBy(xpath = "(//table[@class='form2']//input)[7]")
    public WebElement regPhone;
    @FindBy(xpath = "(//table[@class='form2']//input)[8]")
    public WebElement regSSN;
    @FindBy(xpath = "(//table[@class='form2']//input)[9]")
    public WebElement regUsername;
    @FindBy(xpath = "(//table[@class='form2']//input)[10]")
    public WebElement regPassword;
    @FindBy(xpath = "(//table[@class='form2']//input)[11]")
    public WebElement regConfirm;
    @FindBy(xpath = "//input[@value='Register']")
    public WebElement regConfirmButton;
    @FindBy(xpath = "//div[@id='rightPanel']/p")
    public WebElement regSuccessText;

    @FindBy(css = "[name='username']")
    public WebElement userName;

    @FindBy(css = "[name='password']")
    public WebElement passwordInput;

    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;


    @FindBy(xpath ="//h1[text()='Accounts Overview']")
    public WebElement loginSuccessMsg;

    @FindBy(xpath = "(//tbody)[1]")
    public WebElement customerDetails;

    @FindBy(xpath = "//*[text()='Account Number:']")
    public WebElement AccNoText;
    @FindBy(xpath = "//*[text()='Account Type:']")
    public WebElement accTypeText;

    @FindBy(xpath = "//*[text()='Balance:']")
    public WebElement balanceText;

    @FindBy(xpath = "//*[text()='Available:']")
    public WebElement avaiblableText;



    @FindBy(xpath = "//a[starts-with(@href, 'activity.htm?id=')]")
    public WebElement AccountNumber;

    @FindBy(xpath = "//*[@id='transactionType']/option[@value='All']")
    public WebElement AllButton;

    @FindBy(xpath = "//*[@id='transactionType']/option[@value='Credit']")
    public WebElement CreditButton;

    @FindBy(xpath = "//*[@id='transactionType']/option[@value='Debit']")
    public WebElement DebitButton;

    @FindBy(xpath = "(//tr)[8]")
    public WebElement tableHeaders;
//
//    @FindBy(xpath = "//select[@id='type']")
//    public WebElement accountType;
//    @FindBy(xpath = "//select[@id='fromAccountId']")
//    public WebElement slTransferFunds;
//    @FindBy(xpath = "//input[@value='Open New Account']")
//    public WebElement newAccountButton;
//    @FindBy(xpath = "((//div[@class='ng-scope'])[2]/p)[1]")
//    public WebElement newAccSuccessText;
//
//    @FindBy(xpath = "(//div[@id='leftPanel']//li)[1]")
//    public WebElement openNewAccountButton;





}

