package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pivotal.ui.LoginPage;
import pivotal.ui.PageTransporter;
import pivotal.ui.ProjectDashboardPage;

public class LoginSteps {

    PageTransporter pageTransporter = PageTransporter.getInstance();

    // Pages
    private LoginPage loginPage;
    private ProjectDashboardPage dashboardPage;

    @Given("^I log in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void logIn(final String userName, final String password) {
        loginPage = pageTransporter.navigateToLoginPage();
        loginPage.login(userName, password);
    }

}
