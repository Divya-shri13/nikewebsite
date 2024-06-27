package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public  class DriveRclass {
	  protected static WebDriver driver;
	@BeforeSuite
	public  void BrowserSetup() {
		// TODO Auto-generated method stub
		
	
		String actUrl = "https://www.nike.com/in/";
		System.setProperty("Webdriver.edge.driver", "C:\\selenium\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String ExtUrl = driver.getCurrentUrl();
	   Assert.assertEquals(actUrl, ExtUrl);
	    System.out.println("The website sucessfully launced");
	}
	    
	    @AfterSuite
	    public void CloseBrowser() {
	    	
	    if (driver != null) {
	    	driver.quit();
	    }
	    }
	    

	}

	    
