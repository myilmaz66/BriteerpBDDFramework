Feature: Adding new customers in the same time

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
#Then double click on plus sign
#And 3 cashiers should be open
#Then for customer 1 add Car travel expenses
#Then for customer 2 add Hotel accommodation
#Then for customer 3 add Honda Accord
#And click on customer 1
#Then Car travel expenses should be in cart
#And click on customer 2
#Then Hotel accommodation should be in cart
#And click on customer 3
#Then Honda Accord should be in cart