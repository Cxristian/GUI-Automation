$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Project management",
  "description": "",
  "id": "project-management",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create a new project when user has at least 1 project",
  "description": "",
  "id": "project-management;create-a-new-project-when-user-has-at-least-1-project",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Project"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I log in with username \"Test_User_Jala\" and password \"Control123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Project Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Icreate a new Project from Project Dashboard page with the following values",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Test_User_Jala",
      "offset": 24
    },
    {
      "val": "Control123",
      "offset": 54
    }
  ],
  "location": "LoginSteps.logIn(String,String)"
});
formatter.result({
  "duration": 128793124900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});