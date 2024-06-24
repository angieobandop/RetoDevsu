## Author: natalia-09@outlook.com
#Scenario add cart the product of demoblaze

@Cart
Feature: Search page demoblaze for login to add products to cart

  As user web
  I want enter page of the products
  To add products to cart


  @LoginSuccessfully
  Scenario: login successfully

    Given angie is a demoblaze user with credentials
    When she enters credentials
    Then she should see the login successfully


  @CartSuccessfully
  Scenario: add 2 products to cart successfully and view cart

  Given angie is a demoblaze user with credentials
  When add a cell phone and Cell phone2 to cart
  Then verified that it is added

  @CompletePurchase
  Scenario: complete purchase form and finalize purchase

    Given angie is a demoblaze user with credentials
    When She looks at the cart and proceeds to fill out the purchase form
    Then finalize purchase and validate
