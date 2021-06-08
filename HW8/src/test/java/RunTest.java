import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/",
        glue = "src/test/java/StepDef",
        tags = "@2"
)
public class RunTest extends AbstractTestNGCucumberTests {

}
