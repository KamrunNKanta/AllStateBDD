Feature:Pay a Bill 
Background: Initiate driver

Scenario: Pay a bill using credentials

Given user move cursor to Pay a Bill
When user will choose PhoneNumber
Then user will provide a phone number
Then user will provide birth date
Then user will click pay now 

