Feature: SignIn features
user wants to check whether he is able to sign in or not

@mytest1
Scenario: user should validate whether four important links are present or not
	Given user is on correct website
	When user clicks on login button
	Then user should see the home page