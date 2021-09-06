Feature: Signin


@HomeCA
Scenario: User can signin successfully 
Given Open application "<URL>"
Then user click on signin button
Then enter username and password and click signin
Then verify user can signin