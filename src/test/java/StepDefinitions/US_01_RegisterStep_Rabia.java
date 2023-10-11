package StepDefinitions;

import Pages.US_01_DialogContent_Rabia;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_01_RegisterStep_Rabia {
    US_01_DialogContent_Rabia rdc =new US_01_DialogContent_Rabia();

    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @When("click register button")
    public void clickRegisterButton(DataTable buttons) {
        List<String> buttonsStr = buttons.asList(String.class);
        for (int i = 0; i < buttonsStr.size(); i++) {
            WebElement linkElement = rdc.getWebElement(buttonsStr.get(i));
            rdc.myClick(linkElement);


        }
    }
    @And("User sending the keys in RegisterDialogContent")
    public void userSendingTheKeysInRegisterDialogContent(DataTable data) {
        List<List<String>> items = data.asLists(String.class);
        for (int i = 0; i <items.size() ; i++) {
            WebElement e=rdc.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            rdc.mySendKeys(e, yazi);
        }
    }
    @Then("User should registered successfully")
    public void userShouldRegisteredSuccessfully() {

        rdc.verifyContainsText(rdc.successText, "Account");

    }



}
