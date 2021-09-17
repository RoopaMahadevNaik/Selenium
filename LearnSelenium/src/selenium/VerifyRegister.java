package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Asha");   //instead of id we can also specify name
		driver.findElement(By.id("LastName")).sendKeys("Daadam");  // name instead of id
		driver.findElement(By.id("Email")).sendKeys("asha001@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("asha@001");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("asha@001");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		//driver.findElement(By.xpath("//input[@value='Continue']")).click(); ----> after register continue button is there
		driver.close();
		
		
	}

}
