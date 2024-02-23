Feature: OrangeHRM Homepage
Scenario: Open the browser and enter the url and enter valid Un and pwd and click on login button

Given I will open the browser and enter the url
When  I will enter the Un and pwd and click on login button
Then 	Homepage should be displayed 
And 	I will logout and close the browser
