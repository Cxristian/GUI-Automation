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
<<<<<<< HEAD
  "duration": 91698645800,
=======
  "duration": 48460427852,
>>>>>>> 7132e63ad2dc1275391b309d5cf29e35adf90e90
  "status": "passed"
});
formatter.match({
  "location": "WorkspaceSteps.navigateToProjectDashboardPage()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 2690245100,
=======
  "duration": 1660589037,
>>>>>>> 7132e63ad2dc1275391b309d5cf29e35adf90e90
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
<<<<<<< HEAD
  "duration": 10211029900,
  "status": "passed"
=======
  "duration": 69080494,
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton class\u003d\"button button--positive button--medium\" id\u003d\"create-workspace-button\" data-aid\u003d\"create-workspace-button\"\u003e...\u003c/button\u003e is not clickable at point (1353, 61). Other element would receive the click: \u003cdiv data-aid\u003d\"scrim\" class\u003d\"tc_scrim tc_scrim_dark\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-HC5QIU5U\u0027, ip: \u0027192.168.1.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\CXRISS~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:55838}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 6d8aa135eacf7276145d59af24009fe6\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat pivotal.ui.WorkspaceDashboardPage.clickCreateWorkspaceBtn(WorkspaceDashboardPage.java:42)\r\n\tat steps.WorkspaceSteps.createANewWorkspace(WorkspaceSteps.java:40)\r\n\tat ✽.When I create a new Workspace from Workspace Dashboard page with \"New_Workspace\" values(src/test/resources/features/workspace.feature:7)\r\n",
  "status": "failed"
>>>>>>> 7132e63ad2dc1275391b309d5cf29e35adf90e90
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});