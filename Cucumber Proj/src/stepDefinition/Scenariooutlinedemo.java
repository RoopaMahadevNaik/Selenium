package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenariooutlinedemo {
	
	WebDriver driver;
	
	@Given("^I am on demowebshop login page$")
	public void i_am_on_demowebshop_login_page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");      		
		driver.manage().window().maximize();    
	}

	@When("^I login with ([^\\\"]*) and ([^\\\"]*)$")
	public void i_login_with_email_and_password(String email, String password) throws Throwable 
	{
		driver.findElement(By.id("Email")).sendKeys(email);         
		driver.findElement(By.name("Password")).sendKeys(password);            
		driver.findElement(By.xpath("//input[@value='Log in']")).click();  
	}

	@Then("^I should see the logout link$")
	public void i_should_see_the_logot_link() throws Throwable 
	{
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();        
		driver.close(); 
	}

	
}
