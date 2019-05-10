package pivotal.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pivotal.BasePage;

public class WorkspaceTopBar extends BasePage {

    @FindBy(css = ".raw_context_name")
    private WebElement accountForm;

    @FindBy(xpath = "//input[@name='search']")
    private WebElement nameWorkspaceTxt;

    @FindBy(xpath = "//span[@class='raw_context_name']")
    private WebElement nameWorkspaceLbl;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(accountForm));
    }

    public String getWorkspaceName() {
        return nameWorkspaceLbl.getText();
    }
}
