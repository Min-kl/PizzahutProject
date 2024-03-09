Feature: Select Pizza and drinks

Scenario: Select items and validate price in cart
Given Customer logged in to pizzahut application
When Customer enter location
Then Select the first option of location
And Customer validate that Vegatarian option is disabled
When Customer selects pizza and added into cart
Then Customer selects drinks and add it to the cart
And Verify the price of selected pizza and drink
