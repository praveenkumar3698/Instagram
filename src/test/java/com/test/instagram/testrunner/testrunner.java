package com.test.instagram.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@tag1", features = "src/test/resources/feature", glue = "com.test.instagram.stepdefenitions", plugin = {
		"pretty", "html:target/cucumber-html-report", "json:target/cucumber-report/cucumber.json" })
public class testrunner {

}
