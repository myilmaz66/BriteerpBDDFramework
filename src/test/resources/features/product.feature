@naser
Feature: As a POSManeger 7 user should be able to create new products.
  Background:
    Given "User" navigates to odoo homepage
    When "User" clicks on "BriteErpDemo" link
    Then "User" should see the login page
    Then "User" logs in as a manager
    When "User" clicks on "Point of Sale" link
    And "User" clicks on "Pricelists" link
    And "User" clicks on a random pricelist name

  Scenario: Create new product on ProductsPage
    And user clicks on Products link under Catalog
    And user clicks on create button
    And user creates new product
    And user clicks on save button
    Then user clicks on create button
    When user clicks on products link
    Then user should see the updated name on products name table

  Scenario:Test Import product on ProductsPage
    And user clicks on Products link
    And user clicks on Import button
    And user clicks on Load File button
    Then user selects file
    When user clicks on Test Import button
    Then user should see the result of testing products

  Scenario:Check products information
    And user clicks on List box
    When user clicks on any product
    Then user should check products information

  Scenario:Edit products information
    And user clicks on List box
    And user clicks on any product
    When user clicks on Edit button
    Then user can able to edit products information

  Scenario:Invoicing the products
    And user clicks on create button
    When user clicks on Invoicing button
    Then user should able to fill out the invoicing page