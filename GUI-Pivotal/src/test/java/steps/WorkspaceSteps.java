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

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pivotal.entities.Workspace;
import pivotal.ui.CreateWorkspacePopUp;
import pivotal.ui.PageTransporter;
import pivotal.ui.WorkspaceDashboardPage;
import pivotal.ui.WorkspacePage;

import static org.testng.Assert.assertEquals;

public class WorkspaceSteps {

    PageTransporter pageTransporter = PageTransporter.getInstance();
    private Workspace workspace;
    // Pages
    private WorkspacePage workspacePage;
    private CreateWorkspacePopUp createWorkspacePopUp;
    private WorkspaceDashboardPage workspaceDashboardPage;

    @When("^I navigate to Workspace Dashboard page$")
    public void navigateToProjectDashboardPage() {
        workspaceDashboardPage = pageTransporter.navigateToProjectDashboardPage();
        workspaceDashboardPage.clickWorkspaceTab();
        workspaceDashboardPage.clickCreateWorkspaceBtn();
    }

    @When("^I create a new Workspace from Workspace Dashboard page with \"([^\"]*)\" values$")
    public void createANewWorkspace(final String workspaceName) {
        createWorkspacePopUp = workspaceDashboardPage.clickCreateWorkspaceBtn();
        this.workspace = new Workspace();
        this.workspace.setNameWorkspace(workspaceName);
        workspacePage = createWorkspacePopUp.createWorkspace(this.workspace);
    }

    @Then("^workspace page should be displayed$")
    public void workspacePageShouldBeDisplayed() {
//        workspacePage = pageTransporter.navigateWorkspacePage();
//        assertEquals(workspacePage.getTopBar().)
    }
}
