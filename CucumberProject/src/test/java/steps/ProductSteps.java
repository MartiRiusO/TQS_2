package steps;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {
	
	WebDriver driver;
    
	@Given("the user is in the tienda page")
	public void TheUserIsInTheTiendaPage()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/categoria-producto/billar/mesas/mesas-de-pool/");
		driver.manage().window().maximize();

	}
	@When("the user select a billar")
	public void TheUserSelectABillar() 
	{
		driver.findElement(By.linkText("BUFFALO POOL DOMINATOR 9 PIES EN NEGRO")).click();
	}
	@When("the user select informacion adicional")
	public void TheUserSelectInformacionAdicional() 
	{
		driver.findElement(By.xpath("//li[contains(text(),'Información adicional')]")).click();
	}
	@When("the user select google plus")
	public void TheUserSelectGooglePlus() 
	{
		driver.findElement(By.className("share-googleplus")).click();
	}
	@When("the user select facebook")
	public void TheUserSelectFacebook() 
	{
		driver.findElement(By.className("share-facebook")).click();
	}
	@When("the user select twitter")
	public void TheUserSelectTwitter() 
	{
		driver.findElement(By.className("share-twitter")).click();
	}
	@When("the user select linkedin")
	public void TheUserSelectLinkedin() 
	{
		driver.findElement(By.className("share-linkedin")).click();
	}	
	@Then("aditional information appears")
	public void AditionalInformationAppears()
	{
		String tittle3 = driver. findElement(By.className("product_weight")).getText();
		Assert.assertTrue(tittle3.contains("480 kg"));
	}
	@Then("google plus share page appears")
	public void GooglePlusSharePageAppears()
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String URL = driver.getCurrentUrl();
		Assert.assertTrue(URL.contains("https://accounts.google.com"));
	}
	@Then("facebook share page appears")
	public void FacebookSharePageAppears()
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String URL = driver.getCurrentUrl();
		Assert.assertTrue(URL.contains("https://www.facebook.com/"));
	}
	@Then("twitter share page appears")
	public void TwitterSharePageAppears()
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String URL = driver.getCurrentUrl();
		Assert.assertTrue(URL.contains("https://twitter.com/"));
	}
	@Then("linkedin share page appears")
	public void LinkedinSharePageAppears()
	{
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String URL = driver.getCurrentUrl();
		Assert.assertTrue(URL.contains("https://www.linkedin.com/"));
	}
}
