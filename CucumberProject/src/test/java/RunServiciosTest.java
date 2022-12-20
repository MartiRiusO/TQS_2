import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Servicios.feature", glue="steps")
public class RunServiciosTest extends AbstractTestNGCucumberTests{
	
}