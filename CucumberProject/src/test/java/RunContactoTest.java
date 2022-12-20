import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Contacto.feature", glue="steps")
public class RunContactoTest extends AbstractTestNGCucumberTests{
	
}