/*
 * @(#) WorkspaceDashboardPage.java Copyright (c) 2019. Jala Foundation.
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
import pivotal.entities.SearchValue;

public class WorkspaceDashboardPage extends BasePage {

    @FindBy(id = "create-workspace-button")
    private WebElement createWorkspaceBtn;

    @FindBy(css = "div[class='Dashboard__Tabs__wrapper']")
    private WebElement workspaceTab;

    @FindBy(xpath = "//span[contains(.,'Workspaces')]")
    private WebElement tabWorkspace;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(workspaceTab));
    }

    public WorkspaceDashboardPage clickWorkspaceTab() {
        tabWorkspace.click();
        return new WorkspaceDashboardPage();
    }

    public CreateWorkspacePopUp clickCreateWorkspaceBtn() {
        createWorkspaceBtn.click();
        return new CreateWorkspacePopUp();
    }

    public Boolean verifyNewWorkspaceInList(String workspaceName) {
        return SearchValue.existValueInList(workspaceName, driver.findElements(By.xpath("//div[@class='WorkspacesPane']//a[@class='WorkspaceTile__name']")));
    }
}
