package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");      //to open the url in chrome and it is in minimized size
		driver.manage().window().maximize(); 
		
		//selecting female as gender
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();  //we can use more than one attributes in xpath which are separated by "and"
       
		//selecting date of birth
		WebElement year=driver.findElement(By.xpath("//*[@placeholder='Year']"));
		
		Select yr=new Select(year);
		List<WebElement>yearcount=yr.getOptions();
		System.out.println(yearcount.size());
		
		for(int i=0;i<yearcount.size();i++)
		{
			System.out.println(yearcount.get(i).getText());
			
		}
		System.out.println("\n");
		yr.selectByIndex(5);
		
		WebElement month=driver.findElement(By.xpath("//*[@placeholder='Month']"));
		Select mnt=new Select(month);
		List<WebElement>monthcount=mnt.getOptions();
		System.out.println(monthcount.size());
		
		for(int i=0;i<monthcount.size();i++)
		{
			System.out.println(monthcount.get(i).getText());
		}
		
		mnt.selectByValue("June");
		System.out.println("\n");
		
		WebElement day=driver.findElement(By.xpath("//*[@placeholder='Day']"));
		Select d=new Select(day);
		List<WebElement>daycount=d.getOptions();
		System.out.println(daycount.size());
		
		for(int i=0;i<daycount.size();i++)
		{
			System.out.println(daycount.get(i).getText());
		}
		
		d.selectByVisibleText("14");
		
	}

}
