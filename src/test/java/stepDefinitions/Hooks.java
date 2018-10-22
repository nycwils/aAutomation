package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	
	
	@Before("@RegressionTest")
	public void beforevalidation()
	{
		
		
		System.out.println("is the before hook being ran first?");
		
	}
	
	@After("@RegressionTest")
	public void aftervalidation() {
		System.out.println("is the before hook being ran LASTT?");
		
	}

}
