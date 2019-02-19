package com.briteerp.steps;


import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.Pages;
import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.briteerp.utilities.BrowserUtils.fluentWait;
import static com.briteerp.utilities.BrowserUtils.waitForClickablility;

public class EditAllPriceListStepDefs implements PricelistInfo{
    Pages pages = new Pages();
    String newPricelistName;
    int itemsCount;

    @Given("{string} navigates to odoo homepage")
    public void navigatesToOdooHomepage(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("{string} should see the login page")
    public void shouldSeeTheLoginPage(String arg0) {
        String expectedTitle = "Login | Website localhost";
        String expectedUrl = "http://52.39.162.23/web/login";
        Assert.assertEquals("Title is not matching", expectedTitle, Driver.getDriver().getTitle());
        Assert.assertEquals("URL is not matching", expectedUrl, Driver.getDriver().getCurrentUrl());
    }

    @Then("{string} logs in as a manager")
    public void logsInAsAManager(String arg0) {
        pages.loginPage().positiveLogIn();
    }

    @And("{string} changes the name of the pricelist")
    public void changesTheNameOfThePricelist(String arg0) {
        pages.pricelistSaveDiscardPage().pricelistName.clear();
        Faker faker = new Faker();
        newPricelistName = faker.commerce().productName();
        pages.pricelistSaveDiscardPage().pricelistName.sendKeys(newPricelistName);
    }

    @Then("The name of the pricelist should match with what user put")
    public void the_name_of_the_pricelist_should_match_with_what_user_put() {
        Assert.assertEquals(pages.pricelistEditCreate().pricelistName.getText(), newPricelistName);
    }

    @Then("{string} should see the updated name on pricelist name table")
    public void shouldSeeTheUpdatedNameOnPricelistNameTable(String arg0) {
        BrowserUtils.wait(1);
        List<String> allPriceListNames = BrowserUtils.getElementsText(pages.pricelists().priceListNames);
        Assert.assertTrue("Pricelist name was not found: ", allPriceListNames.contains(newPricelistName));
    }

    @And("{string} types a code into E-commerce Promotional Code field")
    public void typesACodeIntoECommercePromotionalCodeField(String arg0) {
        pages.pricelistSaveDiscardPage().eCommercePromotionalCodeBox.sendKeys("12070");
    }

    @And("{string} chooses the second option")
    public void choosesTheSecondOption(String arg0) {
        pages.pricelistSaveDiscardPage().allowToUseOn2Option.click();
    }

    @And("{string} deletes an item from Pricelist Items table")
    public void deletesAnItemFromPricelistItemsTable(String arg0) {
        pages.pricelistSaveDiscardPage().deleteSigns.get(BrowserUtils.randomNumber(0,
        pages.pricelistSaveDiscardPage().deleteSigns.size() - 1)).click();
    }

    @Then("{string} should see the message")
    public void shouldSeeTheMessage(String arg0) {

    }

    @Then("{string} should see the same info about the pricelist")
    public void shouldSeeTheSameInfoAboutThePricelist(String arg0) {
        System.out.println(pricelistName);
        Assert.assertEquals(pages.pricelistEditCreate().pricelistName.getText(), pricelistName);
        Assert.assertEquals(pages.pricelistEditCreate().eCommercePromotionalCodeBox.getText(), eCommercePromotionalCode);
        Assert.assertEquals(pages.pricelistEditCreate().selectedAllowToUseOn.getText(), allowToUseOn);
        Assert.assertEquals(pages.pricelistEditCreate().pricelistItems.size() + "", itemsCount);
    }

//--------------------------------------------Add and Delete Items in Pricelist Items field--------------------------------------------

    @Then("{string} should see Global and Fix Price radio buttons are chosen by default")
    public void shouldSeeGlobalAndFixPriceRadioButtonsAreChosenByDefault(String arg0) {
        Assert.assertTrue(pages.createPricelistItems().globalRadioBtn.isSelected());
        Assert.assertTrue(pages.createPricelistItems().fixPriceRadioBtn.isSelected());
    }
    @When("{string} clicks on {string} button on both fields")
    public void clicksOnButtonOnBothField(String arg0, String arg1) {
        int randomNumber = BrowserUtils.randomNumber(0, pages.createPricelistItems().ApplyOnButtons.size() - 1);
        if (randomNumber > 0) {
            pages.createPricelistItems().ApplyOnButtons.get(randomNumber).click();
            pages.createPricelistItems().productBox.get(randomNumber - 1).click();
            pages.createPricelistItems().productItems.get(BrowserUtils.randomNumber(0, pages.createPricelistItems().productItems.size() - 1)).click();
        } else {
            pages.createPricelistItems().ApplyOnButtons.get(randomNumber).click();
        }
    }
    @And("{string} fills the required field")
    public void fillsTheRequiredField(String arg0) {
        pages.createPricelistItems().computePriceButtons.get(BrowserUtils.randomNumber(0, pages.createPricelistItems().computePriceButtons.size() - 1)).click();
        pages.createPricelistItems().minQuantityBox.clear();
        pages.createPricelistItems().minQuantityBox.sendKeys("" + BrowserUtils.randomNumber(0, 10));
    }

    @Then("{string} should see that item count is increased by one")
    public void shouldSeeThatItemCountIsIncreasedByOne(String arg0) {
        Assert.assertEquals(pages.pricelistSaveDiscardPage().deleteSigns.size(), itemsCount+1);
    }

    @Then("{string} should see that itemcount is decreased by one")
    public void shouldSeeThatItemcountIsDecreasedByOne(String arg0) {
        Assert.assertEquals(pages.pricelistSaveDiscardPage().deleteSigns.size(), itemsCount - 1);
    }


}
