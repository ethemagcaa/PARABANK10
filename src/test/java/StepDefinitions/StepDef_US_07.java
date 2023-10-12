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

    @When("Should be click update button")
    public void shouldBeClickUpdateButton() {dc.myClick(ln.uptadeContactInfo);}

    @Then("SendKeys")
    public void sendkeys(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0));
            dc.mySendKeys(e, items.get(i).get(1));
        }
        dc.myClick(dc.submitButton);
    }



    @And("Click")
    public void click() { dc.myClick(dc.buttonUpdateProfile);}

    @Then("Should be see update message")
    public void shouldBeSeeUpdateMessage() {dc.verifyContainsText(dc.updateMessage, "Updated");}

    @Then("Checking the entered information")
    public void checkingTheEnteredInformation() {
        dc.wait.until(ExpectedConditions.attributeToBe(dc.firstName, "value", "nsl"));
        String dogrulama = dc.firstName.getAttribute("value");
        Assert.assertEquals(dogrulama, "nsl");   }    // her seferınde baskalarının verısı geldıgı ıcın buralar dogrulanmıyor

    @Then("Clear")
    public void clear() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.firstName));
        dc.mySendKeys(dc.firstName, "irs");
        dc.wait.until(ExpectedConditions.visibilityOf(dc.lastname));
        dc.mySendKeys(dc.lastname, "ddlv");
        dc.mySendKeys(dc.address, "street");
        dc.wait.until(ExpectedConditions.visibilityOf(dc.city));
        dc.mySendKeys(dc.city, "     ");
        dc.mySendKeys(dc.state, "clvlnd");
        dc.mySendKeys(dc.zipcode, "      ");
        dc.mySendKeys(dc.phone, "        ");}

    @Then("Should be see errorMessage")
    public void shouldBeSeeErrorMessage() { Assert.assertTrue(dc.errorM.getText().contains("required"));}


}
