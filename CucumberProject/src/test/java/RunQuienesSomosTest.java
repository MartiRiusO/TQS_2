import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/QuienesSomos.feature", glue="steps")
public class RunQuienesSomosTest extends AbstractTestNGCucumberTests{
	
}