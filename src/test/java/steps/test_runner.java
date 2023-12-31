package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = false,
        monochrome = true,
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"pretty","html:target/cucumber.html"}

)
public class test_runner {
}