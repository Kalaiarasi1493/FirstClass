package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Featurefile\\Login1.feature"},glue = {"com.stepdefinition"},monochrome = true,dryRun=false)


public class TestRunner {

}
