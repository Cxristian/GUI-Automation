/*
 * @(#) CreateWorkspacePopUp.java Copyright (c) 2019. Jala Foundation.
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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pivotal.BasePage;

public class CreateWorkspacePopUp extends BasePage {

    @FindBy(xpath = "//h1[contains(.,'Create new workspace')]")
    private WebElement createWorkspaceLabel;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement nameWorkspaceTextBox;

    @FindBy(xpath = "//button[contains(.,'Create')]")
    private WebElement nextCreateNewWorkspace;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(createWorkspaceLabel));
    }
    public void workspaceName(String workspaceName) {
        setWorkspaceName(workspaceName);
        clickCreateWorkspaceBtn();
    }
    public WorkspacePage clickCreateWorkspaceBtn() {
        nextCreateNewWorkspace.click();
        return new WorkspacePage();
    }
    public void setWorkspaceName(String workspaceName) {
        nameWorkspaceTextBox.sendKeys(workspaceName);
    }
}
