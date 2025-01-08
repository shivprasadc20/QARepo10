
  Feature: Check signup functionality
    @Signup
    Scenario: To check sign up fetaure
      Given user click on sign up button
      Then user is navigating to sign up page
#      And verify Sending money from country drop down as United states by default
      Given User is able to select Business for sign up
      And user is able to select Individual for sign up
      Given User enters "Joan" in first text field
      And User enters "Bond" in second text field
      And User enters "7700250568" in text field
      And User enters "joanb@yopmail.com" in email text field
      And user selects  Terms & conditions checkbox
      And User selects Yes for marketing communication.
      And User selects NO for marketing communication.
      Given Verify with OTP button is visible
      When Click on Verify with OTP button is clickable
      Then user is navigating to OTP page & submit otp to verify.
      Given user is navigate to password page to set password
      And user enters password "Test@1234" on password page
      And user enters confirm password "Test@1234" on password page
      Given Signup button is visible
      When User click on Signup button
      Then User is navigating to sign up send money page
      Given Send money button is visible
      When User click on Send money button
      Then User is navigating to personal details about me page.
      Given User enters "34" in my age text field
      Then Verify correct DOB is reflecting in My Date of birth field
      Given User selects Gender from my gender section
      Given User enters "238954789" in My Social Security Number field
      Given User is able to select count of citizenship
      Given My Annual income drop down with options is visible
      And user selects income from drop down option
