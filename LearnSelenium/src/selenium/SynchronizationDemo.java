package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");      //to open the url in chrome and it is in minimized size
		
		driver.manage().window().maximize();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("Email")).sendKeys("rupanaik@gmail.com");         // entering email using sendKeys
		driver.findElement(By.name("Password")).sendKeys("rupan@123");             // entering password
		//driver.findElement(By.className("button-1 login-button")).click();  -----> it did not open using className, so use xpath
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//driver.findElement(By.xpath("//a[@class='ico-logout']")).click();   -----> here logout is a link in the page so you can use xpath or linkText for links
		
		driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();        //using linkText
		driver.close();  

	}

}
