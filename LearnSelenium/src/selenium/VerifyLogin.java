package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");      //to open the url in chrome and it is in minimized size
		
		driver.manage().window().maximize();     // to maximize the window
		
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("You are on the correct page");
			driver.findElement(By.linkText("Log out")).click();        
			driver.close();                     
		}
		
		else
		{
			System.out.println("You are on the wrong page");
			driver.close();
		}
		
		
	    

	}

}
