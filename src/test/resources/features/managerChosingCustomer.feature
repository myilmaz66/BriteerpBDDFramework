@wip1
Feature:Manager chosing customer

  Background:
    Given user on the PoS WholeFoods page

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
    Then click on customer button
    And click on search for Customer
    Then type "Morgan Rose"
    And click on set custommer
    Then Customer should be set











  
  
