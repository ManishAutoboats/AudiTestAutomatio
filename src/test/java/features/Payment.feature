Feature: payment funitonality

Scenario: Payment with card
Given user launch site url
When user enter username and password
And user click on button
Then validate sucesfull login
When user enter card number
And click on pay button
Then Validate sucesull order
