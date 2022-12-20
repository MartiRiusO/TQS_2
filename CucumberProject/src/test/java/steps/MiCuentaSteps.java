package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MiCuentaSteps {
	
	WebDriver driver;
    
	@Given("the user is in the index page5")
	public void theUserIsInTheIndexPage()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/");
		driver.manage().window().maximize();

	}
	@When("the user select mi cuenta")
	public void TheUserSelectMiCuenta() 
	{
		driver.findElement(By.xpath("//*[@id=\"nav-menu-item-1163\"]")).click();
	}
	@When("the user select olvidaste la contraseña")
	public void ThUserSelectOlvidasteLaContraseña() 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Olvidaste')]")).click();
	}
	@Then("mi cuenta info appears")
	public void MiCuentaInfoAppears()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("MI CUENTA"));
	}
	@Then("recuperacion info appears")
	public void RecuperacionInfoAppears()
	{
		String tittle = driver.findElement(By.xpath("//p[contains(text(),'Lost')]")).getText();
		Assert.assertTrue(tittle.contains("Lost your password?"));
	}
}
