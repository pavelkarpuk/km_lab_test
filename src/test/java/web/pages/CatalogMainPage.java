package web.pages;

import com.codeborne.selenide.Selenide;

public class CatalogMainPage {

    private final String typeOfPurchaseButton = "//span[contains(text(), '%s')]/ancestor::li";
    private final String typeOfElectronicsButton = "//div[contains(text(), '%s')]";
    private final String typeOfMobilePhoneButton = "//div[contains(text(),'Мобильные телефоны')]/parent::div/descendant::span[contains(text(), '%s')]";

    public void clickElectronicsButton() {
        Selenide.$x(String.format(typeOfPurchaseButton, "Электроника")).click();
    }

    public void hoverToMobilePhonesTitle() {
        Selenide.$x(String.format(typeOfElectronicsButton, "Мобильные телефоны")).hover();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void clickSmartphoneButton() {
        Selenide.$x(String.format(typeOfMobilePhoneButton, "Смартфоны")).click();
    }
}
