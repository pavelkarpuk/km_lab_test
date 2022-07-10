package web.helpers;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import web.pages.HomePage;

@Guice
public class HomePageHelper extends AbstractPageHelper {

    @Inject
    private HomePage homePage;

    public HomePageHelper navigateToOnlinerHomePage() {
        logger.info("Navigate to Onliner home page");
        homePage.navigateToPage();
        return this;
    }

    public void clickCatalogButton() {
        logger.info("Click 'Каталог' button");
        homePage.clickCatalogButton();
    }
}
