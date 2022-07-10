package web.tests;

import com.google.inject.Inject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import web.helpers.CatalogMainPageHelper;
import web.helpers.HomePageHelper;
import web.helpers.SmartphoneCatalogPageHelper;

import static org.hamcrest.MatcherAssert.assertThat;

@Guice
public class CheckCostOfFirstApplePhoneTest extends BaseWebTest {

    @Inject
    private HomePageHelper homePageHelper;
    @Inject
    private CatalogMainPageHelper catalogMainPageHelper;
    @Inject
    private SmartphoneCatalogPageHelper smartphoneCatalogPageHelper;

    @BeforeClass
    public void openListWithApplePhones() {
        homePageHelper.navigateToOnlinerHomePage()
                .clickCatalogButton();
        catalogMainPageHelper.clickElectronicsButton()
                .hoverToMobilePhonesTitle()
                .clickSmartphoneButton();
        smartphoneCatalogPageHelper.clickOpenListManufacturersButton()
                .clickAppleCheckbox();
    }

    @Test
    public void firstApplePhoneShouldCostMoreThan100RublesTest() {
        double priceOfFirstApplePhone = smartphoneCatalogPageHelper.getListOfPrices().get(0);
        boolean isFirstPriceMoreThan100Rubbles = priceOfFirstApplePhone > 100;
        assertThat(
                "The cost of first Apple phone in the list is less than 100 BYN",
                isFirstPriceMoreThan100Rubbles
        );
    }
}
