Feature: Discount for item

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
#    Then click on Honda Accord
#    And verify that product is added to cart
#    Then price should be "24.000"
#    And click on Disc button
#    Then click on five and zero
#    And verify price is "12.000"