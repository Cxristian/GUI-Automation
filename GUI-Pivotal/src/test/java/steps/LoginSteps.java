package steps;

import cucumber.api.java.en.Given;
import pivotal.ui.LoginPage;
import pivotal.ui.PageTransporter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoginSteps {

    PageTransporter pageTransporter = PageTransporter.getInstance();
    Properties prop = new Properties();

    // Pages
    private LoginPage loginPage;

//    @Given("^I log in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
//    public void logIn(final String userName, final String password) {
//        loginPage = pageTransporter.navigateToLoginPage();
//        loginPage.login(userName, password);
//    }

    @Given("^I log in with username and password$")
    public void logInUser() {
        try {
            InputStream input = new FileInputStream("Login.properties");
            prop.load(input);
        } catch (IOException io) {
            io.printStackTrace();
        }
        String userName = (String) prop.get("user");
        String password = (String) prop.get("pass");
        loginPage = pageTransporter.navigateToLoginPage();
        loginPage.login(userName, password);
    }
}
