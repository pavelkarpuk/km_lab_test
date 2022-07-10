package web.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import web.driver.DriverUtils;

public class BaseWebTest {

    @BeforeClass(alwaysRun = true)
    public void browserSetup() {
        DriverUtils.runChromeBrowser();
        DriverUtils.browserConfiguration();
    }

    @AfterClass(alwaysRun = true)
    public void browserTearDown() {
        DriverUtils.tearDownBrowser();
    }
}
