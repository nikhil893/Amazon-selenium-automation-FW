package com.VIP.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",//to tell cucumber where is ur feature file
        glue = "com.VIP.StepDefs",// to tell cucumber where is ur step def code
        // tags="", //to tell which tagged feature file to execute
        plugin = {"pretty", // to generate reports
                "html:target/html/htmlreport.html",
                "json:target/json/file.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        publish = false,
        dryRun = false

//dryRun = false //to tell whether to test run(true) or actual run(false)
        //dry run false: if you run it
        //dry run true: if you don't want to run it
)

public class TestRunner {
}
