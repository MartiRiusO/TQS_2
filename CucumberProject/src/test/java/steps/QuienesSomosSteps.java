package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuienesSomosSteps {
	
	WebDriver driver;
    
	@Given("the user is in the index page3")
	public void theUserIsInTheIndexPage()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/");
		driver.manage().window().maximize();

	}
	@When("the user select quienes somos")
	public void TheUserSelectQuienesSomos() 
	{
		driver.findElement(By.xpath("//*[@id=\"nav-menu-item-1104\"]")).click();
	}
	@Then("quienes somos info appears")
	public void QuienesSomosInfoAppears()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("QUIENES SOMOS"));
	}

}
