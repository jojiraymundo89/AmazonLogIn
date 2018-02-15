$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("amazonLogIn.feature");
formatter.feature({
  "line": 2,
  "name": "Verify user should not be able to login with invalid credentials",
  "description": "",
  "id": "verify-user-should-not-be-able-to-login-with-invalid-credentials",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@loginAmazon"
    }
  ]
});
formatter.before({
  "duration": 6559426864,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Amazon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonLoginSD.iAmOnAmazonHomePage()"
});
formatter.result({
  "duration": 378081760,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify login error message",
  "description": "",
  "id": "verify-user-should-not-be-able-to-login-with-invalid-credentials;verify-login-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@loginAmazon-1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I hover over to Accounts \u0026 List",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter MrYou@yahoo.com into email text box",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter whatever into password text box",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify error or warning message",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonLoginSD.hoverOver()"
});
formatter.result({
  "duration": 2128602952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signIn",
      "offset": 11
    }
  ],
  "location": "AmazonLoginSD.clickOn(String)"
});
formatter.result({
  "duration": 569051255,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MrYou@yahoo.com",
      "offset": 8
    },
    {
      "val": "email",
      "offset": 29
    }
  ],
  "location": "AmazonLoginSD.enterText(String,String)"
});
formatter.result({
  "duration": 236075221,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "whatever",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 22
    }
  ],
  "location": "AmazonLoginSD.enterText(String,String)"
});
formatter.result({
  "duration": 82011133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "submit",
      "offset": 11
    }
  ],
  "location": "AmazonLoginSD.clickOn(String)"
});
formatter.result({
  "duration": 983787660,
  "status": "passed"
});
formatter.match({
  "location": "AmazonLoginSD.verifyErrorOrWarningMessage()"
});
formatter.result({
  "duration": 158818362,
  "status": "passed"
});
formatter.after({
  "duration": 44080863,
  "status": "passed"
});
}););