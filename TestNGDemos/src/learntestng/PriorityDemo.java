package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityDemo {

	WebDriver driver;
	@Test(description="Testcase to open the application")
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");      
		driver.manage().window().maximize(); 
		System.out.println("Start application");
	}
	
	@Test(priority = 1, description= "Testcase to verify login")
	public void loginapp()
	{
		
		driver.findElement(By.id("Email")).sendKeys("rupanaik@gmail.com");        
		driver.findElement(By.name("Password")).sendKeys("rupan@123");             
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Successfully login");
		
	}
	
	@Test(priority = 2,description="Testcase to verify signoff")
	public void signoff()
	{
		driver.findElement(By.linkText("Log out")).click();        
		driver.close();
		System.out.println("Signoff succeessfully");
	}
}
