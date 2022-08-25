Feature: Validation of SauceDemo

  #Author:Aniket
  Background: Login with valid credential
    Given Open the browser
    When Enter valid username "username" and Password "password"
    Then execute successfully

  @smoke @regression
  Scenario: User will be able to Add items to cart
    Then Add To Cart

  @regression
  Scenario: User will be able to go to checkout page
    Then Add To Cart
    And Enter firstname "firstname" lastname "lastname" and postalcode "postalcode"

  @important @smoke
  Scenario: User will be able to confirm the order
    Then Add To Cart
    And Enter firstname "firstname" lastname "lastname" and postalcode "postalcode"
    And Bill output
