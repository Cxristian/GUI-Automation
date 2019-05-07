package core.selenium.webdrivers;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FireFox {
    /**
     * Initializes FirefoxDriver driver.
     * @return A new FirefoxDriver.
     */
    public WebDriver initDriver() {
        FirefoxDriverManager.getInstance().setup();
        FirefoxProfile profile = new FirefoxProfile();
//        profile.setPreference("browser.download.folderList", 2);
//        profile.setPreference("browser.download.dir", "C:\\Users\\Admin\\Downloads");
        return new FirefoxDriver();
    }
}
