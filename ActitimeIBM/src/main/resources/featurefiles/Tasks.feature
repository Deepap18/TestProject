@tasks
Feature: This feature is used to test tasks

@createcustomer
Scenario: This scenario is to test create Customer
Given an user opens browser and URL
#When the user enters username and password
#And click on login button
#Then the Login page should be displayed
#When the user clicks on tasks tabs
#Then the tasks page should be displayed
#When the User clicks on Add new Customre button
#And cliuck on New customer link
#Then the pop up should appear to enter the details

@deleteCustomer
Scenario: This scenario is to test delete Customer
Given an user opens browser and URL
When the user enters username and password
And click on login button
Then the Login page should be displayed
When the user clicks on tasks tabs
Then the tasks page should be displayed
And click on the steeting button
And clicks on actions button
And clicks on Delete button
And clicks on DeletePermanentely Button
Then the customer should be deleted

