package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue="com.stepDef",
		monochrome=true,
		plugin = {
					"pretty","junit:target/JUnitReports/report.xml",
					"html:target/HTMLReports/report.html",
					"json:target/JSONReports/Cucumber.json"
					}

		
		)
public class TestRunner {

}
