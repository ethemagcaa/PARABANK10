package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent{
    public DialogContent() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy (css = "div[class='header_user_info']")
    public WebElement signInButton;
    @FindBy (id = "email_create")
    public WebElement emailCreateInput;
    @FindBy (id = "SubmitCreate")
    public WebElement createAccountButton;
    @FindBy (id = "customer_firstname")
    public WebElement firstNameInput;
    @FindBy (id = "customer_lastname")
    public WebElement lastNameInput;
    @FindBy (id = "passwd")
    public WebElement passwordInput;
    @FindBy (id = "submitAccount")
    public WebElement registerButton;
    @FindBy (css = "p[class='alert alert-success']")
    public WebElement successText;

    @FindBy (css = "span[class='heading-counter']")
    public WebElement topListNumber;
    @FindBy (css = "div[class='product-count']")
    public WebElement downListNumber;
    @FindBy (xpath = "//ul[@id='product_list']/li")
    public List<WebElement> itemsList;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signIn1;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']")
    public WebElement signIn2;

    @FindBy (xpath = "(//div[@class='alert alert-danger'])[1]")
    public  WebElement hata;

    @FindBy(xpath = "//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
    public WebElement welcomeMessage;

    @FindBy(xpath="//a[@class='login']")
    public WebElement signin;

    @FindBy(id="SubmitLogin")
    public WebElement siginlogin;

    @FindBy(xpath="//*[text()='My account']")
    public WebElement successMessage;

    //Ethem
    @FindBy(xpath ="//*[@title='Sitemap']")
    public WebElement SiteMap;

    @FindBy(xpath ="//*[@title='View a list of my addresses']")
    public WebElement Addresses;

    @FindBy(xpath ="//*[@title='Add an address']")
    public WebElement adanewaddress;

    @FindBy(id="firstname")
    public WebElement firstNameInputET;

    @FindBy(id="lastname")
    public WebElement lastNameInputET;

    @FindBy(id="address1")
    public WebElement address;

    @FindBy(id="city")
    public WebElement city;


    @FindBy(id="postcode")
    public WebElement zip;

    @FindBy(id="phone")
    public WebElement homephone;

    @FindBy(id="phone_mobile")
    public WebElement mobilephone;

    @FindBy(id="alias")
    public WebElement reference;

    @FindBy(id="submitAddress")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@class='addresses']")
    public WebElement successTextET;

    @FindBy(css="[id='id_state' ] [value='5']")
    public WebElement state;


    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
            //Faruk
            case "signInButton": return this.signInButton;
            case "emailCreateInput": return this.emailCreateInput;
            case "createAccountButton": return this.createAccountButton;
            case "firstNameInput": return this.firstNameInput;
            case "lastNameInput": return this.lastNameInput;
            case "passwordInput": return this.passwordInput;
            case "registerButton": return this.registerButton;
            case "successText": return this.successText;


            //Ethem
            case "sigin": return this.signin;
            case "email": return this.email;
            case "password": return this.password;
            case "siginlogin": return this.siginlogin;
            case "SiteMap": return this.SiteMap;
            case "Addresses": return  this.Addresses;
            case "adanewaddress": return this.adanewaddress;
            case "firstNameInputET": return this.firstNameInputET;
            case "lastNameInputET": return this.lastNameInputET;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zip": return this.zip;
            case "homephone": return this.homephone;
            case "mobilephone": return this.mobilephone;
            case "reference": return this.reference;
            case "saveButton": return this.saveButton;
            case "successTextET": return this.successTextET;

        }
        return null;
    }

    // Cansu_04_
    @FindBy(xpath="//a[@title='Women']")
    public WebElement buttonWomen;

    @FindBy(xpath="//li[@class='last']//span[@class='grower CLOSE']")
    public WebElement buttonDresses;

    @FindBy(xpath="(//a[@href='https://cleverppc.com/prestashop4/index.php?id_category=11&controller=category&id_lang=1'])[3]")
    public WebElement summerDress;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement msg;

    @FindBy(css = "a[title='Add to cart'] span")  // 5 taneli,
    public List<WebElement> addBUTTONSS;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dRESSESbutton;

    @FindBy(xpath = "//i[@class='icon-th-list']")
    public WebElement listelemeButonu;

    @FindBy(id = "add_to_cart") //urunlerın ıcıne tıklayınca olan ekeleme
    public WebElement ekleme;

    @FindBy(xpath = "//div[@class='button-container']/span")
    public WebElement continueButton;

    @FindBy(css = "h5[itemprop='name']")
    public List<WebElement> dressesNamesL1;

    @FindBy(xpath = "//p[@class='product-desc']")
    public List<WebElement> descriptions;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//span[@id='summary_products_quantity']")
    public WebElement cartContains;

    //Faruk_05_
    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dressesButton;


    // Cansu_06_

    // Vildan_07_

    @FindBy(css = "[title='Log in to your customer account']")
    public WebElement signIn;

    @FindBy(name="email")
    public WebElement eMail;

    @FindBy(name="passwd")
    public WebElement pass;

    @FindBy(css = "[name='SubmitLogin']")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[text()='Dresses'])[2]")
    public WebElement dresses;

    @FindBy(xpath = "//span[text()='Categories']")
    public WebElement scroll;

    @FindBy(xpath = "(//*[@title='Printed Dress'])[2]")
    public WebElement dress;

    @FindBy(xpath = "(//span[text()='Add to cart'])[1]")
    public WebElement addToCart;

    @FindBy(css = "[title='Close window']")
    public WebElement closeWindow;

    @FindBy(xpath = "//b[text()='Cart']")
    public WebElement cart;

    @FindBy(xpath = "//*[text()='Your delivery address']")
    public WebElement addressVild;

    @FindBy(xpath = "//span[text()='Proceed to checkout']")
    public WebElement proceedBtn;

    @FindBy(xpath = "( //*[ contains( text(), 'My address' )  ])[1]")
    public WebElement adressSelected;

    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement scroll2;


    @FindBy(xpath = "//*[text()='I agree to the terms of service and will adhere to them unconditionally.']")
    public WebElement checkBox;

    @FindBy(xpath = "(//*[ contains( text(), 'check' )  ])[2]")

    public WebElement proceedBtn1;
    @FindBy(css = "[id='paypal-standard-btn']")
    public WebElement payPal;

    @FindBy(xpath = "//*[ contains( text(), 'Şu anda bir şeylerin' )  ]")
    public WebElement payPalNagetiveMessage;

    @FindBy(css = "[id='ccbill-standard-btn']")

    public WebElement creditCard;

    @FindBy(xpath = "//body['Invalid request (1).']")

    public WebElement creditCardNegativeMessage;

    @FindBy(css = "[title='Pay by bank wire']")
    public WebElement bankWire;

    @FindBy(xpath = "(//span[text()='$33.00'])[2]")

    public WebElement totalPrice;

    @FindBy(xpath = "//p//span[text()='$33.00']")
    public  WebElement lastTotal;

    @FindBy(xpath = "//*[text()='I confirm my order']")
    public WebElement confirm;

    @FindBy(xpath = "//p[text()='Your order on Xu Clothing is complete.']")
    public WebElement confirmMessage;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div")
    public WebElement orderNumber;

    // Ihsan_08_

    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contactUs;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement customerService;

    @FindBy(id = "email")
    public WebElement emailIhs;

    @FindBy(id = "id_order")
    public WebElement orderReference;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(id = "uniform-fileUpload")
    public WebElement attachFile;

    @FindBy(xpath = "//button[@id='submitMessage' and @name='submitMessage']\n")
    public WebElement send;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement onay;

}
