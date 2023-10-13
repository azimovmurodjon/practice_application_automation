package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = false,
        monochrome = true,
        features = "src/test/resources/hooks_demo/hooks_demo.feature",
        glue = "steps_for_hooks_demo",
        plugin = {"pretty","html:target/cucumber.html"}

)
public class hooks_demo_test_runner {
}
