package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep {

    DialogContent dc=new DialogContent();

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.userName,"tester5");
        dc.mySendKeys(dc.passwordInput,"9182734");
        dc.myClick(dc.loginButton);

    }


    @Then("welcome message should be  displayed")
    public void welcomeMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.loginSuccessMsg,"Accounts");

    }


}

