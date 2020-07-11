Feature: Search for vegetables

@searchTest
Scenario: Search veggies
Given user logins to the green page
When search for "Cucumber"
Then results for "Cucumber" will be retrieved

@searchTest
Scenario: Search veggies
Given user logins to the green page
When search for "Brinjal"
Then results for "Brinjal" will be retrieved
And items added to the cart
And user navigated to checkout
Then "Brinjal" is displayed
