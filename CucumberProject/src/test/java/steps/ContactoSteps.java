package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactoSteps {
	
	WebDriver driver;
    
	@Given("the user is in the index page4")
	public void theUserIsInTheIndexPage()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/");
		driver.manage().window().maximize();

	}
	@When("the user select Contacto")
	public void TheUserSelectContacto() 
	{
		driver.findElement(By.xpath("//*[@id=\"nav-menu-item-1139\"]")).click();
	}
	@Then("Contacto info appears")
	public void ContactoInfoAppears()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("CONTACTO"));
	}

}
