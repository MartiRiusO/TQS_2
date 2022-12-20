import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Tienda.feature", glue="steps")
public class RunTiendaTest extends AbstractTestNGCucumberTests{
	
}