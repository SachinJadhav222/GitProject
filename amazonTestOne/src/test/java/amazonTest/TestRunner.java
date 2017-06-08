package amazonTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by SOHAM on 07/05/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags="@test1",features = ".", dryRun = false
)
public class TestRunner {


}
