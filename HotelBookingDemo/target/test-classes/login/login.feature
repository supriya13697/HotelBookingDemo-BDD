Feature: Hotel Login Functionality
Scenario: Username and password not entered
Given User is on login page
When Username password is blank
Then Display Error Message 'Please enter Username'

Scenario: Password is blank
Given User is on login page
When Username ig given but password is blank
Then Display Error Message 'Please enter Password'

Scenario: Invalid Username and Password 
Given User is on login page
When Invalid username password is entered
Then Display alert 'Invalid login'

Scenario: Valid Username and Password 
Given User is on login page
When username password are valid
Then go to registration form