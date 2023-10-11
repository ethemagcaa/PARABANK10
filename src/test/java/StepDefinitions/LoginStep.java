package StepDefinitions;

import Pages.DialogContent;
import Pages.DialogContentV;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    DialogContentV dc=new DialogContentV();


    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com");

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
