package Runnerclasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\KEDAR\\eclipse-\\jdcucumber\\src\\test\\resources\\featurefile\\google.feature", glue = "StepDef" )

public class googlerunner {

}
