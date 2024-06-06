package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefiniation"},
        dryRun = false,
         monochrome = true,
        plugin = {"pretty","html:target/cucumber-reports.html",
                "html:target/cucumber-reports.html",
                "pretty","json:target/JsonReport.json" }
        //tags= "@Sanity or @Amit"
        //tags= "@Sanity and @Smoke or Amit"
      //  tags= "not @Sanity"
        //tags="@login2"
       // tags= "@Functional  and not @Smoke"



        //plugin = {"html:target/cucumber-reports.html"}
//        plugin = {
//                "html:target/cucumber-reports.html",
//                "junit:target/cucumber-reports/Cucumber.xml"
//        },
        //tags = "@CreateDeal"
)
public class TestRunner extends AbstractTestNGCucumberTests {

   // private TestNGCucumberRunner testNGCucumberRunner;

}



