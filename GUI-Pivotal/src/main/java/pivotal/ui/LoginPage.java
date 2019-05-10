package pivotal.ui;

import Reader.ReaderFileProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pivotal.BasePage;

import java.util.Properties;

/**
 * Created by Yesica on 07/05/2019.
 */
public class LoginPage extends BasePage {

    @FindBy(id="login_type_check_form")
    private WebElement loginForm;

    @FindBy(id="credentials_username")
    private WebElement userNameTextBox;

    @FindBy(css="input[class='app_signin_action_button']")
    private WebElement nextSignInBtn;

    @FindBy(id="credentials_password")
    private WebElement passwordTextBox;

    @Override
    public void waitUntilPageObjectIsLoaded() {
        wait.until(ExpectedConditions.visibilityOf(loginForm));
    }

    public void login(String userName, String password) {
        Properties prop = ReaderFileProperties.getInstance().loadFile("Login.properties");
        setUserName(prop.getProperty(userName) );
        clickNextSignInBtn();
        setPassword(prop.getProperty(password));
        clickNextSignInBtn();
//        return new WorkspacePage();
    }

    private void setPassword(String password) {
        passwordTextBox.sendKeys(password);
    }

    private void clickNextSignInBtn() {
        nextSignInBtn.click();
    }

    public void setUserName(String userName) {
        userNameTextBox.sendKeys(userName);
    }
}
