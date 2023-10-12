package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContentCansu extends Parent10 {
    public DialogContentCansu() {PageFactory.initElements(GWD.getDriver(), this);}

    // bu logOut vıldanın hazıraldıgı leftnavda var
    // emailInput -  passwordInput- loginButton dc de var  oradan alıp swıtch ıcıne koyamadım ondan buraya ekledım

    @FindBy(xpath = "//*[text()='Log Out']")
    public WebElement logOut;

    @FindBy(css = "[name='username']")
    public WebElement emailInput;

    @FindBy(css = "[name='password']")
    public WebElement passwordInput;

    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;


    @FindBy(xpath ="//h1[text()='Accounts Overview']")
    public WebElement loginSuccessMsg;





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
            case "logOut"             : return logOut;
            case "emailInput"         : return emailInput;
            case "passwordInput"      : return passwordInput;
            case "loginButton"        : return loginButton;
            case "errorM"             : return errorM;





    }

        return null;

}
}