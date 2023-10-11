package StepDefinitions;

import Pages.US_04_NewAccountPom;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US_04_NewAccount_Ihs {

    US_04_NewAccountPom na = new US_04_NewAccountPom();

    @When("the user clicks on the Open New Account link")
    public void theUserClicksOnTheLink() {

       na.myClick(na.openNewAccount);

    }

    @And("the user selects checking as the type of account to be opened from the Drop-Down menu")
    public void theUserSelectsAsTheTypeOfAccountToBeOpenedFromTheDropDownMenu() {


        WebElement checkingAccountOption = na.checkingAccount.get(0);
        na.myClick(checkingAccountOption);

    }

    @And("the user observes a notification regarding the minimum initial deposit requirement")
    public void theUserObservesANotificationRegardingTheMinimumInitialDepositRequirement() {

        na.verifyContainsText(na.minimumDepositMessage,"A minimum of");
        System.out.println(na.minimumDepositMessage.getText());
    }



    @And("the user clicks the Open New Account button")
    public void theUserClicksTheButton() {
        na.myClick(na.openNewAccount2);

    }

    @Then("the user should successfully create a Checking Account")
    public void theUserShouldSuccessfullyCreateACheckingAccount() {

        // String beklenenMsj = "Account Opened!";
        na.verifyContainsText(na.newAccountOpenedMessage, "Account Opened!");

    }

    @And("the user should see the account number")
    public void theUserShouldSeeTheAccountNumber() {

        na.myClick(na.newAccountID);
        na.verifyContainsText(na.accountNumber, "Account Number");

    }

    @And("the user selects savings as the type of account to be opened from the Drop-Down menu")
    public void theUserSelectsSavingsAsTheTypeOfAccountToBeOpenedFromTheDropDownMenu() {

        //na.myClick(na.accountTypeDropbox);
        WebElement savingAccountOption = na.savingAccount.get(0);
        na.myClick(savingAccountOption);

    }

    @Then("the user should successfully create a Saving Account")
    public void theUserShouldSuccessfullyCreateASavingAccount() {

        // String beklenenMsj = "Account Opened!";
       // WebElement element = na.newAccountOpenedMessage;
       na.verifyContainsText(na.newAccountOpenedMessage, "Account Opened!");


    }

}
