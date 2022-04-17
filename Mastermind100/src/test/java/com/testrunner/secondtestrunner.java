package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		
		
	features="cucumbersecondfeatures",
	    glue="com.stepdefinition"
	    
	    
		
		)
public class secondtestrunner extends AbstractTestNGCucumberTests{
	
	
}