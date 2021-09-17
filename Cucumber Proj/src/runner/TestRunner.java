package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Feature/login.feature",glue= {"stepDefinition"},tags= {"@smoke"},plugin= {"pretty","junit:junitrepo/cucumberjunit/cucumberrep.xml"})   //instead of Feature/login.feature
																		      //we can use only Feature
public class TestRunner {

}
