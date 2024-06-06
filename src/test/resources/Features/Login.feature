@Functional
Feature: feature 1 test case

	Background:
		Given Browser is open
@Smoke @Sanity
Scenario: check login scenario with username and password


	Given user is on login page
	When page is loaded successful
	And user enter username and password
	Then user logged in successful
@Regression
	Scenario: check login scenario with username and password

		Given user is on login page
		When page is loaded successful
		And user enter "asing" and "amd34"

		Then user logged in successful

	Scenario: check login scenario 1

		Given user is on login page
		When page is loaded successful
		And user enter <username> and <password>

			|amit    |a@swe   |
		Then user logged in successful

