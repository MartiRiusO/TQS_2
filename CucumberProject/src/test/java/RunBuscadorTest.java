import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Buscador.feature", glue="steps")
public class RunBuscadorTest extends AbstractTestNGCucumberTests{
	
}