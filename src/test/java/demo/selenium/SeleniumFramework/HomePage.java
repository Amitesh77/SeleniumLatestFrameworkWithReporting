package demo.selenium.SeleniumFramework;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

class HomePage extends base{
	
	public static Logger log=LogManager .getLogger(base.class.getName());
	
	


@BeforeTest
public void initialize() throws IOException
{
	driver=initializeDriver();
	 log.info("Driver is initiated");
	 
	 
	 
}

@AfterTest
public void closebrowser()
{
	driver.close();
	driver=null;
}

	 @Test(dataProvider="getData")
	 public void basePageNavigation(String username,String password) throws IOException, InterruptedException
	 {
		 
		
		 
		 driver.get(prop.getProperty("url"));
		 
		 log.info("Navigated to Home page");
		 
		 LandingPage l1=new LandingPage(driver);
		 
		 l1.getLogin().click();
		 
		 LoginPage l2=new LoginPage(driver);

		 l2.getEmail().sendKeys(username);
		 
		 l2.getPassword().sendKeys(password);
		 
		 l2.getLogin().click();
		 
		 
		 
		 
		 
		
		  
		 
		 
	 }
	 
	 
	 @DataProvider()
	 public Object[][] getData()
	 {
		 
		 
		 //row stands for how many different data types test should run
		 
		 //column stands for how many values for each test
		 
		 Object [][] data=new Object[2][2];
		 
		 data[0][0]="nonrestricteduser@gmail.com";
		 data[0][1]="123456";
		
		 
		 data[1][0]="restricteduser@gmail.com";
		 data[1][1]="123456";
		 
		 
		 return data;
		 
		 
		 
	 }
	 
	 
	 
	 
}