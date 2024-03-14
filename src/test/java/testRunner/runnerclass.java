package testRunner;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		   features= {".//Feature"},
		   //features={".//Feature/1Travel.feature",".//Feature/2Car.feature",".//Feature/3Health.feature"},
		   //features= {"@target/rerun.txt"},
		   glue = "StepDefinition" ,
		   plugin= {"pretty","html:reports/myreport.html", 
				   "rerun:target/rerun.txt",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		   dryRun=false,  //check mapping between scenario steps and stepdefinition method
		   monochrome=true, //to avoid junk character in output
		   publish=true    //to publish report in cucumber server
		   )
 

public class runnerclass {

}
