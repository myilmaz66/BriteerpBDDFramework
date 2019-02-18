Feature: As a POSManeger7, I should be able to edit all PriceList

    Background:
    Given User navigates to odoo homepage
    When User clicks on BriteErpDemo link
    Then User puts email "in_pos_manager7@info.com" and password "KjKtfgrs36"
    And User clicks on login button
    Then User should be able to log in
    When User clicks on Point of Sale
    And User clicks on Pricelists link
    And User clicks on a random pricelist name

  Scenario: Check if PriceList name can be updated and saved after clicking on edit button
    And User clicks on edit button
    And User changes the name of the pricelist
    And User clicks on save button
    Then The name of the pricelist should match with what user put
    When User clicks on Pricelists link again
    Then User should see the updated name on pricelist name table

  Scenario: Discard any edited pricelist
    And User clicks on edit button
    And User changes the name of the pricelist
    And User types a code into "E-commerce Promotional Code" field
    And User clicks on "Allow to use on" dropdown and choose the second option
    And User deletes an item from "Pricelist Items" table
    And User clicks on discard button
    Then User should see the message
    When User clicks on "OK" button
    Then User should see the same info about the pricelist


