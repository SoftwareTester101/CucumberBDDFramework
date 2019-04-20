package myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/contactsmap.feature",// path
        // of the feature file
        glue = {"stepDefinitions"},    //path of step definitions
        format = {"pretty", "html: test-outout", "json: json_output/cucumber.json", "junit: junit_output/cucumber/xml"},
        monochrome = true, //dispaly the console output in the readable format
        strict = true,      //will check if any step is not  defined in step def file
        dryRun = false  //to check the mapping is in line with feature file and step def file
)

public class TestRunner {        
//    private TestNGCucumberRunner testNGCucumberRunner;
//
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() {
//        this.testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
//
//    @Test(dataProvider = "features")
//    public void feature(CucumberFeatureWrapper featureWrapper) {
//        testNGCucumberRunner.runCucumber(featureWrapper.getCucumberFeature());
//    }
//
//    @DataProvider
//    public Object[][] features(){
//        return testNGCucumberRunner.provideFeatures();
//    }
//
//    @AfterClass (alwaysRun = true)
//    public void tearDown(){
//        testNGCucumberRunner.finish();
//    }

}
