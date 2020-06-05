package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	By signin=By.cssSelector("a[href*='sign_in']");
	
	By title=By.cssSelector(".text-center>h2");
	
	public 	WebElement getLogin()
	{ 
		
		return driver.findElement(signin);
	}
	
	public 	WebElement gettitle()
	{
		
		return driver.findElement(title);
	}
	
	
	

}
