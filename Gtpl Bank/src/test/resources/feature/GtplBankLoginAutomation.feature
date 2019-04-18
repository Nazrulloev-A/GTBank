Feature: Login to Bank account with valid credentials

@login
Scenario: Login with valid Crrdentials 

Given user should be on the login page of Gtpl Bank
When user should enter the valid UserId and Password
Then user should click to Login Button to log succesfully