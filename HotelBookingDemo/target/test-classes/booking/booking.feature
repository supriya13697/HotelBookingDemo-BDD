Feature: Hotel Booking Functionality
Scenario: Firstname not entered
Given User is on hotel booking page
When Firstname is blank
Then Display Error Message 'Please enter Firstname'

Scenario: Lastname not entered
Given User is on hotel booking page
When Firstname is given but lastname is blank
Then Display Error Message 'Please enter Lastname'

Scenario: Email not entered 
Given User is on hotel booking page
When Email is blank
Then Display alert 'Please enter email'

Scenario: Mobile Number not entered 
Given User is on hotel booking page
When Mobile Number is blank
Then Display alert 'Please enter mobile number'

Scenario: Invalid Email 
Given User is on hotel booking page
When Invalid email is entered
Then Display alert 'Invalid email'

Scenario: Invalid Mobile Number 
Given User is on hotel booking page
When Invalid Mobile Number is entered
Then Display alert 'Invalid Mobile Number'

Scenario: Gender not selected 
Given User is on hotel booking page
When Gender is not selected
Then Display alert 'Please select gender'

Scenario: City not entered 
Given User is on hotel booking page
When City is not choosen
Then Display alert 'Please select city'

Scenario: State not entered 
Given User is on hotel booking page
When State is not chosen
Then Display alert 'Please select state'

Scenario: Type of room not selected 
Given User is on hotel booking page
When Type of room is not selected
Then Display alert 'Please select type of room'

Scenario: Card Holder name not entered 
Given User is on hotel booking page
When Card Holder name is not entered
Then Display alert 'Please enter Card Holder name'

Scenario: Debit card number not entered 
Given User is on hotel booking page
When Debit card number is not entered
Then Display alert 'Please enter Debit card number'

Scenario: CVV not entered 
Given User is on hotel booking page
When CVV is not entered
Then Display alert 'Please enter CVV'

Scenario: Expiration month not entered 
Given User is on hotel booking page
When Expiration month is not entered
Then Display alert 'Please enter Expiration month'

Scenario: Expiration year not entered 
Given User is on hotel booking page
When Expiration year is not entered
Then Display alert 'Please enter Expiration year'

Scenario: Valid Details
Given User is on hotel booking page
When All details are valid
Then go to sucess form