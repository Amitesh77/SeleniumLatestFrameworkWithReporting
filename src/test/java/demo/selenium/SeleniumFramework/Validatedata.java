package demo.selenium.SeleniumFramework;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Navigationbar;
import resources.base;

class Validatedata extends base
{
	
	public static Logger log=LogManager .getLogger(base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		 log.info("Driver is initiated");
		 
		 driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
		 
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
		driver=null;
	}

	 @Test
	 public void basePageNavigation() 
	 {

		 LandingPage l1=new LandingPage(driver);
	
		 String text=l1.gettitle().getText();
		 
		 Assert.assertEquals(text,"FEATURED COURSES");
		 
		 log.info("Successfuly executed ");
		 
	
	 }
	 
	 @Test
	 public void navBar() throws IOException
	 {

		 Navigationbar n1=new Navigationbar(driver);
		 
		 boolean nav=n1.getnavigationBar().isDisplayed();
		 boolean b1=false;
		 
		 Assert.assertTrue(b1);
		 
		 
	 }
	 
	 
	
	 
	 
	 
	 
}