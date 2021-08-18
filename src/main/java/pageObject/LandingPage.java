package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin= By.cssSelector("a[href='sign in']");
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}


	





	public WebElement Login()
	{
		return driver.findElement(signin);
	}
	

}
