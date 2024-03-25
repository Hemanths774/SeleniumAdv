Feature: OrangeHrm login page
@all @smoke
Scenario Outline: Login with Valid Credentials
Given navigate to Login page
When User enter valid Username<username>
And Enter valid Password<password>
And click on Login button
And Home page should be displayed
Then click on Logout button
Examples:
|username|password|
|admin|admin123|
|Admin|admin123|
 