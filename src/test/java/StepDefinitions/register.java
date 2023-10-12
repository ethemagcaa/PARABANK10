package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class register {
    DialogContent dc=new DialogContent();

    @When("Click register button")
    public void clickRegisterButton() {
        dc.myClick(dc.regButton);
    }

    @Then("User enter register information and click register button")
    public void userEnterRegisterInformationAndClickRegisterButton() {

        dc.mySendKeys(dc.regFirstName, "tester7");
        dc.mySendKeys(dc.regLastName, "qa2");
        dc.mySendKeys(dc.regAddress, "Sancaktepe/kızılay cad.");
        dc.mySendKeys(dc.regCity, "Istanbul");
        dc.mySendKeys(dc.regState, "Turkey");
        dc.mySendKeys(dc.regZipCode, "23098");
        dc.mySendKeys(dc.regPhone, "+907679875184");
        dc.mySendKeys(dc.regSSN, "1234");
        dc.mySendKeys(dc.regUsername, "tester7");
        dc.mySendKeys(dc.regPassword, "12345");
        dc.mySendKeys(dc.regConfirm, "12345");
        dc.myClick(dc.regConfirmButton);
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.regSuccessText,"Your account was created successfully");
    }
}
