package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)

@CucumberOptions(
		
		features ="/Users/a121yn0n/git/as/RestAssuredFrameWork/src/main/java/runner/Features/OpenAPI.feature", // path of the features files
		glue={"/RestAssuredFrameWork/src/test/java/testpackage"}, //step definitation path of file
		//format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome= true, // display  the console output in proper format
		strict= true, // it will any step is not defined in the step defination file 
		dryRun= false //to check the mapping between feature file and step def file
		)




		
public class TestRunner {	
		
}
