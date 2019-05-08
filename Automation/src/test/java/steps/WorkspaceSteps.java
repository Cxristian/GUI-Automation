/*
 * @(#) WorkspaceSteps.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import pivotal.ui.CreateWorkspacePopUp;
import pivotal.ui.PageTransporter;
import pivotal.ui.WorkspaceDashboardPage;
import pivotal.ui.WorkspacePage;

public class WorkspaceSteps {

    PageTransporter pageTransporter = PageTransporter.getInstance();

    // Pages
    private WorkspacePage workspacePage;
    private CreateWorkspacePopUp createWorkspacePopUp;
    private WorkspaceDashboardPage workspaceDashboardPage;

    @When("^I navigate to Workspace Dashboard page$")
    public void navigateToProjectDashboardPage() {
        workspacePage = pageTransporter.navigateToProjectDashboardPage();
        workspacePage.clickNextWorkspaceTab();
    }

    @When("^I create a new Workspace from Workspace Dashboard page with \"([^\"]*)\" values$")
    public void createANewWorkspace(String workspace) {
        workspaceDashboardPage.clickCreateWorkspaceBtn();
        createWorkspacePopUp.workspaceName(workspace);
    }
}

