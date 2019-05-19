package pivotal.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pivotal.BasePage;

public class WorkspaceStoriesPage extends BasePage {
//
//    @FindBy(css = "//span[@class='tc_context_name']")
//    private WebElement workspaceNameTab;

    @FindBy(xpath = "//input[@name='search']")
    private WebElement workspaceNameTxt;

    @FindBy(xpath = "//span[@class='raw_context_name']")
    private WebElement workspaceNameLbl;

    @FindBy(xpath = "//a[@class='_257Dx__projectNavTab _2l-eS__projectNavTab--current']")
    private WebElement workspaceTabURL;

    @FindBy(xpath = "//button[@data-aid='edit-workspace']")
    private WebElement workspaceEditBtn;

    @FindBy(css = "div[data-aid='projectDropdown']")
    private WebElement workspaceDropDownBtn;

    @FindBy(css = "li[class='w39lj__DropdownMenuOption']")
    private WebElement workspaceListProjects;

    @FindBy(css = "button[class='save']")
    private WebElement workspaceBtnSave;

    @FindBy(xpath = "//section[@class='projects']")
    private WebElement sectionProjects;

//    @FindBy(xpath = "//li[@class=\"project\"]")
//    private WebElement sectionProjectsListProject;


    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(workspaceNameLbl));
    }

    public String getWorkspaceName() {
        return workspaceNameLbl.getText();
    }

    public void clickAddProjectBtn() {
        workspaceEditBtn.click();
        clickDropDownBtn();
    }

    private void clickDropDownBtn() {
        workspaceDropDownBtn.click();
        clickListOfProjects();
    }

    private void clickListOfProjects() {
        workspaceListProjects.click();
        clickBtnSave();
    }

    private WorkspacePage clickBtnSave() {
        workspaceBtnSave.click();
        return new WorkspacePage();
    }

    public String getWorkspaceUrl () {
        return workspaceTabURL.getAttribute("href");
    }


    public boolean isSectionProjectInWorkspace() {
        return sectionProjects.isDisplayed();
    }
}
