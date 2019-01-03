package stepDefinitions;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.WebConnector;

public class Hooks extends WebConnector {
	
	
	
	
	@Before("@RegressionTest")
	public void beforevalidation()
	{
		
		
		System.out.println("is the before hook being ran first?");
		
	}

	@After
	public void tearDownAndScreenshotOnFailure(Scenario scenario) {
		try {
			
			if(driver != null && scenario.isFailed()) {
				System.out.println("DID THIS BLOCK OF CODE RUNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN");
				scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
				driver.manage().deleteAllCookies();
				driver.quit();
//				driver = null;
			}
			
			
			if(driver != null) {
//				driver.manage().deleteAllCookies();
//				driver.quit();
//				driver = null;
			}
		} catch(Exception e) {
			System.out.println("Method Failed: screenshotOnFailure, Exception: " + e.getMessage());
		}
	}
	
	
	

}
