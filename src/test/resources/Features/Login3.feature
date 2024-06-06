Feature: feature 1 test case

	@Smoke
Scenario Outline: check login scenario with username and password parameter
		Given user is on login page
		When page is loaded successful
		And user enter <username> and <password>
		Then user logged in successful
	Examples:
	|username|password|
	|"usr1"    |"oass1"   |
	|"usr3"    |"oass2"   |



