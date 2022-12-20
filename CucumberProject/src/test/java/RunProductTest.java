import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Product.feature", glue="steps")
public class RunProductTest extends AbstractTestNGCucumberTests{
	
}