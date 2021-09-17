package pageFactoryDemo;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	
	WebDriver driver;
	
	@FindBy(id="gender-female")
	WebElement gender;
	
	@FindBy(id="FirstName")
	WebElement fname;
	
	@FindBy(id="LastName")
	WebElement lname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement cpass;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement register;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement cont;
	
	@FindBy(linkText="Log out")
	WebElement logout;
	
	@FindBy(linkText="Log in")
	WebElement submit;
	
	public RegisterPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void selectgender()
	{
		gender.click();
	}
	
	public void addfname(String firstname)
	{
		fname.sendKeys(firstname);
	}
	
	public void addlname(String lastname)
	{
		lname.sendKeys(lastname);
	}
	
	public void addemail(String em)
	{
		email.sendKeys(em);
	}
	
	public void addpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void addcpassword(String cp)
	{
		cpass.sendKeys(cp);
	}
	public void clickregister()
	{
		register.click();
	}
	
	public void clickcontinue()
	{
		cont.click();
	}
	
	public void clicklogout()
	{
		logout.click();
	}
	
	public void clicksignin()
	{
		submit.click();
	}

	
	
	

}
