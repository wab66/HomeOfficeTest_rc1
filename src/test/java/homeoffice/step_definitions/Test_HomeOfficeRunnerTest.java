package homeoffice.step_definitions;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.runtime.formatter.SerenityReporter;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //plugin = {"pretty"},
        //plugin = {"cucumber.runtime.formatter.SerenityReporter"},
        features = "src/test/resources/features", glue = "src/test/java/homeoffice/step_definitions"
)
public class Test_HomeOfficeRunnerTest {}
