package RUNNER;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(features = "/Users/SA20466287/eclipse-workspace/cucumber/src/main/java/FEATURE/test2.feature", glue = {

 "BINDING" })

public class Runner2 {

}

