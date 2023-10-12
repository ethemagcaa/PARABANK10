package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AccountsOverview {
    DialogContent dc=new DialogContent();
    LeftNav lf=new LeftNav();


    @And("Click on the accountsOverview button")
    public void clickOnTheAccountsOverviewButton() {
        lf.myClick(lf.accountsOverview);
    }
    @Then("should see customer data details")
    public void shouldSeeCustomerDataDetails() {
        System.out.println(dc.customerDetails.getText());



    }
    @And("click on an account number")
    public void clickOnAnAccountNumber() {

        dc.myClick(dc.AccountNumber);





    }



    @And("should see activity list")
    public void shouldSeeActivityList() {


        dc.verifyContainsText(dc.AccNoText,"Account Number");
        dc.verifyContainsText(dc.accTypeText,"Account Type");
        dc.verifyContainsText(dc.balanceText,"Balance");
        dc.verifyContainsText(dc.avaiblableText,"Available");
        
    }

    @And("click on credit, debit and All button")
    public void clickOnCreditDebitAndAllButton() {

        dc.myClick(dc.AllButton);
        dc.myClick(dc.CreditButton);
        dc.myClick(dc.DebitButton);

    }

    @And("should see {string} as mentioned in customer data")
    public void shouldSeeAsMentionedInCustomerData(String arg0) {

        dc.MyAssert(dc.tableHeaders,"Date");
        dc.MyAssert(dc.tableHeaders,"Transaction");
        dc.MyAssert(dc.tableHeaders,"Debit (-)");
        dc.MyAssert(dc.tableHeaders,"Credit (+)");


    }



}
