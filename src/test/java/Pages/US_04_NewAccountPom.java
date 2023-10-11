package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_04_NewAccountPom extends Parent10  {
    public US_04_NewAccountPom() { PageFactory.initElements(GWD.getDriver(), this); }

    @FindBy(xpath = "//*[text()='Open New Account']")
    public WebElement openNewAccount;

    @FindBy(xpath="//*[@id='type']")
    public WebElement accountTypeDropbox;

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


}
