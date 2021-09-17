package demowebshoptests;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGParallelTestingDemo {
	
	WebDriver driver;

	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");     
		driver.manage().window().maximize();
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "Google");
		driver.close();
	}
	
	
	@Test
	public void test2()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();  
        
        String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Demo Web Shop. Login");
		driver.close();
        
        /*driver.findElement(By.id("Email")).sendKeys("rupanaik@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("rupan@123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        driver.findElement(By.linkText("Log out")).click();*/
       
	}
	
}
