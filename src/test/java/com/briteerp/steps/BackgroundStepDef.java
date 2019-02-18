package com.briteerp.steps;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackgroundStepDef {

    Pages pages = new Pages();


    @Given("user on the {string} page")
    public void user_on_the_page(String currentUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), currentUrl );
    }

    @Then("user click on BritErpDemo")
    public void user_click_on_BritErpDemo() {
        pages.odoo().briteErpDemo.click();
    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String login) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(login));
    }


    @Then("user logs in as a Manager")
    public void user_logs_in_as_a_Manager() {
        pages.loginPage().positiveLogIn();
    }

    @Then("{string} should be displayed")
    public void should_be_displayed(String odoo) {

        Assert.assertTrue(Driver.getDriver().getTitle().equals(odoo) );

    }

    @Then("user click on PointOfSale module")
    public void user_click_on_PointOfSale_module() {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), 10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(pages.discussModulePage().pointOfSale));
        pages.discussModulePage().pointOfSale.click();

    }

    @Then("user see {string} page")
    public void user_see_page(String pointOfSaleTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.pointOfSale().resumeButton));
       Assert.assertEquals(Driver.getDriver().getTitle(),pointOfSaleTitle);
    }

    @Then("user click on resume of Whole Foods Store")
    public void user_click_on_resume_of_Whole_Foods_Store() {
        pages.pointOfSale().resumeButton.click();
    }

    @Then("{string} Point Of sale page should be displayed")
    public void point_Of_sale_page_should_be_displayed(String wholeFpOs) {
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
       wait.until(ExpectedConditions.elementToBeClickable(pages.wholeFoodsStorePage().customerButton));
      Assert.assertEquals(Driver.getDriver().getTitle(),wholeFpOs);
    }

}
