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
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pivotal.api.WorkspaceApi;
import pivotal.entities.Context;
import pivotal.entities.ReaderIdInURL;
import pivotal.entities.Workspace;
import pivotal.ui.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class WorkspaceSteps {

    private Context context;
    PageTransporter pageTransporter = PageTransporter.getInstance();

    private CreateWorkspacePopUp createWorkspacePopUp;
    private Workspace workspace;

    private WorkspaceApi workspaceApi;

    // Pages
    private WorkspacePage workspacePage;
    private WorkspaceDashboardPage workspaceDashboardPage;
    private WorkspaceMorePage workspaceMorePage;
    private WorkspaceStoriesPage workspaceStoriesPage;

    public WorkspaceSteps (Context context) {
        this.context = context;
        workspace = context.getWorkspace();
    }

    @When("^I navigate to Workspace Dashboard page$")
    public void navigateToProjectDashboardPage() {
        workspaceDashboardPage = pageTransporter.navigateToProjectDashboardPage();
        workspaceDashboardPage.clickWorkspaceTab();
    }

    @When("^I create a new Workspace from Workspace Dashboard page with \"([^\"]*)\" value$")
    public void createANewWorkspace(final String workspaceName) {
        createWorkspacePopUp = workspaceDashboardPage.clickCreateWorkspaceBtn();
        workspace.setWorkspaceName(workspaceName);
        workspacePage = createWorkspacePopUp.createWorkspace(workspace);
    }

    @Then("^workspace page should be displayed$")
    public void verifyWorkspacePageDisplayed() {
        workspace.setId(ReaderIdInURL.getInstance().getIdNumber(workspacePage.getWorkspaceUrl()));
        assertEquals(workspacePage.getTopBar().getWorkspaceName(), workspace.getWorkspaceName(),"the workspace name not displayed");
        assertEquals(workspacePage.isWorkspacePanelDisplayed(),"sidebar_wrapper" ,"the workspace panel not displayed");
    }

    @Then("^workspace Dashboard page should be displayed the new workspace$")
    public void verifyWorkspaceDashboardPageShouldBeDisplayedTheNewWorkspace() {
        boolean existWorkspace = workspaceDashboardPage.verifyNewWorkspaceInList(workspace.getWorkspaceName());
        assertTrue(existWorkspace,"Don't exist the account in the Account Page");
    }


    @When("^I go to the more page and delete the Workspace with the name \"([^\"]*)\"\\.$")
    public void goToTheMorePageAndDeleteTheWorkspace(String workspaceName) {
        workspaceMorePage = workspacePage.goToWorkspaceMorePage();
        workspaceMorePage.workspaceDelete();
    }

    @Then("^I can see a yellow message \"([^\"]*)\"$")
    public void seeAYellowMessage(String message) {
        assertEquals(message, workspaceDashboardPage.getMessageDelete(), "not successfully deleted");
        assertTrue(false);
    }

    @When("^I navigate to Workspace page$")
    public void navigateToWorkspacePage() {
        workspaceStoriesPage = workspacePage.getTopBar();
    }

    @When("^I attach a workspace to a project$")
    public void attachAWorkspaceToAProject() {
        workspaceStoriesPage.clickAddProjectBtn();
    }


    @Then("^workspace page should be displayed with the project$")
    public void verifyWorkspacePageShouldBeDisplayedWithTheProject() {
        assertEquals(workspacePage.getTopBar().getWorkspaceName(),workspace.getWorkspaceName(),"the workspace name not displayed");
        assertEquals(workspacePage.isWorkspacePanelDisplayed(),"sidebar_wrapper" ,"the workspace panel not displayed");
        boolean existWorkspace = workspaceStoriesPage.isSectionProjectInWorkspace();
        assertTrue(existWorkspace,"Don't exist the account in the Account Page");
    }

    @When("^I update a Workspace from Workspace Settings with the name \"([^\"]*)\"$")
    public void updateAWorkspaceFromWorkspaceSettingsWithTheName(String UpdateWorkspace) {
        workspaceMorePage = workspacePage.goToWorkspaceMorePage();
        workspaceMorePage.setWorkspaceName(UpdateWorkspace);
        workspace.setWorkspaceName(UpdateWorkspace);
    }

    @Then("^I can see a green message \"([^\"]*)\"$")
    public void canSeeAGreenMessage(String message) {
        assertEquals(message, workspaceMorePage.getMessageSuccesfully(),"not successfully saved");
    }
}
