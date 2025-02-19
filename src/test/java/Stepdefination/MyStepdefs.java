package Stepdefination;

import classes.Login;
import classes.Sendmoney;
import classes.SignUp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.io.IOException;

import static classes.Configurations.driver;

public class MyStepdefs {
    Login login=new Login();
    Sendmoney s= new Sendmoney();
    SignUp sp= new SignUp();
    @Given("User is on login page")
    public void user_is_on_login_page() {
        login.userIsOnLoginPage();
    }
    @When("User enters loginid {string}   & password {string}")
    public void user_enters_loginid_password(String userid, String password) throws IOException, InterruptedException {
        login.userEntersLoginidPassword(userid, password);
    }
    @When("Clicks Login button")
    public void clicks_login_button() throws IOException, InterruptedException {
        login.clicksLoginButton();
    }
    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.userIsNavigatedToTheHomePage();
    }
    @Given("Click on My profile button")
    public void clickOnMyProfileButton() throws InterruptedException {
        login.clickOnMyProfileButton();
    }
    @When("click on Logout button")
    public void clickOnLogoutButton() throws InterruptedException {
        login.clickOnLogoutButton();
    }
    @Then("User is logging out")
    public void userIsLogginOut() throws InterruptedException, IOException {
        login.userIsLoggingOut();
    }
    @Given("Bank transfer option is visible with the credit timelines message")
    public void bankTransferOptionIsVisibleWithTheCreditTimelinesMessage() {
      s.bankTransferOptionIsVisibleWithTheCreditTimelinesMessage();
    }
    @And("Select Bank transfer option is clickable")
    public void selectBankTransferOptionIsClickable() {
        s.selectBankTransferOptionIsClickable();
    }
    @When("User enters Amount {int}")
    public void userEntersAmount(int amount) throws InterruptedException {
      s.userEntersAmount(amount);
    }
    @Then("User is getting correct reciver amount to Reciever gets field")
    public void userIsGettingCorrectReciverAmountToRecieverGetsField() {
      s.userIsGettingCorrectReciverAmountToRecieverGetsField();
    }
    @And("User is able to see correct amount in breakup details with compare to Reciever amount")
    public void userIsAbleToSeeCorrectAmountInBreakupDetailsWithCompareToRecieverAmount() {
        s.userIsAbleToSeeCorrectAmountInBreakupDetailsWithCompareToRecieverAmount();
    }
    @Given("Sendmoney button is visible")
    public void sendmoneyButtonIsVisible() {
        s.sendmoneyButtonIsVisible();
    }
    @When("Sendmoney button is clickable user is navigating to select account details page")
    public void sendmoneyButtonIsClickableUserIsNavigatingToSelectAccountDetailsPage() {
        s.sendmoneyButtonIsClickableUserIsNavigatingToSelectAccountDetailsPage();
    }
    @Given("user click on sign up button")
    public void user_click_on_sign_up_button() throws InterruptedException {
     sp.user_click_on_sign_up_button();
    }
    @Then("user is navigating to sign up page")
    public void user_is_navigating_to_sign_up_page() {
    sp.user_is_navigating_to_sign_up_page();
    }
    @Then("verify Sending money from country drop down as United states by default")
    public void verify_sending_money_from_country_drop_down_as_united_states_by_default() {
   sp.verify_sending_money_from_country_drop_down_as_united_states_by_default();
    }
    @Given("User is able to select Business for sign up")
    public void user_is_able_to_select_business_for_sign_up() throws InterruptedException {
    sp.user_is_able_to_select_business_for_sign_up();
    }
    @Given("user is able to select Individual for sign up")
    public void user_is_able_to_select_individual_for_sign_up() throws InterruptedException {
    sp.user_is_able_to_select_individual_for_sign_up();
    }
    @Given("User enters {string} in first text field")
    public void userEntersInFirstTextField(String arg0) {
        sp.userEntersInFirstTextField(arg0);
    }
    @And("User enters {string} in second text field")
    public void userEntersInSecondTextField(String arg1) {
        sp.userEntersInSecondTextField(arg1);
    }
    @And("User enters {string} in text field")
    public void userEntersInTextField(String arg2) {
        sp.userEntersInTextField(arg2);
    }
    @And("User enters {string} in email text field")
    public void userEntersInEmailTextField(String arg3) {
        sp.userEntersInEmailTextField(arg3);
    }
    @Given("user selects  Terms & conditions checkbox")
    public void user_selects_terms_conditions_checkbox() {
   sp.user_selects_terms_conditions_checkbox();
    }
    @And("User selects Yes for marketing communication.")
    public void userSelectsYesForMarketingCommunication() throws InterruptedException {
        sp.userSelectsYesForMarketingCommunication();
    }
    @And("User selects NO for marketing communication.")
    public void userSelectsNOForMarketingCommunication() throws InterruptedException {
        sp.userSelectsNOForMarketingCommunication();
    }
    @Given("Verify with OTP button is visible")
    public void verify_with_otp_button_is_visible() throws IOException {
        sp.verify_with_otp_button_is_visible();
    }
    @When("Click on Verify with OTP button is clickable")
    public void click_on_verify_with_otp_button_is_clickable() throws InterruptedException {
        sp.click_on_verify_with_otp_button_is_clickable();
    }
    @Then("user is navigating to OTP page & submit otp to verify.")
    public void userIsNavigatingToOTPPageSubmitOtpToVerify() throws InterruptedException, IOException {
        sp.userIsNavigatingToOTPPageSubmitOtpToVerify();
    }
    @Given("user is navigate to password page to set password")
    public void userIsNavigateToPasswordPageToSetPassword() {
        sp.userIsNavigateToPasswordPageToSetPassword();
    }
    @And("user enters password {string} on password page")
    public void userEntersPasswordOnPasswordPage(String arg5) {
        sp.userEntersPasswordOnPasswordPage(arg5);
    }
    @And("user enters confirm password {string} on password page")
    public void userEntersConfirmPasswordOnPasswordPage(String arg6) {
       sp.userEntersConfirmPasswordOnPasswordPage(arg6);
    }
    @Given("Signup button is visible")
    public void signupButtonIsVisible() throws IOException {
       sp.signupButtonIsVisible();
    }
    @When("User click on Signup button")
    public void userClickOnSignupButton() throws InterruptedException {
        sp.userClickOnSignupButton();
    }
    @Then("User is navigating to sign up send money page")
    public void userIsNavigatingToSignUpSendMoneyPage() throws IOException, InterruptedException {
        sp.userIsNavigatingToSignUpSendMoneyPage();
    }
    @Given("Send money button is visible")
    public void sendMoneyButtonIsVisible() {
       sp.sendMoneyButtonIsVisible();
    }
    @When("User click on Send money button")
    public void userClickOnSendMoneyButton() throws InterruptedException {
     sp.userClickOnSendMoneyButton();
    }
    @Then("User is navigating to personal details about me page.")
    public void userIsNavigatingToPersonalDetailsAboutMePage() throws IOException {
    sp.userIsNavigatingToPersonalDetailsAboutMePage();
    }
    @Given("User enters {string} in my age text field")
    public void userEntersInMyAgeTextField(String arg9) {
        sp.userEntersInMyAgeTextField(arg9);
    }
    @Then("Verify correct DOB is reflecting in My Date of birth field")
    public void verifyCorrectDOBIsReflectingInMyDateOfBirthField() {
        sp.verifyCorrectDOBIsReflectingInMyDateOfBirthField();
    }
    @Given("User selects Gender from my gender section")
    public void userSelectsGenderFromMyGenderSection() {
sp.userSelectsGenderFromMyGenderSection();
    }
    @Given("User enters {string} in My Social Security Number field")
    public void UserEntersInMySocialSecurityNumberField(String arg10) {
        sp.UserEntersInMySocialSecurityNumberField(arg10);
    }
    @Given("User is able to select count of citizenship")
    public void userIsAbleToSelectCountOfCitizenship() throws IOException, InterruptedException {
        sp.userIsAbleToSelectCountOfCitizenship();

    }
    @Given("My Annual income drop down with options is visible")
    public void myAnnualIncomeDropDownWithOptionsIsVisible() throws IOException, InterruptedException {
        sp.myAnnualIncomeDropDownWithOptionsIsVisible();
    }
    @And("user selects income from drop down option")
    public void userSelectsIncomeFromDropDownOption() throws IOException, InterruptedException {
        sp.userSelectsIncomeFromDropDownOption();

    }

    @Given("My Occupation list drop down with options is visible")
    public void myOccupationListDropDownWithOptionsIsVisible() throws InterruptedException {
        sp.myOccupationListDropDownWithOptionsIsVisible();
    }

    @Given("user enters name {string} in Employer name text field")
    public void userEntersNameNameInEmployerNameTextField(String name) throws IOException {
        sp.userEntersNameNameInEmployerNameTextField(name);
        
    }

    @And("Click on Current address button")
    public void clickOnCurrentAddressButton() {
        sp.clickOnCurrentAddressButton();
    }

    @Then("navigate to my current address page")
    public void navigateToMyCurrentAddressPage() {sp.navigateToMyCurrentAddressPage();
    }
}
