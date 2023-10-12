package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_01_DialogContent_Rabia extends Parent10 {

    public US_01_DialogContent_Rabia(){PageFactory.initElements(GWD.getDriver(),this);}
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerButton;
    @FindBy(css = "[id='customer.firstName']")
    public WebElement firstname;
    @FindBy(css = "[id='customer.lastName']")
    public WebElement lastname;
    @FindBy(css = "[id='customer.address.street']")
    public WebElement address;
    @FindBy(css = "[id='customer.address.city']")
    public WebElement city;
    @FindBy(css = "[id='customer.address.state']")
    public WebElement state;
    @FindBy(css = "[id='customer.address.zipCode']")
    public WebElement zipcode;
    @FindBy(css = "[id='customer.phoneNumber']")
    public WebElement phone;
    @FindBy(css = "[id='customer.ssn']")
    public WebElement ssn;
    @FindBy(css = "[id='customer.username']")
    public WebElement username;
    @FindBy(css = "[id='customer.password']")
    public WebElement password;
    @FindBy(css = "[id='repeatedPassword']")
    public WebElement confirm;
    @FindBy(css = "[value='Register']")
    public WebElement registerButton2;
    @FindBy(xpath = "//h2[text()='Account Services']")
    public WebElement successText;

    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
            case "registerButton": return this.registerButton;
            case "firstname": return this.firstname;
            case "lastname": return this.lastname;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zipcode": return this.zipcode;
            case "phone": return this.phone;
            case "ssn": return this.ssn;
            case "username": return this.username;
            case "password": return this.password;
            case "confirm": return this.confirm;
            case "registerButton2": return this.registerButton2;
            case "successText": return this.successText;


        }
        return null;
    }



}
