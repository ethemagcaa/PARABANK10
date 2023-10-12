package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class US_02_LoginStep_Ethem {
   DialogContent dc=new DialogContent();

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Click sign-in button and enter {string} and {string} and click sign-in button")
    public void clickSignInButtonAndEnterAndAndClickSignInButton(String userName, String password)
    {
        dc.mySendKeys(dc.userName,userName);
        dc.mySendKeys(dc.passwordInput,password);
        dc.myClick(dc.loginButton);
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.userName,"tester7");
        dc.mySendKeys(dc.passwordInput,"12345");
        dc.myClick(dc.loginButton);
    }

    @Then("welcome message should be  displayed")
    public void welcomeMessageShouldBeDisplayed() {

        dc.verifyContainsText(dc.loginSuccessMsg,"Accounts");
    }

    @When("click logout button")
    public void clickLogoutButton()
    {
        dc.myClick(dc.logoutButton);
        System.out.println("Başarılı Şekilde Çıkış Yapıldı");
    }
    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed()
    {
        dc.verifyContainsText(dc.loginErrorMsg,"Error!");
    }


}
