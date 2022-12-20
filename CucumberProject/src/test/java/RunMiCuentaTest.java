import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/MiCuenta.feature", glue="steps")
public class RunMiCuentaTest extends AbstractTestNGCucumberTests{
	
}