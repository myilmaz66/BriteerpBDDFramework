Feature: As a POSManeger7, I should be able to edit all PriceList

  Background:
    Given "User" navigates to odoo homepage
    When "User" clicks on "BriteErpDemo" link
    Then "User" should see the login page
    Then "User" logs in as a manager
    When "User" clicks on "Point of Sale" link
    And "User" clicks on "Pricelists" link
    And "User" clicks on "a random pricelist name"

  Scenario: Check if PriceList name can be updated and saved after clicking on edit button
    And "User" clicks on "Edit" button
    And "User" changes the name of the pricelist
    And "User" clicks on "Save" button
    Then The name of the pricelist should match with what user put
    When "User" clicks on "Pricelists" link
    Then "User" should see the updated name on pricelist name table

  Scenario: Discard any edited pricelist
    And "User" clicks on "Edit" button
    And "User" changes the name of the pricelist
    And "User" types a code into E-commerce Promotional Code field
    And "User" clicks on "Allow to use on" dropdown
    And "User" chooses the second option
    And "User" deletes an item from Pricelist Items table
    And "User" clicks on "Discard" button
    And "User" clicks on "Ok" button
    Then "User" should see the same info about the pricelist
  @wip
  Scenario: "Add and Delete Items in Pricelist Items field
    And "User" clicks on "Edit" button
    And "User" clicks on "Add an item" link
    Then "User" should see Global and Fix Price radio buttons are chosen by default
    When "User" clicks on "a random radio" button
    And "User" fills the required field
    And "User" clicks on "Save & Close" button
    Then "User" should see item count is increased by one
    When "User" clicks on "a random trash can" sign
    Then "User" should see item count is decreased by one






