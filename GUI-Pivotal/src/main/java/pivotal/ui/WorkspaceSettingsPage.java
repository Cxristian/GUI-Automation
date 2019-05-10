package pivotal.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pivotal.BasePage;

public class WorkspaceSettingsPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"content clearfix\"]")
    private WebElement matar;

    @Override
    public void waitUntilPageObjectIsLoaded() {

    }


}
