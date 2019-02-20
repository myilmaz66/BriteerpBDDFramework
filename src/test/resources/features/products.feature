Feature:

  Background:
    Given "User" navigates to odoo homepage
    When "User" clicks on "BriteErpDemo" link
    Then "User" should see the login page
    Then "User" logs in as a manager
    When "User" clicks on "Point of Sale" link
    And "User" clicks on "Products" link
    And "User" clicks on "Create" button

    Scenario: