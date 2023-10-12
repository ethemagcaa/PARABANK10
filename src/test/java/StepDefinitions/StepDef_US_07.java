package StepDefinitions;

import Pages.DialogContent;
import Pages.DialogContentCansu;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class StepDef_US_07 {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    DialogContentCansu dcc = new DialogContentCansu();

    @When("Should be click update button")
    public void shouldBeClickUpdateButton() {dc.myClick(ln.uptadeContactInfo);}

    @Then("SendKeys")
    public void sendkeys(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dcc.getWebElement(items.get(i).get(0));
            dc.mySendKeys(e, items.get(i).get(1));
        }
        dc.myClick(dcc.submitButton);
    }


    @And("Click")
    public void click() { dc.myClick(dcc.buttonUpdateProfile);}

    @Then("Should be see update message")
    public void shouldBeSeeUpdateMessage() {dc.verifyContainsText(dcc.updateMessage, "Updated");}

    @Then("Checking the entered information")
    public void checkingTheEnteredInformation() {
        dc.wait.until(ExpectedConditions.attributeToBe(dcc.firstName, "value", "nsl"));
        String dogrulama = dcc.firstName.getAttribute("value");
        Assert.assertEquals(dogrulama, "nsl");   }    // her seferınde baskalarının verısı geldıgı ıcın buralar dogrulanmıyor

    @Then("Clear")
    public void clear() {
        dc.wait.until(ExpectedConditions.visibilityOf(dcc.firstName));
        dc.mySendKeys(dcc.firstName, "irs");
        dc.wait.until(ExpectedConditions.visibilityOf(dcc.lastname));
        dc.mySendKeys(dcc.lastname, "ddlv");
        dc.mySendKeys(dcc.address, "street");
        dc.wait.until(ExpectedConditions.visibilityOf(dcc.city));
        dc.mySendKeys(dcc.city, "     ");
        dc.mySendKeys(dcc.state, "clvlnd");
        dc.mySendKeys(dcc.zipcode, "      ");
        dc.mySendKeys(dcc.phone, "        ");}

    @Then("Should be see errorMessage")
    public void shouldBeSeeErrorMessage() { Assert.assertTrue(dcc.errorM.getText().contains("required"));}


}
