package com.briteerp.steps;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Pages;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import com.briteerp.utilities.Driver;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

   protected Pages pages;

    @Before
    public void setup() {
        pages = new Pages();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();

    }

    @Before
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("I am reporting the results");
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        System.out.println("Closing driver");
        Driver.closeDriver();
    }
}
