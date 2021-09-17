package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertVerify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");      //to open the url in chrome and it is in minimized size
		driver.manage().window().maximize(); 
        
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		// To handle alert messages
		Alert alert = driver.switchTo().alert();
		
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		
		alert.accept();
		
	    driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		// To handle alert messages
		Alert alert1 = driver.switchTo().alert();
		
		String alertmessage1 = driver.switchTo().alert().getText();
		System.out.println(alertmessage1);
		
		alert1.dismiss();
		
		
		  driver.findElement(By.linkText("Alert with Textbox")).click();
	      driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			
			// To handle alert messages
			Alert alert2 = driver.switchTo().alert();
			
			String alertmessage2 = driver.switchTo().alert().getText();
			System.out.println(alertmessage2);
			alert2.sendKeys("testers");
			alert2.accept();
	}

}
