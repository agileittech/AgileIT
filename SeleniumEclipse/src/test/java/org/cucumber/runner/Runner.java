package org.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources"},
                 glue =     {"org.cumcumber.basics"},
                 plugin = "html:test-output/bddreport/myreport.html",
                 tags   = "@ReqId1")
           
public class Runner {

}
