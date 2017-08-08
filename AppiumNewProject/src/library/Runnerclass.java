/**
 * 
 */
package library;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	




@RunWith(Cucumber.class)
@CucumberOptions (features ="src/featurefile/",glue={"src/stepdefinition/"})

public class Runnerclass {
}
