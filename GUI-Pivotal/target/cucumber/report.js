$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/workspace.feature");
formatter.feature({
  "line": 1,
  "name": "create workspace",
  "description": "",
  "id": "create-workspace",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create a new workspace for an user",
  "description": "",
  "id": "create-workspace;create-a-new-workspace-for-an-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#    Given I log in with username \"Test_User_Jala\" and password \"Control123\""
    }
  ],
  "line": 5,
  "name": "I log in with username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I navigate to Workspace Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I create a new Workspace from Workspace Dashboard page with \"New_Workspace\" values",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "workspace page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.logInUser()"
});
formatter.result({
  "duration": 91698645800,
  "status": "passed"
});
formatter.match({
  "location": "WorkspaceSteps.navigateToProjectDashboardPage()"
});
formatter.result({
  "duration": 2690245100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New_Workspace",
      "offset": 61
    }
  ],
  "location": "WorkspaceSteps.createANewWorkspace(String)"
});
formatter.result({
  "duration": 10211029900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});