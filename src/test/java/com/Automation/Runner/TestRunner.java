package com.Automation.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\aniket.1\\eclipse-workspace\\Cucumber_SauceDemo_GlobalLogic\\src\\test\\resources\\Feature" }, 
glue = "com.Automation.StepsDef",
plugin = {"html:reports/reports.html", "json:target/cucumber.json", "rerun:target/rerun.txt"},
tags="(@regression or @smoke) and @important"
)


public class TestRunner {

}
