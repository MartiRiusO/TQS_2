package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TiendaSteps {
	
	WebDriver driver;
    
	@Given("the user is in the index page")
	public void theUserIsInTheIndexPage()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/");
		driver.manage().window().maximize();

	}
	@When("the user select tienda")
	public void TheUserSelectTienda() 
	{
		driver.findElement(By.id("nav-menu-item-1175")).click();
	}
	@When("the user select ofertas from categorias")
	public void TheUserSelectOfertasFromCategorias() 
	{
		driver.findElement(By.linkText("Ofertas")).click();
	}
	@When("the user select list view")
	public void TheUserSelectListView() 
	{
		driver.findElement(By.id("list")).click();
	}
	@When("the user select billar from categorias")
	public void TheUserSelectBillarFromCategorias() 
	{
		driver.findElement(By.linkText("Billar")).click();
	}
	@When("the user select accesorios para mesas from billar")
	public void TheUserSelectAccesoriosParaMesasFromBillar() 
	{
		driver.findElement(By.linkText("Accesorios Para Mesas")).click();
	}
	@When("the user select lamparas from the accesorios para mesas")
	public void TheUserSelectsLamparasFromTheAccesoriosParaMesas() 
	{
		driver.findElement(By.linkText("Lamparas")).click();
	}
	@When("the user select the first destacado")
	public void TheUserSelectTheFirstDestacado() 
	{
		driver.findElement(By.linkText("Tela de carambola Simonis 300 Rapide - 170 cm | color: azul")).click();
	}
	@Then("the offer list appears")
	public void TheOfferListAppears()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("OFERTAS"));
	}
	@Then("the offer list appears as list view")
	public void TheOfferListAppearsAsListView()
	{
	    String attr = driver.switchTo().activeElement().getAttribute("title");
		Assert.assertTrue(attr.contains("List View"));
	}
	@Then("the lamparas list appears")
	public void TheLamparasListAppears()
	{
		String tittle2 = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle2.contains("LAMPARAS"));
	}

}
