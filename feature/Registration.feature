Feature: Registration features
user wants to check whether he is able to register or not

@mytest
Scenario Outline: User passes his information and register himself
		Given user is on register page
		When user enters firstname as "<firstName>"
		And user enters lastname as "<lastName>"
		And user enters phone number as "<phoneNumber>"
		And user enters email as "<email>"
		And user enters address as "<address>"
		And user enters city as "<city>"
		And user enters state as "<state>"
		And user enters postal code as "<postal_code>"
		And user selects country as "<country_name>"
		And user enters username "<userName>"
		And user enters password "<password>"
		And user enters confirm password "<password>"

Examples:		
		|firstName|lastName|phoneNumber|email|address|city|state|postal_code|country_name|userName|password|confirm_password|
		|Apurv|Rath|727727272|apu@gmail.com|MG Road Kolkata|kolkata|West Bengal|721507|INDIA|apurv04|Ap1234|Ap1234|