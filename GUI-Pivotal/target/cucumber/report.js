$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/workspace.feature");
formatter.feature({
  "line": 1,
  "name": "create workspace",
  "description": "",
  "id": "create-workspace",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I create a project with the name \"Test_Project\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I log in with username and password",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Test_Project",
      "offset": 34
    }
  ],
  "location": "ProjectStep.createAProjectWithTheName(String)"
});
formatter.result({
  "duration": 3735268264,
  "error_message": "java.lang.NullPointerException\r\n\tat io.restassured.path.json.JsonPath.getInt(JsonPath.java:244)\r\n\tat pivotal.api.ProjectApi.createAProject(ProjectApi.java:42)\r\n\tat steps.ProjectStep.createAProjectWithTheName(ProjectStep.java:31)\r\n\tat ✽.Given I create a project with the name \"Test_Project\"(src/test/resources/features/workspace.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.logInUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 8,
  "name": "Create a new workspace for an user",
  "description": "",
  "id": "create-workspace;create-a-new-workspace-for-an-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@deleteNewWorkspace"
    },
    {
      "line": 7,
      "name": "@deleteProject"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I navigate to Workspace Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I create a new Workspace from Workspace Dashboard page with \"Test_Workspace\" value",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "workspace page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I navigate to Workspace page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I attach a workspace to a project",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "workspace page should be displayed with the project",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I navigate to Workspace Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "workspace Dashboard page should be displayed the new workspace",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkspaceSteps.navigateToProjectDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test_Workspace",
      "offset": 61
    }
  ],
  "location": "WorkspaceSteps.createANewWorkspace(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.verifyWorkspacePageDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.navigateToWorkspacePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.attachAWorkspaceToAProject()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.verifyWorkspacePageShouldBeDisplayedWithTheProject()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.navigateToProjectDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.verifyWorkspaceDashboardPageShouldBeDisplayedTheNewWorkspace()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 15145834889,
  "error_message": "org.openqa.selenium.WebDriverException: permission denied\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-HC5QIU5U\u0027, ip: \u0027192.168.43.207\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: driver.version: FirefoxDriver\nremote stacktrace: \r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:147)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:125)\r\n\tat core.selenium.webdrivers.FireFox.initDriver(FireFox.java:18)\r\n\tat core.selenium.WebDriverManager.initialize(WebDriverManager.java:44)\r\n\tat core.selenium.WebDriverManager.\u003cinit\u003e(WebDriverManager.java:25)\r\n\tat core.selenium.WebDriverManager.getInstance(WebDriverManager.java:35)\r\n\tat steps.Hooks.\u003cinit\u003e(Hooks.java:23)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\r\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\r\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\r\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\r\n\tat org.picocontainer.injectors.AbstractInjectionFactory$LifecycleAdapter.getComponentInstance(AbstractInjectionFactory.java:56)\r\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\r\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\r\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\r\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\r\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\r\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:40)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:643)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:820)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1128)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:782)\r\n\tat org.testng.TestRunner.run(TestRunner.java:632)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:366)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:361)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:319)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:268)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:86)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1244)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1169)\r\n\tat org.testng.TestNG.run(TestNG.java:1064)\r\n\tat org.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:73)\r\n\tat org.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:123)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 35221655836,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 68515475,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I create a project with the name \"Test_Project\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I log in with username and password",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Test_Project",
      "offset": 34
    }
  ],
  "location": "ProjectStep.createAProjectWithTheName(String)"
});
formatter.result({
  "duration": 823932258,
  "error_message": "java.lang.NullPointerException\r\n\tat io.restassured.path.json.JsonPath.getInt(JsonPath.java:244)\r\n\tat pivotal.api.ProjectApi.createAProject(ProjectApi.java:42)\r\n\tat steps.ProjectStep.createAProjectWithTheName(ProjectStep.java:31)\r\n\tat ✽.Given I create a project with the name \"Test_Project\"(src/test/resources/features/workspace.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.logInUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "Update a new workspace",
  "description": "",
  "id": "create-workspace;update-a-new-workspace",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@deleteNewWorkspace"
    },
    {
      "line": 18,
      "name": "@deleteProject"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I navigate to Workspace Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I create a new Workspace from Workspace Dashboard page with \"Test_Workspace\" value",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "workspace page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I update a Workspace from Workspace Settings with the name \"Update_Workspace\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I can see a green message \"Changes saved.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I navigate to Workspace Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "workspace Dashboard page should be displayed the new workspace",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkspaceSteps.navigateToProjectDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test_Workspace",
      "offset": 61
    }
  ],
  "location": "WorkspaceSteps.createANewWorkspace(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.verifyWorkspacePageDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Update_Workspace",
      "offset": 60
    }
  ],
  "location": "WorkspaceSteps.updateAWorkspaceFromWorkspaceSettingsWithTheName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Changes saved.",
      "offset": 27
    }
  ],
  "location": "WorkspaceSteps.canSeeAGreenMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.navigateToProjectDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.verifyWorkspaceDashboardPageShouldBeDisplayedTheNewWorkspace()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 901555475,
  "status": "passed"
});
formatter.after({
  "duration": 826670427,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 124191853,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I create a project with the name \"Test_Project\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I log in with username and password",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Test_Project",
      "offset": 34
    }
  ],
  "location": "ProjectStep.createAProjectWithTheName(String)"
});
formatter.result({
  "duration": 873210619,
  "error_message": "java.lang.NullPointerException\r\n\tat io.restassured.path.json.JsonPath.getInt(JsonPath.java:244)\r\n\tat pivotal.api.ProjectApi.createAProject(ProjectApi.java:42)\r\n\tat steps.ProjectStep.createAProjectWithTheName(ProjectStep.java:31)\r\n\tat ✽.Given I create a project with the name \"Test_Project\"(src/test/resources/features/workspace.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.logInUser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 29,
  "name": "Delete a workspace in Pivotal Tracker",
  "description": "",
  "id": "create-workspace;delete-a-workspace-in-pivotal-tracker",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@deleteProject"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I navigate to Workspace Dashboard page",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I create a new Workspace from Workspace Dashboard page with \"Test_Workspace\" value",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "workspace page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I go to the more page and delete the Workspace with the name \"Test_Workspace\".",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I can see a yellow message \"Test_Workspace was successfully deleted.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WorkspaceSteps.navigateToProjectDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test_Workspace",
      "offset": 61
    }
  ],
  "location": "WorkspaceSteps.createANewWorkspace(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WorkspaceSteps.verifyWorkspacePageDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test_Workspace",
      "offset": 62
    }
  ],
  "location": "WorkspaceSteps.goToTheMorePageAndDeleteTheWorkspace(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test_Workspace was successfully deleted.",
      "offset": 28
    }
  ],
  "location": "WorkspaceSteps.seeAYellowMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 890483092,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 35856155,
  "status": "passed"
});
});