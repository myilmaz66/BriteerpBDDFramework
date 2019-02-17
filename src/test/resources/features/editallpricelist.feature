Feature:
  Background: Opening the browser and navigating to Pricelists link
    Given User navigates to odoo homepage
    When User clicks on BriteErpDemo link
    And User puts email "in_pos_manager7@info.com" and password "KjKtfgrs36"
    And User clicks on login button
    And User clicks on Point of Sale
    And User clicks on Pricelists link

  Scenario: Check if PriceList name can be updated and saved after clicking on edit button
    Given User is on Pricelists page
    When User clicks on a random pricelist name
    And User clicks on edit button
    And User changes the name of the pricelist
    And User clicks on save button
    Then The name of the pricelist should match with what user put
    And User clicks on Pricelists link again
    Then User should see the updated name on pricelist name table