package learntestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartDemo {
	
	WebDriver driver;
	
	@Test
	public void openwindow() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.opencart.com");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
	}
	
	//verifying title of the page
	@Test(priority=1)
	public void ckeckurl()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle,"Your Store");
				
	}
	
	@Test(priority=2)
	public void performtask() throws Exception
	{
		driver.findElement(By.linkText("Desktops")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Mac (1)")).click();
		Thread.sleep(1000);
		WebElement val=driver.findElement(By.id("input-sort"));
		val.click();
		Select select=new Select(val);
		select.selectByVisibleText("Name (A - Z)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='content']/div[2]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void search() throws Exception
	{
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mobiles");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/span/button[@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-search")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("description")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button-search")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
