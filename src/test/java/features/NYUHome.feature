Feature: NYUHome Phase Two Features

In order to verify that all the components of NYUHome are working as expected
As a user with valid credentials
I want to run through all the NYUHome Test Cases.  



@RegressionTest
Scenario Outline: NYUHome Login and flip card
Given Runmode is "<Runmode>"
Given I am logged into NYUHome in "<BrowserType>"
When I click on "Academics" left nav link
Then I should see the first Academics card "Title" and "Content"
When When I flip the "First" card
Then I should be able to use "Settings" and move the "Slider"
And I flipback the "Back" card
And I close the browser

Examples:
|Runmode|BrowserType  |
|   Y	| Mozilla   |
|   N   | Chrome      |

@RegressionTest
Scenario Outline: Admin page create card
Given Runmode is "<Runmode>"
Given I am logged into NYUHome Admin in "<BrowserType>"
When I input text in the "Front_Title"
And I input text in the "Front_Content" 
And I input text in the "Back_Title"
And I input text in the "Back_Content"
And I select the "Academics_Category" category
And I input a link in the "Add_Card_Link" field
And I click on "Add_Card_Submit"
Then My "New_Card" should be created successfully
And I close the browser

Examples:
|Runmode|BrowserType  |
|   Y	| Mozilla   |
|   N   | ChromeHL    |


@RegressionTest
Scenario Outline: Profile Settings
Given Runmode is "<Runmode>"
Given I am logged into NYUHome in "<BrowserType>"
When I click on "User_profile"
And I click on "Profile"
And I click on "Edit_Profile"
Then I should see the "Upload_Photo" and be able to upload a photo
And I close the browser

Examples:
|Runmode|BrowserType  |
|   Y	| Mozilla   |
|   N   | ChromeHL    |
