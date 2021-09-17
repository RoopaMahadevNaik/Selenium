package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Datatabledemo 
{
	
	WebDriver driver;
	
	@Given("^user is on demowebshop login page$")
	public void user_is_on_demowebshop_login_page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");      		
		driver.manage().window().maximize(); 
	   
	}

	@When("^user signs in with email and password$")
	public void user_signs_in_with_email_and_password(DataTable credentials) throws Throwable 
	{
		List<List<String>> data=credentials.raw();
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(0));         
		driver.findElement(By.name("Password")).sendKeys(data.get(0).get(1));            
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Successfully login");   
	}

	@Then("^user should view logout$")
	public void user_should_view_logout() throws Throwable 
	{
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();        
		driver.close();    
	}


}
