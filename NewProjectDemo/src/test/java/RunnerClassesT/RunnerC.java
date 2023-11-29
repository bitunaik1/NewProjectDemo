package RunnerClassesT;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features", // Specify the feature file to run
    glue = {"StepDefinition"},      // Specify the package where your step definitions are located
    monochrome = true,                          // Display the console output in a proper readable format
    plugin = {"pretty", "html:target/cucumber-reports.html"} // Specify the reporting format
)
public class RunnerC {

}
