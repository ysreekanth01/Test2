Feature: Application login 



@webTest
Scenario: Home page default login
Given User is on netbanking login page
When user login into application with username "jin" and password "1234"
Then home page is populated
And cards displayed are "true"


@mobileTest
Scenario: Home page default login
Given User is on netbanking login page
When user sign up with following details 
| jenny | abcd | john@abcd.com | Australia | 3242353|
Then home page is populated
And cards displayed are "false"


Scenario Outline: Home page default login
Given User is on netbanking login page
When user login in to application with <username> and password <password>
Then home page is populated
And cards displayed are "true"
Examples:
|username|password|
|user1   |pass1   |
|user2   |pass2   |
|user3   |pass3   |
|user4   |pass4   |


