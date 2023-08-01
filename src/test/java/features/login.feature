Feature: login funtioality

Scenario: verify login feature with valid deatils

Given user launch site Url
When user enter username and password
And user click on button
Then validate sucesfull login
Then Validate success message

Scenario: verify login feature with invalid deatils

Given user launch site Url
When user enter username and password
And user click on button
Then validate Error message
Then validate message
Then Vaidate login