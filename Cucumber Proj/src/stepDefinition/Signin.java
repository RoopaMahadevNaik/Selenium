package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin {
	
	WebDriver driver;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");      		
		driver.manage().window().maximize(); 
	    
	}

	@When("^User enters email and password$")
	public void user_enters_email_and_password() throws Throwable 
	{
		driver.findElement(By.id("Email")).sendKeys("rupanaik@gmail.com");         
		driver.findElement(By.name("Password")).sendKeys("rupan@123");            
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Successfully login");
	   
	}

	@Then("^user should see logout link$")
	public void user_should_see_logout_link() throws Throwable 
	{
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();        
		driver.close();
	  
	}
}
