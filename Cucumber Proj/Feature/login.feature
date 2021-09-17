Feature: Verify Login

@smoke
Scenario: Successful login with valid credentials
Given User is on login page
When User enters email and password
Then user should see logout link

@regression
Scenario: Unsuccessful login
Given user is directed to login page
When user enters invalid credentials
Then user should see error message "Invalid Credentials"