package com.briteerp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        plugin = {
        		"json:target/cucumber.json",
        		"html:target/cucumber/",
        		"rerun:target/rerun.txt"}
)
public class FailedScenarios {

}