$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Account.feature");
formatter.feature({
  "line": 1,
  "name": "Account Feature",
  "description": "\nIn order to verify that all the components are working as expected\nAs a user with valid credentials\nI want to run through all the test cases.",
  "id": "account-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "WebPublishing Upload Avatar Image",
  "description": "",
  "id": "account-feature;webpublishing-upload-avatar-image",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Runmode is \"\u003cRunmode\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I am logged into wp.nyu.edu in \"\u003cBrowserType\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on \"Your_Avatar_Link\" link and upload a picture",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the picture should be uploaded successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "account-feature;webpublishing-upload-avatar-image;",
  "rows": [
    {
      "cells": [
        "Runmode",
        "BrowserType"
      ],
      "line": 18,
      "id": "account-feature;webpublishing-upload-avatar-image;;1"
    },
    {
      "cells": [
        "Y",
        "Mozilla"
      ],
      "line": 19,
      "id": "account-feature;webpublishing-upload-avatar-image;;2"
    },
    {
      "cells": [
        "Y",
        "Chrome"
      ],
      "line": 20,
      "id": "account-feature;webpublishing-upload-avatar-image;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 174637,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "WebPublishing Upload Avatar Image",
  "description": "",
  "id": "account-feature;webpublishing-upload-avatar-image;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Runmode is \"Y\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I am logged into wp.nyu.edu in \"Mozilla\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on \"Your_Avatar_Link\" link and upload a picture",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the picture should be uploaded successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Y",
      "offset": 12
    }
  ],
  "location": "stepDefinition.Runmode_is(String)"
});
formatter.result({
  "duration": 97116379,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mozilla",
      "offset": 32
    }
  ],
  "location": "stepDefinition.i_am_logged_into_wp_nyu_edu_in(String)"
});
formatter.result({
  "duration": 4725369396,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your_Avatar_Link",
      "offset": 12
    }
  ],
  "location": "stepDefinition.i_click_on_link_and_upload_a_picture(String)"
});
formatter.result({
  "duration": 8799638952,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.the_picture_should_be_uploaded_successfully()"
});
formatter.result({
  "duration": 231216427,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_close_the_browser()"
});
formatter.result({
  "duration": 527679474,
  "status": "passed"
});
formatter.after({
  "duration": 75774,
  "status": "passed"
});
formatter.before({
  "duration": 45730,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "WebPublishing Upload Avatar Image",
  "description": "",
  "id": "account-feature;webpublishing-upload-avatar-image;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Runmode is \"Y\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I am logged into wp.nyu.edu in \"Chrome\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on \"Your_Avatar_Link\" link and upload a picture",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the picture should be uploaded successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Y",
      "offset": 12
    }
  ],
  "location": "stepDefinition.Runmode_is(String)"
});
formatter.result({
  "duration": 86695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 32
    }
  ],
  "location": "stepDefinition.i_am_logged_into_wp_nyu_edu_in(String)"
});
formatter.result({
  "duration": 6391126918,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your_Avatar_Link",
      "offset": 12
    }
  ],
  "location": "stepDefinition.i_click_on_link_and_upload_a_picture(String)"
});
formatter.result({
  "duration": 5813821350,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.the_picture_should_be_uploaded_successfully()"
});
formatter.result({
  "duration": 54086736,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_close_the_browser()"
});
formatter.result({
  "duration": 155935884,
  "status": "passed"
});
formatter.after({
  "duration": 47257,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Verify all the links on WebPublishing landing page is funcitonal",
  "description": "",
  "id": "account-feature;verify-all-the-links-on-webpublishing-landing-page-is-funcitonal",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Runmode is \"\u003cRunmode\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I am logged into wp.nyu.edu in \"\u003cBrowserType\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click on \"Create\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should see \"Admin_Email_Field\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click on \"Support\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I should see \"WebPublishing_Help_Label\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click on \"Updates\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I should see \"Recent_Posts\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "account-feature;verify-all-the-links-on-webpublishing-landing-page-is-funcitonal;",
  "rows": [
    {
      "cells": [
        "Runmode",
        "BrowserType"
      ],
      "line": 35,
      "id": "account-feature;verify-all-the-links-on-webpublishing-landing-page-is-funcitonal;;1"
    },
    {
      "cells": [
        "Y",
        "Mozilla"
      ],
      "line": 36,
      "id": "account-feature;verify-all-the-links-on-webpublishing-landing-page-is-funcitonal;;2"
    },
    {
      "cells": [
        "Y",
        "Chrome"
      ],
      "line": 37,
      "id": "account-feature;verify-all-the-links-on-webpublishing-landing-page-is-funcitonal;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 146510,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Verify all the links on WebPublishing landing page is funcitonal",
  "description": "",
  "id": "account-feature;verify-all-the-links-on-webpublishing-landing-page-is-funcitonal;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Runmode is \"Y\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I am logged into wp.nyu.edu in \"Mozilla\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click on \"Create\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should see \"Admin_Email_Field\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click on \"Support\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I should see \"WebPublishing_Help_Label\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click on \"Updates\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I should see \"Recent_Posts\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Y",
      "offset": 12
    }
  ],
  "location": "stepDefinition.Runmode_is(String)"
});
formatter.result({
  "duration": 121912,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mozilla",
      "offset": 32
    }
  ],
  "location": "stepDefinition.i_am_logged_into_wp_nyu_edu_in(String)"
});
formatter.result({
  "duration": 3822773390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create",
      "offset": 12
    }
  ],
  "location": "stepDefinition.i_click_on_Link(String)"
});
formatter.result({
  "duration": 6784326225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin_Email_Field",
      "offset": 14
    }
  ],
  "location": "stepDefinition.i_should_see(String)"
});
formatter.result({
  "duration": 18581631,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Support",
      "offset": 12
    }
  ],
  "location": "stepDefinition.i_click_on_Link(String)"
});
formatter.result({
  "duration": 7173258090,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WebPublishing_Help_Label",
      "offset": 14
    }
  ],
  "location": "stepDefinition.i_should_see(String)"
});
formatter.result({
  "duration": 14052823,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Updates",
      "offset": 12
    }
  ],
  "location": "stepDefinition.i_click_on_Link(String)"
});
formatter.result({
  "duration": 5952534512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Recent_Posts",
      "offset": 14
    }
  ],
  "location": "stepDefinition.i_should_see(String)"
});
formatter.result({
  "duration": 15245408,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_close_the_browser()"
});
formatter.result({
  "duration": 532002079,
  "status": "passed"
});
formatter.after({
  "duration": 39604,
  "status": "passed"
});
formatter.before({
  "duration": 58468,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Verify all the links on WebPublishing landing page is funcitonal",
  "description": "",
  "id": "account-feature;verify-all-the-links-on-webpublishing-landing-page-is-funcitonal;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "Runmode is \"Y\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I am logged into wp.nyu.edu in \"Chrome\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click on \"Create\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I should see \"Admin_Email_Field\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click on \"Support\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I should see \"WebPublishing_Help_Label\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click on \"Updates\" Link",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I should see \"Recent_Posts\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Y",
      "offset": 12
    }
  ],
  "location": "stepDefinition.Runmode_is(String)"
});
formatter.result({
  "duration": 49580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 32
    }
  ],
  "location": "stepDefinition.i_am_logged_into_wp_nyu_edu_in(String)"
});
formatter.result({
  "duration": 5293746225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create",
      "offset": 12
    }
  ],
  "location": "stepDefinition.i_click_on_Link(String)"
});
formatter.result({
  "duration": 5916819342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin_Email_Field",
      "offset": 14
    }
  ],
  "location": "stepDefinition.i_should_see(String)"
});
formatter.result({
  "duration": 31665557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Support",
      "offset": 12
    }
  ],
  "location": "stepDefinition.i_click_on_Link(String)"
});
formatter.result({
  "duration": 7776067647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WebPublishing_Help_Label",
      "offset": 14
    }
  ],
  "location": "stepDefinition.i_should_see(String)"
});
formatter.result({
  "duration": 31279114,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Updates",
      "offset": 12
    }
  ],
  "location": "stepDefinition.i_click_on_Link(String)"
});
formatter.result({
  "duration": 5819842644,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Recent_Posts",
      "offset": 14
    }
  ],
  "location": "stepDefinition.i_should_see(String)"
});
formatter.result({
  "duration": 30605628,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.i_close_the_browser()"
});
formatter.result({
  "duration": 156848721,
  "status": "passed"
});
formatter.after({
  "duration": 69916,
  "status": "passed"
});
});