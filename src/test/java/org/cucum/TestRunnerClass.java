package org.cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\RAJA\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\Adactin.feature",glue="org.steps")
public class TestRunnerClass {

}
