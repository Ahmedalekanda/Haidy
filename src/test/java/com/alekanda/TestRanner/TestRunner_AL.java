package com.alekanda.TestRanner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.alekanda.Utill.TestBase_AL;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = {"src/test/resourse/Featuress"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDepAL", tags= {"@HomeCA"})


public class TestRunner_AL extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	
	public void lunchApplicatationURL() {
		TestBase_AL launchh = new TestBase_AL();
		launchh.initzz();	
		
	}
	@AfterTest
	
	public void CloseApplicationURL() {
	
		TestBase_AL launchh = new TestBase_AL();
		launchh.driver.quit();
	}
	

}
