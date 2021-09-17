package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		
		driver.findElement(By.id("welcome")).click();
		//driver.findElement(By.linkText("Logout")).click();
		
		WebDriverWait mywait=new WebDriverWait(driver,10);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		/*WebElement tab=driver.findElement(By.id("welcome"));
		 tab.click();
		 Select t=new Select(tab);
		 t.selectByVisibleText("Logout");*/
		 	 
		 
	}

}
