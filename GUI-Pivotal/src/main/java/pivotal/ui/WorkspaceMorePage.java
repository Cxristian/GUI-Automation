package pivotal.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pivotal.BasePage;

public class WorkspaceMorePage extends BasePage {

    @FindBy(css = ".tc_header_project_name")
    private WebElement workspaceNameTab;

    @FindBy(xpath = "//div[@class='content clearfix']")
    private WebElement workspaceForm;

    @FindBy(id = "workspace_name")
    private WebElement workspaceNameTxt;

    @FindBy(id = "delete_link")
    private WebElement deleteLbl;

    @FindBy(css = ".save_bar__submit")
    private WebElement saveBtn;

    @FindBy(xpath = "//a[@class='_3O7Ar__projectNavTab _21UXs__projectNavTab--current']")
    private WebElement workspaceTabURL;

    @FindBy(id = "confirm_delete")
    private WebElement workspaceConfirmDeletBtn;


    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(workspaceForm));
    }

    public String getWorkspaceSettingsURL() {
        return workspaceTabURL.getAttribute("href");

    }

    public void workspaceDelete() {
        deleteLbl.click();
        workspaceDeleteConfirm();
    }

    public WorkspaceDashboardPage workspaceDeleteConfirm() {
        workspaceConfirmDeletBtn.click();
        return new WorkspaceDashboardPage();
    }

    public void setWorkspaceName(String workspaceName) {
        workspaceNameTxt.clear();
        workspaceNameTxt.sendKeys(workspaceName);
        saveBtn.click();
    }

}
