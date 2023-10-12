package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class DialogContent extends Parent10 {
    public DialogContent() {PageFactory.initElements(GWD.getDriver(), this);}


    //Rabia's elements
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


    //vildan's elements

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


    //Ethem's elements

    @FindBy(xpath = "//*[@href='/parabank/logout.htm']")
    public WebElement logoutButton;

    @FindBy(xpath ="//h1[text()='Error!']")
    public WebElement loginErrorMsg;


    //ihsan's elements
    @FindBy(xpath="(//*[@id='type']/option)[1]")
    public List<WebElement> checkingAccount;

    @FindBy(xpath="(//*[@id='type']/option)[2]")
    public List<WebElement> savingAccount;

    @FindBy(xpath="//b[ contains(text(), 'A minimum of 100,00 $' )  ]")
    public WebElement minimumDepositMessage;

    @FindBy(xpath="//*[@type='submit']")
    public WebElement openNewAccount2;

    @FindBy(xpath="//*[@id='rightPanel']//h1")
    public WebElement newAccountOpenedMessage;

    @FindBy(xpath="//*[@id='newAccountId']")
    public WebElement newAccountID;

    @FindBy(xpath="//td[contains(text(),'Account Number:')]")
    public WebElement accountNumber;


    // Cansu's elements

    @FindBy(css = "input[value='Register']")
    public WebElement submitButton;






    @FindBy(css = "[id='customer.firstName']")
    public WebElement firstName;

    @FindBy(css = "[id='customer.lastName']")
    public WebElement lastname;

    @FindBy(css = "[id='customer.address.street']")
    public WebElement address;

    @FindBy(css = "[id='customer.address.city']")
    public WebElement city;

    @FindBy(css = "[id='customer.address.state']")
    public WebElement state;

    @FindBy(css = "[id='customer.address.zipCode']")
    public WebElement zipcode;

    @FindBy(css = "[id='customer.phoneNumber']")
    public WebElement phone;
    @FindBy(xpath ="//input[@value='Update Profile']")
    public WebElement buttonUpdateProfile;

    @FindBy(xpath ="//h1[@class='title']")
    public WebElement updateMessage;

    @FindBy(xpath = "//span[@class='error ng-scope' and text()='Zip Code is required.']")
    public WebElement errorM;




    @FindBy(xpath = "//input[@id='amount']")
    public WebElement loanAmount;

    @FindBy(xpath = "//input[@id='downPayment']")
    public WebElement downPayment;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccountId;

    @FindBy(css = "input[value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(id = "loanStatus")
    public WebElement loanStatus;

    @FindBy(css = "div[class='ng-scope'] > p")
    public WebElement approvedMessage;

    @FindBy(id = "newAccountId")
    public WebElement newAccountId;

    @FindBy(id = "accountType")
    public WebElement accountType;

    @FindBy(id = "balance")
    public WebElement balance;

    @FindBy(id = "availableBalance")
    public WebElement availableBalance;

    @FindBy(css = "p[class='ng-scope'] > b")
    public WebElement transactionMessage;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "firstName"          : return firstName;
            case "lastname"           : return lastname;
            case "address"            : return address;
            case "city"               : return city;
            case "state"              : return state;
            case "zipcode"            : return zipcode;
            case "phone"              : return phone;
            case "buttonUpdateProfile": return buttonUpdateProfile;
            case "logOut"             : return logoutButton;
            case "emailInput"         : return userName;
            case "passwordInput"      : return passwordInput;
            case "loginButton"        : return loginButton;
            case "errorM"             : return errorM;






        }

        return null;

    }



}





