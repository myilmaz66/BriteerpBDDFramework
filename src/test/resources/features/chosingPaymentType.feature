Feature: Chosing payment type

  Background:
    Given "User" navigates to odoo homepage
    Then "login" page should be displayed
    And user logs in as a Manager
    Then "Odoo" should be displayed
    And user click on PointOfSale module
    Then user see "Point of Sale - Odoo" page
    Then user click on resume of Whole Foods Store
    Then "Odoo POS" Point Of sale page should be displayed

#  Scenario:
#    Then click on any product
#    And verify that product is added to cart
#    Then click on payment button
#    And user should see payment page
#    Then click on option CASH(USD)
#    And verify CASH(USD) is chosed

