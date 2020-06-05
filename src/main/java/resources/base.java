package resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		 prop=new Properties();
		
		FileInputStream fis=new FileInputStream("/Users/568650/Documents/Selenium/SeleniumFramework/src/main/java/Resources/data.properties");
		
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","/Users/568650/Documents/Selenium/driver/chromedriver");
			 driver=new ChromeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","/Users/568650/Documents/Selenium/driver/geckodriver");
			 driver=new FirefoxDriver();
		}
		
		else
		{
			System.setProperty("webdriver.InternetExplorer.driver","/Users/568650/Desktop/Selenium/driver/internetexplorerdriver");
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;

	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("/Users/568650/Documents/Selenium/Screenshots/"+result+"screenshot.png"));

	}

}
