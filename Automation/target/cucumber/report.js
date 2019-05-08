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
  "line": 4,
  "name": "I log in with username \"Test_User_Jala\" and password \"Control123\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Workspace Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I create a new Workspace from Workspace Dashboard page with \"New Workspace\" values",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "workspace page should be displayed",
  "keyword": "Then "
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
  "duration": 35102341100,
  "status": "passed"
});
formatter.match({
  "location": "WorkspaceSteps.navigateToProjectDashboardPage()"
});
formatter.result({
  "duration": 944200,
  "error_message": "java.lang.NullPointerException\r\n\tat steps.WorkspaceSteps.navigateToProjectDashboardPage(WorkspaceSteps.java:34)\r\n\tat ✽.When I navigate to Workspace Dashboard page(src/test/resources/features/workspace.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Workspace",
      "offset": 61
    }
  ],
  "location": "WorkspaceSteps.createANewWorkspace(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});