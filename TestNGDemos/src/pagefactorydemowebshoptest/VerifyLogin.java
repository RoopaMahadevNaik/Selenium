package pagefactorydemowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactoryDemo.LoginPOM;

public class VerifyLogin {
	
	@Test
	public void validate()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		
		LoginPOM log=PageFactory.initElements(driver,LoginPOM.class);
		
		log.sendemail("rupanaik@gmail.com");
		log.sendpassword("rupan@123");
		log.clicklogin();
		driver.close();
	}

}
