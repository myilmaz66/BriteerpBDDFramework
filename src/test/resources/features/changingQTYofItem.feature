Feature: Chosing qunatity of product


  Background:
    Given user on the "http://52.39.162.23/web/database/selector" page
    Then user click on BritErpDemo
    Then "login" page should be displayed
    And user logs in as a Manager
    Then "Odoo" should be displayed
    And user click on PointOfSale module
    Then user see "Point of Sale - Odoo" page
    Then user click on resume of Whole Foods Store
    Then "Odoo POS" Point Of sale page should be displayed

  Scenario:
Then click on any product
And verify that product is added to cart
Then click on QTY button
And Click on button 2
Then units should become 2
And price should be double