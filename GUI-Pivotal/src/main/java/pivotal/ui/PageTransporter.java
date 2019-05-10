package pivotal.ui;

import core.selenium.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Yesica on 06/05/2019.
 */
public class PageTransporter {

    private String baseURL = "https://www.pivotaltracker.com/";
    private WebDriver webDriver;

    private static PageTransporter instance;

    /**
     * Constructor of page transporter.
     */
    protected PageTransporter() {
        initialize();
    }

    /**
     * Gets instance of SelectSiteUserConfig.
     *
     * @return the instance or a new instance.
     */
    public static PageTransporter getInstance() {
        if (instance == null) {
            instance = new PageTransporter();
        }
        return instance;
    }

    /**
     * Initializes page transporter.
     */
    private void initialize() {
        webDriver = WebDriverManager.getInstance().getWebDriver();
    }

    /**
     * Goes to the given URL.
     *
     * @param url - Site's URL.
     */
    private void goToURL(final String url) {
        try {
            webDriver.navigate().to(new URL(url));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Navigates to Login Page.
     *
     * @return New instance of LoginPage.
     */
    public LoginPage navigateToLoginPage() {
        goToURL(baseURL.concat("signin"));
        return new LoginPage();
    }

    public WorkspaceDashboardPage navigateToProjectDashboardPage() {
        goToURL(baseURL.concat("dashboard"));
        return new WorkspaceDashboardPage();
    }

    public WorkspaceSettingsPage navigateToWorkspaceSettingsPage(String url) {
        goToURL(url);
        return new WorkspaceSettingsPage();
    }
}
