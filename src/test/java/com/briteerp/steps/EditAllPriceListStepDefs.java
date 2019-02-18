package com.briteerp.steps;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import javax.security.auth.login.Configuration;

public class EditAllPriceListStepDefs {
    Pages pages = new Pages();


    @Given("User navigates to odoo homepage")
    public void user_navigates_to_odoo_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User clicks on BriteErpDemo link")
    public void user_clicks_on_BriteErpDemo_link() {
        pages.odoo().briteErpDemo.click();
    }

    @Then("User puts email {string} and password {string}")
    public void user_puts_email_and_password(String email, String password) {
        pages.loginPage().emailBox.sendKeys(ConfigurationReader.getProperty(email));
        pages.loginPage().passwordBox.sendKeys(ConfigurationReader.getProperty(password));
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        pages.loginPage().logInButton.click();
    }

    @Then("User should be able to log in")
    public void user_should_be_able_to_log_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User clicks on Point of Sale")
    public void user_clicks_on_Point_of_Sale() {
        pages.discussModulePage().pointOfSale.click();
    }

    @When("User clicks on Pricelists link")
    public void user_clicks_on_Pricelists_link() {
        pages.pointOfSaleModulePage().pricelistsLink.click();
    }
//===================================================================================================================================================================================


    @When("User clicks on a random pricelist name")
    public void user_clicks_on_a_random_pricelist_name() {

    }

    @When("User clicks on edit button")
    public void user_clicks_on_edit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User changes the name of the pricelist")
    public void user_changes_the_name_of_the_pricelist() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User clicks on save button")
    public void user_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("The name of the pricelist should match with what user put")
    public void the_name_of_the_pricelist_should_match_with_what_user_put() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User clicks on Pricelists link again")
    public void user_clicks_on_Pricelists_link_again() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User should see the updated name on pricelist name table")
    public void user_should_see_the_updated_name_on_pricelist_name_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


//======================================================================================================================================================================================

    @Given("User is on Pricelists page")
    public void user_is_on_Pricelists_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User types a code into {string} field")
    public void user_types_a_code_into_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User clicks on {string} dropdown and choose the second option")
    public void user_clicks_on_dropdown_and_choose_the_second_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User deletes an item from {string} table")
    public void user_deletes_an_item_from_table(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User clicks on discard button")
    public void user_clicks_on_discard_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User should see the message")
    public void user_should_see_the_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User should see the same info about the pricelist")
    public void user_should_see_the_same_info_about_the_pricelist() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
