package Pages;
import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_02_DialogContent_Ethem extends Parent10 {
    public US_02_DialogContent_Ethem() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(css = "[name='username']")
    public WebElement userName;

    @FindBy(css = "[name='password']")
    public WebElement passwordInput;

    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;

    @FindBy(xpath ="//h1[text()='Accounts Overview']")
    public WebElement loginSuccessMsg;

    @FindBy(xpath = "//*[@href='/parabank/logout.htm']")
    public WebElement logoutButton;

    @FindBy(xpath ="//h1[text()='Error!']")
    public WebElement loginErrorMsg;
}
