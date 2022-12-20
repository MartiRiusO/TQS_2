package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServiciosSteps {
	
	WebDriver driver;
    
	@Given("the user is in the index page2")
	public void theUserIsInTheIndexPage()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/");
		driver.manage().window().maximize();

	}
	@When("the user select servicios")
	public void TheUserSelectServicios() 
	{
		driver.findElement(By.xpath("//*[@id=\"nav-menu-item-1191\"]")).click();
	}
	@When("the user select mantenimiento y reparaciones de mesas de billar")
	public void TheUserSelectMantenimientoYReparacionesDeMesasDeBillar() 
	{
		driver.findElement(By.xpath("//*[@id=\"nav-menu-item-1190\"]")).click();
	}
	@When("the user select reparaciones de tacos y flechas de billar")
	public void TheUserSelectReparacionesDeTacosYFlechasDeBillar() 
	{
		driver.findElement(By.xpath("//*[@id=\"nav-menu-item-1195\"]")).click();
	}	
	@Then("mantenimiento y reparaciones de mesas de billar info appears")
	public void MantenimientoYReparacionesDeMesasDeBillarInfoAppears()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("MANTENIMIENTO Y REPARACIÓN DE MESAS DE BILLAR"));
	}
	@Then("reparaciones de tacos y flechas de billar info appears")
	public void ReparacionesDeTacosYFlechasDeBillarInfoAppears()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("REPARACIONES DE TACOS Y FLECHAS DE BILLAR"));
	}

}
