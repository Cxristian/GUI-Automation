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
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pivotal.entities.Workspace;
import pivotal.ui.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WorkspaceSteps {

    PageTransporter pageTransporter = PageTransporter.getInstance();

    private CreateWorkspacePopUp createWorkspacePopUp;
    private Workspace workspace;

    // Pages
    private WorkspacePage workspacePage;
    private WorkspaceDashboardPage workspaceDashboardPage;
    private WorkspaceMorePage workspaceMorePage;
    private WorkspaceStoriesPage workspaceStoriesPage;

    @When("^I navigate to Workspace Dashboard page$")
    public void navigateToProjectDashboardPage() {
        workspaceDashboardPage = pageTransporter.navigateToProjectDashboardPage();
        workspaceDashboardPage.clickWorkspaceTab();
    }

    @When("^I create a new Workspace from Workspace Dashboard page with \"([^\"]*)\" value$")
    public void createANewWorkspace(final String workspaceName) {
        createWorkspacePopUp = workspaceDashboardPage.clickCreateWorkspaceBtn();
        workspace = new Workspace();
        workspace.setWorkspaceName(workspaceName);
        workspacePage = createWorkspacePopUp.createWorkspace(workspace);
    }

    @Then("^workspace page should be displayed$")
    public void verifyWorkspacePageDisplayed() {
        assertEquals(workspacePage.getTopBar().getWorkspaceName(), workspace.getWorkspaceName(),"the workspace name not displayed");
        assertEquals(workspacePage.isWorkspacePanelDisplayed(),"sidebar_wrapper" ,"tue workspace panel not displayed");
    }

    @Then("^workspace Dashboard page should be displayed the new workspace$")
    public void verifyWorkspaceDashboardPageShouldBeDisplayedTheNewWorkspace() {
        boolean existWorkspace = workspaceDashboardPage.verifyNewWorkspaceInList(workspace.getWorkspaceName());
        assertTrue(existWorkspace,"Don't exist the account in the Account Page");
    }


    @When("^I go to the more page and delete the Workspace with the name \"([^\"]*)\"\\.$")
    public void goToTheMorePageAndDeleteTheWorkspace(String workspaceName) {
        workspaceMorePage = workspacePage.isWorkspaceMorePage();
        workspaceMorePage.workspaceDelete();
    }

    @Then("^I can see a yellow message \"([^\"]*)\"$")
    public void seeAYellowMessage(String message) {
        assertEquals(message, workspaceDashboardPage.getMessageDelete());
    }

    @When("^I navigate to Workspace page$")
    public void navigateToWorkspacePage() {
        workspaceStoriesPage = workspacePage.getTopBar();
    }


    @Then("^I attach a workspace to  a project$")
    public void iAttachAWorkspaceToAProject() {
        workspaceStoriesPage.clickAddProjectBtn();
    }


}
