package classes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.zeromq.SocketType;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static classes.Configurations.driver;
import static classes.Configurations.testdata;

public class SignUp extends Basefunction {

    @FindBy(xpath = "//div[text()=\"Sign Up\"]")
    private WebElement tabsignup;
    @FindBy(xpath = "//input[@class=\"input css-1cwyjr8 r-wbaqdt\"]")
    private WebElement country;
    @FindBy(xpath = "//div[text()=\"Individual\"]")
    private WebElement individual;
    @FindBy(xpath = "//div[text()=\"Business\"]")
    private WebElement business;
    @FindBy(xpath = "//div[text()=\"First Name\"]/following-sibling::input")
    private WebElement firstname;
    @FindBy(xpath = "//div[text()=\"Last Name\"]/following-sibling::input")
    private WebElement lastname;
    @FindBy(xpath = "//div[text()=\"Mobile Number\"]/following-sibling::input")
    private WebElement mobile;
    @FindBy(xpath = "//div[text()=\"Email Address\"]/following-sibling::input")
    private WebElement email;
    @FindBy(xpath = "//img[@alt=\"checkbox\"]")
    private WebElement checkbox;
    @FindBy(xpath = "//div[text()=\"Yes\"]")
    private WebElement yes;
    @FindBy(xpath = "//div[text()=\"Yes\"]")
    private WebElement no;
    @FindBy(xpath = "//div[text()=\"Verify With OTP\"]")
    private WebElement otpbtn;
    @FindBy(xpath = "//div[text()=\"Submit\"]")
    private WebElement submit;
    //    @FindBy(xpath = "//div[@class='css-1dbjc4n r-19fu0aa r-13ui10z r-1544tr9 r-1ui5ee8 r-1ph75f1 r-zso239" +
//            " r-1mnahxq r-bnwqim r-q4m81j r-cfp7ip']//input[@aria-label='See an informative alert']")private WebElement otp;
    @FindBy(xpath = "//div[text()=\"Resend OTP\"]")
    private WebElement resendotp;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-18u37iz r-mvpalk']")
    private WebElement timer;
    @FindBy(xpath = "//div[text()=\"Enter Password\"]/following-sibling::input")
    private WebElement newpassword;
    @FindBy(xpath = "//div[text()=\"Confirm Password\"]/following-sibling::input")
    private WebElement confpassword;
    @FindBy(xpath = "//div[text()=\"Sign Up\"]")
    private WebElement signup;
    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1777fci r-d9fdf6']" +
            "//div[@id='nca_send_money']//div[@id='nca_send_money']")
    private WebElement sendmoneybtn;
//    @FindBy(xpath = "//div[text()=\"My Age\"]")
//    private WebElement myagefield;
//    @FindBy(xpath = "//div[@class='css-1dbjc4n r-eqz5dr r-1wcu1vj r-gmdvlt']//input[@aria-label='See an informative alert']")
//    private WebElement mydob;
    @FindBy(xpath = "//div[text()=\"My Gender\"]")
    private WebElement genderheading;
    @FindBy(xpath = "//div[text()=\"Male\"]")
    private WebElement male;
    @FindBy(xpath = "//div[text()=\"Female\"]")
    private WebElement female;
    @FindBy(xpath = "//div[text()=\"Transgender\"]")
    private WebElement transgender;
    @FindBy(xpath = "//div[text()=\"My Social Security Number\"]//following-sibling::input")
    private WebElement ssn;
    @FindBy(xpath = "//div[text()=\"United States of America\"]")
    private WebElement usa;
    @FindBy(xpath = "//div[text()=\"India\"]")
    private WebElement india;


    public SignUp() {
        PageFactory.initElements(driver, this);
    }

    public void user_click_on_sign_up_button() throws InterruptedException {
        driver.navigate().to(testdata.getProperty("applicationurl"));
        Thread.sleep(5000);
        tabsignup.click();
        Thread.sleep(4000);
    }

    public void user_is_navigating_to_sign_up_page() {
        String Actualurl = "https://money2indiauat.icicibank.com/usa/registration/individual";
        String expectedurl = driver.getCurrentUrl();
        if (Actualurl.equals(expectedurl)) {
            System.out.println("url verification passed:" + Actualurl);
        } else {
            System.out.println("url verification failed");
            driver.quit();
        }
    }

    public void verify_sending_money_from_country_drop_down_as_united_states_by_default() {
        String selectedcountry = country.getText();
        System.out.println(selectedcountry);
    }

    public void user_is_able_to_select_business_for_sign_up() throws InterruptedException {
        business.click();
        Thread.sleep(2000);
    }

    public void user_is_able_to_select_individual_for_sign_up() throws InterruptedException {
        individual.click();
        Thread.sleep(2000);
    }

    public void userEntersInFirstTextField(String arg0) {
        firstname.sendKeys(arg0);
    }

    public void userEntersInSecondTextField(String arg1) {
        lastname.sendKeys(arg1);
    }

    public void userEntersInTextField(String arg2) {
        mobile.sendKeys(arg2);
    }

    public void userEntersInEmailTextField(String arg3) {
        email.sendKeys(arg3);
    }

    public void user_selects_terms_conditions_checkbox() {
        checkbox.click();
    }

    public void userSelectsYesForMarketingCommunication() throws InterruptedException {
        yes.click();
        Thread.sleep(2000);
    }

    public void userSelectsNOForMarketingCommunication() throws InterruptedException {
        no.click();
        Thread.sleep(1000);
    }

    public void verify_with_otp_button_is_visible() throws IOException {
        System.out.println(otpbtn.getText());
        screenshot(driver, "signupfirstpage");
    }

    public void click_on_verify_with_otp_button_is_clickable() throws InterruptedException {
        otpbtn.click();
        Thread.sleep(25000);
    }

    public void userIsNavigatingToOTPPageSubmitOtpToVerify() throws InterruptedException, IOException {
        screenshot(driver, "otp page");
    }

    public void userIsNavigateToPasswordPageToSetPassword() {
        WebElement text = driver.findElement(By.xpath("//div[text()=\"Set a password\"]"));
        System.out.println(text.getText());
    }

    public void userEntersPasswordOnPasswordPage(String arg5) {
        newpassword.sendKeys(arg5);
    }

    public void userEntersConfirmPasswordOnPasswordPage(String arg6) {
        confpassword.sendKeys(arg6);
    }

    public void signupButtonIsVisible() throws IOException {
        System.out.println(signup.getText());
        screenshot(driver, "password page");
    }
    public void userClickOnSignupButton() throws InterruptedException {
        signup.click();
        Thread.sleep(8000);
    }
    public void userIsNavigatingToSignUpSendMoneyPage() throws InterruptedException, IOException {
        String currenturl1 = "https://money2indiauat.icicibank.com/usa/send-money-for-new-user";
        String Expectedurl1 = driver.getCurrentUrl();
        screenshot(driver, "signupsendmoneypage");
        if (currenturl1.equals(Expectedurl1)) {
            System.out.println("URL Verification passed:" + currenturl1);
        } else {
            System.out.println("URL Verification failed");
            driver.quit();
        }
    }

    public void sendMoneyButtonIsVisible() {
        System.out.println(sendmoneybtn.getText());
    }
    public void userClickOnSendMoneyButton() throws InterruptedException {
        sendmoneybtn.click();
        Thread.sleep(3000);
    }
    public void userIsNavigatingToPersonalDetailsAboutMePage() throws IOException {
        String currenturl2 = "https://money2indiauat.icicibank.com/usa/personal-detail";
        String expectedurl2 = driver.getCurrentUrl();
        screenshot(driver, "personaldetailsaboutmepage");
        if (expectedurl2.equalsIgnoreCase(currenturl2)) {
            System.out.println("url verification passed:" + expectedurl2);
        } else {
            System.out.println("url verification failed");
            driver.quit();
        }
    }
    public void userEntersInMyAgeTextField(String arg9) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        // Wait for the input element within the div that has the text "My Age"
        WebElement myAgeField = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//div[text()='My Age']/following-sibling::input")));
        myAgeField.sendKeys(arg9);
    }
    public void verifyCorrectDOBIsReflectingInMyDateOfBirthField() {
        String actualdob = "07/01/1991";
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement mydob = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//*[text()=\"My Date Of Birth\"]//following-sibling::input[@type=\"text\"]")));
        String expecteddob = mydob.getText();
        if (actualdob.equals(expecteddob)) {
            System.out.println("Date of birth verification is passed:" + expecteddob);
        } else {
            System.out.println("Date of birth verification is failed:" + expecteddob);
//            driver.quit();
        }
    }
    public void userSelectsGenderFromMyGenderSection() {
        System.out.println(genderheading.getText());
        female.click();
        transgender.click();
        male.click();
    }
    public void UserEntersInMySocialSecurityNumberField(String arg10) {
        ssn.sendKeys(arg10);
    }
    public void userIsAbleToSelectCountOfCitizenship() throws InterruptedException, IOException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        // Click on the dropdown to open options
////        WebElement countryOptions = wait.until(ExpectedConditions.elementToBeClickable
////        (By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-42olwf r-1f0042m r-p1pxzi r-1joea0r r-1j6l8hp']" +
////                "//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']")));
//       //div[@class="r-6dt33c css-1dbjc4n"]//div[text()="Others (Choose One)"]
//        WebElement countryOptions = wait.until(ExpectedConditions.visibilityOfElementLocated
//            (By.xpath("//div[@class=\"r-6dt33c css-1dbjc4n\"]" +
//                    "//div[@class=\"css-1dbjc4n r-1kihuf0 r-qklmqi r-gxnn5r r-13l2t4g r-13yce4e r-5os0gu r-1or9b2r r-q1p0lz r-5soawk\"]")));
////        WebElement countryOptions= driver.findElement(By.xpath("//div[contains(text(),\"Others\")]"));
//        countryOptions.click();
//        screenshot(driver, "dropdownoptionlist");
//        List<WebElement> options = driver.findElements(By.xpath("//div[@class=\"css-901oao r-1larm2r r-wbaqdt\"]"));
//        // Loop through each option and print its value
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//            if(option.getText().equalsIgnoreCase("Afghanistan"))
//            {
//                option.click();
//            }
//        }
//        Thread.sleep(3000);
        usa.click();
        Thread.sleep(1000);
        india.click();
    }
    public void myAnnualIncomeDropDownWithOptionsIsVisible() throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        // Wait until the dropdown element is clickable and then click it
        WebElement income = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='css-1dbjc4n r-848iym r-bnwqim r-1co9hmh']" +
                "/div[text()='My Annual Income']")));
        income.click(); // Take a screenshot after opening the dropdown screenshot(driver,"incomelist");
        // Wait for the options to be visible and then find all the options
        List<WebElement> incomeOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='css-901oao r-1larm2r r-wbaqdt']")));
        // Loop through each option and print its value
        for (WebElement option : incomeOptions) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase("0-50,000 USD")) {
                option.click(); break;
                // Exit the loop after selecting the option
                }
        }
    }
    public void userSelectsIncomeFromDropDownOption() throws IOException {
        WebElement occupation= driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-848iym r-bnwqim r-1co9hmh\"]" +
                "/div[contains(text(),\"My Occupation\")]"));
        occupation.click();
        screenshot(driver,"ocuupationlist");
        List<WebElement> occupationoptions=driver.findElements(By.xpath("//div[@class=\"css-1dbjc4n r-18wd4mo r-qklmqi r-18u37iz r-1sp51qo\"]" +
                "/div[@class=\"css-901oao r-1larm2r r-wbaqdt\"]"));
        for(WebElement occupationoptions1:occupationoptions)
        {
            System.out.println(occupationoptions1.getText());
            if(occupationoptions1.getText().equalsIgnoreCase("Accountant"))
            {
                occupationoptions1.click();
            }
        }
    }
}

