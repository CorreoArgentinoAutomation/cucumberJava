package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/build/cucumber.json"},
        stepNotifications = true,
        publish = true,
        features = {"src/test/java/features/search.feature"},
        glue = {"steps"},
       /*  plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },  */
        monochrome = true,
        tags =  "@PRUEBA2" )
public class TestRunner {
}
