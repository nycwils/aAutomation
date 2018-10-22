package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import util.WebConnector;

import java.net.MalformedURLException;
import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



@RunWith(Cucumber.class)
public class stepDefinition {
	
	WebConnector selenium = WebConnector.getInstance();
	
	
	
	/////////////WebPublishing Step Definitions Below - Start///////////////////
	
	@Given("^I am logged into wp\\.nyu\\.edu in \"([^\"]*)\"$")
	public void i_am_logged_into_wp_nyu_edu_in(String browser) throws Throwable {
	    
		
		selenium.openBrowser(browser);
		selenium.nyuWebPublishingDefaultLogin();
		
		//Assert.assertTrue("Not logged in", selenium.isLoggedIn());
		//selenium.click_link_text("Your_Avatar_Link");
		System.out.println("11111111111111111111111111");
	    
	}

	@Given("^I am on wp\\.nyu\\.edu in \"([^\"]*)\"$")
	public void i_am_on_wp_nyu_edu_in(String browser) throws Throwable {
		selenium.openBrowser(browser);
		selenium.navigate("webpublishingURL");
	}


	@When("^I click on \"([^\"]*)\" link and upload a picture$")
	public void i_click_on_link_and_upload_a_picture(String arg1) throws Throwable {
	   
		
		selenium.click_link_text(arg1);
		selenium.send_image("/Users/wl41/Desktop/pic.png", "chooseFileButton");
		selenium.click("Image_Upload_Button");
		selenium.click("Crop_Image_Button");
	    
	}

	@Then("^the picture should be uploaded successfully$")
	public void the_picture_should_be_uploaded_successfully() throws Throwable {
		
		selenium.click("Uploaded_Image");
		
		
		
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		
		selenium.closeBrowser();
	}

	
	@When("^I click on \"([^\"]*)\" Link$")
	public void i_click_on_Link(String arg1) throws Throwable {
	    
		Thread.sleep(2000L);
		selenium.navigate("webpublishingURL");
		Thread.sleep(2000L);
		selenium.click_link_text(arg1);
	    
	}

	
	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {
	   selenium.isElementPresentText(arg1);
	   //selenium.back();
	}


	/////////////WebPublishing Step Definitions Below - End///////////////////
	

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       
    	
    	System.out.println("testing111111111");
    	selenium.openBrowser("Mozilla");
		selenium.nyuWebPublishingDefaultLogin();
       
//       System.setProperty("webdriver.gecko.driver", "src//test//java//Resources//geckodriver");
//       //System.setProperty("webdriver.gecko.driver", "//Users//wl41//Desktop//selenium2018//geckodriver");
//       WebDriver driver = new FirefoxDriver();
//       driver.get("http://www.google.com");
//       
//       Thread.sleep(5000);
//	   driver.quit();
//	   
	   
    	
    }
    
    @When("^I click on aa \"([^\"]*)\"$")
    public void i_click_on_aa(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	//System.out.println("testing2222222");
    }

    @When("^I click on \"([^\"]*)\"$")
	public void I_Click_On(String object) throws InterruptedException{
		//selenium.log("Clicking on " + object);
		selenium.click(object);
		
		
	}

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
//        System.out.println(strArg1);
//        System.out.println(strArg2);
    	
    	System.out.println("testing2222222");
    	selenium.click_link_text("Your_Avatar_Link");
//        
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("testing33333333");
    }

    @Then("^Cards are not displayed are \"([^\"]*)\"$")
    public void cards_are_not_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	//System.out.println(arg1);
    	System.out.println("testing44444444");
    }
    
    @When("^User signs in with the following details$")
    public void user_signs_in_with_the_following_details(DataTable data) throws Throwable {
        List<List<String>>  obj = data.raw();
        obj.get(0).get(0);
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
    }
  
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }
    
    
    @Given("^validate the broser$")
    public void validate_the_broser() throws Throwable {
        System.out.println("is this running first??1111");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("is this running first??2222");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("is this running first??2222");
    }

    
    //This is a copy from the previous framework.  It starts here//////// -------------------------
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    
    
    
	// clicking on object

	
	@And("^I click on_wait \"([^\"]*)\"$")
	public void I_Click_On_wait(String object) throws InterruptedException{
		//selenium.log("Clicking on " + object);
		Thread.sleep(2000L);
		selenium.click(object);
		Thread.sleep(2000L);
		
	}
	
	@And("^I click_id on \"([^\"]*)\"$")
	public void I_Click_id_On(String object) throws InterruptedException{
		//selenium.log("Clicking on " + object);
		selenium.click_id(object);
	}
	
	@And("^I click_link on \"([^\"]*)\"$")
	public void I_Click_link_On(String object) throws InterruptedException{
		//selenium.log("Clicking on " + object);
		selenium.click_link_text(object);
		
	}
	
	
	
	@When("^I click on \"([^\"]*)\" on the first course site$")
	public void I_Click_On_First_Course_Site(String object) throws InterruptedException{
		selenium.selectFirstCourseSite();
		selenium.click_link_text(object);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String object, String text){
		//selenium.log("Typing in " + object);
		System.out.println("Entering "+ object + "value "+ text);
		selenium.type(text, object);
	}
	
	//Sauce Test
	@Given("^I sauce$")
	public void I_sauce() throws MalformedURLException{
		selenium.sauceLab();
	}
	///////
	
	@Given("^I am on nyu.edu in \"([^\"]*)\"$")
	public void I_am_logged_in_app(String browser) throws InterruptedException{
		
		System.out.println("did this print?");
		selenium.openBrowser(browser);
		selenium.doDefaultLogin();
		System.out.println("did this print?22222");
		//Assert.assertTrue("Not logged in", selenium.isLoggedIn());
		
	}
	
	@Given("^Runmode is \"([^\"]*)\"$")
	public void Runmode_is(String runmode){
		if(runmode.equals("N"))
			throw new PendingException("Skipping the test as Runmode is NO");
	}
	
	@Given("^Browser is \"([^\"]*)\"$")
	public void Browser_is(String browser){
		selenium.openBrowser(browser);
	}
	
	@And("^\"([^\"]*)\"should be present$")
	public void Should_be_present(String object){
		Assert.assertTrue("Object not found "+ object, selenium.isElementPresent(object));
	}
	
	@And("^I close browser$")
	public void I_close_browser(){
		selenium.closeBrowser();
	}
	//compare titles
	//compare text 
	//compare values in droplist
	
	@Then("^^\"([^\"]*)\" page will be displayed$")
	public void Page_Will_Be_Displayed(String object) throws InterruptedException{
		//selenium.switch_to_iframe();
		selenium.isElementPresent_link_text(object);
		
	}
	

	
	@And("^I upload a \"([^\"]*)\" file$")
	public void I_Upload_A_Small_File(String object) throws InterruptedException{
		selenium.switch_to_iframe();
		selenium.click("add");
		selenium.click("upload_files");
		selenium.type(object, "file_upload_path");
		selenium.click("upload_files_now");
		
		
	}
	
	@Then("^the file will be uploaded$")
	public void Then_the_file_will_be_uploaded(){
		selenium.isElementPresent_link_text("resources_page");
	}
	
	/////////NYU HOME COMMON steps/////////////////////
	
	@Given("^I am logged in nyuHome in \"([^\"]*)\"$")
	public void I_am_logged_in_nyuhome_app(String browser) throws InterruptedException{
		
		//System.out.println("testing123");
		selenium.openBrowser(browser);
		selenium.nyuHomeDefaultLogin();
		
		
	}
	
	@When("^I click on \"([^\"]*)\" tab$")
	public void I_click_on_home_tabs(String object){
		selenium.click_link_text(object);
	}
	
	

	

	@When("^I click on \"([^\"]*)\" tab param$")
	public void I_click_on_home_tabs_param(String object){
		selenium.click_link_text(object);
		
	}

	
	@Then("^^\"([^\"]*)\" page will be displayed_ad$")
	public void nyuHome_Page_Will_Be_Displayed(String object) throws InterruptedException{
		
		selenium.isElementPresent(object);
	}
	
	
	
	@When("^I click on home \"([^\"]*)\" link$")
	public void I_click_on_home_signoff_link(String object){
		
		selenium.click(object);
	}
	
	
	/////////////////////////////////////////////////////
	
	
	
	
	//////////////////Gmail  //////////////////////////////
	
	@Then("^^\"([^\"]*)\" popup page will be displayed_ad$")
	public void gmail_popup_Page_Will_Be_Displayed(String object) throws InterruptedException{
		selenium.switch_window();
		selenium.isElementPresent(object);
	}
	
	@When("^I compose a \"([^\"]*)\" message$")
	public void I_compose_gmail(String object) throws InterruptedException{
		selenium.click(object);
		selenium.composeGmail();
		
	}
	
	@And("I forward an email")
	public void I_forward_an_email() throws InterruptedException{
		selenium.forwardGmail();
	}
	
	@Then("email will be sent")
	public void email_will_be_sent(){
		
	}
	
	///////////////////////////////////////////////////////
	
	
	////////////////STREAM.NYU.EDU//////////////////////////
	
	@Given("^I am logged in nyuStream in \"([^\"]*)\"$")
	public void I_am_logged_in_nyustream_app(String browser) throws InterruptedException{
		
		//System.out.println("testing123");
		selenium.openBrowser(browser);
		selenium.nyuStreamDefaultLogin();
		
		
	}
	

	
	
	@When("^I click on \"([^\"]*)\" link on Stream left menu$")
	public void I_click_on_stream_link(String object){
		selenium.click_link_text(object);
	}
	
	@Then("^^\"([^\"]*)\" page will be displayed_stream$")
	public void nyuHome_Page_Will_Be_Displayedstream(String object) throws InterruptedException{
		
		selenium.isElementPresent(object);
	}
	
	@Given("^I am logged in nyuNewStream in \"([^\"]*)\"$")
	public void I_am_logged_in_nyunewstream_app(String browser) throws InterruptedException{
		
		//System.out.println("testing123");
		selenium.openBrowser(browser);
		selenium.nyuNewStreamDefaultLogin();
			
	}
	
	//@When("^I click on \"([^\"]*)\" and \"([^\"]*)\" on the newStream top menu$")
	//public void I_click_on_stream_link(String object, String object2) throws InterruptedException{
		//selenium.click(object);
		//selenium.click_link_text(object2);
	//	selenium.hover1();
	//}
	
	@When("^I navigate to \"([^\"]*)\" page$")
	public void I_navigate_to_page(String object){
		selenium.navigate(object);
		System.out.println(object);
	}
	
///////////////////////////////////////////////////////
	
	
	////////////////Albert stuff /////////////////////////
	
	@Given("^I am logged in Albert in \"([^\"]*)\"$")
	public void I_am_logged_in_Albert(String browser) throws InterruptedException{
		selenium.openBrowser(browser);
		selenium.albertDefaultLogin();
		
	}
	
	@And("^I click on Albert \"([^\"]*)\"$")
	public void I_click_Albert_enrollment(String object) throws InterruptedException{
		
		System.out.println("testing frame");
		selenium.switch_to_frame();
		selenium.click(object);
		Thread.sleep(2000L);
	}
	
	@And("^I select \"([^\"]*)\" from dropdown$")
	public void I_select_dropdown(String object) throws InterruptedException{
		selenium.albertDropDown(object);
		Thread.sleep(2000L);
	}
	
	@And("^I sign off from \"([^\"]*)\"$")
	public void I_albert_sign_off(String object) throws InterruptedException{
		selenium.switch_to_frame_back();
		Thread.sleep(1000L);
		selenium.click(object);
	}
	//////////////////////////////////////////////////////
	
	//sauceConnect
	
	
	
/////////NYU Home Stuffs/////////////////////
	
	@Given("^I am logged in devNYUHome in \"([^\"]*)\"$")
	public void I_am_logged_in_devNYUHome(String browser) throws InterruptedException{
		selenium.openBrowser(browser);
		selenium.devNYUHomeDefaultLogin();
		Thread.sleep(5000L);
		
	}
	
//////////////////////////////////////////////////////	
	
	
//////////////////////// WIKI STUFF ////////////////////////
	
	@Given("^I am logged in Wikis in \"([^\"]*)\"$")
	public void I_am_logged_in_wikis(String browser) throws InterruptedException{
		selenium.openBrowser(browser);
		selenium.wikisDefaultLogin();
		Thread.sleep(5000L);
		
	}
	
	
	@And("^I attach \"([^\"]*)\"$")
	public void I_attach(String object){
		selenium.type(object, "wiki_attach_doc");
	}
	
	@And("^I type \"([^\"]*)\"$")
	public void I_type(String object) throws InterruptedException{
		Thread.sleep(1000L);
		selenium.type(object, "wiki_macro_serach");
	}
	
	@And("^I upload \"([^\"]*)\"$")
	public void I_upload(String object){
		selenium.type(object, "wikiUpload");
	}
	
	
////////////////////////////////////////////////////////////////////////
	
	///////////////WEB PUBLISHING////////////////////////
	
	@Given("^I am logged in Webpublishing in \"([^\"]*)\"$")
	public void I_am_logged_in_webpublishing(String browser) throws InterruptedException{
		selenium.openBrowser(browser);
		selenium.webPublishingDefaultLogin();
		Thread.sleep(5000L);
		
	}
	
	
	@And("^I click on activate \"([^\"]*)\"$")
	public void I_Click_On_activate(String object) throws InterruptedException{
		selenium.navigateURL(object);
		
		
	}
	
	
	@And("^I upload a WB \"([^\"]*)\" file$")
	public void I_Upload_A_WB(String object) throws InterruptedException{
		
		selenium.type(object, "file_upload_path");
		
		
		
	}
	
	@And("^I wait")
	public void I_wait() throws InterruptedException{
		
		Thread.sleep(2000L);
		
		
		
	}
	/////////////////////////////////////////////////////
	
	////////////////service Link Sandbox///////////////////
	@Given("^I am logged in ServiceLinkSandbox in \"([^\"]*)\"$")
	public void I_am_logged_in_servicelinksandbox(String browser) throws InterruptedException{
		selenium.openBrowser(browser);
		selenium.serviceLinkDefaultLogin();
		Thread.sleep(5000L);
	}
    
    
    //It ends here............
    
    

}