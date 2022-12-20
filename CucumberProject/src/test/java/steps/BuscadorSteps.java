package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuscadorSteps {
	
	WebDriver driver;
    
	@Given("the user is in the index page6")
	public void theUserIsInTheIndexPage()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://billarescuevas.com/");
		driver.manage().window().maximize();

	}
	@When("the user select search bar")
	public void TheUserSelectSearchBar() 
	{
		driver.findElement(By.xpath("//div[@class=\"block-nowrap\"]")).click();
	}
	@When("the user write existent product")
	public void TheUserWriteExistentProduct() 
	{
		driver.findElement(By.xpath("//input[@id=\"s\"]")).sendKeys("BUFFALO POOL DOMINATOR 9 PIES EN NEGRO");
	}
	@When("the user write non existent product")
	public void TheUserWriteNonExistentProduct() 
	{
		driver.findElement(By.xpath("//input[@id=\"s\"]")).sendKeys("NONONONONO");
	}
	@When("the user search product")
	public void TheUserSearchProduct() 
	{
		driver.findElement(By.xpath("//button[@class=\"btn btn-special\"]")).click();
	}
	@When("the user click the filter")
	public void TheUserClickTheFilter() 
	{
		driver.findElement(By.xpath("//div[@class=\"selectric-wrapper selectric-cat\"]")).click();
	}
	@When("the user select the filter")
	public void TheUserSelectTheFilter() 
	{
		driver.findElement(By.xpath("//li[@data-index=\"2\"]")).click();
	}
	@Then("Product appear")
	public void ProductAppear()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("SEARCH - BUFFALO POOL DOMINATOR 9 PIES EN NEGRO"));
	}
	@Then("Product dont appear")
	public void ProductDontAppear()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("SEARCH - NONONONONO"));
	}
	@Then("Product appear2")
	public void ProductAppear2()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("SEARCH - BILLAR / BUFFALO POOL DOMINATOR 9 PIES EN NEGRO"));
	}
	@Then("Product dont appear2")
	public void ProductDontAppear2()
	{
		String tittle = driver. findElement(By.className("breadcrumb")).getText();
		Assert.assertTrue(tittle.contains("SEARCH - BILLAR / NONONONONO"));
	}

}
