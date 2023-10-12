package StepDefinitions;

import Pages.DialogContent;
import Pages.DialogContentCansu;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class StepDef_US_08 {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @When("User clicks on the button of request loan")
    public void userClicksOnTheButtonOfRequestLoan() {dc.myClick(ln.requestLoan);}

    @Then("User fills money data")
    public void userFillsMoneyData() {
        dc.mySendKeys(dc.loanAmount, "2000");
        dc.mySendKeys(dc.downPayment, "400");}

    @And("User selects an account number")
    public void userSelectsAnAccountNumber() {
        Select ddMenu = new Select(dc.fromAccountId);
        ddMenu.selectByIndex(0);}

    @Then("User clicks on the button of apply now")
    public void userClicksOnTheButtonOfApplyNow() { dc.myClick(dc.applyNowButton);}

    @And("Loan request processed information is verified")
    public void loanRequestProcessedInformationIsVerified() {dc.verifyContainsText(dc.loanStatus, "Approved");}

    @And("Approved message is displayed")
    public void approvedMessageIsDisplayed() {dc.verifyContainsText(dc.approvedMessage, "approved");}

    @And("User clicks on new account number")
    public void userClicksOnNewAccountNumber() { dc.myClick(dc.newAccountId);}

    @Then("Account details information is verified")
    public void accountDetailsInformationIsVerified() {
        dc.verifyContainsText(dc.accountType, "LOAN");
        dc.verifyContainsText(dc.balance, "2000");
        dc.verifyContainsText(dc.availableBalance, "2000");
        dc.verifyContainsText(dc.transactionMessage, "No");}
}
