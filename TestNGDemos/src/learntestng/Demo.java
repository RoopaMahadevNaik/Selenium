package learntestng;

//Generated by Selenium IDE

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
//import org.testng.annotations.After;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Demo {
	WebDriver driver; 

JavascriptExecutor js;

@Test
public void t2() {
	System.setProperty("webdriver.chrome.driver", "C:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
 driver.get("https://demo.opencart.com/");
 driver.manage().window().setSize(new Dimension(1050, 660));
 driver.findElement(By.linkText("Desktops")).click();
 driver.findElement(By.linkText("Mac (1)")).click();
 assertThat(driver.getTitle(), is("Mac"));
 driver.findElement(By.id("input-sort")).click();
 {
   WebElement dropdown = driver.findElement(By.id("input-sort"));
   dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
 }
 driver.findElement(By.cssSelector(".button-group > button:nth-child(1)")).click();
 js.executeScript("window.scrollTo(0,426)");
 {
   WebElement element = driver.findElement(By.cssSelector(".fa-th-list"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 driver.findElement(By.xpath("//input[@name='search']")).click();
 driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mobiles");
 driver.findElement(By.cssSelector(".input-group-btn > .btn")).click();
 driver.findElement(By.id("input-search")).click();
 driver.findElement(By.id("input-search")).sendKeys("null");
 driver.findElement(By.id("description")).click();
 driver.findElement(By.id("button-search")).click();
 driver.close();
}
private void assertThat(String title, Object object) {
	// TODO Auto-generated method stub
	
}
private Object is(String string) {
	// TODO Auto-generated method stub
	return null;
}
}
