package com.pagelibrary;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources",
				glue={"com.pagelibrary"},
				format={"pretty","html:test-output/html.xml","json:test-output/json.xml"},
				strict=true,
				monochrome=true,
				dryRun=false)

public class TestRunner {
	
}
