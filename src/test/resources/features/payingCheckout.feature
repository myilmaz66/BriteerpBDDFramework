Feature: Paying for item


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
#Then chose Honda accord
#And verify that product is added to cart
#Then click on payment button
#And user should see payment page
#Then click on option CASH(USD)
#And verify CASH(USD) is chosed
#Then enter in tendered 30.000
#And 30.000 should be displayed
#Then verify change is 6.000
#And click on validate button
#Then click on print recepit
#And printing details should be displayed