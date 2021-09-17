$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login",
  "description": "",
  "id": "verify-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "verify-login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters email and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should see logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "Signin.user_is_on_login_page()"
});
formatter.result({
  "duration": 4798645600,
  "status": "passed"
});
formatter.match({
  "location": "Signin.user_enters_email_and_password()"
});
formatter.result({
  "duration": 4450592600,
  "status": "passed"
});
formatter.match({
  "location": "Signin.user_should_see_logout_link()"
});
formatter.result({
  "duration": 1034360900,
  "status": "passed"
});
});