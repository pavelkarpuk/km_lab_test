package web.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import web.utils.ListUtils;
import web.utils.WaitUtils;

import java.util.List;
import java.util.stream.Collectors;

public class SmartphoneCatalogPage {

    private final SelenideElement indicatorUpdateCatalog = Selenide.$x("//div/span[contains(text(), 'Нет товаров')]");
    private final SelenideElement openListManufacturersButton = Selenide.$x("//span[text() = 'Производитель']/parent::div/following-sibling::div/child::div");
    private final String manufacturerCompanyButton = "//label[contains(@class,'checkbox')]/descendant::span[text()='%s']";
    private final ElementsCollection primaryPricesOfSmartphones = Selenide.$$x("//a[contains(@class, 'price-value_primary')]");

    public void clickOpenListManufacturersButton() {
        openListManufacturersButton.scrollIntoView(true);
        openListManufacturersButton.click();
    }

    public void clickAppleCheckbox() {
        Selenide.$x(String.format(manufacturerCompanyButton, "Apple")).click();
        WaitUtils.waitForElementToBeInvisible(indicatorUpdateCatalog);
    }

    public List<Double> getListOfPrimaryPrices() {
        return ListUtils.convertStringPricesToDouble(
                primaryPricesOfSmartphones
                        .asDynamicIterable()
                        .stream()
                        .map(SelenideElement::getText)
                        .collect(Collectors.toList())
        );
    }
}
