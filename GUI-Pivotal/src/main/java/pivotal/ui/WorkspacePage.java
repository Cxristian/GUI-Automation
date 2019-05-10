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

    @FindBy(xpath = "//a[@href='/n/workspaces/744725']")
    private WebElement workspacePageStoriesTab;


    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(workspaceForm));
    }

//    public String getEndPointWorkspace() {
//
//    }
}
