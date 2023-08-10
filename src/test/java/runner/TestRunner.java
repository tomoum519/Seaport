package runner;

import io.cucumber.testng.CucumberOptions;
import test.TestBase;

@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"},
plugin = {"pretty","html:target/cucumber-html-report",
		"html:target/cucumberReports/cucumber-pretty.html",
        "json:target/cucumberReports/cucumber-TestReport.json",
        "rerun:target/cucumberReports/rerun.txt",
        "junit:target/cucumberReports/cukes.xml",}
,tags = "@tag1"
)
public class TestRunner extends TestBase {

}
