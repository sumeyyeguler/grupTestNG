package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlloverPage {

    public AlloverPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;
    @FindBy(xpath = "//*[text()='Register']")
    public WebElement register;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeAVendor;

    @FindBy(css = "#user_email")
    public WebElement email;

    @FindBy(xpath = "//*[@name='wcfm_email_verified_input']")
    public WebElement verficationCode;
    @FindBy(xpath = "//*[@name='loginfmt']")
    public WebElement outlookmail;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement ileri;
    @FindBy(xpath = "//*[@type='password']")
    public WebElement password;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement oturumAc;
    @FindBy(id = "idBtn_Back")
    public WebElement hayir;

    @FindBy(xpath = "//*[text()='Gereksiz E-posta']")
    public WebElement gereksiz;
    @FindBy(xpath = "(//div[@class='customScrollBar jEpCF']//div/div)[2]")
    public WebElement ilkMesaj;
    @FindBy(xpath = "//*[@style='margin:0 0 16px']/b")
    public WebElement sayi;
    @FindBy(css = "#passoword")
    public WebElement alloverpassword;
    @FindBy(xpath = "//*[id='confirm_pwd']")
    public WebElement confirmPassword;

    @FindBy(id = "wcfm_membership_register_button")
    public WebElement registerButton;
    @FindBy(xpath = "//*[text()='Not right now']")
    public WebElement simdiDegil;

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;
    @FindBy(xpath = "(//a[text()='Account details'])[1]")
    public WebElement acoutdetails;
    @FindBy(xpath = "//*[@id='account_first_name']")
    public WebElement ilkname;
    @FindBy(xpath = "//*[@id='account_last_name']")
    public WebElement lastname;
    @FindBy(xpath = "//*[@id='account_email']")
    public WebElement emaildegistir;
    @FindBy(xpath = "//*[text()='Save changes']")
    public WebElement savechanges;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInEmail;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myAccount;

    //My Account
    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[1]")
    public WebElement orders;

    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[2]")
    public WebElement downloads;

    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[3]")
    public WebElement adresses;

    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[4]")
    public WebElement accountDetails;

    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[5]")
    public WebElement wishList;

    @FindBy(xpath = "(//p[@class='text-uppercase text-center mb-0'])[6]")
    public WebElement logout;


}
