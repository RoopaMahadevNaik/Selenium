package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class UnsuccessfulLogin 
{
	WebDriver driver;
	@Given("^user is directed to login page$")
	public void user_is_directed_to_login_page() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");      		
		driver.manage().window().maximize();
	}

	@When("^user enters invalid credentials$")
	public void user_enters_invalid_credentials() throws Throwable 
	{
		driver.findElement(By.id("Email")).sendKeys("rupanaik@gmail.com");         
		driver.findElement(By.name("Password")).sendKeys("rupan@12");            
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

	@Then("^user should see error message \"([^\"]*)\"$")
	public void user_should_see_error_message(String arg1) throws Throwable {
	 String message=driver.findElement(By.xpath("//*[contains(text(),'Login was unsuccessful.')]")).getText();
	 Assert.assertEquals("Invalid Credentials",message);
	}
}
