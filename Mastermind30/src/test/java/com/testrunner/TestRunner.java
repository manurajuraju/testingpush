package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features="cucumberfeatures",
		glue="com.stepdefinition"
		
		
		
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
