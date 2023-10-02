package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DialogContent extends Parent10 {
    public DialogContent() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(css = "[name='username']")
    public WebElement userName;

    @FindBy(css = "[name='password']")
    public WebElement passwordInput;

    @FindBy(css = "[value='Log In']")
    public WebElement loginButton;


    @FindBy(xpath ="//h1[text()='Accounts Overview']")
    public WebElement loginSuccessMsg;


}

