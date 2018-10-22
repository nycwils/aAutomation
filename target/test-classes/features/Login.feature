Feature: Application Login


#Background:
#Given validate the broser
#When Browser is triggered
#Then check if browser is started

#@RegressionTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "wilson" and password "password"
Then Home page is populated
And Cards are not displayed are "true"

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and password "wrongpassword"
Then Home page is populated
And Cards are not displayed are "false"

Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login in to application with <Username> and password <Password>
Then Home page is populated
And Cards are not displayed are "false"

Examples:
|Username|Password|
|user1   |pass1   |
|user2   |pass2   |


