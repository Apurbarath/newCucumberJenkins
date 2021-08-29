Feature: SignIn features
user wants to check whether he is able to sign in or not

@Belgium
Scenario: user should validate whether four important links are present or not
	Given user is on belgium dashboard
	When user clicks on belgium login button
	Then user should see the belgium home page