package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		
		System.out.println(pagetitle.length());

		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);
		
		if("http://demowebshop.tricentis.com/login".equals(pageurl))
		{
			System.out.println("You are on correct page");
		}
		
		else
		{
			System.out.println("You are on wrong page");
		}
		
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		System.out.println(pagesource.length());
		
		driver.close();
	}

}
