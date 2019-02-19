package com.briteerp.steps;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.Pages;
import cucumber.api.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UniversalStepDefs {
    Pages pages = new Pages();

    @And("{string} clicks on {string} button")
    public void clicksOnButton(String user, String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "edit":
                pages.pricelistEditCreate().editButton.click();
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
            case "save & close":
                pages.createPricelistItems().saveAndClose.click();
                BrowserUtils.wait(1);
                break;
            case "a random radio":
                pages.createPricelistItems().ApplyOnButtons.get(BrowserUtils.randomNumber(0,
                        pages.createPricelistItems().ApplyOnButtons.size() - 1));
                pages.createPricelistItems().computePriceButtons.get(BrowserUtils.randomNumber(0,
                        pages.createPricelistItems().computePriceButtons.size() - 1));
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
                BrowserUtils.wait(2);
                pages.discussModulePage().pointOfSale.click();
                break;
            case "pricelists":
                pages.pointOfSaleModulePage().pricelistsLink.click();
                break;
            case "add an item":
                pages.pricelistSaveDiscardPage().addAnItem2.click();
                break;
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
            case "a trash can":
                pages.pricelistSaveDiscardPage().deleteSigns.get(pages.pricelistSaveDiscardPage().deleteSigns.size() - 1).click();
                BrowserUtils.wait(1);
                break;
            case "forward arrow":
                pages.pricelistSaveDiscardPage().forwardArrowButton.click();
                BrowserUtils.wait(1);
                break;
            case "back arrow":
                pages.pricelistSaveDiscardPage().backArrowButton.click();
                BrowserUtils.wait(1);
                break;
        }
    }
}
