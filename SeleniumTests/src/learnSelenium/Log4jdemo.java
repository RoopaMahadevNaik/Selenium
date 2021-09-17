package learnSelenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(Log4jdemo.class); // class name
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "G:\\Tools\\MiddlewareSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		log.info("Launch Browser");
				
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		log.info("URL launched");
		
		String title = driver.getTitle();
		System.out.println("Title value is: " + title);
		
		log.info("title value is:" + title);
		
		if(title.equals("google")){
			System.out.println("correct title is Google");
			log.info("Correct title: Test case passed");
		}
		else{
			System.out.println("Incorrect title");
			//log.info("Incorrect title: Test case failed");
			log.error("Wrong page");
			
		}
		driver.quit();



	}

}
