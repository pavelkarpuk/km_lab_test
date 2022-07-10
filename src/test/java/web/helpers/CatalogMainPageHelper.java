package web.helpers;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import web.pages.CatalogMainPage;

@Guice
public class CatalogMainPageHelper extends AbstractPageHelper {

    @Inject
    private CatalogMainPage catalogMainPage;

    public CatalogMainPageHelper clickElectronicsButton() {
        logger.info("Click 'Электроника' button");
        catalogMainPage.clickElectronicsButton();
        return this;
    }

    public CatalogMainPageHelper hoverToMobilePhonesTitle() {
        logger.info("Hover to 'Мобильные телефоны и аксессуары' button");
        catalogMainPage.hoverToMobilePhonesTitle();
        return this;
    }

    public void clickSmartphoneButton() {
        logger.info("Click 'Смартфоны' button");
        catalogMainPage.clickSmartphoneButton();
    }
}
