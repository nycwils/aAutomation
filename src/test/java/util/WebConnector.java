package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;

public class WebConnector {
	
	//loggin
	//initialize properties file
	
	//selenium layer - selenium commands
	// selenium webdriver layer ; 
	
	//Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	Properties OR = null;
	Properties CONFIG = null;
	public static WebDriver driver = null;
	public static WebDriver mozilla = null;
	public static WebDriver chrome = null;
	public static WebConnector w;
	
	
	public WebConnector(){
		
		if(OR==null){
			try{
				// initialize OR
				OR = new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//config//OR.properties");
				OR.load(fs);
				
				
				
				//initialize CONFIG to corresponding env
				CONFIG = new Properties();
				 fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//config//"+OR.getProperty("testEnv")+"_config.properties");
				CONFIG.load(fs);
				
				
				
				//OR.getProperty(objectName)))
				//driver.get(CONFIG.getProperty(URL));
				//System.out.println(OR.getProperty("loginusername"));
				//System.out.println(CONFIG.getProperty("loginURL"));
				
			}catch(Exception e){
				System.out.println("Error on initializing properties files");
			}
			
		}
		
	}
	
	//*************** Application Independant functions ****************
	
	// opening the browser
	public void openBrowser(String browserType){
		if(browserType.equals("Mozilla") && mozilla==null){
			System.setProperty("webdriver.gecko.driver", "src//test//java//Resources//geckodriver");
			
			driver = new FirefoxDriver();
			mozilla = driver;
		}else if(browserType.equals("Mozilla") && mozilla!=null) {
			driver=mozilla;
		}else if(browserType.equals("Chrome") && chrome == null){
			System.setProperty("webdriver.chrome.driver", "src//test//java//Resources//chromedriver");
			driver = new ChromeDriver();
			chrome = driver;
		}else if(browserType.equals("Chrome") && chrome != null){	
			driver = chrome;
		}else if(browserType.equals("IE")){
			//set the IE server exe path and initialize
		}
		//maximize driver
		
		if (mozilla == driver) {
			driver.manage().window().maximize();
		}else if (chrome == driver) {
			driver.manage().window().fullscreen();
		}
		//driver.manage().window().maximize();
		// set implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	//navigates to a URL
	public void navigate(String URL){
		
		driver.get(CONFIG.getProperty(URL));
	}
	// clicking on any object
	public void click(String objectName){
		
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
	}
	
	public void check_image(String objectName) {
		String img = driver.findElement(By.xpath("objectName")).getText();
		System.out.println("SRC goes here......." + img);
	}
	
	public void click_id(String objectName) throws InterruptedException{
		Thread.sleep(2000L);
		driver.findElement(By.xpath(OR.getProperty(objectName))).click();
		Thread.sleep(2000L);
	}
	
	public void click_link_text(String objectName){
		
		
		driver.findElement(By.linkText(OR.getProperty(objectName))).click();
	}
	
	public void click_className(String objectName){
		driver.findElement(By.className(OR.getProperty(objectName))).click();
	}
	
	public void type(String text, String objectName){
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
	}
	
	public void select(String text, String objectName){
		driver.findElement(By.xpath(OR.getProperty(objectName))).sendKeys(text);
		
	}
	
	public void send_image(String text, String objectName){
		driver.findElement(By.id(OR.getProperty(objectName))).sendKeys(text);
	
	}
	
	public boolean isElementPresent(String objectName){
		//int count = driver.findElements(By.xpath(OR.getProperty(objectName))).size();
		String count = driver.findElement(By.xpath(OR.getProperty(objectName))).getText();
		//if(count==0)
		//	return false;
		//else
			//return true;
		if(count=="")
			return false;
		else
			return true;
		
		
	}
	
	public void back() {
		driver.navigate().back();
	}
	
	public void isElementPresentText(String objectName){
		
		driver.findElement(By.xpath(OR.getProperty(objectName))).getText();
	}
	
	public boolean isElementPresent_link_text(String objectName){
		//int count = driver.findElements(By.linkText(OR.getProperty(objectName))).size();
		//if(count==0)
		//	return false;
		//else
			//return true;
		String count = driver.findElement(By.linkText(OR.getProperty(objectName))).getText();
		if(count=="")
			return false;
		else
			return true;
	}
	
	public void closeBrowser(){
		driver.close();
		mozilla = null;
		chrome = null;
	}
	
	public void selectFirstCourseSite() throws InterruptedException{
		
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//*[@id='siteLinkList']/li[2]/a/span")).click();
		Thread.sleep(2000L);
		
	}
	
	public void switch_to_iframe() throws InterruptedException{
		
		Thread.sleep(1000L);
		
		/*List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println("Total frames = " + frames.size());
        
       for (int i = 0; i <frames.size(); i++){
        	
        	 System.out.println(frames.get(i).getAttribute("id"));
        	 System.out.println(i);
        }
	*/
        driver.switchTo().frame(0);
        Thread.sleep(1000L);
	}

public void switch_to_frame() throws InterruptedException{
		
		Thread.sleep(1000L);
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
        System.out.println("Total frames = " + frames.size());
        
       for (int i = 0; i <frames.size(); i++){
        	
        	 System.out.println(frames.get(i).getAttribute("id"));
        	 System.out.println(i);
        }
     
        driver.switchTo().frame(1);
        Thread.sleep(1000L);
	}
	
	
	public void switch_window() throws InterruptedException{

		Set<String> windowsid = driver.getWindowHandles();
		Iterator<String> iter = windowsid.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
			
		}
		
		windowsid = driver.getWindowHandles();
		iter = windowsid.iterator();
		String mainWindowID = iter.next();
		String tabbedWindowId = iter.next();
		System.out.println(mainWindowID);
		System.out.println(tabbedWindowId);
		
		
		Thread.sleep(3000L);
		driver.switchTo().window(tabbedWindowId);
		
		Thread.sleep(2000L);
		
	}
	
	////**************Application Dependant functions******************////
	public boolean isLoggedIn(){
		if(isElementPresent("messageOfTheDay"))
			return true;
		else
			return false;
	}
	
	
	///////////////////////////////
	
	public void composeGmail() throws InterruptedException{
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("wl41@nyu.edu");
		
		Random rand = new Random();
		int n = rand.nextInt();
		String message = "testMessage"+n;
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(message);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(1000L);
	}
	
	public void forwardGmail() throws InterruptedException{
		driver.findElement(By.xpath("//div[@class = 'y6']/span[contains(., 'testMessage')]")).click();
		driver.findElement(By.xpath("//div[@class = 'amn']/span[contains(., 'Forward')]")).click();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("wl41@nyu.edu");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		
		Thread.sleep(1000L);
		Set<String> windowsid = driver.getWindowHandles();
		Iterator<String> iter = windowsid.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
			
		}
		
		windowsid = driver.getWindowHandles();
		iter = windowsid.iterator();
		String mainWindowID = iter.next();
		String tabbedWindowId = iter.next();
		System.out.println(mainWindowID);
		System.out.println(tabbedWindowId);
		
		
		Thread.sleep(3000L);
		driver.switchTo().window(tabbedWindowId);
		driver.close();
		driver.switchTo().window(mainWindowID);
		driver.close();
		
		mozilla = null;
		chrome = null;
		
		
	}
	
	
	/////////////////////////////
	
	public void doDefaultLogin(){
	    
		navigate("nyuEDU");
		//type(CONFIG.getProperty("adminUserName"),"loginusername");
		//type(CONFIG.getProperty("adminPassword"),"loginpassword");
		//click("loginButton");
		
	}
	
	public void nyuWebPublishingDefaultLogin() {
		navigate("webpublishingURL");
		click("WP_Login_Button");
		type(CONFIG.getProperty("WebPublishingUserName"),"SSO_Name_Field");
		type(CONFIG.getProperty("WebPublishingPassword"),"SSO_Password_Field");
		//type(CONFIG.getProperty("SSO_Name_Field"),"WebPublishingUserName");
		//type(CONFIG.getProperty("SSO_Password_Field"),"WebPublishingPassword");
		click("SSO_Login_Button");
	}
	
	public void nyuHomeDefaultLogin(){
		navigate("nyuHomeLoginUrl");
		type(CONFIG.getProperty("nyuHomeUserName"),"nyuHomeUserName");
		type(CONFIG.getProperty("nyuHomePassword"),"nyuHomePassword");
		click("shibLog");
	}
	
	
	public void nyuStreamDefaultLogin(){
		navigate("nyuStreamLoginUrl");
		type(CONFIG.getProperty("nyuHomeUserName"),"nyuHomeUserName");
		type(CONFIG.getProperty("nyuHomePassword"),"nyuHomePassword");
		click("shibLog");
	}
	
	public void nyuNewStreamDefaultLogin(){
		navigate("nyuNewStreamLoginUrl");
		type(CONFIG.getProperty("nyuHomeUserName"),"nyuHomeUserName");
		type(CONFIG.getProperty("nyuHomePassword"),"nyuHomePassword");
		click("shibLog");
	}
	
	public void devNYUHomeDefaultLogin(){
		navigate("devNYUHome");
		type(CONFIG.getProperty("nyuHomeUserNameDEV"),"nyuHomeUserName");
		type(CONFIG.getProperty("nyuHomePasswordDEV"),"nyuHomePassword");
		click("shibLog");
	}
	
	public void wikisDefaultLogin() throws InterruptedException{
		navigate("wikisUrl");
		driver.findElement(By.xpath("//*[@id='login-link']/span")).click();
		Thread.sleep(2000L);
		type(CONFIG.getProperty("adminUserName"),"wikiloginusername");
		type(CONFIG.getProperty("adminPassword"),"wikiloginpassword");
		click("shibLog");
	}
	
	public void webPublishingDefaultLogin() throws InterruptedException{
		navigate("webPublishingURL");
		type(CONFIG.getProperty("webPubUserName"),"webPubNetID");
		type(CONFIG.getProperty("webPubPassword"),"webPubPassword");
		click("shibLog");
	}
	
	public void serviceLinkDefaultLogin() throws InterruptedException{
		navigate("servickLinkSandboxURL");
		type(CONFIG.getProperty("serviceLinkName"),"serviceLinkID");
		type(CONFIG.getProperty("serviceLinkPassword"),"serviceLinkPassword");
		click("shibLog");
	}
	
	public void hover1() throws InterruptedException{
		WebElement elems=driver.findElement(By.xpath("//*[@id='horizontalMenu']/ul/li[2]/ul/li[1]/a"));//Menu Item
		WebElement elems1=driver.findElement(By.xpath("//*[@id='horizontalMenu']/ul/li[2]/a"));//Menu
		Actions builder = new Actions(driver); 
		Actions hoverOverRegistrar = builder.moveToElement(elems1);
		hoverOverRegistrar.perform();
		Thread.sleep(2000L);
		//elems.click();
		driver.findElement(By.linkText("Activism")).click();
		Thread.sleep(3000L);
	}
	
	public void navigateURL(String objectName){
		//driver.get(OR.getProperty(objectName));
		driver.get(CONFIG.getProperty(objectName));
	}
	
	///////////////////Albert//////////////
	public void albertDefaultLogin() throws InterruptedException{
		navigate("albertLoginUrl");
		type(CONFIG.getProperty("albertUserName"),"albertUserName");
		type(CONFIG.getProperty("albertPassword"),"albertPassword");
		click("albertLoginButton");
		Thread.sleep(2000L);
	}
	
	public void albertDropDown(String objectName) throws InterruptedException{
		
		/*
		WebElement dropdown = driver.findElement(By.id("NYU_CLS_WRK2_DESCR254$45$"));
		List<WebElement> lists = dropdown.findElements(By.tagName("option"));
		String abu = lists.get(12).getText();
		System.out.println("aaaaaaa");
		System.out.println(abu);
		System.out.println("bbbbbbbb");
		lists.get(12).click();
		Thread.sleep(2000L);
		lists.get(12).click();
		*/
		driver.findElement(By.id("NYU_CLS_WRK2_DESCR254$45$")).sendKeys(OR.getProperty(objectName));
		Thread.sleep(1000L);
		driver.findElement(By.id("NYU_CLS_WRK2_DESCR254$45$")).sendKeys(Keys.ENTER);
		
	}
	
	
public void switch_to_frame_back() throws InterruptedException{
		
		Thread.sleep(1000L);
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
        System.out.println("Total frames = " + frames.size());
        
       for (int i = 0; i <frames.size(); i++){
        	
        	 System.out.println(frames.get(i).getAttribute("id"));
        	 System.out.println(i);
        }
     
        driver.switchTo().frame(0);
        Thread.sleep(1000L);
	}
	
	
	/////////////////////
	
	
	
	//***************Singleton
	public static  WebConnector getInstance(){
		if(w==null)
			w = new WebConnector();
		
		return w;
			
	}
	
	
	//************* Utility Functions *******
	
	//sauceLabs Testing
	
public void sauceLab() throws MalformedURLException{
    // Choose the browser, version, and platform to test
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    capabilities.setCapability("version", "28");
    capabilities.setCapability("platform", Platform.MAC);
    // Create the connection to Sauce Labs to run the tests
   driver = new RemoteWebDriver(
            new URL("http://wl41:71179d36-a130-4de5-94b2-8e60a7b0a89f@ondemand.saucelabs.com:80/wd/hub"),
            capabilities);

}
	
public Scenario myScenario;
public void i_take_a_screenshot() throws Throwable {
	
    try {
        
    	if (myScenario.isFailed()) {
    		myScenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
    	}
    	
    } catch (ClassCastException cce) {
        cce.printStackTrace();
    }

}

public void takeScreenShot (String fileName){
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		//workspace directory --> FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//screenshots//"+fileName+".jpg"));
		FileUtils.copyFile(scrFile, new File("//Users//wl41//Desktop//screenshot"+fileName+".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("This THIS LINE RUNNNNNNNNNNN?????????");
	}	
}

	//***********LOGGING********************/
	//public void log(String msg){
	//	APPLICATION_LOGS.debug(msg);
	//}
	
	
}
