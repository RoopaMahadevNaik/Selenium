package pagefactorydemowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import pageFactoryDemo.LoginPOM;
import pageFactoryDemo.LoginPOM;
import pageFactoryDemo.RegisterPOM;

public class RegisterDemo {
	WebDriver driver;
	
	@Test
	public void regiater()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register"); 
		driver.manage().window().maximize();
		
		RegisterPOM log=PageFactory.initElements(driver,RegisterPOM.class);
		
		log.selectgender();
		log.addfname("Jane");
		log.addlname("Foster");
		log.addemail("janefoster11@gmail.com");
		log.addpassword("jane@123");
		log.addcpassword("jane@123");
		log.clickregister();
		log.clickcontinue();
		log.clicklogout();
		log.clicksignin();
		//driver.close();
	
		LoginPOM lp=PageFactory.initElements(driver, LoginPOM.class);
		lp.sendemail("janefoster11@gmail.com");
		lp.sendpassword("jane@123");
		lp.clicklogin();
		driver.close();
	}


}
