package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class BasicNavigation extends base {
	WebDriver driver;
	@Test

	public void initalpage() throws IOException {
		
	driver= initializeDriver();
	
	driver.get("http://www.qaclickacademy.com/");
	LandingPage l = new LandingPage(driver);
	
	l.Login().click();
	
	
	}
}
