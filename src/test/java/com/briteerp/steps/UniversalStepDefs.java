package com.briteerp.steps;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.Pages;
import cucumber.api.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UniversalStepDefs  {
    Pages pages = new Pages();

    @And("{string} clicks on {string}")
    public void clicksOn(String user, String something) {
        switch (something.toLowerCase()) {
            case "a random pricelist name":
                BrowserUtils.wait(1);
                pages.pricelists().priceListNames.get(BrowserUtils.randomNumber(0,
                        pages.pricelists().priceListNames.size() - 1)).click();

                break;
        }
    }

    @And("{string} clicks on {string} button")
    public void clicksOnButton(String user, String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "edit":
                pages.pricelistEditCreate().editButton.click();
                int itemsCount = pages.pricelistSaveDiscardPage().deleteSigns.size();
                break;
            case "save":
                pages.pricelistSaveDiscardPage().saveButton.click();
                break;
            case "discard":
                pages.pricelistSaveDiscardPage().discardButton.click();
                break;
            case "ok":
                pages.pricelistSaveDiscardPage().okButton.click();
                break;
            case "Save & Close":
                pages.createPricelistItems().saveAndClose.click();
                break;
            case "a random radio":
                pages.createPricelistItems().ApplyOnButtons.get(BrowserUtils.randomNumber(0,
                        pages.createPricelistItems().ApplyOnButtons.size()-1));
                pages.createPricelistItems().computePriceButtons.get(BrowserUtils.randomNumber(0,
                        pages.createPricelistItems().computePriceButtons.size()-1));
                break;
        }
    }

    @When("{string} clicks on {string} link")
    public void clicksOnLink(String user, String linkName) {
        switch (linkName.toLowerCase()) {
            case "briteerpdemo":
                pages.odoo().briteErpDemo.click();
                break;
            case "point of sale":
                BrowserUtils.fluentWait(pages.discussModulePage().pointOfSale, 10);
                pages.discussModulePage().pointOfSale.click();
                break;
            case "pricelists":
                pages.pointOfSaleModulePage().pricelistsLink.click();
            case "add an item":
                pages.pricelistSaveDiscardPage().addAnItem2.click();
        }
    }

    @When("{string} clicks on {string} dropdown")
    public void clicks_on_dropdown(String userName, String dropdownName) {
        switch (dropdownName.toLowerCase()) {
            case "allow to use on":
                pages.pricelistSaveDiscardPage().allowToUseOnDropDown.click();
                break;
        }
    }

    @When("{string} clicks on {string} sign")
    public void clicksOnSign(String arg0, String signName) {
        switch (signName.toLowerCase()) {
            case "trash can":
                pages.pricelistSaveDiscardPage().deleteSigns.get(BrowserUtils.randomNumber(0,
                        pages.pricelistSaveDiscardPage().deleteSigns.size()-1 ));
                break;
        }
    }
}
