package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.logging.*;

public class CommonFunctions {
	
	public static Properties properties=null;
	public static ChromeDriver driver=null;
	public static Alert al=null;
	
	
	public Properties loadPropertyFile()
	{
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		properties=new Properties();
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	
	@BeforeSuite
	public void launchBrowser()
	{
		loadPropertyFile();
		String url=properties.getProperty("url");
		String username=properties.getProperty("username");
		String password=properties.getProperty("password");
		String browser=properties.getProperty("browser");
		String location=properties.getProperty("location");
		
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", location);
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closingBrowser()
	{
		driver.quit();
	}

}
