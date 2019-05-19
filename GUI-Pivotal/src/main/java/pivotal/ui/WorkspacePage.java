/*
 * @(#) WorkspacePage.java Copyright (c) 2019. Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package pivotal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pivotal.BasePage;

public class WorkspacePage extends BasePage {

    @FindBy(css = ".sidebar_wrapper")
    private WebElement workspaceForm;

    @FindBy(xpath = "//span[contains(text(),'add projects')]")
    private WebElement workspaceAddProject;

    @FindBy(xpath = "//a[@data-aid='navTab-more']")
    private WebElement workspaceMoreBtn;

    @FindBy(xpath = "//a[@data-aid='navTab-stories']")
    private WebElement workspaceStoriesBtn;

 //   @FindBy(xpath = "//a[@class='_257Dx__projectNavTab _2l-eS__projectNavTab--current']")
    @FindBy(css = "a[class='_257Dx__projectNavTab _2l-eS__projectNavTab--current']")
    private WebElement workspaceTabURL;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(workspaceForm));
    }

    public WorkspaceStoriesPage getTopBar() {
        return new WorkspaceStoriesPage();
    }

    public String isWorkspacePanelDisplayed() {
        return workspaceForm.getAttribute("class");
    }

    public WorkspaceMorePage goToWorkspaceMorePage() {
        workspaceMoreBtn.click();
        return new WorkspaceMorePage();
    }

    public WorkspaceStoriesPage goToWorkspaceStoriesPage() {
        workspaceStoriesBtn.click();
        return new WorkspaceStoriesPage();
    }

    public String getWorkspaceUrl () {
        return workspaceTabURL.getAttribute("href");
    }

}
