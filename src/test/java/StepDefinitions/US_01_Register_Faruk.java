package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_01_Register_Faruk {

    DialogContent dc = new DialogContent();

    @When("Click on the element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable buttons) {
        List<String> buttonsStr = buttons.asList(String.class);
        for (int i = 0; i <buttonsStr.size() ; i++) {
            WebElement linkElement = dc.getWebElement(buttonsStr.get(i));
            dc.myClick(linkElement);
        }
    }

    @And("User sending the keys in DialogContent")
    public void userSendingTheKeysInDialogContent(DataTable datas) {
        List<List<String>> items = datas.asLists(String.class);
        for (int i = 0; i <items.size() ; i++) {
            WebElement e=dc.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);
            dc.mySendKeyes(e, yazi);
        }
    }


    @Then("User should registered successfully")
    public void userShouldRegisteredSuccessfully() {
        dc.verifyContainsText(dc.successText, "created");
    }



}
