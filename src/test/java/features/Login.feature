Feature: Application Login

@regTest
Scenario: Home Page Default login
Given user is on landing page
When user login into an application with "ammu" and password "sen2"
Then Home page is displayed
And Cards are displayed

@smokeTest
Scenario: Home Page Default login
Given user is on landing page
When user login into an application with "John" and password "sen1"
Then Home page is displayed
And Cards are displayed

@smokeTest
Scenario: Home Page Default login
Given user is on landing page
When user signup with details
| senthil | abcg | senthil@gmail.com | india | america|
Then Home page is displayed
And Cards are displayed

@regTest
Scenario Outline: Home Page Default login
Given user is on landing page
When user login with <uname> and <password>
Then Home page is displayed
And Cards are displayed

Examples:
|uname|password|
|sen1 |sen2    |
|sen2 | sen3   |

