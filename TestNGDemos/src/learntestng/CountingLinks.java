package learntestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CountingLinks {
	
	WebDriver driver;
	@Test
	public void count()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The number of links is "+ links.size());
        
        for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
		}
        
        driver.close();
	}

}
