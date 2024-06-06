@login2
Feature: feature 1 test case
@Regression
Scenario: check login scenario with username and password

	Given user is on login page
	When page is loaded successful
	And user enter "asing" and "amd34"

	Then user logged in successful
@Amit
	Scenario: check login scenario 1

		Given user is on login page
		When page is loaded successful
		And user enter <username> and <password>

			|amit    |a@swe   |
		Then user logged in successful


