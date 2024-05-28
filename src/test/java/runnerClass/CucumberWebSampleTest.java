package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "com.qapropsoft.carina.demo", monochrome = true, 
		dryRun = false,
		tags = "@SmokeTest or @SanityTest",
		//publish = true, 
		plugin = { "pretty"}

)
public class CucumberWebSampleTest extends AbstractTestNGCucumberTests {

	

}