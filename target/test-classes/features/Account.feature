Feature: Account Feature

In order to verify that all the components with image loadking and top p nav are working as expected
As a user with valid credentials
I want to run through all the test cases for image loading and wp navigation.  



@RegressionTest
Scenario Outline: WebPublishing Upload Avatar Image
Given Runmode is "<Runmode>"
Given I am logged into wp.nyu.edu in "<BrowserType>"
When I click on "Your_Avatar_Link" link and upload a picture
Then the picture should be uploaded successfully
And I close the browser

Examples:
|Runmode|BrowserType|
|   Y	| Mozilla   |
|   N   | Chrome    |

@RegressionTest
Scenario Outline: Verify all the links on WebPublishing landing page is funcitonal
Given Runmode is "<Runmode>"
Given I am logged into wp.nyu.edu in "<BrowserType>"
When I click on "Create" Link
Then I should see "Admin_Email_Field"
When I click on "Support" Link 
Then I should see "WebPublishing_Help_Label"
When I click on "Updates" Link 
Then I should see "Recent_Posts"
And I close the browser

Examples:
|Runmode|BrowserType|
|   N	| Mozilla   |
|   N   | Chrome    |