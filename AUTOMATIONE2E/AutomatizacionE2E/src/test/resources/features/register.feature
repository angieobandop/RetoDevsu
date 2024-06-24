## Author: natalia-09@outlook.com
#Scenario Register and login demoblaze

@Login
Feature: Search page demoblaze for the register And login

  As user web
  I want to register
  To enter page of the products

  @RegisterSuccessfully
  Scenario: register successfull

    Given angie is a demoblaze user without credentials
    When she enters information necessary to create a user
    Then she should register successfully
