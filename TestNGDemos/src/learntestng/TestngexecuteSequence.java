package learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestngexecuteSequence {
	
    @BeforeSuite
    public void setproperty()
    {
        System.out.println("Set the system property");
    }
    
    @BeforeClass
    public void enterurl()
    {
        System.out.println("Open URL");
    }
    
    @BeforeTest
    public void launchbrowser()
    {
        System.out.println("Open browser");
    }
    
    @BeforeMethod
    public void geturl()
    {
        System.out.println("Display url");
    }
    

    @Test
    public void checktitle()
    {
        System.out.println("Check title of Page");
    }
    
    @AfterMethod
    public void logout()
    {
        System.out.println("logout");
    }
    
    @AfterClass
    public void closebrowser()
    {
        System.out.println("close browser");
    }
    
    @AfterTest
    public void checkresult()
    {
        System.out.println("result displayed");
    }
    
    
}

