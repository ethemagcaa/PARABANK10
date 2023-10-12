package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;


public class US_04_NewAccount_Ihs {

      DialogContent dc=new DialogContent();

      LeftNav lf=new LeftNav();

    @When("the user clicks on the Open New Account link")
    public void theUserClicksOnTheLink() {

       lf.myClick(lf.openNewAccount);

    }

    @And("the user selects checking as the type of account to be opened from the Drop-Down menu")
    public void theUserSelectsAsTheTypeOfAccountToBeOpenedFromTheDropDownMenu() {


        WebElement checkingAccountOption = dc.checkingAccount.get(0);
        dc.myClick(checkingAccountOption);

    }

    @And("the user observes a notification regarding the minimum initial deposit requirement")
    public void theUserObservesANotificationRegardingTheMinimumInitialDepositRequirement() {

        dc.verifyContainsText(dc.minimumDepositMessage,"A minimum of");
        System.out.println(dc.minimumDepositMessage.getText());
    }



    @And("the user clicks the Open New Account button")
    public void theUserClicksTheButton() {
        dc.myClick(dc.openNewAccount2);

    }

    @Then("the user should successfully create a Checking Account")
    public void theUserShouldSuccessfullyCreateACheckingAccount() {

        // String beklenenMsj = "Account Opened!";
        dc.verifyContainsText(dc.newAccountOpenedMessage, "Account Opened!");

    }

    @And("the user should see the account number")
    public void theUserShouldSeeTheAccountNumber() {

        dc.myClick(dc.newAccountID);
        dc.verifyContainsText(dc.accountNumber, "Account Number");

    }

    @And("the user selects savings as the type of account to be opened from the Drop-Down menu")
    public void theUserSelectsSavingsAsTheTypeOfAccountToBeOpenedFromTheDropDownMenu() {

        //na.myClick(na.accountTypeDropbox);
        WebElement savingAccountOption = dc.savingAccount.get(0);
        dc.myClick(savingAccountOption);

    }

    @Then("the user should successfully create a Saving Account")
    public void theUserShouldSuccessfullyCreateASavingAccount() {

        // String beklenenMsj = "Account Opened!";
       // WebElement element = na.newAccountOpenedMessage;
       dc.verifyContainsText(dc.newAccountOpenedMessage, "Account Opened!");


    }

}
