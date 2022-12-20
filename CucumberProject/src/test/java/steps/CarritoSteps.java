package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarritoSteps {
	
	WebDriver driver;
	
    
	@Given("the user is in the index page1")
	public void theUserIsInTheIndexPage1()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/");
		driver.manage().window().maximize();
	}
	@Given("the user is in the billar page")
	public void theUserIsInTheBillarPage()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/tienda/billar/mesas/mesas-de-pool/buffalo-pool-dominator-9-pies-en-negro/");
		driver.manage().window().maximize();
	}
	@When("the user select carrito")
	public void TheUserSelectCarrito() 
	{
		driver.findElement(By.xpath("//div[contains(@class,'cart-head cart-head4')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'pull-right')]")));
	}
	@When("the user select ver carrito")
	public void TheUserSelectVerCarrito() 
	{
		driver.findElement(By.xpath("//a[contains(@class,'pull-right')]")).click();
	}
	@When("the user select añadir al carrito")
	public void TheUserSelectAñadirAlCarrito()
	{
		driver.findElement(By.xpath("//button[contains(@name,'add')]")).click();
	}
	@When("the user select delete billar")
	public void TheUserSelectDeleteBillar()
	{
		driver.findElement(By.xpath("//td//a[contains(@aria-label,'Remove this item')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(@class,'cart')]")));
	}
	@When("the user select volver a la tienda")
	public void TheUserSelectVolverALaTienda()
	{
		driver.findElement(By.xpath("//a[contains(@class,'button wc-backward')]")).click();
	}
	@When("the user select seguir comprando")
	public void TheUserSelectSeguirComprando()
	{
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-default')]")).click();
	}
	@Then("carrito appears empty")
	public void CarritoAppearsEmpty()
	{
		String tittle2 = driver.findElement(By.xpath("//p[contains(@class,'cart')]")).getText();
		Assert.assertTrue(tittle2.contains("Tu carrito está vacío."));
	}
	@Then("carrito appears with the billar")
	public void CarritoAppearsWithTheBillar()
	{
		String tittle2 = driver.findElement(By.xpath("//th[contains(@class,'product-name')]")).getText();
		Assert.assertTrue(tittle2.contains("Produco"));
	}
	@Then("vuelve a la tienda")
	public void VuelveALaTienda()
	{
		String URL = driver.getCurrentUrl();
		Assert.assertTrue(URL.contains("https://billarescuevas.com/tienda/"));
	}
}
