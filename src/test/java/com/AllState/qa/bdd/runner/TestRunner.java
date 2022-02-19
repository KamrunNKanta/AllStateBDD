package com.AllState.qa.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"},
		glue= {"classpath:/com/AllState/qa/bdd/steps"},
		monochrome = true,
		dryRun = true,
		plugin = {"json:target/jsonReport.json", "junit:target/xmlReport.xml", "html:target/htmlReport.html"}
		)
public class TestRunner {
	

}
