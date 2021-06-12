Feature: Login to Qaclickacademy Application

Scenario Outline: Postive test Validation for login
Given Intialiaze the browser with Chrome
And Navigate to "http://qaclickacademy.com" site
And Click on the Login Link in the Homepage to land in login page
When user enters <username> and <password>
Then Verify Login Should be Successful
And Close the browser Successfully

Examples:
|username 				|password|
|ps1436@gmail.com | 123456|
|siva@gmail.com		|12345|
