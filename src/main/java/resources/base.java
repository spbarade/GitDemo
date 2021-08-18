package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ABC\\eclipse-E2EFramework\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
				
				
		{
			System.setProperty("webdriver.chrome.driver","D:\\Suhas\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		if(browserName=="firefox")
		{
			System.setProperty("webdriver.chrome.driver","D:\\Suhas\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		if(browserName=="IE")
		{
			System.setProperty("webdriver.chrome.driver","D:\\Suhas\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
