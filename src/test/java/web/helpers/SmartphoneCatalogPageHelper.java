package web.helpers;

import com.google.inject.Inject;
import org.testng.annotations.Guice;
import web.pages.SmartphoneCatalogPage;

import java.util.List;

@Guice
public class SmartphoneCatalogPageHelper extends AbstractPageHelper {

    @Inject
    private SmartphoneCatalogPage smartphoneCatalogPage;

    public SmartphoneCatalogPageHelper clickOpenListManufacturersButton() {
        logger.info("Open list with all manufacturers");
        smartphoneCatalogPage.clickOpenListManufacturersButton();
        return this;
    }

    public SmartphoneCatalogPageHelper clickAppleCheckbox() {
        logger.info("Click 'Apple' checkbox");
        smartphoneCatalogPage.clickAppleCheckbox();
        return this;
    }

    public List<Double> getListOfPrices() {
        logger.info("Get list of primary prices from smartphone catalog page");
        return smartphoneCatalogPage.getListOfPrimaryPrices();
    }
}
