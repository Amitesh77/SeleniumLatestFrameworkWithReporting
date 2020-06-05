package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

 public class Navigationbar extends base{
	
	
	public WebDriver driver;
	
	public Navigationbar(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	By navigationBar=By.cssSelector("[class='navbar-collapse collapse']");
	
	public WebElement getnavigationBar()
	{
		return driver.findElement(navigationBar);
	}
	
	

}
