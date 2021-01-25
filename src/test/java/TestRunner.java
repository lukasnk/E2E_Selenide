import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource",
        plugin ={"json:target/cucuber.json"},
        tags = "@ALL"
)

public class TestRunner {
}
