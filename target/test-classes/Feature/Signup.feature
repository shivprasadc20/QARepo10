
  Feature: Check signup functionality
    @Signup
    Scenario: To check sign up fetaure
      Given user click on sign up button
      Then user is navigating to sign up page
#      And verify Sending money from country drop down as United states by default
      Given User is able to select Business for sign up
      And user is able to select Individual for sign up
      Given User enters "Aman" in first text field
      And User enters "Sharama" in second text field
      And User enters "8350220568" in text field
      And User enters "aman@yopmail.com" in email text field
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
      Given User enters "26" in my age text field
      Then Verify correct DOB is reflecting in My Date of birth field
      Given User selects Gender from my gender section
      Given User enters "230954789" in My Social Security Number field
      Given User is able to select count of citizenship
      Given My Annual income drop down with options is visible
      And user selects income from drop down option
#     Given My Occupation list drop down with options is visible
#     And user selects occupation from drop down
      Given user enters name 'ray' in Employer name text field
      When Click on Current address button
      Then navigate to my current address page






      @signuploginpage
      Scenario: To check sign up login fetaure
        Given User is on login page
        When User enters loginid 'vivan@yopmail.com'   & password 'Test@1234'
        When Clicks Login button
        Then User is navigating to sign up send money page
        Given Send money button is visible
        When User click on Send money button
        Then User is navigating to personal details about me page.
        Given User enters "34" in my age text field
        Then Verify correct DOB is reflecting in My Date of birth field
        Given User selects Gender from my gender section
        Given User enters "230954789" in My Social Security Number field
        Given User is able to select count of citizenship
        Given My Annual income drop down with options is visible
        And user selects income from drop down option
        Given My Occupation list drop down with options is visible
#        And user selects occupation from drop down
        Given user enters name 'Vivan' in Employer name text field
        When Click on Current address button
        Then navigate to my current address page





