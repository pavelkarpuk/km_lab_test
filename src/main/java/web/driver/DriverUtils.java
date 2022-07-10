package web.driver;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class DriverUtils {

    public static void runChromeBrowser() {
        WebDriverManager.chromedriver().setup();
    }

    public static void tearDownBrowser() {
        WebDriverRunner.closeWebDriver();
    }

    public static void browserConfiguration() {
        Selenide.open("http://google.com");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
}
