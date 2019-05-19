package steps;


import core.selenium.WebDriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import pivotal.api.ProjectApi;
import pivotal.api.WorkspaceApi;
import pivotal.entities.Context;

public class Hooks {


    private final Context context;
    private WebDriver driver;

    public Hooks(Context context) {
        this.context = context;
        driver = WebDriverManager.getInstance().getWebDriver();
    }

    @After("@deleteNewWorkspace")
    public void deleteNewWorkspace() {
        WorkspaceApi.getInstance().deleteAWorkspace(context.getWorkspace().getId());
    }

    @After("@deleteProject")
    public void deleteProject() {
        ProjectApi.getInstance().deleteAProject(context.getProject());
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }
    }
}
