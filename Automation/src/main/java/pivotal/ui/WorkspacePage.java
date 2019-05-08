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

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WorkspacePage extends BasePage{
    @FindBy(css = "div[class='Dashboard__Tabs__wrapper']")
    private WebElement workspaceForm;

    @FindBy(xpath = "//span[contains(.,'Workspaces')]")
    private WebElement tabWorkspace;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(workspaceForm));
    }

    public void clickNextWorkspaceTab() {
        tabWorkspace.click();
    }

}
