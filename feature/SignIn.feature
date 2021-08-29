Feature: SignIn features
user wants to check whether he is able to sign in or not

Scenario: user should validate whether four important links are present or not
	Given user is on signon page
	Then user should see four web links
	When user clicks on "SignOn"
	Then user should validate the url for "signOn"
	When user clicks on "register"
	Then user should validate the url for "register"
	When user clicks on "support"
	Then user should validate the url for "support"
	When user clicks on "contact"
	Then user should validate the url for "contact"
	

Scenario Outline: user shoud be able to sign in with valid credentials
	Given user is on signon page
	When  user enters username as "<username>"
	And   user enters password as "<password>"
	And  user clicks on submit 
	
	Examples:
		|username|passowrd|
		|apurv|1234|
		
	