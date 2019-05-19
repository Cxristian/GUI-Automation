package steps;

import core.selenium.WebDriverManager;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import pivotal.ui.LoginPage;
import pivotal.ui.PageTransporter;

public class LoginSteps {

    PageTransporter pageTransporter = PageTransporter.getInstance();

    // Pages
    private LoginPage loginPage;
    protected WebDriver webDriver;

    @Given("^I log in with username and password$")
    public void logInUser() {

        webDriver = WebDriverManager.getInstance().getWebDriver();
        String title = webDriver.getTitle();
        if (title.toLowerCase().equals("pivotal tracker - sign in") || title.equals("")) {
            loginPage = pageTransporter.navigateToLoginPage();
            loginPage.login("user", "pass");
        }
    }

}
