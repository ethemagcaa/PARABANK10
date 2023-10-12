package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//public class LoginStep {
//
//    DialogContent dc=new DialogContent();
//
//
//    @Given("Navigate to ParaBank")
//    public void navigateToParaBank() {
//        GWD.getDriver().get("https://para.testar.org/");
//
//    }
//
//    @When("Enter username and password and click login button")
//    public void enterUsernameAndPasswordAndClickLoginButton() {
//        dc.mySendKeys(dc.emailInput,"team10@gmail.com");
//        dc.mySendKeys(dc.passwordInput,"123456");
//        dc.myClick(dc.loginButton);
//
//    }
//
//
//
//    @Then("welcome message should be  displayed")
//    public void welcomeMessageShouldBeDisplayed() {
//        dc.verifyContainsText(dc.loginSuccessMsg,"Accounts");
//
//    }
//
//
//}
